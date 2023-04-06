Algoritmo "atividade70"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê 100 valores e mostra quel foi o maior e o menor digitado
// Autor(a)    : Beatriz
// Data atual  : 04/04/2023
Var
   // Seção de Declarações das variáveis
   valores, contador, maior, menor: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite o 1° número:")
   leia(valores)
   maior<-valores
   menor<-valores
   
   para contador de 2 ate 100 faca
      escreval("Digite o",contador,"° número:")
      leia(valores)

      se valores > maior entao
         maior<-valores
      fimse

      se valores < menor entao
         menor<- valores
      fimse

   fimpara
   
   escreval("O maior valor digitado foi:",maior)
   escreval("O menor valor digitado foi:",menor)

Fimalgoritmo