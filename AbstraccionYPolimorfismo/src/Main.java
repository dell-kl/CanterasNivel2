import Data.RegistrarNave;
import Data.RegistrarTipoLanzadera;
import Data.RegistrarTipoNoTripulada;
import Data.RegistrarTipoTripulada;
import Naves.Lanzadera;
import Naves.Robotica;
import Naves.Tripulada;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
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

    public static void RegistrarNave() throws IOException {
        while(true){
            System.out.println("====================== ESCOGE TU TIPO DE NAVE =================");
            System.out.println("[1] Naves.Lanzadera");
            System.out.println("[2] Naves.Tripulada");
            System.out.println("[3] Naves.Robotica");
            System.out.println("[4] Regresar");
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
                    Tripulada tripulada = new Tripulada();
                    tripulada.setPeso(4000);
                    tripulada.setNombre("Zeta X");
                    tripulada.setVelocidad(3000);
                    new RegistrarNave(new RegistrarTipoTripulada()).GenerarGuardado(tripulada);
                    break;
                case "3":
                    Robotica robotica = new Robotica();
                    robotica.setPeso(4000);
                    robotica.setNombre("Zeta Y");
                    robotica.setVelocidad(3000);
                    new RegistrarNave(new RegistrarTipoNoTripulada()).GenerarGuardado(robotica);
                    break;
            }
        }
    }

    public static void UsarNave() {

    }
}
