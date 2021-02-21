import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String args[])  {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(sumAllNums(number));
    }

    public static int sumAllNums(int number){
        if(number == 1) return number;
        return number + sumAllNums(number - 1);
    }
}
