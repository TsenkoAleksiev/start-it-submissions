import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String talk = scan.nextLine();


        while(!talk.equals(".")){
            bobby(talk);
            talk = scan.nextLine();
        }
    }

    public static void bobby(String talk){
        if(talk.isEmpty()) System.out.println("Хубаво деее");
        else{
            boolean endsWithQuestMark = talk.charAt(talk.length() - 1) == '?';
            boolean isAllUpperCase = talk.equals(talk.toUpperCase());

            if(endsWithQuestMark && isAllUpperCase) System.out.println("Спокоооо, знам к'во правя!");
            else if(endsWithQuestMark) System.out.println("Добре.");
            else if(isAllUpperCase) System.out.println("Споко бе, ман!");

            else System.out.println("Ахъ.");
        }
    }
}
