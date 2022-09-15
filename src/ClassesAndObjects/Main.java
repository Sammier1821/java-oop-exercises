package ClassesAndObjects;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Operation op = new Operation();

    System.out.print("Input a number: ");
    int number1 = sc.nextInt();
    System.out.print("Input another number: ");
    int number2 = sc.nextInt();

    System.out.println("The sum is: " + op.add(number1, number2));
    System.out.println("The difference is: " + op.subtract(number1, number2));
    System.out.println("The product is: " + op.multiply(number1, number2));
    System.out.println("The quotient is: " + op.divide(number1, number2));

    sc.close();
  }
}
