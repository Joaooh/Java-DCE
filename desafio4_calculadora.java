import java.util.Scanner;

public class desafio4_calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("===================\nCalculadora Simples\n===================");
        System.out.println();
        System.out.println("Escolha uma operação:");
        System.out.print("+ -> Soma\n- -> Subtração\n* -> Multiplicação\n/ -> Divisão\n");
        System.out.println();
        String escolha = scan.nextLine();

        System.out.print("Digite um número: ");
        double num1 = scan.nextDouble();

        System.out.print("Digite outro número: ");
        double num2 = scan.nextDouble();
        scan.nextLine();

        if (escolha.equals("+")) {
            System.out.println("Resultado: " + soma(num1, num2));

        } else if (escolha.equals("-")) {
            System.out.println("Resultado: " + subtracao(num1, num2));

        } else if (escolha.equals("*")) {
            System.out.println("Resultado: " + multiplicacao(num1, num2));

        } else if (escolha.equals("/")) {
            while (num2 <= 0) {
                System.out.print("Não é permitida divisão por 0 ou negativos. Digite outro número: ");
                num2 = scan.nextDouble();
                scan.nextLine();
            }
            System.out.println("Resultado: " + divisao(num1, num2));
        } else {
            System.out.println("Operação inválida.");
        }

        scan.close();
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        return num1 / num2;
    }
}