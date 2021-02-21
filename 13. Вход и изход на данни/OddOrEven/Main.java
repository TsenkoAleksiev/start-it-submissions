import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    Scanner input = new Scanner(System.in);
    int num = Integer.parseInt(input.nextLine());
    if(num % 2 == 0){
        System.out.println("even");
    }else{
        System.out.println("odd");
    }
  }
}
