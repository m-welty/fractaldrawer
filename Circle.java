// Written by Max Welty, welty037

import java.awt.Color;

public class Circle {

// INSTANCE VARIABLES
    public double radius;
    public double x_pos;
    public double y_pos;
    public Color color;

//CONSTRUCTOR
    public Circle(double radius, double x_pos, double y_pos) {
        this.radius = radius; // Radius of the circle
        this.x_pos = x_pos; // X position of the center of the circle
        this.y_pos = y_pos; // Y position of the center of the circle
    }

// ACCESSOR METHODS
    public double calculatePerimeter() { // Returns the perimeter of the circle
        return 2 * Math.PI * radius;
    }
    public double calculateArea() { // Returns the area of the circle
        return Math.PI * Math.pow(radius, 2);
    }
    public Color getColor() { // Returns the color of the circle
        return color;
    }
    public double getXPos() { // Returns  the x position of the center of the circle
        return x_pos;
    }
    public double getYPos() { // Returns the y position of the center of the circle
        return y_pos;
    }
    public double getRadius() { // Returns the radius of the circle
        return radius;
    }

// UPDATE METHODS
    public void setColor(Color color) { // Sets the color of the circle
        this.color = color;
    }
    public void setPos(double xPos, double yPos) { // Sets the center position of the circle
        this.x_pos = xPos;
        this.y_pos = yPos;
    }
    public void setRadius(double rad) { // Sets the radius of the circle
        this.radius = rad;
    }
}
