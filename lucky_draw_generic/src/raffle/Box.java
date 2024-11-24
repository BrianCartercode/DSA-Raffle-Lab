package raffle;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Random;

public class Box<T> implements Iterable<T> {
	
	
	private ArrayList<T> contents; // Models the contents of the box
	
	/**
	 * Constructor
	 */
	public Box() {
		/* 
		 * initialise the value of the instance variable 
		 */
		contents = new ArrayList<>();
	}
	
	/**
	 * Draws an item from the box. 
	 * When the item is drawn, it is physically removed from the box. Its
	 * 	object reference is returned as a result.
	 * 
	 * If the box is empty, this method will simply return null.
	 * 
	 * @return
	 */
	public T draw() {
		
		T drawnItem = null;
		
		if (!contents.isEmpty()) {
			/* Use a random number generator to determine which item is to
			 * be drawn from the box.
			 */ 
			Random randomizer = new Random();
			int which = randomizer.nextInt(contents.size());
			drawnItem = contents.remove(which);
		}
		
		return drawnItem;
	}
	
	/**
	 * Puts an item into the box.
	 * @param item
	 */
	public void put(T item) {
		contents.add(item);
	}

	/**
	 * Returns true if the specified item is currently in the box.
	 * Returns false otherwise.
	 * @param item
	 * @return
	 */
	public boolean find(T item) {
		return contents.contains(item);
	}

	public Iterator<T> iterator() {
		return contents.iterator();
	}
	
	/**
	 * Returns true if the box is empty.
	 * Returns false otherwise. 
	 * @return
	 */
	public boolean isEmpty() {
		return contents.isEmpty();
	}
}
