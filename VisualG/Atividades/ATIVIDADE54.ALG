Algoritmo "atividade54"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Modifique o exercício anterior para aceitar somente valores maiores que 0 para N.
// Data atual  : 30/03/2023
Var
   // Seção de Declarações das variáveis
   contador, valor:inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("-----CONTAR DE 1 ATÉ ...-----")
   escreval("Digite um numero:")
   leia(valor)

   se valor <= 0 entao
      enquanto valor < 0 faca
         escreval("VALOR INVALIDO, DIGITE SOMENTE NÚMEROS MAIORES QUE 0")
         escreval("Digite um valor:")
         leia(valor)
      fimenquanto
   fimse

   para contador de 1 ate valor faca
      escreval(contador)
   fimpara
   
Fimalgoritmo