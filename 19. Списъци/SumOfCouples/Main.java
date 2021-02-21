import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;

        numbers.add(Integer.parseInt(sc.nextLine()));
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == 0){
                break;
            }
            numbers.add(Integer.parseInt(sc.nextLine()));
        }
        numbers.remove(numbers.get(numbers.size() - 1));
        sum = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < numbers.size(); i++){
            for(int j = i + 1; j < numbers.size(); j++){
                if((numbers.get(i) + numbers.get(j) == sum) && (i != j)){
                    System.out.print(numbers.get(i) + " " + numbers.get(j) + '\n');
                }
            }
        }


    }
}
