package net.salesianos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

import net.salesianos.investigadores.Investigadores;
import net.salesianos.investigadores.biologos.Biologo;
import net.salesianos.investigadores.matematicos.Matematico;
import net.salesianos.investigadores.quimicos.Quimicos;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        ArrayList<Investigadores> sede = new ArrayList<>();
        sede.add(new Matematico("Gauss", "Álgebra", 1900));
        sede.add(new Biologo("Margulis", "Bacterias", 1400));
        sede.add(new Quimicos("Mendeleiev", "Gases", 1150));

        System.out.println("--- BIENVENIDO A LA SEDE ---");

        do {
            try {
                System.out.println("1. Probar Matemático");
                System.out.println("2. Probar Biólogo");
                System.out.println("3. Probar Químico");
                System.out.println("4. Salir");
                System.out.print("Elige una opción: ");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        probarMatematico((Matematico) sede.get(0));
                        break;
                    case 2:
                        probarBiologo((Biologo) sede.get(1));
                        break;
                    case 3:
                        probarQuimico((Quimicos) sede.get(2));
                        break;
                    case 4:
                        System.out.println("saliendo ...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Mano hay va un número ");
                teclado.nextLine(); 
                opcion = 0; 
            } finally {
                System.out.println("Fin de la acción");
            }

        } while (opcion != 4);

        teclado.close();
    }


    public static void probarMatematico(Matematico m) {
        System.out.println("El matematico es: ");
        m.Identificacion(); 
        m.CalculoBasico(5, 2);
        m.EstadoSueldo();
        m.Trabajar(3);
    }

    public static void probarBiologo(Biologo b) {
        System.out.println("El biologo es: ");
        b.Identificacion();
        b.EstadoSueldo();
        b.añadirEspecimen("Cordyceps ");
        b.añadirEspecimen("Virus-T");
        b.Trabajar();
    }

    public static void probarQuimico(Quimicos q) {
        System.out.println("El quimico es: ");
        q.Identificacion();
        q.EstadoSueldo();
        q.añadirElemento("Oxígeno");
        q.añadirElemento("Hidrógeno");
        q.Trabajar(); 
    }
}