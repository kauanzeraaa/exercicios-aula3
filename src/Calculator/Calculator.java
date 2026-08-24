package Calculator;

import java.util.Scanner;

public class Calculator {

  public double sum(double number1, double number2){
    return number1 + number2;
  }

  public double subtract(double number1, double number2){
    return number1 - number2;
  }

  public double multiply(double number1, double number2){
    return number1 * number2;
  }

  public double divide(double number1, double number2){
    return number1 / number2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("1 - Sum two numbers.");
    System.out.println("2 - Subtract two numbers.");
    System.out.println("3 - Multiply two numbers.");
    System.out.println("4 - Divide two numbers.");

    System.out.println("Type one of the options:");
    int choose = sc.nextInt();

    System.out.println("Write the first float number: ");
    double number1 = sc.nextDouble();

    System.out.println("Write the second float number: ");
    double number2 = sc.nextDouble();

    Calculator calculator = new Calculator();

    double result = 0.0;

    switch (choose) {
      case 1:
        result = calculator.sum(number1, number2);
        System.out.println("Result of sum: " + result);
        break;
      case 2:
        result = calculator.subtract(number1, number2);
        System.out.println("Result of subtract: " + result);
        break;
      case 3:
        result = calculator.multiply(number1, number2);
        System.out.println("Result of multiply: " + result);
        break;
      case 4:
        if(number1 == 0 || number2 == 0){
          System.out.println("Cannot divide by zero!");
          break;
        } else{
          result = calculator.divide(number1, number2);
          System.out.println("Result of divide: " + result);
          break;
        }
      default:
        System.out.println("Option not found!");
        break;
    }

    sc.close();
  }
}
