import Tareas.*;
import java.util.ArrayList;
import java.util.List;



public class PitCrewTeam {

    int cantMiembros;
    //Creacion de las listas
    private static List<Trabajador> listaTrabajadores = new ArrayList<>();
    private static List<Trabajador> teamDriverA = new ArrayList<>();
    private static List<Trabajador> teamDriverB = new ArrayList<>();

    public PitCrewTeam() {

    }
//los Get de las listas
    public List<Trabajador> getTeamDriverA() {
        return teamDriverA;
    }


    public List<Trabajador> getTeamDriverB() {
        return teamDriverB;
    }

     //Metodo para adicionar elemetos ala lista trbajadores
    public void adicionar(Trabajador trabajador) {
        listaTrabajadores.add(trabajador);
    }

    //metodo para imprimir la lista trabajadores
    public static void imprimirListaTrabajadores(List<Trabajador> listaTrabajadores) {
        for (Trabajador trabajador : PitCrewTeam.listaTrabajadores) {
            trabajador.atributos();
            System.out.println(); // Agrega una línea en blanco para separar los trabajadores
        }
    }

   //Creador de objetos segun su rol
    public void categorizarTrabajadores(String nombre, String rol, double tiempo) {
        Trabajador trabajador = null;

        switch (rol) {
            case "FlapAdjust":
                trabajador = new FlapAdjust(nombre, rol, tiempo);
                break;

            case "FrontJack":
                trabajador = new FrontJack(nombre, rol, tiempo);
                break;

            case "Lollipop":
                trabajador = new Lollipop(nombre, rol, tiempo);
                break;

            case "RearJack":
                trabajador = new RearJack(nombre, rol, tiempo);
                break;

            case "Steadier":
                trabajador = new Steadier(nombre, rol, tiempo);
                break;

            case "TyreGunner":
                trabajador = new TyreGunner(nombre, rol, tiempo);
                break;

            case "TyreOff":
                trabajador = new TyreOff(nombre, rol, tiempo);
                break;

            case "TyreOn":
                trabajador = new TyreOn(nombre, rol, tiempo);
                break;

            default:
                System.out.println("Rol desconocido: " + rol);
                break;
        }

    }

  //Se dividiran los travajadores en dos grupos , A y B
    public static void separarEquipo(List<Trabajador> listaTrabajadores) {

        int flapAdjustCount = 0;
        int frontJackCount = 0;
        int lollipopCount = 0;
        int rearJackCount = 0;
        int steadierCount = 0;
        int tyreGunnerCount = 0;
        int tyreOffCount = 0;
        int tyreOnCount = 0;

        for (Trabajador trabajador : PitCrewTeam.listaTrabajadores) {
            switch (trabajador.getRol()) {
                case "FlapAdjust":
                    if (flapAdjustCount < 2) {
                        teamDriverA.add(trabajador);
                        flapAdjustCount++;
                    } else {
                        teamDriverB.add(trabajador);
                    }
                    break;
                case "FrontJack":
                    if (frontJackCount < 1) {
                        teamDriverA.add(trabajador);
                        frontJackCount++;
                    } else {
                        teamDriverB.add(trabajador);
                    }
                    break;
                case "Lollipop":
                    if (lollipopCount < 2) {
                        teamDriverA.add(trabajador);
                        lollipopCount++;
                    } else {
                        teamDriverB.add(trabajador);
                    }
                    break;
                case "RearJack":
                    if (rearJackCount < 1) {
                        teamDriverA.add(trabajador);
                        rearJackCount++;
                    } else {
                        teamDriverB.add(trabajador);
                    }
                    break;
                case "Steadier":
                    if (steadierCount < 2) {
                        teamDriverA.add(trabajador);
                        steadierCount++;
                    } else {
                        teamDriverB.add(trabajador);
                    }
                    break;
                case "TyreGunner":
                    if (tyreGunnerCount < 4) {
                        teamDriverA.add(trabajador);
                        tyreGunnerCount++;
                    } else {
                        teamDriverB.add(trabajador);
                    }
                    break;
                case "TyreOff":
                    if (tyreOffCount < 4) {
                        teamDriverA.add(trabajador);
                        tyreOffCount++;
                    } else {
                        teamDriverB.add(trabajador);
                    }
                    break;
                case "TyreOn":
                    if (tyreOnCount < 4) {
                        teamDriverA.add(trabajador);
                        tyreOnCount++;
                    } else {
                        teamDriverB.add(trabajador);
                    }
                    break;
                default:
                    System.out.println("Rol desconocido: " + trabajador.getRol());
                    break;
            }
        }

       //implementacion para asegurarse que los grupos para cada uno no son mayores de 5
        while (teamDriverA.size() < 5) {
            teamDriverA.add(PitCrewTeam.listaTrabajadores.remove(0));
        }

        while (teamDriverB.size() < 5) {
            teamDriverB.add(PitCrewTeam.listaTrabajadores.remove(0));
        }


    }
  //metodo para hacer la sumatoria y imprimir la frase de ganaste o perdiste
    public static void Tiempo(List<Trabajador> TeamDriverA, List<Trabajador> TeamDriverB) {
        double TiempoTDA = 0;
        double TiempoTDB = 0;
        for (int i = 0; i < TeamDriverA.size(); i++) {
            TiempoTDA = TiempoTDA + TeamDriverA.get(i).getTiempo();
        }
        for (int i = 0; i < TeamDriverB.size(); i++) {
            TiempoTDB = TiempoTDB + TeamDriverB.get(i).getTiempo();
        }
        if (TiempoTDA <= 2) {
            System.out.println("Gano A");
        } else if (TiempoTDA > 2) {
            System.out.println("Perdio ");
        }
        if (TiempoTDB > 2) {
            System.out.println("Gano B");
        } else if (TiempoTDB < 2) {
            System.out.println("Perdio B");
        }
    }

    public Iterable<? extends Trabajador> getListaTrabajadores() {
        Iterable<? extends Trabajador> o = null;
        return o;
    }

}
