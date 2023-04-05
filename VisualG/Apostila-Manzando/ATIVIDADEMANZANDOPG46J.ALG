Algoritmo "atividadeManzandoPg46j"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : mostra a soma e a media dos numeros pares de 50 a 70
// Autor(a)    : Beatriz
// Data atual  : 01/04/2023
Var
   // Seção de Declarações das variáveis
   contador,soma:inteiro
   media:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   contador<-50
   enquanto contador <= 70 faca
      se contador mod 2 = 0 entao
         soma<-soma+contador
         media<-soma/10
      fimse
         contador<-contador+1
   fimenquanto

   escreval("A soma dos números na faixa numérica de 50 a 70:",soma)
   escreval("A média dos números na faixa numérica de 50 a 70:",media)

Fimalgoritmo