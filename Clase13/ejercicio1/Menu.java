package Clase13.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    List<Figura> figurasCreadas = new ArrayList<>();
    private boolean mostarMenu = true;

    public boolean getMostrarMenu(){
        return mostarMenu;
    }

    public void mostrarMenuPrincipal(){
        System.out.println("------------------------------------");
        System.out.println("Ingrese 1 para crear una figura");
        System.out.println("Ingrese 2 para mostrar sumatoria de areas");
        System.out.println("Ingrese 3 para salir");
        System.out.println("------------------------------------");
    }

    public void mostrarMenuFiguras(){
        System.out.println("------------------------------------");
        System.out.println("Ingrese 1 para crear un circulo");
        System.out.println("Ingrese 2 para crear un triangulo");
        System.out.println("Ingrese 3 para crear un rectangulo");
        System.out.println("Ingrese 4 para volver");
        System.out.println("------------------------------------");

        checkearRespuestaUsuarioMenuFiguras();
    }

    private void checkearRespuestaUsuarioMenuFiguras() {
        int seleccionUsuario = teclado.nextInt();

        switch (seleccionUsuario){
            case 1:
                recibirDatosCirculo();
                break;
            case 2:
                recibirDatosPoligonoRegular(2);
                break;
            case 3:
               recibirDatosPoligonoRegular(3);
                break;
            case 4:
                mostrarMenuPrincipal();
                break;
            default: mostrarMenuFiguras();
        }
    }

    private void recibirDatosCirculo() {
        System.out.println("Ingresa el radio del circulo");
        double radioCirculo = teclado.nextDouble();
        Circulo circulo = new Circulo();
    }

    private void recibirDatosPoligonoRegular(int seleccionUsuario) {
        System.out.println("Ingresa la base");
        double base = teclado.nextDouble();
        System.out.println("Ingresa la altura");
        double altura = teclado.nextDouble();
        if (seleccionUsuario==2){
            Triangulo triangulo = new Triangulo(base, altura);
        }else{
            Rectangulo rectangulo = new Rectangulo(base,altura);
        }
    }
    public void checkearRespuestaUsuarioMenuPrincipal() {
        int seleccionUsuario = teclado.nextInt();

        switch (seleccionUsuario){
            case 1:
                mostrarMenuFiguras();
                break;
            case 2:
                calcularSumatoriaAreas();
                break;
            case 3:
                mostarMenu = false;
                break;
            default:
                System.out.println("La opcion ingresada no es valida");
                break;

        }
    }

    public void calcularSumatoriaAreas(){
        double areaTotal = 0;
        for (var figura :figurasCreadas) {
            areaTotal = areaTotal + figura.calcularArea();
        }

        System.out.println("El area total es: " + areaTotal);
    }



}
