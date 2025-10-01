//Ejercicio 1: Registro de inventarios de plásticos
//Objetivo: Registrar producto plástico y calcular valor total de stock.
import  java.util.Scanner;
public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Cuántos productos quieres agregar? ");
        int cantidad = input.nextInt();
        input.nextLine();

        String[] nombre = new String[cantidad];
        double[] precio = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("PRODUCTO #" + (i + 1));
            System.out.print("Nombre del producto: ");
            nombre[i] = input.nextLine();

            System.out.print("Precio del producto: ");
            precio[i] = input.nextDouble();
            input.nextLine();
        }

        double total = 0;
        System.out.println("\nResumen de productos:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(nombre[i] + " - $" + precio[i]);
            total += precio[i];
        }

        System.out.println("Valor total del stock: $" + total);
    }
}