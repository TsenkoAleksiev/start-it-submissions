import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        counter(number);

    }

    public static void counter(int num){
        int count = 0;
        while (num != 0){
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
