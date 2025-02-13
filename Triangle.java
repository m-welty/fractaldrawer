import java.awt.Color;

public class Triangle {

// INSTANCE VARIABLES
    public double x_pos;
    public double y_pos;
    public double width;
    public double height;
    public Color color;

//CONSTRUCTOR
    public Triangle(double x_pos, double y_pos, double width, double height) {
        this.x_pos = x_pos; // X position of the bottom left corner
        this.y_pos = y_pos; // Y position of the bottom left corner
        this.width = width; // Width of the triangle
        this.height = height; // Height of the triangle
    }

// ACCESSOR METHODS
    public double calculatePerimeter() { // Returns the perimeter of the triangle
        return width + 2 * Math.sqrt(Math.pow(height, 2) + Math.pow(width / 2, 2));
    }
    public double calculateArea() { // Returns the area of the triangle
        return 0.5 * width * height;
    }
    public Color getColor() { // Returns the color of the triangle
        return color;
    }
    public double getXPos() { // Returns the x position of the bottom left corner of the triangle
        return x_pos;
    }
    public double getYPos() { // Returns the y position of the bottom left corner of the triangle
        return y_pos;
    }
    public double getHeight() { // Returns the height of the triangle
        return height;
    }
    public double getWidth() { // Returns the width of the triangle
        return width;
    }

// UPDATE METHODS
    public void setColor(Color color) { // Sets the color of the triangle
        this.color = color;
    }
    public void setPos(double xPos, double yPos) { // Sets the position of the bottom left corner of the triangle
        this.x_pos = xPos;
        this.y_pos = yPos;
    }
    public void setHeight(double height) { // Sets the height of the triangle
        this.height = height;
    }
    public void setWidth(double width) { // Sets the width of the triangle
        this.width = width;
    }
}
