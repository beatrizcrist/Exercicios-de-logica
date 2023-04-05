Algoritmo "ATIVIDADEMANZANDOPG66K"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : mostra o valor do fatorial dos valores ímpares situados na faixa numérica de 1 a 10
// Autor(a)    : Beatriz
// Data atual  : 02/04/2023
Var
   contador, numero, valor, fatorial, soma: inteiro

Inicio
   contador <- 1
   para contador de 1 ate 10 faca
      se contador mod 2 <> 0 entao
         fatorial <- 1
         numero <- 1
        para numero de contador ate 1 passo -1 faca
         fatorial <- fatorial * numero
         numero <- numero + 1
        fimpara
         escreval(fatorial)

         soma <- soma + fatorial
      fimse
   fimpara

   escreval("O somatório das fatoriais é: ", soma)

FimAlgoritmo



