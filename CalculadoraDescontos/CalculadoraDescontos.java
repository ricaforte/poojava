package CalculadoraDescontos;

import java.time.format.SignStyle;  //double precoproduto=200;
import java.util.Scanner;

public class CalculadoraDescontos {
    public void calcular50(){ 
        Scanner sc = new Scanner(System.in);
        

   double precoproduto=200;
    final int desconto20 = 50;
    double precocomdesconto = precoproduto
    -(precoproduto*desconto20/100);
    System.out.println("O preço com desconto é"
    +precocomdesconto+ " reais"); 



    }
    public void calcular30(){    // double precoproduto=200;
        double precoproduto=200;
         final int desconto20 = 30;
         double precocomdesconto = precoproduto
         -(precoproduto*desconto20/100);
         System.out.println("O preço com desconto é"
         +precocomdesconto+ " reais"); 
    }

    
}
