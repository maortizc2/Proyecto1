package Tareas;

public class Steadier extends Trabajador{

    public Steadier(String nombre, String rol, double tiempo){
        super(nombre,rol, tiempo);
    }

    public static void estabilizarCoche(double tiempo){
        System.out.println("Estabilizando el coche, el tiempo estimado: "+tiempo);
    }
    public static void manteniendoEstabilidad(double tiempo){
        System.out.println("Manteniendo el equilibrio del auto, el tiempo estimado: "+tiempo);
    }
    //tiempo estimado del rol es 0,8;
}
