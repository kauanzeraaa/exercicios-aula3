package Orders;
import java.util.Scanner;

public class Orders {
  public void ExibirMenu(){
    System.out.println("1 - Hambúrguer || R$20,00");
    System.out.println("2 - Pizza || R$35,00");
    System.out.println("3 - Cachorro Quente || R$15,00");
    System.out.println("4 - Refrigerante || R$8,00");
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Orders o = new Orders();
    o.ExibirMenu();

    System.out.print("\nEscolha uma das opções acima: ");
    String escolha = sc.nextLine();

    switch (escolha) {
      case "1":
        System.out.println("\nProduto escolhido: Hambúrguer");
        System.out.println("Preço: R$20,00");
        break;
      case "2":
        System.out.println("\nProduto escolhido: Pizza");
        System.out.println("Preço: R$35,00");
        break;
      case "3":
        System.out.println("\nProduto escolhido: Cachorro Quente");
        System.out.println("Preço: R$15,00");
        break;
      case "4":
        System.out.println("\nProduto escolhido: Refrigerante");
        System.out.println("Preço: R$8,00");
      break;
      default:
        System.out.println("Opção inválida!");
        break;
    }
  }
}
