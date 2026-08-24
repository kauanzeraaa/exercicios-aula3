package Bank;

import java.util.Scanner;

public class Bank {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o saldo inicial da conta: R$");
    double saldo = sc.nextDouble();
    int opcao;

    do {
      System.out.println("\n1 - Consultar saldo");
      System.out.println("2 - Depositar");
      System.out.println("3 - Sacar");
      System.out.println("4 - Sair");
      System.out.print("Digite uma opção: ");
      opcao = sc.nextInt();

      switch (opcao) {
        case 1:
          System.out.printf("Saldo atual: R$%.2f%n", saldo);
          break;
        case 2:
          System.out.print("Digite o valor do depósito: R$");
          double deposito = sc.nextDouble();

          if (deposito > 0) {
            saldo += deposito;
            System.out.printf("Depósito realizado. Saldo atual: R$%.2f%n", saldo);
          } else {
            System.out.println("Valor inválido");
          }
          break;
        case 3:
          System.out.print("Digite o valor do saque: R$");
          double saque = sc.nextDouble();

          if (saque <= 0) {
            System.out.println("Valor inválido");
          } else if (saque > saldo) {
            System.out.println("Saldo insuficiente");
          } else {
            saldo -= saque;
            System.out.printf("Saque realizado. Saldo atual: R$%.2f%n", saldo);
          }
          break;
        case 4:
          System.out.println("Programa encerrado");
          break;
        default:
          System.out.println("Opção inválida");
          break;
      }
    } while (opcao != 4);

    sc.close();
  }
}
