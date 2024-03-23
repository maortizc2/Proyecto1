package Tareas;
//se evidencia herencia
public class TyreGunner extends Trabajador {
    private int time;

    public TyreGunner(String nombre, String rol, double tiempo){
        super(nombre,rol,tiempo);
    }

    public static void AflojarNeumatico(double tiempo){
        System.out.println("Aflojando neumatico, tiempo estimado: "+tiempo);
    }
    public static void ApretarNeumatico(double tiempo ){
        System.out.println("Apretando neumatico, tiempo estimado: "+tiempo);
    }
    //tiempo estimado del rol 0,4sg
}
