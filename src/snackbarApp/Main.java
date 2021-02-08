package snackbarApp;

public class Main
{
    private static void workWithData()
    {
        System.out.println("Welcome to Lambda Snackbar!\n");

        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolatebar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        jane.buySnack(soda.getCost(3));
        soda.buySnack(3);
        System.out.println("Jane cash on hand: "+jane.getWallet());
        System.out.println("Sodas left: "+soda.getQuantity());
        System.out.println("\n");

        jane.buySnack(pretzel.getCost(1));
        pretzel.buySnack(1);
        System.out.println("Jane cash on hand: "+jane.getWallet());
        System.out.println("Pretzels left: "+pretzel.getQuantity());
        System.out.println("\n");

        bob.buySnack(soda.getCost(2));
        soda.buySnack(2);
        System.out.println("Bob cash: "+bob.getWallet());
        System.out.println("Soda left: "+soda.getQuantity());
        System.out.println("\n");

        jane.addCash(10.00);
        System.out.println("Jane cash: "+jane.getWallet());
        System.out.println("\n");

        jane.buySnack(chocolatebar.getCost(1));
        chocolatebar.buySnack(1);
        System.out.println("Jane cash: "+jane.getWallet());
        System.out.println("Chocolate bars left: "+chocolatebar.getQuantity());
        System.out.println("\n");

        pretzel.addInventory(12);
        System.out.println("Pretzels: "+pretzel.getQuantity());
        System.out.println("\n");

        bob.buySnack(pretzel.getCost(3));
        pretzel.buySnack(3);
        System.out.println("Bob cash: "+bob.getWallet());
        System.out.println("Pretzels: "+pretzel.getQuantity());
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}