import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[] chars = new char[10];
        Arrays.fill(chars, '\u2588');
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < chars.length; j++){
                System.out.print(chars[j]);
            }
            System.out.println();
        }

    }
}