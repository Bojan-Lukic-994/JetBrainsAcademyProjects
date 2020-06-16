import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirells = scanner.nextInt();
        int nuts = scanner.nextInt();
        int leftovers = 0;

        leftovers = nuts % squirells;
        System.out.println(leftovers);
    }
}