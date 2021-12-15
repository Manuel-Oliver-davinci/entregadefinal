package examenFinal.primerejercicio;

public class Main {
    public static void main(String[] args) {

    Puntos3D primerPunto = new Puntos3D(1,9,8);
    Puntos3D segundoPunto = new Puntos3D(8,9,1);
    Puntos3D tercerPunto = new Puntos3D(4);

        System.out.println("----------------------------------");
        System.out.println("Primer Punto: " + primerPunto);
        System.out.println("----------------------------------");
        System.out.println("Segundo Punto: " +segundoPunto);
        System.out.println("----------------------------------");
        System.out.println("Tercer Punto: " + tercerPunto);

        System.out.println("----------------------------------");

        System.out.println("Distancia al origen: " + segundoPunto.distanciaOrigen());
        System.out.println("----------------------------------");
        System.out.println("Distancia a otro punto: " + segundoPunto.calcularDistanciaOtroPunto(0,0,0));
        System.out.println("----------------------------------");
        System.out.println("Distancia a otro punto: " + segundoPunto.calcularDistanciaOtroPunto(primerPunto));
        System.out.println("----------------------------------");

    Vector3D primerVector = new Vector3D(primerPunto,segundoPunto);
    Vector3D segundoVector = new Vector3D(tercerPunto);

        System.out.println("PrimerVector:" + primerVector);
        System.out.println("----------------------------------");
        System.out.println("SegundoVector:" + segundoVector);
        System.out.println("----------------------------------");


        System.out.println("-----Mostrando Metodos Vectores-----");
        System.out.println("-----CalculandoMagnitud-----");

        System.out.println("Magnitud del PrimerVector:" + primerVector.calcularMagnitud());
        System.out.println("----------------------------------");
        System.out.println("Magnitud del SegundoVector:" +segundoVector.calcularMagnitud());
        System.out.println("----------------------------------");

        System.out.println("-----Mostrando Componentes de Vectores-----");

        System.out.println("Primer Vector: ");primerVector.mostrarComponentes();
        System.out.println("----------------------------------");
        System.out.println("Segundo Vector: "); segundoVector.mostrarComponentes();
        System.out.println("----------------------------------");



    }
}
