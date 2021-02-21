import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[2];
        words[0] = sc.next();
        words[1] = sc.next();

        char[] firstWord = words[0].toCharArray();
        char[] secondWord = words[1].toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        System.out.println(Arrays.equals(firstWord, secondWord));
    }
}