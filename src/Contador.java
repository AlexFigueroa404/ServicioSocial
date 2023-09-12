public class Contador {
    public static void main(String[] args) {


        int contador = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Cantidad de numeros pares: " + contador);

    }
}