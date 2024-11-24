package raffle;

import java.util.HashMap;
import java.util.Map;

/**
 * A class to model a raffle.
 * To facilitate the lucky draw, a raffle uses two separate boxes to
 * keep its prizes and sold tickets.
  */
public class Raffle {

	private String title;
	
	private Box<Prize> prizes;
	
	private Box<Ticket> tickets;
	
	public Raffle(String title) { 
		
		this.title = "Raffle for " + title;
		
		
		prizes = new Box<>();
		tickets = new Box<>();
	}

	/** 
	 * Returns the title (i.e. purpose) of this raffle.
	 * @return
	 */
	public String title() {
		return title;
	}
	
	
	public void addPrize(String name, int value) {
		prizes.put(new Prize(name, value));
	}
	
	/**
	 * Sell a ticket to the buyer.
	 * @param buyer	the buyer's name.
	 */
	public void sellTicket(String buyer) {
		
		tickets.put(new Ticket(buyer));
	}
	
	/**
	 * Perform the lucky draw.
	 * For each prize in the raffle, 
	 * 	find a winner by drawing a ticket from the box of sold tickets.
	 * If there are more prizes than number of tickets being sold,
	 * 	some prizes will be left behind.
	 *   
	 * @return a mapping between prizes and winning tickets 
	 * 		(each prize is associated with one winning ticket) 
	 */
	public Map<Prize, Ticket> luckyDraw() {
		
		// Creates a mapping of which prize is won by whom.
		Map<Prize, Ticket> winners = new HashMap<Prize, Ticket>();
		
	
		for (Prize prize : prizes) {
			if (!tickets.isEmpty()) {
				winners.put(prize, tickets.draw());
			}
			else {
				 
				return winners;
			}
		}
		
		return winners;
	}

}
