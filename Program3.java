package Assignment1;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first matrix rows: ");
        int row1 = sc.nextInt();
        System.out.print("Enter first matrix cols: ");
        int col1 = sc.nextInt();

        int[][] matrix1 = new int[row1][col1];
        System.out.println("Enter first matrix:");
        for (int i = 0; i < row1; i++)
            for (int j = 0; j < col1; j++)
                matrix1[i][j] = sc.nextInt();

        System.out.print("Enter second matrix rows: ");
        int row2 = sc.nextInt();
        System.out.print("Enter second matrix cols: ");
        int col2 = sc.nextInt();

        int[][] matrix2 = new int[row2][col2];
        System.out.println("Enter second matrix:");
        for (int i = 0; i < row2; i++)
            for (int j = 0; j < col2; j++)
                matrix2[i][j] = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter operation: ");
        String operation = sc.nextLine();

        switch (operation) {

        case "Addition":
            if (row1 != row2 || col1 != col2) {
                System.out.println("Addition not possible");
                return;
            }
            int[][] add = new int[row1][col1];
            for (int i = 0; i < row1; i++)
                for (int j = 0; j < col1; j++)
                    add[i][j] = matrix1[i][j] + matrix2[i][j];

            print(add);
            break;

        case "Subtraction":
            int[][] sub = new int[row1][col1];
            for (int i = 0; i < row1; i++)
                for (int j = 0; j < col1; j++)
                    sub[i][j] = matrix1[i][j] - matrix2[i][j];

            print(sub);
            break;

        case "Multiplication":
            if (col1 != row2) {
                System.out.println("Multiplication not possible");
                return;
            }
            int[][] mul = new int[row1][col2];

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    mul[i][j] = 0;
                    for (int k = 0; k < col1; k++) {
                        mul[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            print(mul);
            break;

        case "Transpose":
            int[][] trans = new int[col1][row1];
            for (int i = 0; i < row1; i++)
                for (int j = 0; j < col1; j++)
                    trans[j][i] = matrix1[i][j];

            print(trans);
            break;

        case "SquareMatrix":
            System.out.println(row1 == col1 ? "Square Matrix" : "Not Square Matrix");
            break;

        case "Diagonal":
            boolean diagonal = true;
            if (row1 != col1) diagonal = false;
            else {
                for (int i = 0; i < row1; i++)
                    for (int j = 0; j < col1; j++)
                        if (i != j && matrix1[i][j] != 0)
                            diagonal = false;
            }
            System.out.println(diagonal ? "Diagonal Matrix" : "Not Diagonal Matrix");
            break;

        case "IdentityMatrix":
            boolean identity = true;
            if (row1 != col1) identity = false;
            else {
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < col1; j++) {
                        if ((i == j && matrix1[i][j] != 1) ||
                            (i != j && matrix1[i][j] != 0)) {
                            identity = false;
                        }
                    }
                }
            }
            System.out.println(identity ? "Identity Matrix" : "Not Identity Matrix");
            break;

        default:
            System.out.println("Invalid Operation");
        }
    }

    static void print(int[][] a) {
        for (int[] r : a) {
            for (int c : r)
                System.out.print(c + " ");
            System.out.println();
        }
    }
}
