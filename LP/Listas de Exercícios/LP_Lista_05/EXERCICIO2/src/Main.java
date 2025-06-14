public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        // Inicializando o vetor com valores de 1 a 10, por exemplo
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }

        // Aplicando as regras
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] += 2; // Ã­ndice par: soma 2
            } else {
                vetor[i] *= 2; // Ã­ndice Ã­mpar: multiplica por 2
            }
        }

        // Exibindo o vetor modificado
        System.out.println("Vetor apÃ³s aplicar as regras:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("PosiÃ§Ã£o " + i + ": " + vetor[i]);
        }
    }
}

