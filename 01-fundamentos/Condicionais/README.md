# 🏧 Terminal Bancário Digital

Simulador de caixa eletrônico em Java que gerencia operações bancárias essenciais através de um menu interativo com validação de regras de negócio.

## 🎯 Objetivo
Dominar o controle de fluxo de execução em Java utilizando a estrutura de seleção múltipla `switch` combinada com validações encadeadas `if / else if / else`.

## 🛠️ Conceitos Praticados
- **Estrutura `switch` Tradicional:** Direcionamento das opções do menu (`case 1` a `case 4`), finalização de blocos com `break` (evitando *fall-through*) e tratamento de erros via `default`.
- **Estruturas Encadeadas (`if / else if / else`):**
  - **Operação de Saque:** Validação de valor nulo ou negativo (`<= 0`), saque com saldo em conta (`<= saldo`), acionamento do limite de cheque especial (`<= saldo + limiteChequeEspecial`) e bloqueio por saldo insuficiente.
  - **Operação de Depósito:** Garantia de valores estritamente positivos.
  - **Simulação de Crédito:** Avaliação ordenada de faixas de renda para concessão de empréstimo.
- **Atribuição Composta:** Atualização do saldo utilizando `-=` e `+=`.
- **Formatação Monetária:** Exibição padronizada de valores monetários com duas casas decimais utilizando `System.out.printf` (`R$ %.2f%n`).

## 💻 Exemplo de Execução
```text
=== BANCO DIGITAL ===
1 - Consultar Saldo
2 - Realizar Saque
3 - Realizar Depósito
4 - Simular Empréstimo
Escolha uma opção:
2
Digite o valor do saque a ser realizado: 
1200,0
Saque realizado usando o Cheque Especial! Novo saldo: R$ -200,00
```
