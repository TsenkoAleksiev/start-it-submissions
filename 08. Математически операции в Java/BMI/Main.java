import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    double mass = 80;
    double height = 171;
    double bmi = mass / (Math.pow((height/100), 2));
    System.out.println(bmi);
  }
}
