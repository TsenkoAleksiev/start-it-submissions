import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int length = input.split(" ").length;
    switch(length){
        case 1:
            System.out.println("едно");
            break;
        case 2:
            System.out.println("две");
            break;
        case 3:
            System.out.println("три");
            break;
        case 4:
            System.out.println("четири");
            break;
        case 5:
            System.out.println("пет");
            break;
        case 6:
            System.out.println("шест");
            break;
        case 7:
            System.out.println("седем");
            break;
        case 8:
            System.out.println("осем");
            break;
        case 9:
            System.out.println("девет");
            break;
        case 10:
            System.out.println("десет");
        default:
            System.out.println("твърде дълго изречение");
    }
  }
}
