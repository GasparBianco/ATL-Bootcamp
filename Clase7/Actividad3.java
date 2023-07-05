package Clase7;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 1 numero y presione enter 5 veces.");
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[3] = sc.nextInt();
        numeros[4] = sc.nextInt();

        float promedio = (float) Arrays.stream(numeros).sum() /numeros.length ;
        System.out.println("El promedio es: " + promedio);
    }
}
