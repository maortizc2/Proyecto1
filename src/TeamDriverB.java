import Tareas.Trabajador;



public class TeamDriverB extends Trabajador{
    public TeamDriverB(String nombre, String rol,double tiempo) {
        super(nombre, rol,tiempo);
    }

    private String conductorA;
    private int cantidadPersonas;

    //hacer el array y sumar los valores de doubles

    //imprimir mensaje para el conductor asignado
    public static void mensajeConductorB(String conductorB){
        System.out.println("El conductor elegido para este auto es: "+conductorB);
    }
}







