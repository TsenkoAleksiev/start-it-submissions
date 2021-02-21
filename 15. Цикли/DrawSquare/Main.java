import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());

    for(int i = 0; i < num; i++){
        for(int j = 0; j < num; j++){
            System.out.print("# ");
        }
        System.out.println();
    }
  }
}
