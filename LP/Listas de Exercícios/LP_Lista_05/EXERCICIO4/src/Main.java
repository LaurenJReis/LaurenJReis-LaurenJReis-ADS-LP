import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);
        int maior, menor, posMaior = 0, posMenor = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a posiÃ§Ã£o " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        maior = menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }

        System.out.println("Maior valor: " + maior + " na posiÃ§Ã£o " + posMaior);
        System.out.println("Menor valor: " + menor + " na posiÃ§Ã£o " + posMenor);
    }
}

