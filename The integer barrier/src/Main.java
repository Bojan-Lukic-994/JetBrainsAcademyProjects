import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (sum < 1000) {
                sum = sum + number;
            }
        }
        if (sum < 1000) {
            System.out.println(sum);
        } else {
            System.out.println(sum - 1000);
        }
    }
}