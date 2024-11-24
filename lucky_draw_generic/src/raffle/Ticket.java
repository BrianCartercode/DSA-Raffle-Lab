package raffle;

/**
 * For modelling a raffle ticket.
 */
public class Ticket {

	// a class variable for keeping track of the number of the previous ticket sold 
	private static int previous = 0;  
	
	private int num;
	private String buyer;
	
	public Ticket(String name) {
		previous++;
		num = previous;
		buyer = name;
	}
	
	/**
	 * Returns the ticket number.
	 * @return
	 */
	public int num() {
		return num;
	}
	
	/**
	 * Returns the name of the one who bought this ticket.
	 * @return
	 */
	public String buyer() {
		return buyer;
	}
	
	
	@Override
	public String toString() {
		return String.format("Ticket Ref: %3d\tPurchase by: %s", num, buyer);
	}
}
