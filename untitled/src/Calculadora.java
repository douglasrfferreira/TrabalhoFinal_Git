import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA ===");
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        Operacao operacao;

        switch (opcao) {
            case 1:
                operacao = new Somar();
                break;
            case 2:
                operacao = new Subtrair();
                break;
            case 3:
                operacao = new Multiplicar();
                break;
            case 4:
                operacao = new Dividir();
                break;
            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        double resultado = operacao.executar(n1, n2);
        System.out.println("\nResultado: " + resultado);

        sc.close();
    }
}
