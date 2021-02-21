
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> nums = new ArrayList<Double>();
        String giveNum = "Въведете положително число: ";
        System.out.print(giveNum);
        double input = scan.nextDouble();
        while(input > 0){
            nums.add(input);
            System.out.print(giveNum);
            input = scan.nextDouble();
        }
        System.out.printf("%.2f", nums.stream().mapToDouble(num -> num).sum());
        System.out.println();
        System.out.println(nums.stream().max(Comparator.comparing(Double::valueOf)).get());
        System.out.println(nums.stream().min(Comparator.comparing(Double::valueOf)).get());
    }
}
