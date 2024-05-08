import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro1 = new Carro("Nissan", "Gtr-R35", 2023, "GTR2023");

        System.out.println("Informações do carro:");
        carro1.exibirInformacoes();

        System.out.print("\nDigite o incremento de velocidade para acelerar: ");
        int incremento = scanner.nextInt();
        carro1.acelerar(incremento);

        System.out.print("\nDigite o decremento de velocidade para frear: ");
        int decremento = scanner.nextInt();
        carro1.frear(decremento);

        System.out.println("\nInformações atualizadas do carro:");
        carro1.exibirInformacoes();

    }
}
