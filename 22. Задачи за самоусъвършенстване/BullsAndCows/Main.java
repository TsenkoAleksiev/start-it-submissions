
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Тайно число: ");
        int numberToGuess = Integer.parseInt(scan.nextLine());
        int[] numberToGuessArr = {
                numberToGuess / 1000,
                (numberToGuess % 1000) / 100,
                (numberToGuess % 100) / 10,
                numberToGuess % 10
        };

        int guess = 0;
        int[] guessArr = new int[4];

        int bulls = 0;
        int cows = 0;


        while (bulls != 4) {
            System.out.print("-> ");
            guess = Integer.parseInt(scan.nextLine());
            while (guess < 1000){
                System.out.println("Невалиден опит!");
                System.out.print("-> ");
                guess = Integer.parseInt(scan.nextLine());
            }
            guessArr[0] = guess / 1000;
            guessArr[1] = (guess % 1000) / 100;
            guessArr[2] = (guess % 100) / 10;
            guessArr[3] = guess % 10;

            for (int i = 0; i < 4; i++) {
                if (guessArr[i] == numberToGuessArr[i]) bulls++;
                for (int j = 0; j < 4; j++) {
                    if (guessArr[i] == numberToGuessArr[j] && !(guessArr[i] == numberToGuessArr[i])) cows++;
                }
            }
            System.out.printf("%d бикове, %d крави\n", bulls, cows);
            if(bulls != 4){
                bulls = 0;
                cows = 0;
            }
        }
    }
}
