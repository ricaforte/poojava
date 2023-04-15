package IteracaoFor1;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("o da  iteracao é" + i);

        }
    }

    public void exemplo2() {
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor[" + i + "]=");
            vetor[i] = sc.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }
    }

    public void exemplo3() {

        double carrinhoCompra[] = new double[] { 19.90, 35.70, 56.80, 97.50 };
        double valorFinal = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
            System.out.println("Valor Parcial Compra: R$" + valorFinal);
        }
        System.out.println("Valor Final Compra: R$" + valorFinal);
    }

    public void exemplo4(){
        
        
    }

}
