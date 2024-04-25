/*Write a program to print the area of two rectangle having sides (4,5) and
(5,8) respectively by creating a class named ‘Rectangle’ with a method
named ‘Area’ which returns the area and length and breadth passed as
parameters to its constructors. */

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
}

public class PracticalEleven {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);

        int area1 = rectangle1.area();
        int area2 = rectangle2.area();

        System.out.println("Area of rectangle 1: " + area1);
        System.out.println("Area of rectangle 2: " + area2);
    }
}