Algoritmo "atividade44"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : obama
// Descrição   : lê dois valores, pede para o usuario digitar o segundo valor novamente se ele for igual a zero, e depois mostra a divisao dos dois valores
// Autor(a)    : Beatriz
// Data atual  : 29/03/2023
Var
// Seção de Declarações das variáveis 
valor1, valor2, divisao: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite o primeiro valor:")
leia(valor1)

repita
escreval("Digite o segundo valor:")
leia(valor2)
ate valor2 <> 0

divisao<-valor1/valor2

escreval("A divisão do primeiro valor pelo segundo valor é:",divisao)

Fimalgoritmo