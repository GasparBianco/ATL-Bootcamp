package Clase13.ejercicio2;

import Clase13.ejercicio2.menu.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int seleccionUsuario;
        do{
            Menu.mostrarMenuPrincipal();
            seleccionUsuario = teclado.nextInt();

        }while(seleccionUsuario != 4);


    }
}
