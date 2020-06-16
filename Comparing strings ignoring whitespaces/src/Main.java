import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user inputs two strings
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        //removes all whitespaces from given strings
        String improvedFirst = first.replaceAll(" ", "");
        String improvedSecond = second.replaceAll(" ", "");

        //compares the length of two given strings
        if (improvedFirst.length() == improvedSecond.length()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}