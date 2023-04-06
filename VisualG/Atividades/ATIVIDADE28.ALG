Algoritmo "atividade28"
// Disciplina   : [Lógica de Programação com javaScript]
// Professor   : Obama
// Descrição   : Lê 3 valores e escrever o maior deles.
// Autor(a)    : Beatriz
// Data atual  : 22/03/2023
Var
   // Seção de Declarações das variáveis
   valor1, valor2, valor3 :real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite o primeiro valor:")
   leia(valor1)
   escreval("Digite o segundo valor:")
   leia(valor2)
   escreval("Digite o terceiro valor:")
   leia(valor3)

   se (valor1 > valor2) e (valor1 > valor3) entao
      escreval("O maior valor digitado é: ",valor1)
   senao
      se (valor2 > valor3) entao
         escreval("O maior valor digitado é: ",valor2)
      senao
         escreval("O maior valor digitado é: ",valor3)
      fimse
   fimse

Fimalgoritmo