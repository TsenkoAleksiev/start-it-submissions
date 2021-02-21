import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    Scanner input = new Scanner(System.in);

    double num1 = Double.parseDouble(input.nextLine());
    double num2 = Double.parseDouble(input.nextLine());

    if(num1 > num2){
        System.out.println(num1);
    }else{
        System.out.println(num2);
    }
  }
}
