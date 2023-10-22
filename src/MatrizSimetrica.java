public class MatrizSimetrica {


    static boolean esSimetrica(int[][] matriz){

        if(matriz.length != matriz[0].length){
            return false;
        }

        for (int fila = 0; fila < matriz.length ; fila++) {
            for (int columna = 0; columna < matriz[fila].length ; columna++) {
                if (matriz[fila][columna] != matriz[columna][fila]){
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {

        int[][] matriz = {{1,2,3},{2,3,4}, {3,4,5}};


        System.out.println(esSimetrica(matriz));



    }
}
