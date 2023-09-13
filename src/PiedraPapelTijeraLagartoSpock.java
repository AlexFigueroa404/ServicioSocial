import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeraLagartoSpock {
    public static void main(String[] args) {
        Random random = new Random();
        int computerOption = random.nextInt(5) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su opción:\n1. Piedra\n2. Papel\n3. Tijera\n4. Lagarto\n5. Spock");
        int userOption = scanner.nextInt();


        String computerOptionString = (computerOption == 1) ? "PIEDRA" : (computerOption == 2) ? "PAPEL" : (computerOption == 3) ? "TIJERA" : (computerOption == 4) ? "LAGARTO" : "SPOCK";

        String userOptionString = (userOption == 1) ? "PIEDRA" : (userOption == 2) ? "PAPEL" : (userOption == 3) ? "TIJERA" : (userOption == 4) ? "LAGARTO" : "SPOCK";

        System.out.println("La opción de la computadora es: " + computerOptionString);

        System.out.println("La opción del usuario es: " + userOptionString);


        if (computerOption == userOption) {
            System.out.println("Empate");
        } else if (userOption == 1 && computerOption == 3 || userOption == 1 && computerOption == 4) {
            System.out.println("Gana el usuario");
        } else if (userOption == 2 && computerOption == 1 || userOption == 2 && computerOption == 5) {
            System.out.println("Gana el usuario");
        } else if (userOption == 3 && computerOption == 2 || userOption == 3 && computerOption == 4) {
            System.out.println("Gana el usuario");
        } else if (userOption == 4 && computerOption == 5 || userOption == 4 && computerOption == 2) {
            System.out.println("Gana el usuario");
        } else if (userOption == 5 && computerOption == 1 || userOption == 5 && computerOption == 3) {
            System.out.println("Gana el usuario");
        } else {
            System.out.println("Gana la computadora");
        }
    }
}