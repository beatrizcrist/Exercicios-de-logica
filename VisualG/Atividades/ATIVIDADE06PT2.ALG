Algoritmo "areatriangulo"
// Disciplina   : [Lógica de Programação]
// Professor   : Obama
// Descrição   : Lê a base e a altura de um triangulo e exibe sua area
// Autor(a)    : Beatriz
// Data atual  : 15/03/2023
Var
// Seção de Declarações das variáveis 
base, altura : inteiro
area: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite a base do triangulo:")
leia(base)
escreval("Digite a altura do triangulo:")
leia(altura)

area<-base*altura/2

escreval("A área do triângulo é:", area)

Fimalgoritmo