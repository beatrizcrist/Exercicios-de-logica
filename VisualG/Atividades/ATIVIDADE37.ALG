Algoritmo "atividade37"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê quantos kilos de morango e maça foram vendidos, mostra o total da ompra
// Autor(a)    : Beatriz
// Data atual  : 26/03/2023
Var
   // Seção de Declarações das variáveis
   kiloMorango, kiloMaca, totalMorango, totalMaca, desconto, total: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite quantos kilos de morango foram comprados: ")
   leia(kiloMorango)
   escreval("Digite quantos kilos de maça foram comprados: ")
   leia(kiloMaca)

   se(kiloMorango <= 5)entao
      totalMorango<-kiloMorango * 2.50
      escreval("O preço total dos morangos comprados é: R$",totalMorango)
   senao
      totalMorango<-kiloMorango * 2.20
      escreval("O preço total dos morangos comprados é: R$",totalMorango)
   fimse

   se(kiloMaca <= 5)entao
      totalMaca<-kiloMaca * 1.80
      escreval("O preço total das maças compradas é:",totalMaca)
   senao
      totalMaca<-kiloMaca * 1.50
      escreval("O preço total das maças compradas é:",totalMaca)
   fimse

   total<-totalMorango + totalMaca

   se(kiloMorango + KiloMaca > 8) ou (total > 25)entao
      desconto<-total-(total*0.10)
      escreval("Total a ser pago pelo cliente: R$",desconto)
   senao
      escreval("Total a ser pago pelo cliente: R$",total)
   fimse

Fimalgoritmo