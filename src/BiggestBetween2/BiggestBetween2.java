package BiggestBetween2;
import java.util.Scanner;

public class BiggestBetween2 {
  int biggest;

  public int findBiggestNumber(int n1, int n2){
    if (n1 > n2){
      biggest = n1;
    }else{
      biggest = n2;
    }
    return biggest;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int numero1 = sc.nextInt();
    System.out.print("Digite o segundo número: ");
    int numero2 = sc.nextInt();

    BiggestBetween2 b = new BiggestBetween2();

    System.out.println("O maior número que você digitou foi: " + b.findBiggestNumber(numero1, numero2));
  }
}
