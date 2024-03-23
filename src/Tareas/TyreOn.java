package Tareas;
//Se evidencia herencia
public class TyreOn extends Trabajador{
    //Constructor de la clase
    public TyreOn(String nombre, String rol,double tiempo) {
        super(nombre, rol,tiempo);
    }
    //Dos metodos diferentes de la clase
    private static void EsperarDespeje(double tiempo){
        System.out.println( "Esperando para poner la llanta,tiempo estimado: "+ tiempo); }

    private static void PonerLlantas(double tiempo){
        System.out.println( "Ubicando la llanta en el ring, tiempo estimado: "+tiempo); }

}
