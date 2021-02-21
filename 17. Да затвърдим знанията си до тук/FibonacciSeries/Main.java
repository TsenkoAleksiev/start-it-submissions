import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        // 0, 1, 1, 2, 3, 5, 8, 13, 21,
        int temp = 0;
        int tempTwo = 1;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum = temp + tempTwo;
            System.out.print(temp + " ");
            tempTwo = temp;
            temp = sum;
        }
  }
}
