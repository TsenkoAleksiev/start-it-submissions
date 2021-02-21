import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 4, 6, 2, 10, 5);
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        System.out.println(numbers.indexOf(inputNum));

    }
}
