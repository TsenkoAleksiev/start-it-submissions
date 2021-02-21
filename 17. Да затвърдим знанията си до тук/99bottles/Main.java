import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    for(int i = 99; i > 0; i--){

            if(i == 2){
                System.out.printf("2 bottles of beer on the wall, 2 bottles of beer.\n" +
                        "Take one down and pass it around, 1 bottle of beer on the wall.\n");
                System.out.println();
                continue;
            }

            if(i == 1){
                System.out.printf("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall.\n");
                System.out.println();
                System.out.printf("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n");
                break;
            }

            System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n" +
                    "Take one down and pass it around, %d bottles of beer on the wall.\n", i, i, i - 1);
            System.out.println();

        }
  }
}
