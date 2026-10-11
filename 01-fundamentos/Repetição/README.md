# 📈 Simulador Financeiro e Investimentos

Terminal financeiro interativo que realiza simulações contínuas de rendimento mensal e listagem de fundos, mantendo o programa ativo até a decisão explícita de encerramento do usuário.

## 🎯 Objetivo
Dominar as quatro estruturas de repetição fundamentais do Java (`while`, `do-while`, `for` e `for-each`), entendendo quando aplicar cada uma de acordo com a previsibilidade das iterações e regras de negócio.

## 🛠️ Conceitos Praticados
- **Laço `do-while`:** Controle do ciclo de vida da aplicação através de um menu interativo contínuo (pós-teste), garantindo que o menu seja exibido ao menos uma vez e repetido enquanto `opcao != 0`.
- **Laço `while`:** Validação defensiva de entrada (pré-teste), obrigando o usuário a redigitar valores enquanto informar valores menores ou iguais a zero (`while (valor <= 0)`).
- **Laço `for` Clássico:** Projeção temporal de juros compostos mês a mês ao longo de um período determinado, calculando e exibindo a evolução financeira a cada iteração.
- **Laço `for-each`:** Iteração simples e limpa sobre um array unidimensional de fundos de investimento sem a necessidade de controle manual de índices.
- **Tratamento de Opções:** Mensagem de erro para opções inexistentes e encerramento limpo do programa ao escolher `0`.

## 💻 Exemplo de Execução
```text
=== SIMULADOR FINANCEIRO ===
1 - Simular Rendimento Mensal (CDB/Poupança)
2 - Listar Fundos Disponíveis
0 - Sair
Escolha uma opção:
1
Digite o valor inicial a investir:
-50
Valor inválido! Digite um valor maior que zero:
1000
Digite a quantidade de meses:
3
Evolução do investimento (1.0% a.m.):
Mês 1: R$ 1010,00
Mês 2: R$ 1020,10
Mês 3: R$ 1030,30

=== SIMULADOR FINANCEIRO ===
1 - Simular Rendimento Mensal (CDB/Poupança)
2 - Listar Fundos Disponíveis
0 - Sair
Escolha uma opção:
0
Encerrando o sistema. Até logo!
```
