public class Marco {

    public static void main(String[] args) {


        int[][] matriz = new int[6][6];


        for (int row = 0; row < matriz.length; row++) {

            for (int column = 0; column < matriz[0].length; column++) {

                if (row == 0 || row == matriz.length - 1) {

                    matriz[row][column] = 1;
                }

                if (column == 0 || column == matriz[0].length - 1) {

                    matriz[row][column] = 1;
                }
            }
        }



        // print the matrix
        for (int row = 0; row < matriz.length; row++) {
            for (int column = 0; column < matriz[0].length; column++) {
                System.out.print(matriz[row][column] + " ");
            }
            System.out.println();
        }


    }
}
