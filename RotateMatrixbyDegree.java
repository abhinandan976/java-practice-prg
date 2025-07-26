import java.util.*;
public class RotateMatrixbyDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix (n * n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the degrese to rotate the matrix(multiple of 90): ");
        int degree = sc.nextInt();
        int rotateCount = (degree / 90) % 4;

        for(int rotation = 0; rotation < rotateCount; rotation++) {
            int [][] temp = new int[n][n];

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    temp[j][n - i - 1] = matrix[i][j];
                }
            }

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    matrix[i][j] = temp[i][j];
                }
            }
        }


        // print the rotated matrix
        // print the rotated matrix
        System.out.println("Rotated Matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
