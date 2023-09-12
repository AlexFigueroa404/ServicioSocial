import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int acumulador = 0;
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Ingrese un numero: ");
            int numero = scanner.nextInt();
            acumulador += numero;
        }

        System.out.println("El acumulador es: " + acumulador);
    }
}