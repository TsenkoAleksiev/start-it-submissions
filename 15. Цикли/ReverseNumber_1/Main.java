
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int reversedNum = 0;
        if(!(sb.charAt(0) == '-')) reversedNum = Integer.parseInt(String.valueOf(sb.reverse()));
        else reversedNum = Integer.parseInt(String.valueOf(sb.reverse().substring(0, sb.length() - 1)));
        System.out.println(reversedNum);
    }
}
