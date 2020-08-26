import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double money = scanner.nextInt();
        int percentage = scanner.nextInt();
        int depositToReach = scanner.nextInt();

        while(depositToReach > money) {
            count++;
            money = money + money * percentage / 100;
        }
        System.out.println(count);
    }
}