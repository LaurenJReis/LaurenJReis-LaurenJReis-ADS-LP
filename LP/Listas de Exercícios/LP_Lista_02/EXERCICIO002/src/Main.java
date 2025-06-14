import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int lol;
        System.out.println("Informe um valor");
        Scanner filo =new Scanner(System.in); // crio uma entrada para algum valor
        lol=filo.nextInt(); // nextInt salva o valor em lol
        lol= lol*lol; // faz o calculo da direita pra esquerda
        System.out.println("Seu quadrado é: " + lol); // ele imprime o resultado na tela

    }
}