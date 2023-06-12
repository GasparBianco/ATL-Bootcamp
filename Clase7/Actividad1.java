package Clase7;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 1 numero y presione enter 5 veces.");
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[3] = sc.nextInt();
        numeros[4] = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println("Los numeros ingresados son: " + numeros[i]);
        }




    }

}

