/*
Write a program that reads four numbers and decrements each of them.
The program must output the results in the same order separated by spaces.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.print(Integer.valueOf(scanner.next()) - 1 + " ");
        }
    }
}