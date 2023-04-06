Algoritmo "atividade30"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Lê  3  valores e mostra eles ordem crescente.
// Autor(a)    : Beatriz
// Data atual  : 26/03/2023
Var
   // Seção de Declarações das variáveis
   valor1, valor2, valor3: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite o primeiro valor:")
   leia(valor1)
   escreval("Digite o segundo valor:")
   leia(valor2)
   escreval("Digite o terceiro valor:")
   leia(valor3)

   se(valor1 < valor2)e(valor1 < valor3)entao
      se(valor2 < valor3)entao
         escreval("Os números digitados em ordem crescente é:",valor1, valor2, valor3)
      senao
         escreval("Os números digitados em ordem crescente é:",valor1, valor3, valor2)
      fimse
   senao
      se(valor2 < valor1)e(valor2 < valor3)entao
         se(valor1 < valor3)entao
            escreval("Os números digitados em ordem crescente é:",valor2, valor1, valor3)
         senao
            escreval("Os números digitados em ordem crescente é:",valor2, valor3, valor1)
         fimse
      senao
         se(valor1 < valor2)entao
            escreval("Os números digitados em ordem crescente é:",valor3, valor1, valor2)
         senao
            escreval("Os números digitados em ordem crescente é:",valor3, valor2, valor1)
         fimse

      fimse
fimse

Fimalgoritmo