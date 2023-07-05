package clase6;

import java.util.Random;
import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args){

        int seleccionDelJugador = getSeleccionDelJugador();

        int numeroAleatorio = getEleccionIA();

        eleccionGanador(seleccionDelJugador, numeroAleatorio);

    }

    private static int getSeleccionDelJugador() {
        System.out.println("ingresa 1 para elegir piedra");
        System.out.println("Ingresa 2 para elegir papel");
        System.out.println("Ingresa 3 para elegir tijera");

        Scanner sc = new Scanner(System.in);
        int seleccionDelJugador = sc.nextInt();
        return seleccionDelJugador;
    }

    private static int getEleccionIA() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(2) + 1;
        return numeroAleatorio;
    }

    private static void eleccionGanador(int seleccionDelJugador, int numeroAleatorio) {
        if (seleccionDelJugador == numeroAleatorio){
            System.out.println("El resultado fue un empate!");
        }else if (seleccionDelJugador == 1){
            if (numeroAleatorio == 2){
                System.out.println("Perdiste, la IA eligio papel");
            }else{
                System.out.println("Ganaste! la IA eligio tijera");
            }
        }else if(seleccionDelJugador == 2){
            if (numeroAleatorio == 1){
                System.out.println("Ganaste! La IA eligio piedra");
            } else {
                System.out.println("Perdiste, la IA eligio tijera");
            }
        }else{
            if(numeroAleatorio == 1){
                System.out.println("Perdiste, la IA eligio piedra");
            }else{
                System.out.println("Ganaste! la IA eligio papel");
            }
        }
    }
}
