import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());

        if(Character.isLowerCase(input.charAt(0))){
            input.setCharAt(0, Character.toUpperCase(input.charAt(0)));
        }

        boolean endsWith = input.charAt(input.length() - 1) == '.' || input.charAt(input.length() - 1) == '?' || input.charAt(input.length() - 1) == '!';
        if(!endsWith){
            input.append('.');
        }

        System.out.println(input);
  }
}
