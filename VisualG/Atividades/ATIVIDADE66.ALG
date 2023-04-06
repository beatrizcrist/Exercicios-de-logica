Algoritmo "atividade66"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Lê dos valores e mostra a soma dos numeros entre os dois valores lidos
// Autor(a)    : Beatriz
// Data atual  : 04/04/2023
Var
   // Seção de Declarações das variáveis
   valor1, valor2, soma, contador: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite o primeiro valor:")
   leia(valor1)
   escreval("Digite o segundo valor:")
   leia(valor2)

   se valor2 < valor1 entao
      para contador de valor2 ate valor1 faca
         soma<-soma+contador
      fimpara
   senao
      para contador de valor1 ate valor2 faca
         soma<-soma+contador
      fimpara
   fimse

   escreval("A soma dos números existentes entre os dois valores lidos é:",soma)

Fimalgoritmo