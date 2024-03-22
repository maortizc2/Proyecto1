import Tareas.Trabajador;

public class TeamDriverA extends Trabajador {

    public TeamDriverA(String nombre, String rol, double tiempo) {
        super(nombre, rol, tiempo);
    }

    //hacer el metodo que imprime el mensaje para el piloto
        public static void mensajePilotos(String conductorA){
            System.out.println("El conductor asignado a este carro es:"+conductorA);
        }


}
