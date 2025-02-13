import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {

// INSTANCE VARIABLES
    public double totalArea = 0; // member variable for tracking the total area
 
// CONSTRUCTOR
    public FractalDrawer() {}

// ACCESSOR METHOD - Draw Fractal
    public double drawFractal(String fractal_shape) {
        Canvas drawing = new Canvas(800, 800); // Creates a blank canvas
        if (fractal_shape.equalsIgnoreCase("triangle")) {
            drawTriangleFractal(300, 300, 0, 0, Color.RED, drawing, 7); // Initiates the triangle fractal drawing
        } else if (fractal_shape.equalsIgnoreCase("circle")) {
            drawCircleFractal(300, 0, 0, Color.GREEN, drawing, 7); // Initiates the circle fractal drawing
        } else if (fractal_shape.equalsIgnoreCase("rectangle")) {
            drawRectangleFractal(300, 300, 0, 0, Color.GREEN, drawing, 7); // Initiates the rectangle fractal drawing
        } else {
            System.out.println("Shape not recognized.");
        }

        return totalArea; // Returns the total area

        // and determines which shapes to draw a fractal by calling appropriate helper function
// drawFractal returns the area of the fractal
    }

// ACCESSOR METHOD - Draw Triangle Fractal
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){ // Draws a triangle fractal
        Triangle myTriangle = new Triangle(x, y, width, height);
        
        if (level == 7) { // Set colors depending on the level of the fractal
            myTriangle.setColor(Color.RED);
        } else if (level == 6) {
            myTriangle.setColor(Color.ORANGE);
        } else if (level == 5) {
            myTriangle.setColor(Color.YELLOW);
        } else if (level == 4) {
            myTriangle.setColor(Color.GREEN);
        } else if (level == 3) {
            myTriangle.setColor(Color.BLUE);
        } else if (level == 2) {
            myTriangle.setColor(Color.PINK);
        } else if (level == 1) {
            myTriangle.setColor(Color.BLACK);
        } else { // Return if the level is higher than 7 or the fractal is done (level = 0)
            return;
        }

        can.drawShape(myTriangle); // Draw a triangle
        totalArea += myTriangle.calculateArea(); // Add the area to the the running total
        double scaling_factor = Math.random() * 0.4 + 0.5; // Generates a random scaling factor for the next level between 0.5 and 0.9
        double new_width = width * scaling_factor; // Make the width smaller for the next fractal
        double new_height = height * scaling_factor; // Make the height smaller for the next fractal

        drawTriangleFractal(new_width, new_height, x, y, c, can, level - 1); // Draw triangle from the first corner
        drawTriangleFractal(new_width, new_height, x + new_width, y, c, can, level - 1); // Draw triangle from the second corner
        drawTriangleFractal(new_width, new_height, x + 0.5 * new_width, y, c, can, level - 1); // Draw triangle from the third corner     
    }

// ACCESSOR METHOD - Draw Circle Fractal
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) { // Draws a circle fractal
        Circle myCircle = new Circle(x, y, radius);

        if (level == 7) { // Set colors depending on the level of the fractal
            myCircle.setColor(Color.RED);
        } else if (level == 6) {
            myCircle.setColor(Color.ORANGE);
        } else if (level == 5) {
            myCircle.setColor(Color.YELLOW);
        } else if (level == 4) {
            myCircle.setColor(Color.GREEN);
        } else if (level == 3) {
            myCircle.setColor(Color.BLUE);
        } else if (level == 2) {
            myCircle.setColor(Color.PINK);
        } else if (level == 1) {
            myCircle.setColor(Color.BLACK);
        } else { // Return if the level is higher than 7 or the fractal is done (level = 0)
            return;
        }

        can.drawShape(myCircle); // Draw a circle
        totalArea += myCircle.calculateArea(); // Add the area to the running total
        double scaling_factor = Math.random() * 0.4 + 0.5; // Generates a random scaling factor for the next level between 0.5 and 0.9
        double new_radius = radius * scaling_factor; // Make the radius smaller for the next fractal

        drawCircleFractal(new_radius, x - radius - new_radius, y, c, can, level -1); // Draw circle from the left
        drawCircleFractal(new_radius, x + radius + new_radius, y, c, can, level -1); // Draw circle from the right
        drawCircleFractal(new_radius, x, y - radius - new_radius, c, can, level -1); // Draw circle from the top
        drawCircleFractal(new_radius, x, y + radius + new_radius, c, can, level -1); // Draw circle from the bottom
    }

// ACCESSOR METHOD - Draw Rectangle Fractal
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) { // Draws a rectangle fractal
        Rectangle myRectangle = new Rectangle(x, y, width, height);
        
        if (level == 7) { // Set colors depending on the level of the fractal
            myRectangle.setColor(Color.RED);
        } else if (level == 6) {
            myRectangle.setColor(Color.ORANGE);
        } else if (level == 5) {
            myRectangle.setColor(Color.YELLOW);
        } else if (level == 4) {
            myRectangle.setColor(Color.GREEN);
        } else if (level == 3) {
            myRectangle.setColor(Color.BLUE);
        } else if (level == 2) {
            myRectangle.setColor(Color.PINK);
        } else if (level == 1) {
            myRectangle.setColor(Color.BLACK);
        } else { // Return if the level is higher than 7 or the fractal is done (level = 0)
            return;
        }
        
        can.drawShape(myRectangle); // Draw a rectangle
        totalArea += myRectangle.calculateArea(); // Add the area to the running total
        double scaling_factor = Math.random() *0.4 + 0.5; // Generates a random scaling factor for the next level between 0.5 and 0.9
        double new_width = width * scaling_factor;
        double new_height = height * scaling_factor;

        drawRectangleFractal(new_width, new_height, x - 0.5 * new_width, y - 0.5 * new_height, c, can, level -1); // Draw a rectangle from the first corner
        drawRectangleFractal(new_width, new_height, x + width - 0.5 * new_width, y - 0.5 * new_height, c, can, level -1); // Draw a rectangle from the second corner
        drawRectangleFractal(new_width, new_height, x - 0.5 * new_width, y + height - 0.5 * new_height, c, can, level -1); // Draw a rectangle from the third corner
        drawRectangleFractal(new_width, new_height, x + width - 0.5 * new_width, y + height - 0.5 * new_height, c, can, level -1); // Draw a rectangle from the fourth corner
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in); // Initiate scanner
        System.out.println("Enter shape. Options are Triangle, Circle, Rectangle: "); // Prompt for fractal type
        String fractal_shape = input.nextLine(); // Read input
        fractal_shape = fractal_shape.replaceAll("\\s+",""); // Remove blanks from shape input
        fractal_shape = fractal_shape.toLowerCase(); // Convert the shape input to all lower case
        FractalDrawer myFractal = new FractalDrawer(); // Create fractal
        double area = myFractal.drawFractal(fractal_shape); // Calculate area
        System.out.println("Fractal Area [units^2]: " + area); // Print area

    }
}
