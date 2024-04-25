/*Developed a program to demonstrate multilevel
inheritance. */


class Animal {
 void eat() {
 System.out.println("Eating...");
 }
}
class Dog extends Animal {
 void bark() {
 System.out.println("Barking...");
 }
}
class Labrador extends Dog {
 void color() {
 System.out.println("Labrador is brown in color.");
 }
}
public class PracticalNineteen {
 public static void main(String[] args) {
 Labrador labrador = new Labrador();
 labrador.eat();
 labrador.bark();
 labrador.color();
 }
}