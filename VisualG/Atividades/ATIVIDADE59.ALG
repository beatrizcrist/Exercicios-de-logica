Algoritmo "atividade59"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Lê 10 valores e escreve quantos desses valores lidos são NEGATIVOS
// Autor(a)    : Beatriz
// Data atual  : 31/03/2023
Var
   // Seção de Declarações das variáveis
   contador, negativos: inteiro
   valores: vetor [1..10] de inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   para contador de 1 ate 10 faca
      escreval("Digite um número:")
      leia(valores[contador])
      se valores[contador] < 0 entao
         negativos<-negativos+1
      fimse
   fimpara

   escreval("A quantidade de números negativos digitados foi: ",negativos)

Fimalgoritmo