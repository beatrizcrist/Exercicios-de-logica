Algoritmo "atividade31"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : L� 3 valores e mostra se pode ser ou n�o um tri�ngulo
// Autor(a)    : Beatriz
// Data atual  : 26/03/2023
Var
// Se��o de Declara��es das vari�veis 
a,b,c: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreval("---------� um triangulo?---------")
escreval("Digite o valor do primeiro lado:")
leia(a)
escreval("Digite o valor do segundo lado:")
leia(b)
escreval("Digite o valor do terceiro lado:")
leia(c)

se(c < a + b) e (a < b + c) e (b < c + a)entao
escreval("Pode formar um tri�ngulo!")
senao
escreval("N�o pode formar um tri�ngulo!")
fimse

Fimalgoritmo
