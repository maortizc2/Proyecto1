package Tareas;
//Se evidencia herencia
public class TyreGunner extends Trabajador {
    //Constructor de la clase
    public TyreGunner(String nombre, String rol, double tiempo){
        super(nombre,rol,tiempo);
    }

    //Dos metodos propios de la clase
    public static void AflojarNeumatico(double tiempo){
        System.out.println("Aflojando neumatico, tiempo estimado: "+tiempo); }
    public static void ApretarNeumatico(double tiempo ){
        System.out.println("Apretando neumatico, tiempo estimado: "+tiempo); }
    //tiempo estimado del rol 0,4sg
}
