package RequestName;
import java.util.Scanner;

public class RequestName {
  public String requestName(String name){
    return "Hello, " + name + "!";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = sc.nextLine();

    RequestName requestName = new RequestName();
    System.out.println(requestName.requestName(name));
    
    sc.close();
  }
}
