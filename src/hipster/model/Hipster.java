package hipster.model;

/**
 * Creates the Hipster object.
 * 
 * @author Mikel North
 * @version 1.3 11/20/13 added getter/setters, oveloaded constructor for
 *          additional hipster
 */
public class Hipster
{
	/**
	 * Creates a String named 'name'.
	 */
	private String name;
	/**
	 * Creates a String named 'hipsterType'.
	 */
	private String hipsterType;
	/**
	 * Creates a String named 'hipsterPhrase'.
	 */
	private String hipsterPhrase;
	/**
	 * Creates a String[] named 'hipsterBooks'.
	 */
	private String[] hipsterBooks;

	/**
	 * creates the Hipster
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Mikel";
		hipsterType = "classy Hipster";
		hipsterPhrase = "sweg? pls halp";

		fillTheBooks();
	}

	/**
	 * gives the hipster something to do
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Oxford Dictionary";
		hipsterBooks[1] = "Snow Crash";
		hipsterBooks[2] = "1984";
		hipsterBooks[3] = "American Gods";
		hipsterBooks[4] = "V for Vendetta";
	}

	/**
	 * creating parameters for the hipster
	 * 
	 * @param name
	 *            The hipsters name
	 * @param hipsterType
	 *            what type of hipster it is
	 * @param hipsterPhrase
	 *            what the hipster says
	 * @param hipsterBooks
	 *            what kind of books the hipster is instead in
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase, String[] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}

	/**
	 * Getter method to get the name
	 * 
	 * @return The name of the Hipster.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Setter method to set name
	 * 
	 * @param name
	 *            the name of the hipster
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Getter method for the type of hipster
	 * 
	 * @return the Hipster type.
	 */
	public String getHipsterType()
	{
		return hipsterType;
	}

	/**
	 * Setter method for the type of the Hipster
	 * 
	 * @param hipsterType
	 *            I what kind of Hipster
	 */
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	/**
	 * Getter method for the Hipsters phrase
	 * 
	 * @return Hipster Phrase
	 */
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	/**
	 * Setter method for what the hipster says
	 * 
	 * @param hipsterPhrase
	 *            what the hipster says
	 */
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	/**
	 * Getter method for the Hipster books.
	 * @return The Hipster books.
	 */
	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	/**
	 * Setter method to change the hipsterBooks.
	 * 
	 * @param hipsterBooks
	 *            books of the hipster.
	 */
	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

}
