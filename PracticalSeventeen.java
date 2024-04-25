/*Developed a program to show static variables,methods and
block. */

public class PracticalSeventeen {
 static int count = 0;
 static {
 System.out.println("Static block executed");
 count = 10;
 }
 static void displayCount() {
 System.out.println("Count: " + count);
 }
 public static void main(String[] args) {
 displayCount();
 }
}