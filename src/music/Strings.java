package music;

public class Strings extends Instrument 
{	
	/**
	 * constructor
	 * pre: none
	 * post: A singer has been created.
	 */
	public Strings(String playerName) 
        {
		super(playerName);
	}

	/** 
	 * Returns the sound of the instrument.
	 * pre: none
	 * post: The sound made by the singer.
	 */
	public String makeSound() 
        {
	 	return("Pling!");
	}

	/** 
	 * Returns a String that represents the instrument.
	 * pre: none
	 * post: A string representing the singer.
	 */
	public String toString() 
        {
	 	return(super.getMusician() + " plays " + makeSound() + ".");
	}
}