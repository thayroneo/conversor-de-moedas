package com.josetayrone.conversordemoedas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDeMoeda conversor = new ConversorDeMoeda();

        while (true) {
            System.out.println("*******************************************************");
            System.out.println("Bem vindo ao Conversor de Moeda!");
            System.out.println("*******************************************************");
            System.out.println("        1) Dólar (USD) -> Peso Argentino (ARS)");
            System.out.println("        2) Peso Argentino (ARS) -> Dólar (USD)");
            System.out.println("        3) Dólar (USD) -> Real Brasileiro (BRL)");
            System.out.println("        4) Real Brasileiro (BRL) -> Dólar (USD)");
            System.out.println("        5) Dólar (USD) -> Peso Colombiano (COP)");
            System.out.println("        6) Peso Colombiano (COP) -> Dólar (USD)");
            System.out.println("        7) Sair");
            System.out.println("*******************************************************");
            System.out.print("Digite a opção desejada: ");

            int opcao = scanner.nextInt();
            if (opcao == 7) {
                break;
            }

            String deMoeda = "";
            String paraMoeda = "";
            switch (opcao) {
                case 1:
                    deMoeda = "USD";
                    paraMoeda = "ARS";
                    break;
                case 2:
                    deMoeda = "ARS";
                    paraMoeda = "USD";
                    break;
                case 3:
                    deMoeda = "USD";
                    paraMoeda = "BRL";
                    break;
                case 4:
                    deMoeda = "BRL";
                    paraMoeda = "USD";
                    break;
                case 5:
                    deMoeda = "USD";
                    paraMoeda = "COP";
                    break;
                case 6:
                    deMoeda = "COP";
                    paraMoeda = "USD";
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            try {
                double taxa = conversor.obterTaxaDeCambio(deMoeda, paraMoeda);
                double valorConvertido = conversor.converter(valor, taxa);
                System.out.printf("%.4f %s é igual a %.4f %s%n", valor, deMoeda, valorConvertido, paraMoeda);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Erro ao obter a taxa de câmbio. Tente novamente.");
            }
        }

        scanner.close();
    }
}
