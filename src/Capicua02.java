import java.util.Scanner;

public class Capicua02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: "); // validar un rango de numeros
        int numero = scanner.nextInt();

        int numeroInvertido = 0;
        int numeroOriginal = numero;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        System.out.println((numeroInvertido == numeroOriginal) ? "Es capicua" : "No es capicua");
    }
}