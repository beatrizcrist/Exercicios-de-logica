Algoritmo "estoque"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : l� quantidade em estoque, quantidade maxima e minima, e mostra se � possivel efetuar a compra ou nao
// Autor(a)    : Beatriz
// Data atual  : 21/03/2023
Var
// Se��o de Declara��es das vari�veis 
quantidadeEstoque, quantidadeMaxima, quantidadeMinima: inteiro
quantidadeMedia: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite a quantidade atual do produto em estoque:")
leia(quantidadeEstoque)
escreval("Digite a quantidade m�xima do produto que o estoque pode ter:")
leia(quantidadeMaxima)
escreval("Digite a quantidade m�nima em estoque de um produto:")
leia(quantidadeMaxima)

quantidadeMedia<-((quantidadeMaxima + quantidadeMinima)/2)

escreval("Quantidade m�dia do produto em estoque: ",quantidadeMedia)

se(quantidadeEstoque >= quantidadeMedia)entao
escreval("N�o efetuar compra")
senao
escreval("Efetuar compra")
fimse

Fimalgoritmo