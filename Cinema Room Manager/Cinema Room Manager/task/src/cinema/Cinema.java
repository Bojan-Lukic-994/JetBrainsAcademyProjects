package cinema;

import java.util.Scanner;

public class Cinema {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        //user enters the number of rows
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        //user enters the number of seats per each row
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = sc.nextInt();

        //creates new cinema object
        char[][] cinema = createCinema(rows, seatsPerRow);

        //prints out the menu for the first time
        printMenu();

        //handles the user wishes - print the seats, buy a ticket of show statistics
        while (true) {
            int decision = sc.nextInt();
            switch (decision) {
                case 0:
                    return;
                case 1:
                    printSeats(cinema, rows, seatsPerRow);
                    printMenu();
                    break;
                case 2:
                    choseSeat(cinema, rows, seatsPerRow);
                    printMenu();
                    break;
                case 3:
                    statistics(cinema, rows, seatsPerRow);
                    break;
            }
        }
    }

    //method that creates new cinema with wanted number of rows and seats
    public static char[][] createCinema(int rows, int seatsPerRow) {
        char[][] cinema = new char[rows + 1][seatsPerRow];
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                cinema[i][j] = 'S';
            }
        }
        return cinema;
    }

    //method that prints seats in the cinema
    public static void printSeats(char[][] cinema, int row, int column) {
        System.out.println("Cinema:");

        //Prints out the row numbers
        System.out.print(" ");
        for (int i = 1; i <= column; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        //Prints out the seats in the cinema
        for (int i = 0; i < row; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < column; j++) {
                System.out.print(" " + cinema[i][j]);
            }
            System.out.println();
        }
    }

    //method that prints out the menu
    public static void printMenu() {
        System.out.println("1. Show the seats" + "\n" + "2. Buy a ticket" + "\n" + "3. Statistics" + "\n" + "0. Exit");
    }

    //method that returns the price of the ticket
    public static int getTicketPrice(int rows, int seatsPerRow, int rowChosen) {
        return rows * seatsPerRow <= 60 ? 10 : rowChosen <= rows / 2 ? 10 : 8;
    }

    //method that books the seat and prints out the seat's price
    public static void choseSeat(char[][] cinema, int rows, int seats) {
        while (true) {
            //user enters the row number
            System.out.println("Enter a row number:");
            int rowChosen = sc.nextInt();

            //user enters the seat in that row
            System.out.println("Enter a seat number in that row:");
            int seatChosen = sc.nextInt();

            //checks if the seat is available and books it if it is
            if (rowChosen > rows || seatChosen > seats) {
                System.out.println("Wrong input!");
            } else if (cinema[rowChosen - 1][seatChosen - 1] == 'B') {
                System.out.println("That ticket has already been purchased");
            } else {
                cinema[rowChosen - 1][seatChosen - 1] = 'B';
                System.out.println("Ticket price: $" + getTicketPrice(rows, seats, rowChosen));
                break;
            }
        }
    }

    //method that calculates the revenue based on number of seats
    public static int totalIncomeFromTickets(int numberOfRows, int seatsPerRow) {

        //calculates the number of all seats and calculates the half of all rows
        int numberOfSeats = numberOfRows * seatsPerRow;
        int halfRows = numberOfRows / 2;

        //calculates the total revenue from the seats
        return numberOfSeats <= 60 ? numberOfSeats * 10 : seatsPerRow * ((halfRows * 10) + (numberOfRows - halfRows) * 8);
    }

    //method that shows the statistics of the cinema
    public static void statistics(char[][] cinema, int rows, int seatsPerRow) {
        int takenSeats = 0;
        int currentIncome = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                if (cinema[i][j] == 'B') {
                    takenSeats++;
                    currentIncome += getTicketPrice(rows, seatsPerRow, i + 1);
                }
            }
        }
        System.out.println("Number of purchased tickets: " + takenSeats);
        System.out.printf("Percentage: " + "%.2f%%", (double) takenSeats * 100 / (rows * seatsPerRow));
        System.out.println();
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncomeFromTickets(rows, seatsPerRow));
    }
}