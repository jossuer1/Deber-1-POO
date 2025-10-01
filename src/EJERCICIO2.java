//        Ejercicio 2: Registro de clientes
//        Objetivo: Capturar datos de un cliente y mostrar ficha.
//        Entradas: cedula, nombres, telefono, email.
//        Salida: Ficha en consola.
//        Reglas: validar que los campos no estén vacíos.

import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----- Registro de Clientes -----");
        System.out.print("¿Cuántos clientes vas a registrar?: ");
        int clientes = input.nextInt();
        input.nextLine();

        String[] cedula = new String[clientes];
        String[] nombre = new String[clientes];
        String[] telefono = new String[clientes];
        String[] email = new String[clientes];

        for (int i = 0; i < clientes; i++) {
            System.out.println("\nCliente #" + (i + 1));

            // Nombre
            while (true) {
                System.out.print("Ingrese el Nombre: ");
                nombre[i] = input.nextLine().trim();
                if (!nombre[i].isEmpty()) break;
                else System.out.println("El nombre no puede estar vacío.");
            }

            // Cédula
            while (true) {
                System.out.print("Ingrese la Cédula: ");
                cedula[i] = input.nextLine().trim();
                if (!cedula[i].isEmpty()) break;
                else System.out.println("La cédula no puede estar vacía.");
            }

            // Teléfono
            while (true) {
                System.out.print("Ingrese el Teléfono: ");
                telefono[i] = input.nextLine().trim();
                if (!telefono[i].isEmpty()) break;
                else System.out.println("El teléfono no puede estar vacío.");
            }

            // Email
            while (true) {
                System.out.print("Ingrese el Email: ");
                email[i] = input.nextLine().trim();
                if (!email[i].isEmpty()) break;
                else System.out.println("El email no puede estar vacío.");
            }
        }

        // ficha
        System.out.println("\n----- Fichas de Clientes -----");
        for (int i = 0; i < clientes; i++) {
            System.out.println("Cliente #" + (i + 1));
            System.out.println("Cédula: " + cedula[i]);
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Teléfono: " + telefono[i]);
            System.out.println("Email: " + email[i]);
            System.out.println("----------------------------");
        }
    }
}