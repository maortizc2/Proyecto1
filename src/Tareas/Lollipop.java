package Tareas;
//se evidencia la herencia
public class Lollipop extends Trabajador{
    //Constructor de la clase
    public Lollipop(String nombre, String rol,double tiempo){
        super(nombre,rol,tiempo);
    }

    //Dos metodos diferentes para clase
    public static void detenerConductor(double tiempo){
    System.out.println("Deteniendo conductor, tiempo estimado: "+tiempo);}
    public static void  salida(double tiempo){
        System.out.println("Dando señal de salida, tiempo estimado: "+tiempo);
    }
//tiempo estimado del rol 0,2 sg
}

