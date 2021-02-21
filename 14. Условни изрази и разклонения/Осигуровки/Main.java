import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = Double.parseDouble(sc.nextLine());
        int years = Integer.parseInt(sc.nextLine());

        double workerTaxes = 0;
        double employerTaxes = 0;

        if(salary < 3000){
            if(years <= 55){
                workerTaxes = salary * 0.2;
                employerTaxes = salary * 0.17;
            }else if(years > 55 && years <= 60){
                workerTaxes = salary * 0.13;
                employerTaxes = salary * 0.13;
            }else if(years > 60 && years <= 65){
                workerTaxes = salary * 0.075;
                employerTaxes = salary * 0.09;
            }else if(years > 65){
                workerTaxes = salary * 0.05;
                employerTaxes = salary * 0.075;
            }
        }else if(salary > 3000){
            workerTaxes = 3000 * 0.2;
            employerTaxes = 3000 * 0.2;
        }

        System.out.printf("%.2f", workerTaxes);
        System.out.println();
        System.out.printf("%.2f", employerTaxes);
    }
}