import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
    enum OurCompany {ИВАН, СТОЯН, ПЕТЪР, МИЛЕН, ОГНЯН}
  public static void main(String[] args) {
    // напишете вашият код тук
    OurCompany name1 = OurCompany.ИВАН;
    OurCompany name2 = OurCompany.СТОЯН;
    OurCompany name3 = OurCompany.ПЕТЪР;
    OurCompany name4 = OurCompany.МИЛЕН;
    OurCompany name5 = OurCompany.ОГНЯН;

    System.out.println(name1);
    System.out.println(name2);
    System.out.println(name3);
    System.out.println(name4);
    System.out.println(name5);
  }
}
