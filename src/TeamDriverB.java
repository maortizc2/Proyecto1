import Tareas.Trabajador;

//se ve la herencia y la herencia multiple
public class TeamDriverB extends Trabajador implements Carro2{

    //Constructor de la clase
    public TeamDriverB(String nombre, String rol,double tiempo) {
        super(nombre, rol,tiempo);
    }

    //Imprime el mensaje para el conductor asignado
    public static void mensajeConductorB(String nombre){
        System.out.println("El conductor elegido para este auto es: "+ nombre);
    }
    
    @Override
    public void TiempoPits(double tiempo, int cantidadPersonas) {

    }
}







