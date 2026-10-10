void main() {
boolean isVip;
double desconto = 0;
double frete = 20;

Scanner scanner = new Scanner(System.in);
System.out.println("Digite o valor da compra:");
double valorCompra = scanner.nextDouble();
System.out.println("Cliente VIP? (1 para Sim, 0 para Não):");
int opcao = scanner.nextInt();
isVip = (opcao == 1);


    frete = (isVip || valorCompra >= 150.0) ? 0.0 : 20.0;
    desconto = isVip ? 0.10 : 0.0;

    double valorTotal = (valorCompra - (valorCompra * desconto)) + frete;

    System.out.println(valorTotal);

    scanner.close();
}


