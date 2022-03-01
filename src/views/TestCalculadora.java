package views;

import model.Calculadora;

import java.util.Scanner;

public class TestCalculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculadora c1 = new Calculadora();

        System.out.println("Digite o valor 1: ");
        c1.valor1 = ler.nextDouble();
        System.out.println("Digite o valor 2: ");
        c1.valor2 = ler.nextDouble();

        int opcao;

        System.out.println("1 - Visualizar os valores: ");
        System.out.println("2 - Soma: ");
        System.out.println("3 - Subtração: ");
        System.out.println("4 - SAIR. ");
        System.out.println("Escolha qual operação você deseja visualizar: ");
        opcao = ler.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Valor 1"+c1.valor1);
                System.out.println("Valor 2"+c1.valor2);
                break;

            case 2:
                System.out.println("Resultado da soma"+c1.somar());
                break;
            case  3:
                System.out.println("Resultado da subtração"+c1.subtrair());
                break;
            case 4:
                System.out.println("Calculadora encerrada");
                System.exit(0);
                break;
            default:
                System.out.println("opção invalida...");
                break;
        }
    }
}
