/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 *
 * @author David J. Barnes and Michael Koelling
 * @version 2011.07.31
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * TODO: Check amount is reasonable
     */
    public void insertMoney(int amount)
    {  
        // balance = balance + amount;
        if(amount > 0){
            balance = balance + amount;
        }
        else{
            System.out.println("Use a positive amout: " + amount);
        }
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        if(balance >= price){
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

        // Update the total collected with the balance.
            total = total + price; 
        // Clear the balance.
            balance = balance - price;
        }
        else{
            System.out.println("Not enough money to buy a ticket.");
        }
        /*
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance; 
        // Clear the balance.
        balance = 0;
        */
    }
    
    /**
     * Return the total amount of money collected by this machine.
     */
    public int getTotal(int total){
        return total;
    }

    /**
     * Set the price of the machine's tickets to be cost (if reasonable)
     */
    public void setPrice(int cost){
        this.price = cost;
    }
}
