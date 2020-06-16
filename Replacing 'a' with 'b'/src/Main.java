/*
Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.
The program should print out the resulting string.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //adds the new string that user inputs
        String item = scanner.nextLine();

        //creates new string - replaces all letters "a" with letters "b"
        String newItem = item.replace('a', 'b');

        //prints out the new string
        System.out.println(newItem);
    }
}