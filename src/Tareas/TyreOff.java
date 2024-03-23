package Tareas;
//se evidencia herencia
public class TyreOff extends Trabajador{

    public TyreOff(String nombre, String rol,double tiempo){
        super(nombre,rol,tiempo);
    }

    public static void EsperarDespeje(double tiempo){
        System.out.println("Esperando despeje , tiempo estimado: " + tiempo);
    }
    public static void RemoverLlanta(double tiempo){
        System.out.println("Removiendo Llantas, tiempo estimado: "+ tiempo);
    }
    //tiempo total de este rol 0.4;
}
