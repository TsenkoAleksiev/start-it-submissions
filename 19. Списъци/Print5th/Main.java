import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        names.add(sc.nextLine());
        while(!names.contains(".")){
            names.add(sc.nextLine());
        }

        names.remove(names.get(names.size() - 1));
        System.out.println(names.get(2));
        Collections.sort(names);
        System.out.println(names);
    }
}