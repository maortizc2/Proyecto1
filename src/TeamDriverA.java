import Tareas.Trabajador;
// se evidencia la herencia y la herencia multiple
public class TeamDriverA extends Trabajador implements Carro1{

     //constructor de la clase
    public TeamDriverA(String nombre, String rol, double tiempo,int cantidadPersonas) {
        super(nombre, rol, tiempo);
    }


    //hacer el metodo que imprime el mensaje para el piloto
        public static void mensajePilotos(String nombre){
            System.out.println("El conductor asignado a este carro es:"+ nombre);
        }


    @Override
    public void TiempoPits(double tiempo , int cantidadPersonas) {

    }
}
