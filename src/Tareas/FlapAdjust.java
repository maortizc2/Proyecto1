package Tareas;

//Se evidencia la herencia
public class FlapAdjust  extends Trabajador{

    //constructor de la clase
    public FlapAdjust(String nombre, String rol,double tiempo){
        super(nombre,rol,tiempo);
    }

    //dos metodos propios de la clase
    public static void AjustarFlap(double tiempo){
        System.out.println("Ajustando flap, tiempo estimado: "+tiempo );
    }
    public static void ponerNuevaAla(double tiempo){
        System.out.println("Poniendo nueva ala, tiempo estimado: "+tiempo);
    }
    //tiempo estimado del rol 0,5

}
