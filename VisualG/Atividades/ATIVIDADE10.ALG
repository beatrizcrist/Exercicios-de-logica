Algoritmo "carroDeFabrica"
// Disciplina   : [L�gica de Programa��o]
// Professor   : Obama
// Descri��o   : L� o valor de carro de fabrica, acrescenta o percentual do distribuidor  de  28%  e  os  impostos  de  45%, e mostra o valor do carro para o consumidor
// Autor(a)    : Beatriz
// Data atual  : 15/03/2023
Var
// Se��o de Declara��es das vari�veis 
precoDeFabrica, final:real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite o custo do carro de f�brica:")
leia(precoDeFabrica)

final<-73/100*precoDeFabrica

escreval("O pre�o do carro para o consumidor ser�:",final+precoDeFabrica)

Fimalgoritmo