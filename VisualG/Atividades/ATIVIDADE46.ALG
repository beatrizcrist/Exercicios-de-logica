Algoritmo "atividade46"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : Acrescentar uma mensagem de 'VALOR INV�LIDO' no exerc�cio [44] caso o segundo  valor informado seja ZERO.
// Autor(a)    : Beatriz
// Data atual  : 29/03/2023
Var
// Se��o de Declara��es das vari�veis
valor1, valor2, divisao: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreval("Digite o primeiro valor:")
leia(valor1)
escreval("Digite o segundo valor:")
leia(valor2)

se valor2 = 0 entao
repita
escreval("VALOR INV�LIDO!")
escreval("Digite o segundo valor:")
leia(valor2)
ate valor2 <> 0
fimse

divisao<-valor1/valor2

escreval("A divis�o do primeiro valor pelo segundo valor �:",divisao)

Fimalgoritmo