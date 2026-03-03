import Data.RegistrarNave;
import Data.RegistrarTipoLanzadera;
import Naves.Lanzadera;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("====================== PANEL GENERAL DE LA NASA =================");
            System.out.println("[1] Registrar Nave");
            System.out.println("[2] Usar Nave");
            System.out.println("[3] Salir");

            System.out.print("[>] Ejecutar orden : ");
            String opcion = scanner.nextLine();

            if(opcion.equals("3"))
                break;

            switch(opcion){
                case "1":
                    RegistrarNave();
                    break;
                case "2":
                    UsarNave();
                    break;
            }
        }
    }

    public static void RegistrarNave() {
        while(true){
            System.out.println("====================== ESCOGE TU TIPO DE NAVE =================");
            System.out.println("[1] Naves.Lanzadera");
            System.out.println("[2] Naves.Tripulada");
            System.out.println("[3] Naves.Robotica");
            System.out.println("[4] Naves.Robotica");
            System.out.print("[>] Escoge nave : ");
            String opcion = scanner.nextLine();

            if(opcion.equals("4"))
                break;

            switch(opcion){
                case "1":
                    Lanzadera lanzadera = new Lanzadera();
                    lanzadera.setPeso(10000);
                    lanzadera.setNombre("Cohete Morty");
                    lanzadera.setVelocidad(10300);
                    new RegistrarNave(new RegistrarTipoLanzadera()).GenerarGuardado(lanzadera);
                    break;
                case "2":

                    break;
                case "3":
                    break;
            }
        }
    }

    public static void UsarNave() {

    }
}
