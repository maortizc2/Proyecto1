import Tareas.*;

import java.util.ArrayList;
import java.util.List;



public class PitCrewTeam {

    int cantMiembros;

    private static List<Trabajador> listaTrabajadores = new ArrayList<>();
    private static List<Trabajador> teamDriverA = new ArrayList<>();
    private static List<Trabajador> teamDriverB = new ArrayList<>();

    public PitCrewTeam() {
    }


    public void adicionar(Trabajador trabajador) {
        listaTrabajadores.add(trabajador);
    }


    public static void imprimirListaTrabajadores() {
        for (Trabajador trabajador : listaTrabajadores) {
            System.out.println(trabajador);
        }
    }



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



    public static void separarEquipo(){

        int flapAdjustCount = 0;
        int frontJackCount = 0;
        int lollipopCount = 0;
        int rearJackCount = 0;
        int steadierCount = 0;
        int tyreGunnerCount = 0;
        int tyreOffCount = 0;
        int tyreOnCount = 0;

        for (Trabajador trabajador : listaTrabajadores) {
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


        while (teamDriverA.size() < 5) {
            teamDriverA.add(listaTrabajadores.remove(0));
        }

        while (teamDriverB.size() < 5) {
            teamDriverB.add(listaTrabajadores.remove(0));
        }


    }

    public static int Tiempo(int tiempo){
        return tiempo;
    }



}
