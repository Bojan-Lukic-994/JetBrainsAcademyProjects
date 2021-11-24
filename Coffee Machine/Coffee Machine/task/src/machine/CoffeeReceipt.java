package machine;

public class CoffeeReceipt {
    private final int id;
    private final String name;
    private final int water;
    private final int milk;
    private final int coffeeBeans;
    private final int cups;
    private final int money;

    //constructor for class Coffee
    public CoffeeReceipt(int id, String name, int water, int milk, int coffeeBeans, int money) {
        this.id = id;
        this.name = name;
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = 1;
        this.money = money;
    }

    //method that returns the amount of water
    public int getWater() {
        return water;
    }

    //method that returns the amount of milk
    public int getMilk() {
        return milk;
    }

    //method that returns the amount of coffee beans
    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    //method that returns the price of the coffee
    public int getMoney() {
        return money;
    }
}