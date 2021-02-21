import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static Scanner scan = new Scanner(System.in);
    static int rows = 0;
    static int cols = 0;

    public static void main(String[] args) {

        int[][] matrixOne = matrix(1);
        int[][] matrixTwo = matrix(2);

        printMatrixWithSymbol(matrixOne, matrixTwo);

        sumMatrix(matrixOne, matrixTwo);

        directSumMatrix(matrixOne, matrixTwo);
    }

    public static int[][] matrix(int num){

        if(num == 1){

            do {
                System.out.print("Брой редове: ");
                rows = Integer.parseInt(scan.nextLine());
            } while (rows >= 10 || rows < 0);

            do {
                System.out.print("Брой колони: ");
                cols = Integer.parseInt(scan.nextLine());
            } while (cols >= 10 || cols < 0);

            int[][] matrix = new int[rows][cols];

            System.out.println("Въведете матрица 1:");
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    System.out.print("Ред " + i + ", Колона " + j + " = ");
                    matrix[i][j] = Integer.parseInt(scan.nextLine());
                }
            }
            return matrix;
        }else {
            int[][] matrix = new int[rows][cols];

            System.out.println("Въведете матрица 2:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Ред " + i + ", Колона " + j + " = ");
                    matrix[i][j] = Integer.parseInt(scan.nextLine());
                }
            }
            return matrix;
        }
    }

    public static void justPrintTwoMatrix(int[][] matrixOne, int[][] matrixTwo){
        for(int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                System.out.printf("%-4d", matrixOne[i][j]);
            }
            for(int j = 0; j < matrixOne[i].length; j++){
                System.out.printf("%-4d", matrixTwo[i][j]);
            }
            System.out.println();
        }
    }

    public static void printMatrixWithSymbol(int[][] matrixOne, int[][] matrixTwo){
        for(int i = 0; i < matrixOne.length; i++){
            for(int j = 0; j < matrixOne[i].length; j++){
                System.out.printf("%-4d", matrixOne[i][j]);
            }
            System.out.print(" | ");
            for(int j = 0; j < matrixOne[i].length; j++){
                System.out.printf("%-4d", matrixTwo[i][j]);
            }
            System.out.println();
        }
    }

    public static void sumMatrix(int[][] matrixOne, int[][] matrixTwo){
        System.out.println("Сумата на матриците е:");
        for(int i = 0; i < matrixOne.length; i++){
            for(int j = 0; j < matrixOne[i].length; j++){
                System.out.printf("%-4d", matrixOne[i][j] +matrixTwo[i][j]);
            }
            System.out.println();
        }
    }

    public static void directSumMatrix(int[][] matrixOne, int[][] matrixTwo){
        int[][] directSumMatrix = new int[rows * cols][rows * cols];

        System.out.println("Директната сумата на матриците е:");

        int[][] nullMatrix = new int[rows][cols];

        justPrintTwoMatrix(matrixOne, nullMatrix);
        justPrintTwoMatrix(nullMatrix, matrixTwo);
    }
}
