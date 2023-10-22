public class DiagonalPrincipal {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];


        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                if (fila == columna) {
                    matriz[fila][columna] = 1;
                }
            }
        }

        // print the matrix
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }

    }
}
