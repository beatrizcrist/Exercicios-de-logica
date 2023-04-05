Algoritmo "ATIVIDADEMANZANDOPG46F"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : lê a base e um expoente e mostra o resultado da potencia
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 29/03/2023
Var
// Seção de Declarações das variáveis
  base, expoente, potencia, contadora:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
  escreval("Digite o valor da base:")
  leia(base)
  escreval("Digite o valor do expoente:")
  leia(expoente)

  potencia <- 1
  contadora <- 1
  enquanto contadora <= expoente faca
    potencia <- potencia * base
    contadora <- contadora + 1
  fimenquanto

  escreval(base, " elevado a", expoente, " é igual a", potencia)

Fimalgoritmo
