Algoritmo "atividade70"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : l� 100 valores e mostra quel foi o maior e o menor digitado
// Autor(a)    : Beatriz
// Data atual  : 04/04/2023
Var
   // Se��o de Declara��es das vari�veis
   valores, contador, maior, menor: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("Digite o 1� n�mero:")
   leia(valores)
   maior<-valores
   menor<-valores
   
   para contador de 2 ate 100 faca
      escreval("Digite o",contador,"� n�mero:")
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