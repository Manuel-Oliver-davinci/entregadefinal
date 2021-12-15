package examenFinal.primerejercicio;

public class Puntos3D {

    //ATRIBUTOS

    double x;
    double y;
    double z;

    //CONSTRUCTORES

    public Puntos3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Puntos3D(double w){
        this.x=w;
        this.y=w;
        this.z=w;
    }

    public Puntos3D() {
        this.x=0;
        this.y=0;
        this.z=0;
    }

    //METODOS

    public double distanciaOrigen(){
        return Math.sqrt(x*x + y*y + z*z);
    }
    public double calcularDistanciaOtroPunto(double x, double y, double z){
        return Math.sqrt(Math.pow(x - this.x,2) + Math.pow(y - this.y,2) + Math.pow(z - this.z,2));

    }
    public double calcularDistanciaOtroPunto(Puntos3D puntos3D){
        return Math.sqrt(Math.pow(puntos3D.x - this.x,2) + Math.pow(puntos3D.y - this.y,2) +
                Math.pow(puntos3D.z - this.z,2));
    }

    //TO STRING

    @Override
    public String toString() {
        return  "x=" + x + ", y=" + y + ", z=" + z ;
    }
}
