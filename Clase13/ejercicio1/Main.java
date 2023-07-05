package Clase13.ejercicio1;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        do {
            menu.mostrarMenuPrincipal();
            menu.checkearRespuestaUsuarioMenuPrincipal();
        } while (menu.getMostrarMenu());
    }
}
