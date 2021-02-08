package snackbarApp;

public class Snack 
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double price;
    private int vendingId;

    public Snack(String name, int quanity, double price, int vendingId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quanity;
        this.price = price;
        this.vendingId = vendingId;
    }

    //getters and setters

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;   
    }

    public int getVendingId()
    {
        return vendingId;
    }

    public void setVendingId(int id)
    {
        this.vendingId = id;
    }

    //other methods

    public void addInventory(int qty)
    {
        quantity = qty;
    }

    public void buySnack(int qty)
    {
        quantity = quantity - qty;
    }

    public double getCost(int qty)
    {
        return price * qty;
    }
}
