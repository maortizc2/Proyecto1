import Tareas.Trabajador;



public class TeamDriverB extends Trabajador implements Carro2{
    public TeamDriverB(String nombre, String rol,double tiempo) {
        super(nombre, rol,tiempo);
    }

    private String conductorA;
    private int cantidadPersonas;

    //imprimir mensaje para el conductor asignado
    public static void mensajeConductorB(String nombre){
        System.out.println("El conductor elegido para este auto es: "+ nombre);
    }

    @Override
    public void TiempoPits(double tiempo, int cantidadPersonas) {

    }
}







