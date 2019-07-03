
/**
 * This class reads a shape file.  For the format of this shape file, see the assignment description.
 * Also, please see the shape files ExampleShapes.txt, ExampleShapesStill.txt, and TwoRedCircles.txt
 *
 * @author Bruce Williams (972648)
 *
 */

import javafx.scene.paint.Color;
import java.io.*;
import java.util.Scanner;

public class ReadShapeFile {

	// TODO: You will likely need to write four methods here. One method to
	// construct each shape
	// given the Scanner passed as a parameter. I would suggest static
	// methods in this case.

	/**
	 * Reads the data file used by the program and returns the constructed queue
	 * 
	 * @param in
	 *            the scanner of the file
	 * @return the queue represented by the data file
	 * @throws FileNotFoundException
	 */
	private static Queue<ClosedShape> readDataFile(Scanner in) {
		Queue<ClosedShape> shapeQueue = new Queue<ClosedShape>();

		String line;
		while (in.hasNextLine()) {
			line = in.nextLine();
			ClosedShape element = setShape(line);
			shapeQueue.enqueue(element);
		}
		shapeQueue.print();

		return shapeQueue;
	}
	/**
	 * main method for testing
	 */
	/*
	 * public static void main(String[] args) throws FileNotFoundException {
	 * 
	 * readDataFile("CirclesAndText.txt");
	 * 
	 * }
	 */

	// Reads which shape the line in the file is constructing and assigns that
	// line to the correct shape method
	/**
	 * Determines what shape a line relates to and returns to it's specific
	 * constructor
	 * 
	 * @param curLine
	 * @return
	 */
	public static ClosedShape setShape(String curLine) {

		String shape = "";
		Scanner line;
		line = new Scanner(curLine);
		shape = line.next();
		if (shape.equals("circle")) {
			return readCircle(curLine);
			// System.out.println(readCircle(curLine).toString());

		}
		if (shape.equals("oval")) {
			return readOval(curLine);
			// System.out.println(readOval(curLine).toString());
		}

		if (shape.equals("square")) {
			return readSquare(curLine);
			// System.out.println(readSquare(curLine).toString());
		}

		if (shape.equals("rect")) {
			return readRect(curLine);
			// System.out.println(readRect(curLine).toString());

		}

		if (shape.equals("text")) {
			// return readText(curLine);
			System.out.println(readText(curLine).toString());

		}
		line.close();
		return null;

	}

	/**
	 * Method to read lines which have already been defined to be circles
	 * 
	 * @param filename
	 * @return text -- the toString method performed on the object.
	 */
	public static Circle readCircle(String line) {

		Scanner in = new Scanner(line);
		Circle circle = null;

		while (in.hasNextLine()) {
			String shape = in.next();
			int x = in.nextInt();
			int y = in.nextInt();
			int vx = in.nextInt();
			int vy = in.nextInt();
			boolean filled = in.nextBoolean();
			int diameter = in.nextInt();
			int colourR = in.nextInt();
			int colourG = in.nextInt();
			int colourB = in.nextInt();
			Color colour = Color.rgb(colourR, colourG, colourB);
			int insertionTime = in.nextInt();

			circle = new Circle(insertionTime, x, y, vx, vy, diameter, colour, filled);

		}
		in.close();
		return circle;
	}

	/**
	 * Method to read lines which have already been defined to be ovals
	 * 
	 * @param filename
	 * @return text -- the toString method performed on the object.
	 */
	public static Oval readOval(String line) {

		Scanner in = new Scanner(line);
		Oval oval = null;

		while (in.hasNextLine()) {
			String shape = in.next();
			int x = in.nextInt();
			int y = in.nextInt();
			int vx = in.nextInt();
			int vy = in.nextInt();
			boolean filled = in.nextBoolean();
			int width = in.nextInt();
			int height = in.nextInt();
			int colourR = in.nextInt();
			int colourG = in.nextInt();
			int colourB = in.nextInt();
			Color colour = Color.rgb(colourR, colourG, colourB);
			int insertionTime = in.nextInt();

			oval = new Oval(insertionTime, x, y, vx, vy, height, width, colour, filled);

		}
		in.close();
		return oval;
	}

	/**
	 * Method to read lines which have already been defined to be squares
	 * 
	 * @param filename
	 * @return text -- the toString method performed on the object.
	 * 
	 */
	public static Square readSquare(String line) {

		Scanner in = new Scanner(line);
		Square square = null;
		while (in.hasNextLine()) {
			String shape = in.next();
			int x = in.nextInt();
			int y = in.nextInt();
			int vx = in.nextInt();
			int vy = in.nextInt();
			boolean filled = in.nextBoolean();
			int sideLength = in.nextInt();
			int colourR = in.nextInt();
			int colourG = in.nextInt();
			int colourB = in.nextInt();
			Color colour = Color.rgb(colourR, colourG, colourB);
			int insertionTime = in.nextInt();
			square = new Square(insertionTime, x, y, vx, vy, sideLength, colour, filled);

		}
		in.close();
		return square;
	}

	/**
	 * Method to read lines which have already been defined to be squares
	 * 
	 * @param filename
	 * @return text -- the toString method performed on the object.
	 */
	public static Rect readRect(String line) {

		Scanner in = new Scanner(line);
		Rect rect = null;
		while (in.hasNextLine()) {
			String shape = in.next();
			int x = in.nextInt();
			int y = in.nextInt();
			int vx = in.nextInt();
			int vy = in.nextInt();
			boolean filled = in.nextBoolean();
			int width = in.nextInt();
			int height = in.nextInt();
			int colourR = in.nextInt();
			int colourG = in.nextInt();
			int colourB = in.nextInt();
			Color colour = Color.rgb(colourR, colourG, colourB);
			int insertionTime = in.nextInt();
			rect = new Rect(insertionTime, x, y, vx, vy, height, width, colour, filled);
		}
		in.close();

		return rect;
	}

	/**
	 * Method to read lines which have already been determined to be text
	 * 
	 * @param line
	 * @return txt
	 */
	public static Text readText(String line) {
		Scanner in = new Scanner(line);
		Text txt = null;
		while (in.hasNextLine()) {
			String shape = in.next();
			int x = in.nextInt();
			int y = in.nextInt();
			int vx = in.nextInt();
			int vy = in.nextInt();
			boolean filled = in.nextBoolean();
			int colourR = in.nextInt();
			int colourG = in.nextInt();
			int colourB = in.nextInt();
			Color colour = Color.rgb(colourR, colourG, colourB);
			int insertionTime = in.nextInt();
			String text = in.next();
			txt = new Text(insertionTime, x, y, vx, vy, colour, filled, text);
		}

		return txt;
	}

	/**
	 * Method to read the file and return a queue of shapes from this file. The
	 * program should handle the file not found exception here and shut down the
	 * program gracefully.
	 * 
	 * @param filename
	 *            the name of the file
	 * @return the queue of shapes from the file
	 * @throws FileNotFoundException
	 */
	public static Queue<ClosedShape> readDataFile(String filename) throws FileNotFoundException {
		File f = new File(filename);
		Scanner in = null;

		try {
			in = new Scanner(f);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(0);
		}
		return ReadShapeFile.readDataFile(in);

	}
}
