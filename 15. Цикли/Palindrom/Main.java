import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();
        System.out.println(word.equalsIgnoreCase(reversedWord.toString()));
  }
}
