import java.util.Scanner;

public class Main {

    public static boolean checaSeJaApareceu(boolean[] checklistIntervalo, int valor) {
        if(checklistIntervalo[valor]) {
            System.out.println("0");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int tamanho = keyboard.nextInt();
        int[][] matriz = new int[tamanho][tamanho];
        boolean[] checklistIntervalo = new boolean[tamanho*tamanho+1];

        for (int i = 0; i < tamanho ; i++) {
            for (int j = 0; j < tamanho ; j++) {
                int valor = keyboard.nextInt();
                if (checaSeJaApareceu(checklistIntervalo, valor)) return;
                matriz[i][j] = valor;
                checklistIntervalo[valor] = true;
            }
        }

        for (int i = 0; i < tamanho; i++) {
            for(int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


}