import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //imports the variables - scanner, two integer numbers (starting and ending point) and sum
        Scanner scanner = new Scanner(System.in);
        int startingNum = scanner.nextInt();
        int endNum = scanner.nextInt();
        int sum = 0;

        //sums all numbers from starting to ending given number
        for (int i = startingNum; i <= endNum; i++) {
            sum = sum + i;
        }

        //prints out the sum of numbers
        System.out.println(sum);
    }
}