import java.awt.Color;

public class Rectangle {

// INSTANCE VARIABLES
    public double x_pos;
    public double y_pos;
    public double width;
    public double height;
    public Color color;

//CONSTRUCTOR
    public Rectangle(double x_pos, double y_pos, double width, double height) {
        this.x_pos = x_pos; // X position of the upper left corner
        this.y_pos = y_pos; // Y position of the upper left corner
        this.width = width; // Width of the rectangle
        this.height = height; // Height of the rectangle
    }

// ACCESSOR METHODS
    public double calculatePerimeter() { // Returns the perimeter of the rectangle
        return 2 * width + 2 * height;
    }
    public double calculateArea() { // Returns the area of the rectangle
        return width * height;
    }
    public Color getColor() { // Returns the color of the rectangle
        return color;
    }
    public double getXPos() { // Returns the x position of the upper left corner of the rectangle
        return x_pos;
    }
    public double getYPos() { // Returns the y position of the upper left corner of the rectangle
        return y_pos;
    }
    public double getHeight() { // Returns the height of the rectangle
        return height;
    }
    public double getWidth() { // Returns the width of the rectangle
        return width;
    }

// UPDATE METHODS
    public void setColor(Color color) { // Sets the color of the rectangle
        this.color = color;
    }
    public void setPos(double xPos, double yPos) { // Sets the position of the upper left corner of the rectangle
        this.x_pos = xPos;
        this.y_pos = yPos;
    }
    public void setHeight(double height) { // Sets the height of the rectangle
        this.height = height;
    }
    public void setWidth(double width) { // Sets the width of the rectangle
        this.width = width;
    }
}
