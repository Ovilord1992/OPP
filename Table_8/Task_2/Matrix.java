package Table_8.Task_2;

import java.util.Scanner;

public abstract class Matrix {
    private int[][] matrix;

    public void autoGenMatrix(int matrixSize){
        matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (100 - 1)) + 100;
            }
        }
    }

    public void matrikKeyB(int matrixSize){
        Scanner scanner = new Scanner(System.in);
        matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("введите строка %s стобец %s",(i + 1), (j + 1) + "\n");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public void printer(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print((matrix[i][j] + " "));
            }
            System.out.println();
        }
    }

    public int max(){
        int a = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > a) a = matrix[i][j];
            }
        }
        return a;
    }
    public int min(){
        int a = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < a) a = matrix[i][j];
            }
        }
        return a;
    }

    public int avg(){
        int a = 0;
        int concat = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                a = a + matrix[i][j];
                concat++;
            }
        }
        return a / concat;
    }
}


