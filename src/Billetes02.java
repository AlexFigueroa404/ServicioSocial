import java.util.Scanner;

public class Billetes02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

         int billetes100 = numero / 100;
         numero %= 100;
         int billetes50 = numero / 50;
         numero %= 50;
         int billetes20 = numero / 20;
         numero %= 20;
         int billetes10 = numero / 10;
         numero %= 10;
         int billetes1 = numero;

         System.out.println("Billetes de 100: " + billetes100);
         System.out.println("Billetes de 50: " + billetes50);
         System.out.println("Billetes de 20: " + billetes20);
         System.out.println("Billetes de 10: " + billetes10);
         System.out.println("Billetes de 1: " + billetes1);
    }
}