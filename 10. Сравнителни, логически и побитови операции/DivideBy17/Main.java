import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    long number = 8589935681L;
    boolean isDivided = number % 17 == 0;
    if(isDivided){
        System.out.println("yes");
    }else{
        System.out.println("no");
    }
  }
}
