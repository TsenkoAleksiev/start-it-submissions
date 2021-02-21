import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static char[][] table = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    public static ArrayList<Character> picksTillNow = new ArrayList<Character>();
    public static char playerOne = ' ';
    public static char playerTwo = ' ';

    public static void main(String[] args) {

    for(char i = '1'; i <= '9'; i++){
        picksTillNow.add(i);
    }

    printTable();

    while (true){
        playerOneChoice();
        endGame();
        playerTwoChoice();
        endGame();
    }
}

/**
 * Prints the table with no players choices made ( 1 - 9 )
 */
public static void printTable() {

    for (int i = 0; i < table.length; i++) {
        for (int j = 0; j < table[i].length; j++) {
            System.out.print(table[i][j] + " ");
        }
        if (table[i][2] != 9) {
            System.out.println();
        }
    }
}


/**
 * Prints the table with the players choice included
 * @param player - player 1 or player 2
 * @param choice - char from 1 - 9
 */
public static void printTable(int player, char choice){

    for (int i = 0; i < table.length ; i++) {
        for (int j = 0; j < table[i].length; j++) {
            if(choice == table[i][j] && player == 1){
                //X
                table[i][j] = 'X';
            }else if(choice == table[i][j] && player == 2){
                //O
                table[i][j] = 'O';
            }
            System.out.print(table[i][j] + " ");
        }
        if(table[i][2] != 9){
            System.out.println();
        }
    }
}


/**
 * Asks for player one choice method and prints the table, checks if that position has been chosen
 */
public static void playerOneChoice(){
    System.out.print("Играч 1: ");
    playerOne = scan.next().charAt(0);
    if(picksTillNow.contains(playerOne)){
        picksTillNow.remove(picksTillNow.indexOf(playerOne));
        printTable(1, playerOne);
    }else{
        playerOneChoice();
    }
}


/**
 * Asks for player one choice method and prints the table, checks if that position has been chosen
 */
public static void playerTwoChoice(){
    System.out.print("Играч 2: ");
    playerTwo = scan.next().charAt(0);
    if(picksTillNow.contains(playerTwo)){
        picksTillNow.remove(picksTillNow.indexOf(playerTwo));
        printTable(2, playerTwo);
    }else{
        playerTwoChoice();
    }
}

/**
 * Checks for a winner. If yes - exits program
 */
public static void endGame(){
    for(int i = 0; i < table.length; i++){
        if(table[i][0] == table[i][1] && table[i][1] == table[i][2] && table[0][i] != 'О'){
            System.out.println("Победа!");
            System.exit(0);
        }
    }

    for(int j = 0; j < table.length; j++){
        if(table[0][j] == table[1][j] && table[1][j] == table[2][j] && table[j][0] != 'O'){
            System.out.println("Победа!");
            System.exit(0);
        }
    }

    if(table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[0][0] != 'O'){
        System.out.println("Победа!");
        System.exit(0);
    }

    if(table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[0][2] != 'O'){
        System.out.println("Победа!");
        System.exit(0);
    }

    if(picksTillNow.isEmpty()) System.exit(0);
 }
}
