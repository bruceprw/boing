import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends ClosedShape {
	private int sideLength;
	private int height;
	private int width;

	/**
	 * Creates a square.
	 * 
	 * @param x
	 *            The display component's x position.
	 * @param y
	 *            The display component's y position.
	 * @param vx
	 *            The display component's x velocity.
	 * @param vy
	 *            The display component's y velocity.
	 * @param sideLength
	 *            the length of the components sides.
	 * @param colour
	 *            The line colour or fill colour.
	 * @param isFilled
	 *            True if the square is filled with colour, false if opaque.
	 */
	protected Square(int insertionTime, int x, int y, int vx, int vy, int sideLength, Color colour, boolean isFilled) {
		super(insertionTime, x, y, vx, vy, colour, isFilled);

		this.sideLength = sideLength;
		this.height = this.width = this.sideLength;
	}

	/**
	 * Gets the side length
	 * 
	 * @return
	 */

	public int getSideLength() {
		return sideLength;
	}

	/**
	 * Sets the side length
	 * 
	 * @param sidelength
	 */
	public void setSideLength(int sidelength) {
		this.sideLength = sideLength;
	}

	/**
	 * Gets the height
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * Gets the width
	 */
	@Override
	public int getWidth() {
		return height;
	}

	/**
	 * Method to convert the square to a string
	 */
	public String toString() {
		String result = "This is a square\n";
		result += super.toString();
		result += "Its side length is " + this.sideLength + "\n";
		return result;
	}

	/**
	 * Method to draw the square to the screen
	 */
	public void draw(GraphicsContext g) {
		g.setFill(colour);
		g.setStroke(colour);
		if (isFilled) {
			g.fillRect(x, y, height, width);
		} else {
			g.strokeRect(x, y, height, width);
		}
	}

}
