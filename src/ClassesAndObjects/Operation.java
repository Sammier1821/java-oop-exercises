package ClassesAndObjects;

public class Operation {  
  /* Attributes */
  
  /* Methods */
  
  // Method to add both numbers
  public int add(int number1, int number2) {
    int sum = number1 + number2;
    return sum;
  }
  
  // Method to subtract both numbers
  public int subtract(int number1, int number2) {
    int difference = number1 - number2;
    return difference;
  }
  
  // Method to multiply both numbers
  public int multiply(int number1, int number2) {
    int product = number1 * number2;
    return product;
  }

  // Method to divide both numbers
  public int divide(int number1, int number2) {
    int quotient = number1 / number2;
    return quotient;
  }

  // Method to show results
  public void showResults(int sum, int difference, int product, int quotient) {
    System.out.println("The sum is: " + sum);
    System.out.println("The difference is: " + difference);
    System.out.println("The product is: " + product);
    System.out.println("The quotient is: " + quotient);
  }
}