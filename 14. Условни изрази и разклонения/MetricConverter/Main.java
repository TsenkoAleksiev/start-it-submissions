import java.io.*;
import java.util.Scanner;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  
    static double metersToMM = 1000;
    static double metersToCM = 100;
    static double metersToMI = 0.000621371192;
    static double metersToIN = 39.3700787;
    static double metersToKM = 0.001;
    static double metersToFT = 3.2808399;
    static double metersToYD = 1.0936133;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        String numberMetric = scan.nextLine();
        String numberToMetric = scan.nextLine();

        double result = convert(number, numberMetric, numberToMetric);
        System.out.printf("%.5f", result);

    }

    public static double convert(double number, String numberMetric, String numberToMetric){

        double converted = 0;

        switch (numberMetric){
            case "mm":
                number /= metersToMM;
                if(numberToMetric.equals("cm")) converted = number * metersToCM;
                else if(numberToMetric.equals("mi")) converted = number * metersToMI;
                else if(numberToMetric.equals("in")) converted = number * metersToIN;
                else if(numberToMetric.equals("km")) converted = number * metersToKM;
                else if(numberToMetric.equals("ft")) converted = number * metersToFT;
                else if(numberToMetric.equals("yd")) converted = number * metersToYD;
                break;
            case "cm":
                number /= metersToCM;
                if(numberToMetric.equals("mm")) converted = number * metersToMM;
                else if(numberToMetric.equals("mi")) converted = number * metersToMI;
                else if(numberToMetric.equals("in")) converted = number * metersToIN;
                else if(numberToMetric.equals("km")) converted = number * metersToKM;
                else if(numberToMetric.equals("ft")) converted = number * metersToFT;
                else if(numberToMetric.equals("yd")) converted = number * metersToYD;
                break;
            case "mi":
                number /= metersToMI;
                if(numberToMetric.equals("mm")) converted = number * metersToMM;
                else if(numberToMetric.equals("cm")) converted = number * metersToCM;
                else if(numberToMetric.equals("in")) converted = number * metersToIN;
                else if(numberToMetric.equals("km")) converted = number * metersToKM;
                else if(numberToMetric.equals("ft")) converted = number * metersToFT;
                else if(numberToMetric.equals("yd")) converted = number * metersToYD;
                break;
            case "in":
                number /= metersToIN;
                if(numberToMetric.equals("mm")) converted = number * metersToMM;
                else if(numberToMetric.equals("cm")) converted = number * metersToCM;
                else if(numberToMetric.equals("mi")) converted = number * metersToMI;
                else if(numberToMetric.equals("km")) converted = number * metersToKM;
                else if(numberToMetric.equals("ft")) converted = number * metersToFT;
                else if(numberToMetric.equals("yd")) converted = number * metersToYD;
                break;
            case "km":
                number /= metersToKM;
                if(numberToMetric.equals("mm")) converted = number * metersToMM;
                else if(numberToMetric.equals("cm")) converted = number * metersToCM;
                else if(numberToMetric.equals("mi")) converted = number * metersToMI;
                else if(numberToMetric.equals("in")) converted = number * metersToIN;
                else if(numberToMetric.equals("ft")) converted = number * metersToFT;
                else if(numberToMetric.equals("yd")) converted = number * metersToYD;
                break;
            case "ft":
                number /= metersToFT;
                if(numberToMetric.equals("mm")) converted = number * metersToMM;
                else if(numberToMetric.equals("cm")) converted = number * metersToCM;
                else if(numberToMetric.equals("mi")) converted = number * metersToMI;
                else if(numberToMetric.equals("in")) converted = number * metersToIN;
                else if(numberToMetric.equals("km")) converted = number * metersToKM;
                else if(numberToMetric.equals("yd")) converted = number * metersToYD;
                break;
            case "yd":
                number /= metersToYD;
                if(numberToMetric.equals("mm")) converted = number * metersToMM;
                else if(numberToMetric.equals("cm")) converted = number * metersToCM;
                else if(numberToMetric.equals("mi")) converted = number * metersToMI;
                else if(numberToMetric.equals("in")) converted = number * metersToIN;
                else if(numberToMetric.equals("km")) converted = number * metersToKM;
                else if(numberToMetric.equals("ft")) converted = number * metersToFT;
                break;
            default:
                System.out.println("No such metric unit!");
                break;
        }

        return converted;
    }
}
