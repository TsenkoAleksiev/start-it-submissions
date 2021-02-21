import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int counter = 0;

        for(int i = 2; i < number / 2; i++){
            if(number % i == 0) counter++;
        }

        System.out.println(counter == 0);
  }
}
