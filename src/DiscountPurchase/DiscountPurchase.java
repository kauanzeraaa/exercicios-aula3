package DiscountPurchase;
import java.util.Scanner;

public class DiscountPurchase {
  public double valorComDesconto;
  public double valorFinal;

  public double calculateDiscount(double valorCompra){
    if (valorCompra <= 100.0){
      System.out.println("Sua compra não teve desconto!");
    } else if(valorCompra <= 500.0){
      valorComDesconto = valorCompra * 0.10;
      valorFinal = valorCompra - valorComDesconto;
    } else if(valorCompra > 500.0){
      valorComDesconto = valorCompra * 0.15;
      valorFinal = valorCompra - valorComDesconto;
    }

    return valorFinal;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    DiscountPurchase d = new DiscountPurchase();

    System.out.print("Digite o valor do produto: ");
    double valorProduto = sc.nextDouble();

    System.out.println("Valor do produto: R$" + valorProduto);
    if (d.calculateDiscount(valorProduto) > 0){
      System.out.println("Valor do produto com desconto: R$" + d.calculateDiscount(valorProduto));
    }
  }
}
