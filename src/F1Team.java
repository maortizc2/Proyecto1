import Tareas.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F1Team {


    private String nombre;
    private int añoFundacion;
    private String teamPrincipal;

    //Instancias de  las listas que almacenaran la información de los roles
    private static List<Trabajador> listaTrabajadores = new ArrayList<>();
    private static List<Trabajador> teamDriverA = new ArrayList<>();
    private static List<Trabajador> teamDriverB = new ArrayList<>();

   // se crea el constructor del equipo
    public F1Team(String nombre, int añoFundacion, String teamPrincipal) {
        this.nombre = nombre;
        this.añoFundacion = añoFundacion;
        this.teamPrincipal = teamPrincipal;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoFundacion() {
        return añoFundacion;
    }

    public void setAñoFundacion(int añoFundacion) {
        this.añoFundacion = añoFundacion;
    }

    public String getTeamPrincipal() {
        return teamPrincipal;
    }

    //metodo de un grupo general
    public void setTeamPrincipal(String teamPrincipal) {
        this.teamPrincipal = teamPrincipal;
    }

    // Metodo para crear todos los objetos
    public static void main(String[] args) {


        PitCrewTeam pitCrewTeam = new PitCrewTeam();
        F1Team f1Team = new F1Team("Mercedes", 1970, "Toto Wolff");

        //se evidencia el polimorfismo
        Trabajador trabajador1=new Trabajador("Josep josanson ", "TyreGunner", 0.4);
        Trabajador trabajador2=new Trabajador("Jean Dupont", "TyreGunner",0.4);
        Trabajador trabajador3=new Trabajador("Ivan Ivaov", "TyreGunner", 0.4);
        Trabajador trabajador4=new Trabajador("Luca Rossi", "TyreGunner", 0.4);
//Objetos de Tyre off
        Trabajador trabajador5=new Trabajador("Hans Muller", "TyreOff", 0.4);
        Trabajador trabajador6=new Trabajador("Luca Rossi", "TyreOff ", 0.4);
        Trabajador trabajador7=new Trabajador("Raj Patel", "TyreOff", 0.4);
        Trabajador trabajador8=new Trabajador("Daniel Da Silva", "TyreOff", 0.4);
//Objetos de Tyre On
        Trabajador trabajador9=new Trabajador("Raj Patel", "TyreOn", 0.4);
        Trabajador trabajador10=new Trabajador("mohamed Ahmed", "TyreOn", 0.4);
        Trabajador trabajador11=new Trabajador("John Smith", "TyreOn", 0.4);
        Trabajador trabajador12=new Trabajador("Pedro Gonzales", "TyreOn", 0.4);
//Objetos de Front jack
        Trabajador trabajador13=new Trabajador("Chen Wei", "FrontJack", 0.7);
        Trabajador trabajador14=new Trabajador("Takeshi Yamamoto", "FrontJack", 0.7);
//Objetos de RearJack
        Trabajador trabajador15=new Trabajador("Alexander Petrov", "RearJack", 0.2);
        Trabajador trabajador16=new Trabajador ("Kenji Sato", "RearJack", 0.2);
//Objetos Steadier
        Trabajador trabajador17=new Trabajador("Omar Farsi", "Steadier", 0.8);
        Trabajador trabajador18=new Trabajador("Kofi Annan", "Steadier", 0.8);
//Objetos Flap adjust
        Trabajador trabajador19=new Trabajador("Adam Nowak", "FlapAdjust", 0.5);
//Objetos de Lollipop
        Trabajador trabajador20=new Trabajador("Emre Can", "Lollipop", 0.1);

// Agregar todos los trabajadores a la listaTrabajadores

        pitCrewTeam.adicionar(trabajador1);
        pitCrewTeam.adicionar(trabajador2);
        pitCrewTeam.adicionar(trabajador3);
        pitCrewTeam.adicionar(trabajador4);
        pitCrewTeam.adicionar(trabajador5);
        pitCrewTeam.adicionar(trabajador6);
        pitCrewTeam.adicionar(trabajador7);
        pitCrewTeam.adicionar(trabajador8);
        pitCrewTeam.adicionar(trabajador9);
        pitCrewTeam.adicionar(trabajador10);
        pitCrewTeam.adicionar(trabajador11);
        pitCrewTeam.adicionar(trabajador12);
        pitCrewTeam.adicionar(trabajador13);
        pitCrewTeam.adicionar(trabajador14);
        pitCrewTeam.adicionar(trabajador15);
        pitCrewTeam.adicionar(trabajador16);
        pitCrewTeam.adicionar(trabajador17);
        pitCrewTeam.adicionar(trabajador18);
        pitCrewTeam.adicionar(trabajador19);
        pitCrewTeam.adicionar(trabajador20);


        System.out.println("Sistema F1Team");


        //creacion del menu
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Ver lista de trabajadores");
            System.out.println("2. Ver lista del teamA");
            System.out.println("3. Ver lista del teamB");
            System.out.println("4. Ver cálculo de los tiempos");
            System.out.println("5. Ver datos del quipo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");


            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            //filtrador de categorias
            switch (opcion) {
                case 1:
                    pitCrewTeam.imprimirListaTrabajadores(listaTrabajadores);
                    break;
                case 2:
                    pitCrewTeam.imprimirListaTrabajadores(teamDriverA);
                    break;
                case 3:
                    pitCrewTeam.imprimirListaTrabajadores(teamDriverB);
                    break;
                case 4:
                    pitCrewTeam.Tiempo(pitCrewTeam.getTeamDriverA(), pitCrewTeam.getTeamDriverB());
                    break;
                case 5:
                    System.out.println("Nombre del equipo: " + f1Team.getNombre());
                    System.out.println("Año de fundación: " + f1Team.getAñoFundacion());
                    System.out.println("Team principal: " + f1Team.getTeamPrincipal());
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 0);



    }


}