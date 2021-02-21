import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    double x = 3;
    double y = 4;

    double r = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
    double theta = Math.atan2(y, x);

    System.out.println("r     = " + r);
    System.out.println("theta = " + theta);
  }
}
