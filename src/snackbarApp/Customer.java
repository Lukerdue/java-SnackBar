package snackbarApp;

public class Customer 
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double wallet;

    public Customer(String name, double wallet)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.wallet = wallet;
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

    public double getWallet()
    {
        return wallet;
    }

    //other methods

    public void buySnack(double price)
    {
        wallet = wallet - price;
    }
}
