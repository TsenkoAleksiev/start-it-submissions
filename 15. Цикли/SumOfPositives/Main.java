import java.io.*;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> num = new ArrayList<String>();
        double checker = 1;

        //fill in the numbers until 0 or negative is filled
        for(int i = 0; i >= 0; i++){
            System.out.print("Въведете положително число: ");
            num.add(sc.next());
            checker = Double.parseDouble(num.get(i));
            //check if entered number is negative or zero. If true, exit for loop
            if(checker <= 0){
                break;
            }
        }

//        //initialise new double[], sum, min and max
            double[] doubleArr = new double[num.size() - 1];
            double sum = 0;

//        //fill the double arr with the elements from the list, parsed, sum all the numbers
            for(int i = 0; i < num.size()-1; i++){
                doubleArr[i] = Double.parseDouble(num.get(i));
                sum += doubleArr[i];
            }

            double min = doubleArr[0];
            double max = doubleArr[0];

//        //find the min and max numbers in the array
            for(int i = 1; i < doubleArr.length; i++){
                if(doubleArr[i] > max){
                    max = doubleArr[i];
                }
            }
//
            for(int i = 1; i < doubleArr.length; i++){
                if(doubleArr[i] < min){
                    min = doubleArr[i];
                }
            }

        System.out.printf("%.2f", sum);
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
}