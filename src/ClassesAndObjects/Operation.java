package ClassesAndObjects;

public class Operation {  
  /* Attributes */
  int sum;
  int difference;
  int product;
  int quotient;
  
  /* Methods */
  
  // Method to add both numbers
  public void add(int number1, int number2) {
    sum = number1 + number2;
  }
  
  // Method to subtract both numbers
  public void subtract(int number1, int number2) {
    difference = number1 - number2;
  }
  
  // Method to multiply both numbers
  public void multiply(int number1, int number2) {
    product = number1 * number2;
  }

  // Method to divide both numbers
  public void divide(int number1, int number2) {
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