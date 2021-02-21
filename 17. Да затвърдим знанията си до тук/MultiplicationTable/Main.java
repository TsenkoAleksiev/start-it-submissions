import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
  }
}
