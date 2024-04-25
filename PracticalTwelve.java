//Write a program for Constructor Overloading.



public class PracticalTwelve {
 private int value;
 public PracticalTwelve() {
 value = 0;
 }
 public PracticalTwelve(int val) {
 value = val;
 }
 public PracticalTwelve(int val1, int val2) {
 value = val1 + val2;
 }
 public int getValue() {
 return value;
 }
 public static void main(String[] args) {
 PracticalTwelve obj1 = new PracticalTwelve();
 PracticalTwelve obj2 = new PracticalTwelve(5);
 PracticalTwelve obj3 = new PracticalTwelve(2, 3);
 System.out.println("Value of obj1: " + obj1.getValue());
 System.out.println("Value of obj2: " + obj2.getValue());
 System.out.println("Value of obj3: " + obj3.getValue());
 }
}