import java.util.Arrays;

public class TransponerMatriz {


    static void print(int[][] matriz) {

        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }

    }

    public static void main(String[] args) {
        int[][] numeros = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},};
        print(numeros);


        int aux;
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < fila; columna++) {
                aux = numeros[fila][columna];

                numeros[fila][columna] = numeros[columna][fila];
                numeros[columna][fila] = aux;

            }
        }

        System.out.println("-----------");
        print(numeros);


    }
}
