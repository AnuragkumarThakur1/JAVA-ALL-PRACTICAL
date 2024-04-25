/*Developed a program to demonstrate string buffer class
and it's method */


public class PracticalEighteen {
 public static void main(String[] args) {
 StringBuffer stringBuffer = new StringBuffer();
 stringBuffer.append("Hello");
 stringBuffer.append(" ");
 stringBuffer.append("World!");
 System.out.println("StringBuffer: " + stringBuffer);
 stringBuffer.insert(5, " Java");
 System.out.println("Modified StringBuffer: " + stringBuffer);
 stringBuffer.reverse();
 System.out.println("Reversed StringBuffer: " +
stringBuffer);
 stringBuffer.delete(0, 6);
 System.out.println("Modified StringBuffer: " + stringBuffer);
 stringBuffer.replace(0, 5, "Hi");
 System.out.println("Modified StringBuffer: " + stringBuffer);
 }
}