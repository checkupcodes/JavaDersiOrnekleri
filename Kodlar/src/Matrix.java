import java.util.Random;

public class Matrix {
    public static void main(String[] args) {

        Random r = new Random();
        int[][] matrix1 = new int[5][5];
        int[][] matrix2 = new int[5][5];
        int[][] sumMatrixes = new int[5][5];

        for(int i = 0 ; i<matrix1.length;i++){
            for(int j = 0;sumMatrixes.length;j++){
                matrix1[i][j] = r.nextInt(3);
                matrix2[i][j] = r.nextInt(3);
                sumMatrixes[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i = 0; i<sumMatrixes.length;i++){
            System.out.println("\t \t |");
            for(int j = 0;j<sumMatrixes[i].length;j++){
                System.out.println(sumMatrixes[i][j] + " ");
            }

            System.out.println(" | ");
        }
}
