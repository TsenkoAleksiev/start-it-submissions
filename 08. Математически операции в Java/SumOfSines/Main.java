import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    double tGrad = 20;
    double tRadians = (tGrad * Math.PI) / 180;
    double result = Math.sin(2 * tRadians) + Math.sin(3 * tRadians);
    System.out.println(result);
  }
}
