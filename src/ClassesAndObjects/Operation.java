package ClassesAndObjects;

import java.util.Scanner;

public class Operation {
  Scanner sc = new Scanner(System.in);
  
  /* Attributes */
  int number1;
  int number2;
  int sum;
  int difference;
  int product;
  int quotient;
  
  /* Methods */
  // Method to input two numbers
  public void readNumbers() {
    System.out.print("Input a number: ");
    number1 = sc.nextInt();
    System.out.print("Input another number: ");
    number2 = sc.nextInt();
  }
  // Method to add both numbers
  public void sum() {
    sum = number1 + number2;
  }
  
  // Method to subtract both numbers
  public void difference() {
    difference = number1 - number2;
  }
  
  // Method to multiply both numbers
  public void product() {
    product = number1 * number2;
  }

  // Method to divide both numbers
  public void quotient() {
    quotient = number1 / number2;
  }

  // Method to show results
  public void showResults() {
    System.out.println("The sum is: " + sum);
    System.out.println("The difference is: " + difference);
    System.out.println("The product is: " + product);
    System.out.println("The quotient is: " + quotient);
  }
}