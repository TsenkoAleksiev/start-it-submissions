import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        while(number != 0){
            System.out.print(number % 2);
            number /= 2;
        }
  }
}
