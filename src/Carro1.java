import java.sql.Statement;

public class Carro1 extends TeamDriverA{
    private String  referenciaCarro;

    public Carro1(String nombre, String rol, double tiempo) {
        super(nombre, rol, tiempo);
    }

    //verificar que los datos ingresados en el metodo si son el resultado de la opercaion de teamA
    public static void TiempoPits(int tiempoTotal,int cantidadPersonas ) {
        int result = tiempoTotal / cantidadPersonas;
        System.out.println(result);
    }


}
