package Tareas;

public class TyreOn extends Trabajador{

    public TyreOn(String nombre, String rol,double tiempo) {
        super(nombre, rol,tiempo);
    }

    private static void EsperarDespeje(double tiempo){
        System.out.println( "Esperando para poner la llanta,tiempo estimado: "+ tiempo);
    }

    private static void PonerLlantas(double tiempo){
        System.out.println( "Ubicando la llanta en el ring, tiempo estimado: "+tiempo);
    }



}
