import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());
    long result = 1L;
    while(num <= 0){
        num = Integer.parseInt(sc.nextLine());
    }

    for(int i = num; i != 0; i--){
        result *= i;
    }
        System.out.println(result);
  }
}
