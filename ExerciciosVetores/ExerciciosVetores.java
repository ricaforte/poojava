package ExerciciosVetores;

import java.util.Scanner;

public class ExerciciosVetores {
    Scanner sc = new Scanner(System.in);

    public void exercicios1() {
        int vetorA[] = new int[] { 5, 10, 20, 25 };
        int vetorB[] = new int[5];
        vetorB[0] = vetorA[0];
        vetorB[1] = vetorA[1];
        vetorB[2] = vetorA[2];
        vetorB[3] = vetorA[3];
        vetorB[4] = vetorA[4];
        System.out.println("o vetorB e");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
    }

    public void exercicios2() {
        ;
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int vetorB[] = new int[] { vetorA[0], vetorA[1], vetorA[2], vetorA[3], vetorA[4], vetorA[5], vetorA[6],
                vetorA[6], vetorA[7], vetorA[8], };
       System.out.println("o vetorB é");
       System.out.println(vetorB[0]);
       System.out.println(vetorB[1]);
       System.out.println(vetorB[2]);
       System.out.println(vetorB[3]);
       System.out.println(vetorB[4]);
       System.out.println(vetorB[5]);
       System.out.println(vetorB[6]);
       System.out.println(vetorB[7]);
    } 
    }



