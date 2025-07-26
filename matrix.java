
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[][] temp = new int[n][n];
        for(int i =0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                temp[j][i] = matrix[i][j];
            }
        }

        // rotate the matrix by 90 degrees clockwise
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n;j++) {
                matrix[i][j] = temp[n - j - 1][i];
            }
        }

        //print the rotated matrix

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
