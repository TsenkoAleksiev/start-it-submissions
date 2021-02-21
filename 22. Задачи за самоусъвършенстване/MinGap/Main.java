import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {
    public static int computeMingap(int[] array) {
        int[] tempArr = new int[array.length - 1];

        for (int i = 0; i < array.length - 1; i++) {
            tempArr[i] = array[i + 1] - array[i];
        }
        int minNumber = tempArr[0];
        for (int i = 1; i < tempArr.length; i++) {
            if (minNumber > tempArr[i]) {
                minNumber = tempArr[i];
            }
        }
        return minNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(computeMingap(arr));
    }
}