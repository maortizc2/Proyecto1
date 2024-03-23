package Tareas;
//Se evidencia herencia
public class TyreOff extends Trabajador{
   //Constuctor de la clase
    public TyreOff(String nombre, String rol,double tiempo){
        super(nombre,rol,tiempo);
    }
  //Dos metodos propios de la clase
    public static void EsperarDespeje(double tiempo){
        System.out.println("Esperando despeje , tiempo estimado: " + tiempo); }
    public static void RemoverLlanta(double tiempo){
        System.out.println("Removiendo Llantas, tiempo estimado: "+ tiempo); }
    //tiempo total de este rol 0.4;
}
