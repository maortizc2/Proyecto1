package Tareas;

//se evidencia la herencica
public class RearJack extends Trabajador {

    public RearJack(String nombre, String rol, double tiempo){
        super(nombre,rol, tiempo);
    }
    public static void subirCarro(double tiempo){
        System.out.println("Subiendo el auto, tiempo estimado: "+tiempo);
    }
    public static void bajarcarro(double tiempo){
        System.out.println("Bajando el auto, tiempo estimado: "+tiempo);
    }
    //tiempo estimado del rol 0,2
}
