package com.jmpolvillo;
import java.util.Scanner;

public class impcproject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu peso en Kilogramos (Usa , para decimales): ");
        float weight = scanner.nextFloat();
        System.out.println("Tu peso es: " + weight + " Kgs.");

        System.out.println("Introduce tu altura en metros (Usa , para decimales): ");
        float height = scanner.nextFloat();
        System.out.println("Tu altura es: " + height + " metros.");

        float imc = (float) (weight / Math.pow(height, 2));

        System.out.println("Tu Indice de Masa Corporal es: " + imc);

        if (imc < 16.0) {
            System.out.println("Tienes delgadez severa.");
        } else if (imc >= 16.0 && imc < 17.0) {
            System.out.println("Tienes delgadez moderada.");
        } else if (imc >= 17.0 && imc < 18.5) {
            System.out.println("Tienes delgadez leve.");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("Tienes peso normal.");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("Tienes sobrepeso.");
        } else if (imc >= 30.0 && imc < 35.0) {
            System.out.println("Tienes obesidad leve.");
        } else if (imc >= 35.0 && imc < 40.0) {
            System.out.println("Tienes obesidad moderada.");
        } else if (imc >= 40) {
            System.out.println("Tienes obesidad mórbida.");
        }

        scanner.close();

    }
}