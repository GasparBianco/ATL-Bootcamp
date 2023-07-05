package clase5;

import java.util.Scanner;

public class Actividad_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cuantas millas quiere convertir a km");
        double millas = sc.nextDouble();

        double km = millas*1.60934 ;

        System.out.println(millas + " millas es el equivalente a: " + km);

    }
}
