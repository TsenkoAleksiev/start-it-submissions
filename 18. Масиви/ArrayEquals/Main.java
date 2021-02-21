import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] userArr = new int[3];
        userArr[0] = Integer.parseInt(sc.nextLine());
        userArr[1] = Integer.parseInt(sc.nextLine());
        userArr[2] = Integer.parseInt(sc.nextLine());

        int[] myArray = {1, 10, 15};
        int counter = 0;
        for(int i = 0; i < userArr.length; i++){
            if(myArray[i] == userArr[i]){
                counter++;
            }
        }

        if (counter == 3){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}