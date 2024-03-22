public class Carro2 extends TeamDriverB {

    private String  referenciaCarro;

    public Carro2(String nombre, String rol, double tiempo) {
        super(nombre, rol, tiempo);
    }

    //verificar que los datos ingresados en le metodo si son el resultado de la opercaion de teamB
    public static void TiempoPits(int tiempoTotal,int cantidadPersonas ){
       int  result=tiempoTotal/cantidadPersonas;
        System.out.println(result);
    }
    public static void tiempoLlegada(int tiempo){
        if (tiempo > 5){
            System.out.println("Perdiste");
        }else{
            System.out.println("Ganaste");
        }
    }
}
