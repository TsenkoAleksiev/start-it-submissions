import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
        Scanner sc = new Scanner(System.in);
        System.out.print("Моля въведете брой на играчите: ");
        int numberPlayers = Integer.parseInt(sc.nextLine());
        double[] result = new double[numberPlayers];

        double max = 0;
        double min = 0;
        double sum = 0;
        double standardDeviation = 0;

        for(int i = 0; i < numberPlayers; i++){
            System.out.print("Въведете резултат №" + i + ": ");
            result[i] = sc.nextDouble();
            sum += result[i];
        }

        max = result[0];
        min = result[0];

        for(int i = 0; i < result.length; i++){
            if(min > result[i]) {
                min = result[i];
            }

            if(max < result[i]){
                max = result[i];
            }
        }

        double average = sum / numberPlayers;
        double temp = 0;
        double sdOne = 0;
        for(int i = 0; i < numberPlayers; i++){
            sdOne += (Math.pow((result[i] - average), 2));
        }

        standardDeviation = Math.sqrt(sdOne / numberPlayers);

        System.out.printf("Min      = %.3f", min);
        System.out.println();
        System.out.printf("Max      = %.3f", max);
        System.out.println();
        System.out.printf("Average  = %.3f", average);
        System.out.println();
        System.out.printf("StdDev   = %.3f", standardDeviation);
  }
}