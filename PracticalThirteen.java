//Write a program for Function Overloading .

public class PracticalThirteen {
 public static void main(String[] args) {
 PracticalThirteen obj = new PracticalThirteen();
 obj.display();
 obj.display(10);
 obj.display("Hello");
 }
 public void display() {
 System.out.println("This is the display method with no parameters");
 }
 public void display(int num) {
 System.out.println("This is the display method with an integer parameter: " +
num);
 }
 public void display(String str) {
 System.out.println("This is the display method with a string parameter: " + str);
 }
}