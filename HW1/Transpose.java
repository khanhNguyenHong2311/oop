import java.util.Scanner;
/**
 * Exercise 1.4.14 : Transpose a square two-dimensional array in place without creating a second array
 * @param n n is the order of matrix
 * @return transposed matrix
 */
public class Transpose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[][] transposedMatrix = new int[n][n];

        // init
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // transposed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                transposedMatrix[j][i] = temp;
                matrix[i][j] = transposedMatrix[j][i];
            }
        }

        // print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}