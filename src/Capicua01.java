import java.util.Scanner;

public class Capicua01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: "); // validar un rango de numeros
        int numero = scanner.nextInt();


        String numeroString = String.valueOf(numero); // convierte el numero a string
        boolean esCapicua = true;

        for (int i = 0; i < numeroString.length() / 2; i++) {

            if (numeroString.charAt(i) != numeroString.charAt(numeroString.length() - 1 - i)) {
                esCapicua = false;
                break;
            }

        }

        System.out.println((esCapicua) ? "Es capicua" : "No es capicua");
    }
}