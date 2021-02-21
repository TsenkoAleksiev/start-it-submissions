import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    double x = 8.3;
    double y = 14.5;

    double distance = Math.sqrt((Math.pow(x, 2) + (Math.pow(y, 2))));
    System.out.println(distance);
  }
}
