import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //inputs the Scanner
        Scanner scanner = new Scanner(System.in);

        //user inputs the asnwer to be read
        int answer = scanner.nextInt();

        //prints out the message depending on user input
        switch (answer) {
            case 1:
                System.out.println("move up");
                break;
            case 2:
                System.out.println("move down");
                break;
            case 3:
                System.out.println("move left");
                break;
            case 4:
                System.out.println("move right");
                break;
            case 0:
                System.out.println("do not move");
                break;
            default:
                System.out.println("error!");
                break;
        }
    }
}