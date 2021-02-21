import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        scan.nextLine();
        double num2 = scan.nextDouble();
        System.out.println(Math.max(num1 , num2));
  }
}
