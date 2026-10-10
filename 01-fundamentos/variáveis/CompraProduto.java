import java.util.Scanner;

public class CompraProduto {
    public static void main(String[] args) {

        String produto = "teclado";
        float precoProduto = 350f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade desejada de " + produto);
        int quantidade = scanner.nextInt();
        scanner.close();

        float valorCompra = quantidade * precoProduto;

        System.out.printf("O valor de %d %s ficou em R$ %.2f reais%n", quantidade, produto, valorCompra);

    }

}
