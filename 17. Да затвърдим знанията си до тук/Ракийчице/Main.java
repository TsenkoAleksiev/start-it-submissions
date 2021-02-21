import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
        int counter = 1;
        double vhod = 0.9;
        double izhod = 0.1;

        while(vhod > izhod){
            vhod = vhod - vhod * 0.1;
            izhod = izhod - izhod * 0.01;
            counter++;
        }

        System.out.println(counter);
  }
}
