import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String[] numberWords = {"едно", "две", "три", "четири", "пет", "шест", "седем", "осем", "девет", "десет"};
        IntStream.range(0, numberWords.length)
                .filter(i -> i == sentence.split(" ").length - 1).forEach(s-> System.out.println(numberWords[s]));
    }
}
