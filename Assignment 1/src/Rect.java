
/**
 * Rect.java
 * @version 1.0
 * @author Bruce Williams (972648)
 */

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Rect extends ClosedShape {
	private int height;
	private int width;

	/**
	 * Creates a rectangle
	 * 
	 * @param insertionTime
	 * @param x
	 *            The display component's x position.
	 * @param y
	 *            The display component's y position.
	 * @param vx
	 *            The display component's x velocity.
	 * @param vy
	 *            The display component's y velocity.
	 * @param height
	 *            The display component's height.
	 * @param width
	 *            The display component's width.
	 * @param colour
	 *            The line colour or fill colour.
	 * @param isFilled
	 *            True if the rectangle is filled with colour, false if opaque.
	 */
	protected Rect(int insertionTime, int x, int y, int vx, int vy, int height, int width, Color colour,
			boolean isFilled) {
		super(insertionTime, x, y, vx, vy, colour, isFilled);
		this.height = height;
		this.width = width;
	}

	/**
	 * Sets the height
	 * 
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Gets the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Sets the width
	 * 
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Gets the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Method to convert the rectangle to a string
	 */
	public String toString() {
		String result = "This is a rectangle\n";
		result += super.toString();
		result += "Its width is " + this.width + "\n";
		return result;
	}

	/**
	 * Draws the rectangle to the screen
	 * 
	 * @param g
	 *            The graphics object of the scene component.
	 */
	public void draw(GraphicsContext g) {
		g.setFill(colour);
		g.setStroke(colour);
		if (isFilled) {
			g.fillRect(x, y, width, height);
		} else {
			g.strokeRect(x, y, width, height);
		}
	}
}
