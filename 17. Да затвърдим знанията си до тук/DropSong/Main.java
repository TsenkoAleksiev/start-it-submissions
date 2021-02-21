import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        while (number != 0) {
            if (number % 3 == 0) System.out.print("Пльок ");
            if (number % 5 == 0) System.out.print("Пляс ");
            if (number % 7 == 0) System.out.print("Пльос ");
            if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) System.out.print(number);

            if (number != 0) {
                System.out.println();
                number = Integer.parseInt(scan.nextLine());
            }
        }
        System.out.println("Пльок Пляс Пльос");
  }
}
