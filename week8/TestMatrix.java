public class TestMatrix {
    public static void main(String[] args) { 
        String[][] m = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" }, { "10", "11", "12"} };

        Matrix<String> matrix = new Matrix<String>(m);


        System.out.println("Print matrix: ");
        System.out.println(matrix.toString());

        matrix.setDirection("fr");
        System.out.println("Print matrix forward row-wise");
        printMatrix(matrix);

        matrix.setDirection("br");
        System.out.println("Print matrix backward row-wise");
        printMatrix(matrix);

        matrix.setDirection("fc");
        System.out.println("Print matrix forward column-wise");
        printMatrix(matrix);

        matrix.setDirection("bc");
        System.out.println("Print matrix backward column-wise");
        printMatrix(matrix);

    }

    private static void printMatrix(Matrix<String> matrix){
        String result = "";
        for(String elem : matrix){
            result += elem + ", ";
        }
        System.out.println(result+ "\n");
    }
}
