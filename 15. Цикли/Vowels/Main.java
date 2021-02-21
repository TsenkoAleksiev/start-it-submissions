import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int counter = 0;
        String tester = input.toLowerCase();
        char[] charArr = tester.toCharArray();
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u' || charArr[i] == 'y'){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
