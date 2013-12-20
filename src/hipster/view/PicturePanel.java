package hipster.view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PicturePanel extends JPanel
{
	/**
	 * Creates a new Image named baseImage.
	 */
	private Image baseImage;
	/**
	 * Creates a new ImageIcon named pictureSource.
	 */
	private ImageIcon pictureSource;
	/**
	 * Creates a new int named width.
	 */
	private int width;
	/**
	 * Creates a new int named height.
	 */
	private int height;
	
	/**
	 * Sets the source for the ImageIcon.
	 * @param imagePath a URL for the source of the Image.
	 */
	public void setPictureSource(URL imagePath)
	{
		this.pictureSource = new ImageIcon(imagePath);
	}
	
	/**
	 * Creates a PicturePanel object with the specified URL path, width and height.
	 * @param imagePath The URL address for the picture.
	 * @param width The width of the panel.
	 * @param height The height of the Panel.
	 */
	public PicturePanel(URL imagePath, int widht, int height)
	{
		this.width = widht;
		this.height = height;
		this.pictureSource = new ImageIcon(imagePath);
	}
	
	/**
	 * Sets the properties and coordinates of the image.
	 */
	@Override
	protected void paintComponent(Graphics panelGraphics)
	{
		super.paintComponent(panelGraphics);
		baseImage = pictureSource.getImage();
		panelGraphics.drawImage(baseImage, 0, 0, width, height, null);
	}
}
