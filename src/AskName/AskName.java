package AskName;
import java.util.Scanner;

public class AskName {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();

    System.out.println("O seu nome é: " + nome);
  }
}
