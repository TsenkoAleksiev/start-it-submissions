import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int input = Integer.parseInt(sc.nextLine());
        while(input != 0){
            sum += input;
            input = Integer.parseInt(sc.nextLine());
        }
        System.out.println(sum);

    }
}