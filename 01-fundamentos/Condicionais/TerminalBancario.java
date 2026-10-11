void main() {
double saldo = 1000;
double limiteChequeEspecial = 500.0;

System.out.println("=== BANCO DIGITAL ===\n" +
        "1 - Consultar Saldo\n" +
        "2 - Realizar Saque\n" +
        "3 - Realizar Depósito\n" +
        "4 - Simular Empréstimo\n" +
        "Escolha uma opção:");

Scanner scanner = new Scanner(System.in);
int opcao = scanner.nextInt();

switch (opcao){
    case 1:
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        break;

    case 2:
        System.out.println("Digite o valor do saque a ser realizado: ");
        double valorSaque = scanner.nextDouble();

        if (valorSaque <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.printf("Saque realizado com sucesso! Novo saldo: R$ %.2f%n ", saldo);
        } else if (valorSaque <= saldo + limiteChequeEspecial) {
            saldo -= valorSaque;
            System.out.printf("Saque realizado usando o Cheque Especial! Novo saldo: R$ %.2f%n ", saldo);
        } else {
            System.out.println("Saldo e limite insuficientes para essa operação.");
        }
        break;


    case 3:
        System.out.println("Digite o valor a depositar: ");
        double valorDeposito = scanner.nextDouble();

        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.printf("Depósito realizado com sucesso! Novo saldo: R$ %.2f%n ", saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
        break;

    case 4:
        System.out.println("Informe sua renda mensal: ");
        double renda = scanner.nextDouble();

        if (renda >= 5000.0) {
            System.out.println("Crédito pré-aprovado de R$ 10.000,00.");
        } else if (renda >= 2000.0) {
            System.out.println("Crédito pré-aprovado de R$ 3.000,00.");
        } else {
            System.out.println("Crédito indisponível para esta faixa de renda.");
        }
        break;

    default:
        System.out.println("Opção inexistente no menu.");
        break;

}
}


