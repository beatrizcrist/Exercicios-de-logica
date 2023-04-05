Algoritmo "AtividadeManzandoPg46l"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê valores ate que seja infomado um negativo, depois mostra o maior e o menor valor digitado
// Autor(a)    : Beatriz
// Data atual  : 02/04/2023
Var
   // Seção de Declarações das variáveis
   valores, maior: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   valores<-1
   enquanto valores >= 0 faca
      escreval("Digite um número")
      leia(valores)

      se (valores > 0) entao
         se (valores > maior) entao
            maior <- valores
         fimse
      fimse
   fimenquanto
   
   escreval("O maior valor digitado foi:",maior)
   escreval("O menor valor digitado foi:",valores)

Fimalgoritmo