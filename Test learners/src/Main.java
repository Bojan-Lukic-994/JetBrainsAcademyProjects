import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //inputs the Scanner
        Scanner scanner = new Scanner(System.in);

        //user enters the answer for the question from description
        int answer = scanner.nextInt();

        //program checks if the answer is correct and prints out the message
        switch (answer) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
                System.out.println("No!");
                break;
            case 3:
                System.out.println("No!");
                break;
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }
}