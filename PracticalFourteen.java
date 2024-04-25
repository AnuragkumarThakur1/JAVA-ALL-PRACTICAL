/*Create a class with a method that prints “This is parent class” and its subclass
with another method that prints “This is child class”. Now ,create an object for
each of the class and call
1- Method of parent class by object of parent class of parent class.
2- Method of child class by object of child class.
3- Method of parent class by object of child class. */

class ParentClass {
 public void printParent() {
 System.out.println("This is parent class");
 }
}
class ChildClass extends ParentClass {
 public void printChild() {
 System.out.println("This is child class");
 }
}
public class PracticalFourteen {
 public static void main(String[] args) {
 ParentClass parentObj = new ParentClass();
 ChildClass childObj = new ChildClass();
 parentObj.printParent();
 childObj.printChild();
 childObj.printParent();
}
}
