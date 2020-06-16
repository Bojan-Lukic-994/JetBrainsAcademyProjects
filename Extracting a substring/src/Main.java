/*
Write a program that reads a string and two integer numbers.
These two numbers are representing a range that includes them both. Print the substring enclosed in this range.
Both numbers are always greater than or equal to 0 and less than the string length.
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        //enters the user inputs - word and two numbers (starting and ending point)
        String word = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        //prints out the substring of the given word
        System.out.print(word.substring(num1, num2 + 1));
    }
}