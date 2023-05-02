import java.util.Scanner;

public class ValorFinalVeiculo {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o custo da fabrica: R$");
        int custoFabrica = scan.nextInt();

        System.out.print("Informe a porcentagem do distribuidor: ");
        int porcentagemDistribuidor = scan.nextInt();

        System.out.print("informe o percentual de impostos: ");
        int PercentualImpostos = scan.nextInt();

        int custoConsumidor;
        int distribuidor;
        int impostos;


        distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        System.out.println("\nValor da distribuidora: " + "R$" + distribuidor);

        impostos = (custoFabrica * PercentualImpostos) / 100;
        System.out.println("\nValor dos impostos: " + "R$" + impostos);

        custoConsumidor = (custoFabrica + distribuidor + impostos);
        System.out.println("\nValor final do veiculo: " + "R$" + custoConsumidor);
    }
}
