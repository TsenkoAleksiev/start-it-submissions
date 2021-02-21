import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
  public static void main(String[] args) {
        int aNum = 0x7DEDEDE1;

        String numToBinary = "0b" + Integer.toString(0x7DEDEDE1, 2);
        System.out.println(numToBinary);

        String numToHexa = "0" + Integer.toString(0x7DEDEDE1, 8);
        System.out.println(numToHexa);

        String numToDecimal = Integer.toString(0x7DEDEDE1, 10);
        System.out.println(numToDecimal);

        String numToSixteen = "0x" + Integer.toString(0x7DEDEDE1, 16);
        System.out.println(numToSixteen);

        String numToThirtysix = Integer.toString(0x7DEDEDE1, 36);
        System.out.println(numToThirtysix.toUpperCase());
  }
}
