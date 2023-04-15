package Extruturadedecisaoif;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class decisaoif {
      Scanner sc = new Scanner(System.in);

      public void calcularDescontoif() {

            System.out.println("informe o valor do produto:");
            double precoProduto = sc.nextDouble();
            // boolean produtoAltoValor = precoProduto >= 100;
            double percentualDesconto = 0.0;
            if (precoProduto >= 100) { // extrutura de deciaso if
                  // Desconto para produtos de alto valor.
                  percentualDesconto = 5.0;
            }
            // Regra de tres
            double desconto = (precoProduto * percentualDesconto) / 100;
            double precoComDesconto = precoProduto - desconto;
            System.out.println("O produto saira por R$" + precoComDesconto);
      }
      // Deciao IF encadeada

      public void ifelse() {
            System.out.println("informe o valor do produto:");
            double precoProduto = sc.nextDouble();
            double percentualDesconto;
            if (precoProduto >= 200){
                  percentualDesconto = 5.0;
                  //Extrutura de Deciaso Encadeada
                  if(){
                  
                  if (precoProduto>=200){
                        percentualDesconto=10.0;
                  }else if(precoProduto=100){
                        percentualDesconto= 5,0
                  }           

            } else {
                  percentualDesconto = 0.0;

            }
            // Regra de tres
            double desconto = (precoProduto * percentualDesconto) / 100;
            double precoComDesconto = precoProduto - desconto;
            System.out.println("O produto saira por R$" + precoComDesconto);
      }
}
