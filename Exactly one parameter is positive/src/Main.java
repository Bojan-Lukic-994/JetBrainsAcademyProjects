/*
Write a program that reads three integer numbers and prints true if exactly one number is positive (i.e. > 0).
Otherwise, it should print false.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //inputs the numbers
        int num1 = scanner.nextInt() > 0 ? 1 : 0;
        int num2 = scanner.nextInt() > 0 ? 1 : 0;
        int num3 = scanner.nextInt() > 0 ? 1 : 0;

        //checks if only one of the numbers is bigger than 0, if it is the program returns true
        System.out.println(num1 + num2 + num3 == 1 ? true : false);
    }
}
