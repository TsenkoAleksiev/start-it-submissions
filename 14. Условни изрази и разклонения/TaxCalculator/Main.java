import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    Scanner sc = new Scanner(System.in);
    double salary = Double.parseDouble(sc.nextLine());
    double taxes = 0;
    if(salary >= 60000){
        taxes += (salary - 60000) * 0.3 + 6000;

    }else if((salary >= 40001) &&(salary <= 59999)){
        taxes += (salary - 40000) * 0.2 + 2000;
    }else if((salary >= 20001) && (salary <= 40000)){
        taxes += (salary - 20000) * 0.1;
    }
    System.out.printf("%.2f", taxes);
  }
}
