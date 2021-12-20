package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //generates the secret code
        CodeGrader grader = new CodeGrader("9305");
        System.out.println("Secret code is generated.");

        //user enters the code to guess
        System.out.println("Enter the code:");
        String input = new Scanner(System.in).nextLine();

        //grades the user input - compares it to the secret code
        grader.compare(input);

        //outputs the results - number of bulls and cows guessed
        System.out.println(grader);
    }
}