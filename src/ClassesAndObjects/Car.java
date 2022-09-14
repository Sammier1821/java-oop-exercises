package ClassesAndObjects;

public class Car {
  String color;
  String brand;
  int km;

  public static void main(String[] args) {
    Car car1 = new Car();
    
    car1.color = "White";
    car1.brand = "Audi";
    car1.km = 0;

    System.out.println("The color of car1 is: " + car1.color);
    System.out.println("The brand of car1 is: " + car1.brand);
    System.out.println("The mileage of car1 is: " + car1.km + "\n");

    Car car2 = new Car();
    car2.color = "Red";
    car2.brand = "Ferrari";
    car2.km = 100;

    System.out.println("The color of car2 is: " + car2.color);
    System.out.println("The brand of car2 is: " + car2.brand);
    System.out.println("The mileage of car2 is: " + car2.km);
  }
}
