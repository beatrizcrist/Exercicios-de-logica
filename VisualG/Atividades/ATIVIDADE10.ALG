Algoritmo "carroDeFabrica"
// Disciplina   : [Lógica de Programação]
// Professor   : Obama
// Descrição   : Lê o valor de carro de fabrica, acrescenta o percentual do distribuidor  de  28%  e  os  impostos  de  45%, e mostra o valor do carro para o consumidor
// Autor(a)    : Beatriz
// Data atual  : 15/03/2023
Var
// Seção de Declarações das variáveis 
precoDeFabrica, final:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite o custo do carro de fábrica:")
leia(precoDeFabrica)

final<-73/100*precoDeFabrica

escreval("O preço do carro para o consumidor será:",final+precoDeFabrica)

Fimalgoritmo