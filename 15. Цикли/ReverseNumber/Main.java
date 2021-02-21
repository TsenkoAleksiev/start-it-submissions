import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    Scanner sc = new Scanner(System.in);
    int number = Integer.parseInt(sc.nextLine());
    int remainder = 0;
    StringBuilder newNum = new StringBuilder("");
    if(number < 0){
        number *= -1;
    }

    while(number > 0){
        remainder = number % 10;
        newNum.append(remainder);
        number /= 10;
    }
    System.out.println(newNum.toString());
  }
}
