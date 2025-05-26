import java.util.Scanner;
import java.util.Random;

public class desafio5_random {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int numeroRandom = rand.nextInt(1, 101);

        int tentativa = 1;
        while (tentativa <= 5) {
            System.out.print("Tentativa " + tentativa + "/5: ");
            System.out.print("Digite um palpite: ");
            int palpite = scan.nextInt();

            if (palpite < numeroRandom) {
                System.out.println("Dica: O número é MAIOR que " + palpite + ".\n");
            } else if (palpite > numeroRandom) {
                System.out.println("Dica: O número é MENOR que " + palpite + ".\n");
            } else {
                System.out.println("Você venceu! O número era " + numeroRandom + ".\n");
                break;
            }

            tentativa++;
        }

        if (tentativa > 5) {
            System.out.println("Você perdeu! O número era " + numeroRandom + ".");
        }

        scan.close();
    }
}