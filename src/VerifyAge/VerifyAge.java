package VerifyAge;
import java.util.Scanner;

public class VerifyAge {
  public boolean verifyAge(int age) {
    return age >= 18;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    VerifyAge verifyAge = new VerifyAge();
    if (verifyAge.verifyAge(age)) {
      System.out.println("Maior de idade.");
    } else {
      System.out.println("Menor de idade.");
    }
    sc.close();
  }
}
