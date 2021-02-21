import java.io.*;
import java.util.*;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
    int[] myArray = {1, 4, 6, 2, 10, 5};
    Scanner sc = new Scanner(System.in);
    int index = Integer.parseInt(sc.nextLine());
    int result = 0;

    for(int i = 0; i < myArray.length; i++){
        if(index == myArray[i]){
            result = i;
        }
    }

    if(result != 0){
        System.out.println(result);
    }else{
        System.out.println(-1);
    }
  }
}

