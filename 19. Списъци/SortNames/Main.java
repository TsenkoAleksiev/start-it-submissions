import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>(3);

        names.add(sc.nextLine());
        names.add(sc.nextLine());
        names.add(sc.nextLine());

        Collections.sort(names);
        System.out.println(names);
    }
}