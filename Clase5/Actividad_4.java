package Clase5;

import java.util.Scanner;

public class Actividad_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta");
        double cuenta = sc.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea dejar");
        double porcentajePropina = sc.nextDouble();

        double propina = cuenta*porcentajePropina/100 ;

        System.out.println("La cantidad de propina que debe dejar es: " + propina);

    }
}
