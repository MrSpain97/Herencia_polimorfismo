import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Coche micoche= new Coche();
        micoche.setVelocidadMaxima(120);
        micoche.setSonido("BRRR");
        micoche.setMatricula("JGZ2480");
        System.out.println("Velocidad Maxima: "+micoche.getVelocidadMaxima()+"\n"
                +micoche.getSonido()+"\n"
                +micoche.getMatricula());
        micoche.diHola();
        micoche.ResuelveOperacion("5","5");
    }
}
/// clase de herencia simple cuando una clase hereda de otra
// herencia multinivel cuando una clase hereda de una tercera ejemplo
// ave = padre > pajaro hereda propiedades de ave> a su ves gallina hereda propiedades de pajaro.

abstract class Vehiculo{
    String matricula;
    private String sonido;

    private  int velocidadMaxima;

    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }

    public Vehiculo(){
        System.out.println("Estoy en el constructor de Vehiculo");
    }


    abstract public void setMatricula(String matricula);
    abstract public String getMatricula();

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return "El sonido de mi coche es: "+this.sonido;
    }

    public void diHola(){
        System.out.println("Hola");
    }
}


final class Coche extends Vehiculo{

    //POLIMOSFIRMO ES QUE UNA CLASE DERIBADA ES DECIR HIJA
    // IMPLEMENTE LA MISMA FUNCION QUE LA CLASE PADRE PERO HACE ALGO DISTINTO EJEMPLO

    public void diHola(){
        System.out.println("Soy un coche");
    }


    //funciones polimorficas

    public int ResuelveOperacion(int a,int b){
        System.out.println("estoy en int");
        return a+b;
    }
    public float ResuelveOperacion(float a,float b){
        System.out.println("estoy en float");
        return a+b;
    }
    public double ResuelveOperacion(double a,double b){
        System.out.println("estoy en double");
        return a+b;
    }

    public void ResuelveOperacion(String a,String b){
        System.out.println("estoy en String");
        double c= Double.parseDouble(a);
        double d= Double.parseDouble(b);
        System.out.println(c-d);
    }
    public Coche(){
        System.out.println("Estoy en el constructor de coche");
    }

    public void setMatricula(String matricula){
        this.matricula= matricula;
    }
    public String getMatricula(){
        return "Mi matricula es: "+ this.matricula;
    }

}