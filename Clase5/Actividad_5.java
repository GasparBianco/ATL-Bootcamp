package Clase5;

import java.util.Random;
import java.util.Scanner;

public class Actividad_5 {
    public static void main(String[] args){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entre 1 y 100");
        int numeroUser = sc.nextInt();

        do {
            if (numeroUser != numeroAleatorio) {
                System.out.println("Incorrecto! Ingrese otro numero");
                numeroUser = sc.nextInt();
                }
            } while (numeroUser != numeroAleatorio);

        System.out.println("Correcto! El numero era: "+numeroAleatorio);

    }

}
