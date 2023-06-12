package Clase7;

import java.util.Scanner;

public class Actividad2 {
    public static void main ( String[] args){

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 1 numero y presione enter 5 veces.");
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[3] = sc.nextInt();
        numeros[4] = sc.nextInt();

        int numeroMax = numeros[0];
        int numeroMin = numeros[0];

        for (int i = 0; i < 5; i++) {

            if (numeroMin > numeros[i]){
                numeroMin = numeros[i];
            }
            if (numeroMax < numeros[i]){
                numeroMax = numeros[i];
            }

        }

        System.out.println("El numero maximo es: " + numeroMax);
        System.out.println("El numero minimo es: " + numeroMin);
    }
}
