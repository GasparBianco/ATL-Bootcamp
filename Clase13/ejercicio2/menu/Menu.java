package Clase13.ejercicio2.menu;

public abstract class Menu {
    public static void mostrarMenuPrincipal(){
        System.out.println("-----------------------------------");
        System.out.println("Ingresa 1 para entrar al menu de personajes");
        System.out.println("Ingresa 2 para iniciar un combate");
        System.out.println("Ingresa 3 para salir");
        System.out.println("-----------------------------------");
    }
    public static void mostrarMenuDePersonajes(){
        System.out.println("-----------------------------------");
        System.out.println("Ingresa 1 para crear un personajes");
        System.out.println("Ingresa 2 para eliminar un personaje");
        System.out.println("Ingresa 3 para ver la lista de personajes");
        System.out.println("Ingrese 4 para voler al menu principal");
        System.out.println("-----------------------------------");
    }

}
