package hipster.view;
/**
 * Creates a JFrame for the project.
 * @author Mikel North
 * @version 1.1 11/20/13
 */
import javax.swing.JFrame;

import hipster.controller.HipsterController;

public class HipsterFrame extends JFrame
{
	/**
	 * Creates a new HipsterPanel named basePanel.
	 */
	private HipsterController baseController;

	/**
	 * Creates a reference to baseController.
	 */
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Sets up the Frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(450, 450);
		this.setVisible(true);
	}
	
}