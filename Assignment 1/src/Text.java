
/**
 * Image.java
 * @author Bruce Williams(972648)
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Text extends ClosedShape {
	private String text;

	/**
	 * Constructs an image
	 * 
	 * @param insertionTime
	 * @param x
	 * @param y
	 * @param vx
	 * @param vy
	 * @param colour
	 * @param isFilled
	 * @param imagePath
	 */
	protected Text(int insertionTime, int x, int y, int vx, int vy, Color colour, boolean isFilled, String text) {
		super(insertionTime, x, y, vx, vy, colour, isFilled);

	}

	/**
	 * Gets the text
	 * 
	 * @return
	 */
	public String getText() {
		return text;
	}

	/**
	 * sets the text
	 * 
	 * @param imagePath
	 */
	public void setText(String imagePath) {
		this.text = text;
	}

	/**
	 * Method to convert the text to a string
	 */
	public String toString() {
		String result = "This is text\n";
		result += super.toString();
		result += "It reads " + this.text + "\n";
		return result;
	}

	/**
	 * Method to draw the text to the screen
	 */
	public void draw(GraphicsContext g) {
		g.strokeText(text, x, y, 200);
		if (isFilled()) {
			g.fillText(text, x, y, 200);
		} else {
			g.strokeText(text, x, y, 200);
		}

	}
}
