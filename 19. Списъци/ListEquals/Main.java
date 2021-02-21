import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 10, 15);
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inputNums = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); i++){
            inputNums.add(sc.nextInt());
        }

        System.out.println(inputNums.equals(numbers));

    }
}
