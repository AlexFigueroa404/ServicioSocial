import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroRandom = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("Bienvenido al juego de Adivina  el numero");
        System.out.println("Estoy pensando en un numero entre 1 y 100. Tu tarea es advinar cual es ese numero.");

        while (intentos < 3 && !adivinado) {

            System.out.println("Intento numero: " + (intentos + 1));
            System.out.println("Introduce tu suposición: ");
            int suposicion = scanner.nextInt();

            if (suposicion > 0 && suposicion <= 100) {

                intentos++;
                if (suposicion == numeroRandom) {
                    adivinado = true;
                } else if (suposicion > numeroRandom) {
                    System.out.println("Te pasaste el numero que buscas es menor");
                } else {
                    System.out.println("Estas muy abajo El numero que buscas es mayor ");
                }

            } else {
                System.out.println("Suposición fuera de rango vuelve a intentarlo");
            }

        }

        if (adivinado) {
            System.out.println("Felicidades Has adivinado el numero: " + numeroRandom + " en " + intentos + " intentos");
        } else {
            System.out.println("Lo siento, has perdidio. El numero secreto era: " + numeroRandom);
        }

    }
}