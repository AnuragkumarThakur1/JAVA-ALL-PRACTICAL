/*Write a program to check if a given string is a palindrome.
A palindrome reads same from front and back e.g.- aba,ccaacc,
mom, etc. */

import java.util.Scanner;
public class PracticalTen {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String input = scanner.nextLine();
 if (isPalindrome(input)) {
 System.out.println("The string is a palindrome.");
 } else {
 System.out.println("The string is not a palindrome.");
 }
 scanner.close();
 }
 public static boolean isPalindrome(String str) {
 int left = 0;
 int right = str.length() - 1;
 while (left < right) {
 if (str.charAt(left) != str.charAt(right)) {
 return false;
 }
 left++;
 right--;
 }
 return true;
 }
}