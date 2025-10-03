//Ejercicio 3: Requisitos para el cuartel
//Objetivo: Determinar si un estudiante cumple (≥18 años y altura ≥ 1.60 m).
//Entradas: edad (int), altura (double).
//Salida: “Cumple” o “No cumple”.
//Reglas: edad y altura deben ser positivas
// practica en el curso subir de nuevo todo

import java.util.Scanner;

public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("REQUISITO PARA EL CUARTEL");

        int edad;
        double altura;

        while (true) {
            System.out.print("Ingrese tu Edad: ");
            edad = input.nextInt();
            System.out.print("Ingrese tu Estatura en metros (ej: 1.75): ");
            altura = input.nextDouble();

            if (edad < 0 || altura <= 0) {
                System.out.println("La edad y estatura no pueden ser menores o iguales a 0.\n");
                continue;
            }
            if (edad < 18 || altura < 1.60) {
                System.out.println("No cumples la edad o la estatura mínima para el cuartel.\n");
            } else {
                System.out.println("Cumples la edad y estatura para el cuartel.");
                break;
            }
        }
    }
}
