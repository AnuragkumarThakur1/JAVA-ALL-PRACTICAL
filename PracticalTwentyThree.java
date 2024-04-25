//Write a Java program to create an interface called
//Shape with the getArea() method. Create three classes
//Circle, Rectangle, and Triangle that implement the
//Shape interface. Each class should provide the
//required implementation for the getArea() method.


interface Shape {
 double getArea();
}
class Circle implements Shape {
 private double radius;
 public Circle(double radius) {
 this.radius = radius;
 }
 @Override
 public double getArea() {
 return Math.PI * radius * radius;
 }
}
class Rectangle implements Shape {
 private double width;
 private double height;
 public Rectangle(double width, double height) {
 this.width = width;
 this.height = height;
 }
 @Override
public double getArea() {
 return width * height;
 }
}
class Triangle implements Shape {
 private double base;
 private double height;
 public Triangle(double base, double height) {
 this.base = base;
 this.height = height;
 }
 @Override
 public double getArea() {
 return 0.5 * base * height;
 }
}
public class Main {
 public static void main(String[] args) {
 Circle circle = new Circle(5);
 Rectangle rectangle = new Rectangle(4, 6);
 Triangle triangle = new Triangle(3, 4);
 System.out.println("Circle area: " +
circle.getArea());
 System.out.println("Rectangle area: " +
rectangle.getArea());
 System.out.println("Triangle area: " +
triangle.getArea());
 }
}

