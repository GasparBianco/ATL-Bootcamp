package clase5;

import java.util.Scanner;

public class Actividad_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int agnos = sc.nextInt();

        int agnosPerrunos = agnos*7 ;

        System.out.println("Su edad de perro es: " + agnosPerrunos);

    }
}
