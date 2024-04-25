/*We have to calculate the area of a rectangle , a square and a circle. Create an
abstract class shape with three abstract method namely 'rectanglearea' taking
to parameters 'squarearea' and 'circlearea' taking one parameter each. The
parameter of ‘rectanglearea’ are its ‘length’ and ‘breadth’ that of ‘squarearea’ is
it ‘sides’ and that of ‘circlearea’ is ‘radius’. Now create another class ‘Area’
containing all the three methods ‘rectanglearea’ ,’squarearea’ and ‘circlearea’
for printing the area of rectangle, square, and circle respectively. Create an
object of class ‘Area’ and call all the three methods.*/


abstract class Shape {
 abstract void RectangleArea(double length, double breadth);
 abstract void SquareArea(double side);
 abstract void CircleArea(double radius);
}
class Area extends Shape {
 void RectangleArea(double length, double breadth) {
 double area = length * breadth;
 System.out.println("Area of Rectangle: " + area);
 }
 void SquareArea(double side) {
 double area = side * side;
 System.out.println("Area of Square: " + area);
 }
 void CircleArea(double radius) {
 double area = Math.PI * radius * radius;
 System.out.println("Area of Circle: " + area);
 }
}
public class PracticalSixteen {
 public static void main(String[] args) {
 Area areaObj = new Area();
 areaObj.RectangleArea(5, 10);
 areaObj.SquareArea(7);
 areaObj.CircleArea(3);
 }
}