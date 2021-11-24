package machine;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;
    private ArrayList<CoffeeReceipt> receipts = new ArrayList<>();

    //constructor for class CoffeeMachine
    public CoffeeMachine() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.cups = 9;
        this.money = 550;
        addReceipts();
    }

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.processAction(machine);
    }

    //adds the list of receipts to the coffee machine when the machine is created
    private void addReceipts() {
        this.receipts = new ArrayList<>();
        receipts.add(new CoffeeReceipt(1, "espresso", 250, 0, 16, 4));
        receipts.add(new CoffeeReceipt(2, "latte", 350, 75, 20, 7));
        receipts.add(new CoffeeReceipt(3, "cappuccino", 200, 100, 12, 6));
    }

    //method that performs user's actions on coffee machine
    private void processAction(CoffeeMachine machine) {
        while (true) {
            //user inputs the action
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = new Scanner(System.in).nextLine();

            switch (action) {
                //buys a coffee if there are enough ingredients
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String decision = new Scanner(System.in).next();
                    if (decision.equals("1") || decision.equals("2") || decision.equals("3")) {
                        CoffeeReceipt receipt = this.receipts.get(Integer.parseInt(decision) - 1);
                        buy(receipt);

                        //gets back to the menu if user changes his mind (doesn't want to buy coffee)
                    } else if (decision.equalsIgnoreCase("back")) {
                        break;
                    }
                    break;

                //fill coffee machine with wanted number of ingredients
                case "fill":
                    fill();
                    break;

                //take out all the money from the coffee machine
                case "take":
                    take();
                    break;

                //output the status of coffee machine
                case "remaining":
                    System.out.println(machine);
                    break;

                //exit the main menu
                case "exit":
                    return;

                //if user inputs the unknown command, prints out the message
                default:
                    System.out.println("Sorry, unknown command.");
                    break;
            }
        }
    }

    //method that buys a cup of coffee from the machine
    public void buy(CoffeeReceipt receipt) {
        //checks if there are enough resources to make a wanted coffee.
        //if there are not enough ingredients, prints out which ingredient is lacking.
        if (this.water < receipt.getWater()) {
            System.out.println("Sorry, not enough water!");
            return;
        } else if (this.milk < receipt.getMilk()) {
            System.out.println("Sorry, not enough milk!");
            return;
        } else if (this.coffeeBeans < receipt.getCoffeeBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } else if (this.cups < 1) {
            System.out.println("Sorry, not enough cups.");
            return;
        }

        //makes chosen coffee, decreases the ingredients and prints out the message
        this.water -= receipt.getWater();
        this.milk -= receipt.getMilk();
        this.coffeeBeans -= receipt.getCoffeeBeans();
        this.cups--;
        this.money += receipt.getMoney();
        System.out.println("I have enough resources, making you a coffee.");
    }

    //method that fills the ingredients in the machine
    public void fill() {
        Scanner sc = new Scanner(System.in);

        //user enters the amount of water to add
        System.out.println("Write how many ml of water you want to add:");
        this.water += sc.nextInt();

        //user enters the amount of milk to add
        System.out.println("Write how many ml of milk you want to add:");
        this.milk += sc.nextInt();

        //user enters the amount of coffee beans to add
        System.out.println("Write how many grams of coffee beans you want to add:");
        this.coffeeBeans += sc.nextInt();

        //user enters the amount of cups to add
        System.out.println("Write how many disposable cups you want to add:");
        this.cups += sc.nextInt();
    }

    //method that takes out all the money from machine
    public void take() {
        System.out.println("I gave you $" + this.money);
        this.money = 0;
    }

    //method that outputs the status of coffee machine
    @Override
    public String toString() {
        return "The coffee machine has:" + '\n' +
                this.water + " ml of water" + '\n' +
                this.milk + " ml of milk" + '\n' +
                this.coffeeBeans + " g of coffee beans" + '\n' +
                this.cups + " disposable cups" + '\n' +
                "$" + this.money + " money";
    }
}