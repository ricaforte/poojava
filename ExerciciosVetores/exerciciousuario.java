package ExerciciosVetores;

public class exerciciousuario{
// resolve lista extra de vetores
public void exercicios1(){ //vetoreA = vetorB
int vetorA[]=new int[]{3,5,7,11,13};
int vetorB[]=new int[5];
int i=0;
while(i<5){
    vetorB[i]=vetorA[i];
    System.out.println(vetorB[i]);
    i++;
}
    
}
public void exercicio2() { 
 int vetorA[]=new int[] {2,4,6,8,10,12,14,16};
 int vetorB[]=new int[8];
 int i=0;
 while(i<8){
    vetorB[i]=vetorA[i];
    System.out.println("vetorB["+i+"]"+vetorB[i]);
    i++;
}
}
}

