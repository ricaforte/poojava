package AtividadeRevisao;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        System.out.println("Digite um numero:");
        double nDigitado = sc.nextDouble();
        if (nDigitado > 10) {
            System.out.println("E maoir que 10!");
        
        }
         else { 
            System.out.println("Nao e maoir que  10!");
        }
        }
    }

public void exemplo2() {
    System.out.println("Informe a quantidade horas Trabalhadas no Mes");
    int horastrabalhadas = sc .nextInt();
    System.out.println("informe o valor da hora ");
    double Valorhoras = sc.nextDouble();
    int horasExtras = horastrabalhadas - 200;
    double salariototal = horastrabalhadas + horasExtras * Valorhoras * 50 / 100;
    System.out.println("O valor das Horas e R$" +salariototal);
}


    

    

    














        
    

