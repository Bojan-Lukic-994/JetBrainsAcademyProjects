/*
Write a program that reads three numbers and checks that they all are different, i.e. not equal to one another.
The output should be true or false.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //inputs the user numbers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //checks if all the numbers are different and prints out if it is true or not
        System.out.println((a != b) && (a != c) && (b != c));

    }
}