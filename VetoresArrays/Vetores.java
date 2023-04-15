package VetoresArrays;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criar meu vetor
        double[] valores = new double[] { 10.5, 15.8, 7.5, -17.6 };
        System.out.println("0 1 elemento do vetor - valores[0] e " + valores[0]);
        System.out.println("0 2 elemento do vetor - valores[1] e " + valores[1]);
        System.out.println("0 3 elemento do vetor - valores[2] e " + valores[2]);
        System.out.println("0 4 elemento do vetor - valores[3] e " + valores[3]);
        System.out.println("Digite um novo valor a 4 posicao/indice 3");
        valores[3] = sc.nextDouble();
        System.out.println("O novo valor da 4Posicao/indice[3] e " + valores[3]);
    }

    public void exemplo2(){
            //criar um valor (vazio)ValoresInt[0]=sc.nextInt();
            int valoresInt[]= new int[5];
            System.out.println("Digite 5 valores Inteiros");
            valoresInt[0]=sc.nextInt();
            valoresInt[1]=sc.nextInt();
            valoresInt[2]=sc.nextInt();
            valoresInt[3]=sc.nextInt();
            valoresInt[4]=sc.nextInt();
            System.out.println("0 1 Elemento do Valor Indice[0] e "+valoresInt[0]);
            System.out.println( "0 2 Elemento do Valor Indice[1] e "+valoresInt[0]);
            System.out.println( "0 3 Elemento do Valor Indice[2] e "+valoresInt[0]);
            System.out.println( "0 4 Elemento do Valor Indice[3] e "+valoresInt[0]);
            System.out.println( "0 5 Elemento do Valor Indice[4] e "+valoresInt[0]);
            }

    public void exemplo3() {
        //criar um valor (vazio)ValoresInt[0]=sc.nextInt();
        double valoresReais[]= new double[10];
        System.out.println("Digite 10 valores");
       valoresReais[0]=sc.nextDouble();
       valoresReais[1]=sc.nextDouble();
       valoresReais[2]=sc.nextDouble();
       valoresReais[3]=sc.nextDouble();
       valoresReais[4]=sc.nextDouble();
       valoresReais[5]=sc.nextDouble();
       valoresReais[6]=sc.nextDouble();
       valoresReais[7]=sc.nextDouble();
       valoresReais[8]=sc.nextDouble();
       valoresReais[9]=sc.nextDouble();
       System.out.println(" 9  Elemento do valor indice[9]e"+valoresReais[9]);
       System.out.println(" 8  Elemento do valor indice[8]e"+valoresReais[8]);
       System.out.println(" 7  Elemento do valor indice[7]e"+valoresReais[7]);
       System.out.println(" 6  Elemento do valor indice[6]e"+valoresReais[6]);
       System.out.println(" 5  Elemento do valor indice[5]e"+valoresReais[5]);
       System.out.println(" 4  Elemento do valor indice[4]e"+valoresReais[4]);
       System.out.println(" 3  Elemento do valor indice[3]e"+valoresReais[3]);
       System.out.println(" 2  Elemento do valor indice[2]e"+valoresReais[2]);
       System.out.println(" 1  Elemento do valor indice[1]e"+valoresReais[1]);
       System.out.println(" 0  Elemento do valor indice[0]e"+valoresReais[0]);
    }
}
