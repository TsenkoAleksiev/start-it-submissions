import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
        String student1 = "Иванчо";
        String student2 = "Марийка";
        String student3 = "Пенчо";
        String student4 = "Голям Петко";

        System.out.printf("%-19s %2d\n", student1, 2);
        System.out.printf("%-19s %2d\n", student2, 6);
        System.out.printf("%-19s %2d\n", student3, 4);
        System.out.printf("%-19s %2d", student4, 5);
  }
}
