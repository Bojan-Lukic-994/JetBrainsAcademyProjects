/*
Write a program that reads an integer value and checks if it is less than 10 and greater than 0.
Your program should print a boolean value (true or false).
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //inputs the number
        int number = scanner.nextInt();

        //checks if the number is bigger than 0 and less than 10
        if (number > 0 && number < 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}