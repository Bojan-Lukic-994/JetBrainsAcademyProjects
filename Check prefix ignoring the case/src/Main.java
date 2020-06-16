import java.util.Scanner;

/*
Write a program that checks if a given string starts with the prefix "J" ignoring the case.
The program should output true or false.
 */
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.print(word.substring(0,1).equalsIgnoreCase("j"));
    }
}
