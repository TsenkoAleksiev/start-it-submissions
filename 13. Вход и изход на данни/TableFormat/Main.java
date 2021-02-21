import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
        String student1 = String.format("%-20s", "Иванчо");
        String student2 = String.format("%-20s", "Марийка");
        String student3 = String.format("%-20s", "Пенчо");
        String student4 = String.format("%-20s", "Голям Петко");

        String student1Grade = String.format("%2d", 2);
        String student2Grade = String.format("%2d", 6);
        String student3Grade = String.format("%2d", 4);
        String student4Grade = String.format("%2d", 5);

        System.out.println(student1 + student1Grade);
        System.out.println(student2 + student2Grade);
        System.out.println(student3 + student3Grade);
        System.out.println(student4 + student4Grade);
  }
}
