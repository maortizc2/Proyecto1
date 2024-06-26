package Tareas;

public  class Trabajador {
    //Abstrancion y encapsulamiento
    //Atributos de la clase
    private String nombre;
    private String rol;
    private double tiempo;

    //Constructor de la clase
    public Trabajador(String nombre, String rol, double tiempo){
        this.nombre = nombre;
        this.rol = rol;
        this.tiempo = tiempo;
    }

  //Metodo propio de la clase
    public void atributos(){
        System.out.println("El nombre del trabajador es: "+ nombre);
        System.out.println("Su rol es : "+ rol);
        System.out.println("Su tiempo es : "+ tiempo);
    }

    //Metodo propio de la clase
    public void descansar (){
        System.out.println(nombre + " Puede descansar");
    }

    //Getter and setter
    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
}

