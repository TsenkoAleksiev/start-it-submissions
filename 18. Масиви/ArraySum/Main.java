import java.io.*;
import java.util.*;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    double[] doubleArr = {-1, 10, 4.5, 15, 3.278};
    double sum = 0;
    for(int i = 0; i < doubleArr.length; i++ ){
        sum += doubleArr[i];
    }
    System.out.println(sum);
  }
}
