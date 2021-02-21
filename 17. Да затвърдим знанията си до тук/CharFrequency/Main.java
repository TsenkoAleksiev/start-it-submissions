import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char chInput = sc.next().charAt(0);
        int counter = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.toCharArray()[i] == chInput){
                counter++;
            }
        }
        System.out.println(counter);
  }
}
