import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int posMenor = 0;

        int[] vetor = new int[n];


        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
            int menor = vetor[posMenor];

            if (vetor[i] < menor)
                posMenor = i;
        }

        System.out.println("Menor valor: " + vetor[posMenor]);
        System.out.println("Posicao: " + posMenor);

    }
}
