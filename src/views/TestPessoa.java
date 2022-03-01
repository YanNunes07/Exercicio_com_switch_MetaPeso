package views;

import model.Pessoa;

import java.util.Scanner;

public class TestPessoa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        System.out.println("Digite seu peso: ");
        p1.setPeso(ler.nextDouble());
        System.out.println("Escolha umas das opções para simular seu objetivo.." +
                "\n1 - Engordar 15%:" +
                "\n2 - Emagrecer 20%:");
        p1.setMeta(ler.nextInt());
        System.out.println(p1);
    }
}
