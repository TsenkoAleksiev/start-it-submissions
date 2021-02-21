
public class Main {
    public static void main(String[] args) {
        int one = 1;
        int num = 5;
        for(int i = 0; i < num; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(one + " ");
                one = one * (i - j) / (j + 1);
            }
            System.out.print(1);
            System.out.println();
        }
    }
}