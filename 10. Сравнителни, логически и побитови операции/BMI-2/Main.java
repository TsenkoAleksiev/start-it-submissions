import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    double mass = 80;
    double heightCM = 171;
    double bmi = mass / (Math.pow((heightCM / 100), 2));
    if((bmi >= 25) && (bmi <= 30)){
        System.out.println("more training, less eating");
    }else{
        System.out.println("you rock!");
    }
  }
}
