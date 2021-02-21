import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers,  1, 4, 6, 2, 10, 5);
        ArrayList<Integer> newNums = new ArrayList<Integer>();


        for(int i = 0; i < numbers.size(); i++){
            if(i % 2 != 0){
                newNums.add(numbers.get(i));
            }
        }

        System.out.println(newNums);
    }
}
