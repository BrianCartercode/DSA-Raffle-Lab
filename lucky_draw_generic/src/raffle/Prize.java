package raffle;

/**
 * A class to model the information about a prize.
 */
public class Prize {
	
	private String name;
	private int value;
	
	
	public Prize(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	/**
	 * Returns the name (description) of this prize.
	 * @return
	 */
	public String name() {
		return name;
	}
	
	/**
	 * Returns the value of this prize, 
	 * 	i.e. how much in GBP£ this prize is worth.
	 * @return
	 */
	public int value() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Prize: " + name + ", cost: £" + value + '\n';
	}

}
