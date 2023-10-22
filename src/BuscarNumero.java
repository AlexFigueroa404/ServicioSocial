public class BuscarNumero {
    public static void main(String[] args) {

        int[][] board = {{1,2,3},{20,46,4}, {10,-1,5}};

        int numeroBuscar = 46;

        boolean encontrado = false;



        for (int fila = 0; fila < board.length ; fila++) {
            for (int columna = 0; columna < board[fila].length ; columna++) {
                if(board[fila][columna] == numeroBuscar){
                    encontrado = true;
                    System.out.printf("EL numero se encontro en (%d,%d)",fila,columna);
                }
            }
        }





    }
}
