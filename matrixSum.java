import java.util.Scanner;

public class matrixSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter dimension of square matrix: ");
        int n = s.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int r = 0;
            for (int j = 0; j < n; j++) {
                r += a[i][j];
            }
            System.out.println("Sum of row " + i + " = " + r);
        }

        for (int j = 0; j < n; j++) {
            int c = 0;
            for (int i = 0; i < n; i++) {
                c += a[i][j];
            }
            System.out.println("Sum of column " + j + " = " + c);
        }

        int d = 0;
        int e = 0;

        for (int i = 0; i < n; i++) {
            d += a[i][i];         
            e += a[i][n - i - 1];   
        }

        System.out.println("Sum of main diagonal = " + d);
        System.out.println("Sum of reverse diagonal = " + e);

        s.close();
    }
}
