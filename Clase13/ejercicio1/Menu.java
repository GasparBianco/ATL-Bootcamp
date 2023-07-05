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
                crearCirculo();
                break;
            case 2:
                crearTriangulo();
                break;
            case 3:
                crearRectangulo();
                break;
            case 4:
                mostrarMenuPrincipal();
                break;
            default: mostrarMenuFiguras();
        }
    }

    private void crearCirculo() {

        System.out.println("Ingresa el radio del circulo");
        double radioCirculo = teclado.nextDouble();
        Circulo circulo = new Circulo();
        circulo.setRadio(radioCirculo);
        figurasCreadas.add(circulo);
        mostrarMenuPrincipal();
    }

    private void crearTriangulo() {

        System.out.println("Ingresa la base del triangulo");
        double baseTriangulo = teclado.nextDouble();
        System.out.println("Ingresa la altura del triangulo");
        double alturaTriangulo = teclado.nextDouble();
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(alturaTriangulo);
        triangulo.setBase(baseTriangulo);
        figurasCreadas.add(triangulo);
        mostrarMenuPrincipal();

    }

    private void crearRectangulo() {

        System.out.println("Ingresa la base del rectangulo");
        double baseRectangulo = teclado.nextDouble();
        System.out.println("Ingresa la altura del rectangulo");
        double alturaRectangulo = teclado.nextDouble();
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAltura(alturaRectangulo);
        rectangulo.setBase(baseRectangulo);
        figurasCreadas.add(rectangulo);
        mostrarMenuPrincipal();


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
