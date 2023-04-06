Algoritmo "crescente"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê dois valores e mostra eles em ordem crescente.
// Autor(a)    : Beatriz
// Data atual  : 17/03/2023
Var
// Seção de Declarações das variáveis 
valor1, valor2 : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite um número: ")
leia(valor1)
escreval("Digite outro número: ")
leia(valor2)

se(valor1 < valor2)entao
escreval("Os números digitados em ordem crescente ficam: ",valor1," ",valor2)
senao
escreval("Os números digitados em ordem crescente ficam: ",valor2," ",valor1)
fimse

Fimalgoritmo