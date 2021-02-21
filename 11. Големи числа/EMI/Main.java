import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
    // напишете вашият код тук
        BigDecimal money = new BigDecimal("10000000");
        BigDecimal yearlyInterest = new BigDecimal("0.105");
        BigDecimal valueOfOne = new BigDecimal("1");
        BigDecimal valueOfTwelve = new BigDecimal("12");
        BigDecimal monthlyInterest = yearlyInterest.divide(valueOfTwelve);
        int numberFee = 12 * 10;


//        BigDecimal firstPart = monthlyInterest.multiply(monthlyInterest.add(valueOfOne).pow(numberFee));
//        BigDecimal secondPart = monthlyInterest.add(valueOfOne).pow(numberFee).subtract(valueOfOne);
        BigDecimal division = (monthlyInterest.multiply(monthlyInterest.add(valueOfOne).pow(numberFee)).divide((monthlyInterest.add(valueOfOne).pow(numberFee).subtract(valueOfOne)), RoundingMode.HALF_UP));
        BigDecimal multiplication = money.multiply(division);

        System.out.println(multiplication.setScale(10, RoundingMode.HALF_UP));
  }
}
