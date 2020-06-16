/*
Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down.
In which day the snail will reach the top of the pole?

Input data format:
On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //adds new inputs - height, feets up per day and feets down per night
        int height = scanner.nextInt();
        int day = scanner.nextInt();
        int night = scanner.nextInt();

        //sets the day counter, sum and difference between day and night
        int dayCounter = 1;
        int sum = day;
        int difference = day - night;

        //counts the days needed to reach the top
        while (height > sum) {
            sum = sum + difference;
            dayCounter++;
        }

        //prints out the number of days needed
        System.out.println(dayCounter);
    }
}