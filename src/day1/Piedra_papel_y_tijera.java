package day1;

import java.util.Scanner;

public class Piedra_papel_y_tijera {
    public static void main(String[] args) {

        System.out.println("Bienvenido al juego de piedra papel y tijera");
        System.out.println("Favor ingrese su nombre para empezar a jugar");

        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);

        System.out.println("Elije: 1=piedra, 2=papel, 3=tijera");

        int numeroIngresadoPorJugador = scanner.nextInt();
        String eleccionJugador = "";

        if (numeroIngresadoPorJugador == 1) {
            eleccionJugador = "Piedra";
            System.out.println("Elegiste " + eleccionJugador);

        }
        if (numeroIngresadoPorJugador == 2) {
            eleccionJugador = "Papel";
            System.out.println("Elegiste " + eleccionJugador);

        }
        if (numeroIngresadoPorJugador == 3) {
            eleccionJugador = "Tijera";
            System.out.println("Elegiste " + eleccionJugador);

        }

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        double randomNumber = Math.random();
        String elecciondecomputadora = "";

        if (randomNumber <= 0.3) {
            elecciondecomputadora = "Piedra";
            System.out.println("La computadora eligió " + elecciondecomputadora);

        } else if (randomNumber <= 0.6) {
            elecciondecomputadora = "Papel";
            System.out.println("La computadora eligió " + elecciondecomputadora);

        } else if (randomNumber <= 1) {
            elecciondecomputadora = "Tijera";
            System.out.println("La computadora eligió " + elecciondecomputadora);

        }

        ////////////////////////////////////////////////////////////////////////////////////////

        if (eleccionJugador == "Tijera" && elecciondecomputadora == "Papel") {
            System.out.println("Gano " + nombre);

        }
        if (eleccionJugador == "Tijera " && elecciondecomputadora == "Piedra") { 
            System.out.println("Perdiste " + nombre);

        }
        if (eleccionJugador == "Tijera" && elecciondecomputadora == "Tijera") {
            System.out.println("Empate");

        }
        if (eleccionJugador == "Papel" && elecciondecomputadora == "Piedra") {
            System.out.println("Gano " + nombre);

        }
        if (eleccionJugador == "Papel" && elecciondecomputadora == "Tijera") {
            System.out.println("Perdiste " + nombre);

        }
        if (eleccionJugador == "Papel" && elecciondecomputadora == "Papel") {
            System.out.println("Empate");

        }
        if (eleccionJugador == "Piedra" && elecciondecomputadora == "Piedra") {
            System.out.println("Empate");

        }
        if (eleccionJugador == "Piedra" && elecciondecomputadora == "Papel") {
            System.out.println("Perdiste " + nombre);

        }
        if (eleccionJugador == "Piedra" && elecciondecomputadora == "Tijera") {
            System.out.println("Gano " + nombre);

        }

    }

}
