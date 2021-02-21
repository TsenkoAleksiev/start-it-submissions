import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    Scanner input = new Scanner(System.in);
    double number = Double.parseDouble(input.nextLine());
    System.out.printf("%.5f", Math.sqrt(number));
  }
}
