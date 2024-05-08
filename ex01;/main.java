import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("Digite 1 para somar ");
        System.out.println("Digite 2 para subtrair ");
        System.out.println("Digite 3 para multiplicacao ");
        System.out.println("Digite 4 para dividir ");
        System.out.println("----------------------------------");

        System.out.print("Digite o numero desejado: ");
        Scanner leitor = new Scanner(System.in);
        int opcao = Integer.parseInt(leitor.nextLine()); 


        System.out.print("Digite o primeiro: ");
        Float a = Float.parseFloat(leitor.nextLine());
        System.out.print("Digite o segundo: ");
        Float b = Float.parseFloat(leitor.nextLine());
        

        
        if(opcao == 1){
            float soma = Calculadora.soma(a,b);
            System.out.println("O valor da soma é " + soma);
        }
        else if(opcao == 2){
            float subtrair = Calculadora.subtrair(a,b);
            System.out.println("O valor da subtraçao é " + subtrair);
        }
        else if (opcao == 3){
            float multiplicar = Calculadora.multiplicar(a,b);
            System.out.println("O valor da multiplicacao é " + multiplicar);
        }
        else if (opcao == 4){
            float dividir = Calculadora.dividir(a,b);
            System.out.println("O valor da divisao é " + dividir);
        }
    }
}
