package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;
/**
 * controller for the hipster project.
 * @author Mikel North
 * 1.1 11/19/13 added constructor information
 */
public class HipsterController  
{	
	private HipsterFrame appFrame;
	private Hipster selfHipster;
	private Hipster [] classHipsters;
	private int hipsterCount;
	
	/**
	 * The controller for the Hipster.
	 */
	public HipsterController()
	{
		selfHipster = new Hipster();
		classHipsters = new Hipster[50];
		hipsterCount = 0;
	}

	/**
	 * gets the  Hipster
	 * @return Self Hipster
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}

/**
 	* this is the Self Hipster
 * @param selfHipster
 */
	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}

	/**
	 * this is the method to start the hipster
	 */
	public void start()
	{
		appFrame = new HipsterFrame(this);
	}

	/**
	 * Getter for the Hipster[] named cubicalHipsters.
	 * @return cubicalHipsters.
	 */
	public Hipster []getClassHipsters()
	{
		return classHipsters;
	}
	
	/**
	 * Retrieves the Hipster from the specified position in the array.
	 * 
	 * @param position
	 *            The location in the array. It must be between 0 and
	 *            classHipsters.length.
	 * @return The Hipster at the position in the array.
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;
		
		if(position < classHipsters.length && position >=0)
		{
			currentHipster = classHipsters[position];
		}
		
		return currentHipster;
	}
	/**
	 * Used to retrieve a random Hipster object from the array of class hipsters.
	 * @return Returns the current Hipster.
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;
		
		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random*classHipsters.length);
		currentHipster = classHipsters[randomIndex];
		
		
		return currentHipster;		
	}
	/**
	 * Creates and adds a Hipster to the array of class Hipsters from the specified values.
	 * @param books The array of books for the current hipster.
	 * @param name the name of the current Hipster.
	 * @param type The type of the current hipster.
	 * @param phrase This Hipsters current phrase of hipsterness
	 */
	public void addHipster(String [] books, String name, String type, String phrase)
	{
		if(hipsterCount < classHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			classHipsters[hipsterCount] = tempHipster;
			
			hipsterCount++;	
		}	
		else
		{
			JOptionPane.showMessageDialog(appFrame,  "The class is full you are too mainstream to be added");
		}
	}
}
