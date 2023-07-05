package clase5;

import java.util.Scanner;

public class Actividad_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio original del producto");
        double valorOriginal = sc.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento");
        double descuento = sc.nextDouble();


        double valorFinal = valorOriginal * (1-descuento/100) ;

        System.out.println("El valor final es: " + valorFinal);

    }
}
