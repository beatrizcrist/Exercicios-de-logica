Algoritmo "atividadeManzandoPg46g"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : mostra a s�rie de Fibonacci at� o d�cimo quinto termo
// Autor(a)    : Beatriz
// Data atual  : 01/04/2023
Var
   // Se��o de Declara��es das vari�veis
   contador, fibonacci, anterior, atual:inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("S�rie de Fibonacci at� o d�cimo quinto termo")
   escreval(1)
   contador <- 1
   atual <- 1
   enquanto contador < 15 faca
      fibonacci <- anterior + atual
      escreval(fibonacci)
      anterior <- atual
      atual <- fibonacci
      contador <- contador + 1
   fimenquanto

Fimalgoritmo
