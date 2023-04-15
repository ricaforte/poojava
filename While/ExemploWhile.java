package While;
import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner (System.in);
    private Random rd;
    public void Exemplo1() {
    int interaçao = 0;
    while (interaçao<1234599999) {
     interaçao += 1;
     System.out.println("essa e a interaçao de n +interaçao");
     }
    } 
    public void Exemplo3(){
        // ler 5 numeros inteiros e printar na ordem
        // criar um vetor com while
        int vetor[] = new int[5];
        int i = 0;
        while (i<5){
            System.out.println("Digite o valor par ao vetor["+i+"]");
            vetor[i]=sc.nextInt();
            i++;
        }
        i=0;
        while (i<5);{
            System.out.println("vetor do["+i+"] E "vetor")

        }

    }          
}
