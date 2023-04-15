package CalculoDeViagem;

/**
 * CalculoViagem
 */
public class CalculoViagem {

    public static void main(String[] args) {

        int distanciapercorrida = 250; // em km

        double consumotransporte = 25
        ; // em km/1

        double precodocombustivel = 4.99; // em R$
        
        double custototal = precodocombustivel*distanciapercorrida/consumotransporte;
        
        System.out.println( "o custo total da viagem foi de:");
        
        System.out.println("R$"+custototal);

    
    

        



    
    }
}