package Clase7;

import java.util.Scanner;

public class Actividad2 {
    public static void main ( String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros quiere comparar");
        int longitud = sc.nextInt();
        int[] numeros = new int[longitud];
        System.out.println("Ingrese 1 numero y presione enter 5 veces.");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        int numeroMax = numeros[0];
        int numeroMin = numeros[0];

        for (int numero : numeros) {

            if (numeroMin > numero) {
                numeroMin = numero;
            }
            if (numeroMax < numero) {
                numeroMax = numero;
            }
        }
        System.out.println("El numero maximo es: " + numeroMax);
        System.out.println("El numero minimo es: " + numeroMin);
    }
}
