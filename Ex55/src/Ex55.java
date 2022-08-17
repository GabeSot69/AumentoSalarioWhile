/*
    Nome: Gabriel Sotero Mendonça
    Objetivo: Faça um programa que leia os valores dos salários atuais dos funcionários de uma empresa e imprima
    os valores com aumento. Se o salário for menor ou igual a R$ 500,00, o programa deve aplicar um aumento de 0.10
    (10%) e se for maior que R$ 500,00, o aumento deve ser de 0.08 (8%). Assim como no nosso último exemplo, o usuário é
     que deve informar quando deseja sair.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String escolha = "SIM";
        while (escolha.equalsIgnoreCase("SIM")) {
            System.out.println("Digite o salario atual");
            double salAtual = scanner.nextDouble();
            if (salAtual <= 500.00) {
                System.out.println("Aumento de 10%\nSalario com aumento: R$" + df.format(salAtual * 1.1));
            } else {
                System.out.println("Aumento de 8%\nSalario com aumento: R$" + df.format(salAtual * 1.08));
            }
            System.out.println();
            scanner.nextLine();
            boolean verificar;
            do {
                System.out.println("Deseja digitar outro salario? (Sim/Nao)");
                escolha = scanner.nextLine();
                verificar = !(escolha.equalsIgnoreCase("SIM")) && !(escolha.equalsIgnoreCase("NAO"));
                System.out.println();
            } while (verificar);

        }
    }
}
