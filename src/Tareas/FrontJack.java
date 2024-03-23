package Tareas;
//Se evidencia la herencia
public class FrontJack extends Trabajador {
    //constructor de la clase
    public FrontJack(String nombre, String rol,double tiempo){
        super(nombre,rol,tiempo);
    }
    //Dos metodos propios de la clase
    public static void SubirCarro(double tiempo){
        System.out.println("Subiendo el carro , tiempo estimado: "+tiempo);
    }
    public static void BajarCarro(double tiempo){
        System.out.println("Bajando el carro, tiempo estimado: "+tiempo);
    }
    //tiempo estimado del rol 0.7
}
