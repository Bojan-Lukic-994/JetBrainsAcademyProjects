import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enters the variables - bus height, number of bridges, array of bridge heights and crash
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int[] bridgeHeights = new int[numberOfBridges];
        boolean crash = false;

        //method that adds the height for every given bridge
        for (int i = 0; i < numberOfBridges; i++) {
            int height = scanner.nextInt();
            bridgeHeights[i] = height;
        }

        //method that checks if the bus height is bigger than heights of bridges
        for (int i = 0; i < bridgeHeights.length; i++) {
            //if bus height is bigger than bridge height, the crash will happen
            //prints out the message on which bridge will crash happen
            if (busHeight >= bridgeHeights[i]) {
                System.out.println("Will crash on bridge " + (i + 1));
                crash = true;
                break;
            }
        }

        //if bus height is smaller than all bridges, the crash will not happen
        if (crash == false) {
            System.out.println("Will not crash");
        }
    }
}