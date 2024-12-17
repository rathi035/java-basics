package sample;

public class Area {
    public static void main(String[] args) {
        // Variables
        int r = 2; // Radius of the circle
        int l = 3, b = 4; // Length and breadth of the rectangle
        int side = 5; // Side of the square
        double pi = 3.14;

        // Calculating areas
        double circle = pi * r * r; // Area of the circle
        int rectangle = l * b; // Area of the rectangle
        int square = side * side; // Area of the square

        // Printing the results
        System.out.println("Area of the Circle: " + circle);
        System.out.println("Area of the Rectangle: " + rectangle);
        System.out.println("Area of the Square: " + square);
    }
}

