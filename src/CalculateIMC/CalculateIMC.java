package CalculateIMC;

import java.util.Scanner;

public class CalculateIMC {
  public double calculateIMC(double peso, double altura) {
    return peso / (altura * altura);
  }

  public String classifyIMC(double imc) {
    if (imc < 18.5) {
      return "Abaixo do peso";
    } else if (imc <= 24.9) {
      return "Peso normal";
    } else if (imc <= 29.9) {
      return "Sobrepeso";
    }

    return "Obesidade";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CalculateIMC c = new CalculateIMC();

    System.out.print("Digite seu peso em kg: ");
    double peso = sc.nextDouble();
    System.out.print("Digite sua altura em metros: ");
    double altura = sc.nextDouble();

    double imc = c.calculateIMC(peso, altura);

    System.out.printf("Seu IMC é: %.2f%n", imc);
    System.out.println("Classificação: " + c.classifyIMC(imc));
  }
}
