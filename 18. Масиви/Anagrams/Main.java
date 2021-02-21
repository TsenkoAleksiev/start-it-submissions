import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
        Scanner sc = new Scanner(System.in);
        String[] words = new String[2];
        words[0] = sc.next();
        words[1] = sc.next();

        String firstWordLower = words[0].toLowerCase();
        String secondWordLower = words[1].toLowerCase();
//
        char[] firstWord = firstWordLower.toCharArray();
        char[] secondWord = secondWordLower.toCharArray();

//
        Arrays.sort(firstWord);

        Arrays.sort(secondWord);
//
        System.out.println(Arrays.equals(firstWord, secondWord));
  }
}
