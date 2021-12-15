package examenFinal.primerejercicio;


public class Vector3D {

    //ATRIBUTOS

    Puntos3D puntoInicial= new Puntos3D();
    Puntos3D puntofinal = new Puntos3D();


    //CONSTRUCTORES

    public Vector3D(Puntos3D puntoInicial, Puntos3D puntofinal) {
        this.puntoInicial = puntoInicial;
        this.puntofinal = puntofinal;
    }
    public Vector3D(Puntos3D puntofinal) {
        this.puntofinal = puntofinal;
        this.puntoInicial.x=0;
        this.puntoInicial.y=0;
        this.puntoInicial.z=0;

    }

    //METODOS

    public double calcularMagnitud(){
        return Math.sqrt(Math.pow(this.puntofinal.x - this.puntoInicial.x,2) + Math.pow(this.puntofinal.y -this.puntoInicial.y,2)
                + Math.pow(this.puntofinal.z -this.puntoInicial.z,2));
    }
    public void mostrarComponentes(){
        double vx,vy,vz;
        vx= puntofinal.x- puntoInicial.x;
        vy= puntofinal.y- puntoInicial.y;
        vz=puntofinal.z- puntoInicial.z;

        System.out.println("x:" + vx);
        System.out.println("y:" + vy);
        System.out.println("z:" + vz);

    }

    //TO STRING

    @Override
    public String toString() {
        return "El vector comienza en el punto: " + puntoInicial + ", y termina en el punto: + " + puntofinal;
    }
}
