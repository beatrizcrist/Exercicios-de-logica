Algoritmo "ATIVIDADEMANZANDOPG66H"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê a base e o expoente, e mostra a potencia
// Autor(a)    : Beatriz
// Data atual  : 02/04/2023
Var
   // Seção de Declarações das variáveis
   base, potencia, expoente, contador: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite o valor da base:")
   leia(base)
   escreval("Digite o valor do expoente:")
   leia(expoente)

   potencia<-1

   para contador de 1 ate expoente faca
      contador<- contador + 1
      potencia<- base * potencia
   fimpara

   escreval(base," elevado a",expoente," é igual a",potencia)
Fimalgoritmo