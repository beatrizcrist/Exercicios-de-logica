Algoritmo "estoque"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê quantidade em estoque, quantidade maxima e minima, e mostra se é possivel efetuar a compra ou nao
// Autor(a)    : Beatriz
// Data atual  : 21/03/2023
Var
// Seção de Declarações das variáveis 
quantidadeEstoque, quantidadeMaxima, quantidadeMinima: inteiro
quantidadeMedia: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite a quantidade atual do produto em estoque:")
leia(quantidadeEstoque)
escreval("Digite a quantidade máxima do produto que o estoque pode ter:")
leia(quantidadeMaxima)
escreval("Digite a quantidade mínima em estoque de um produto:")
leia(quantidadeMaxima)

quantidadeMedia<-((quantidadeMaxima + quantidadeMinima)/2)

escreval("Quantidade média do produto em estoque: ",quantidadeMedia)

se(quantidadeEstoque >= quantidadeMedia)entao
escreval("Não efetuar compra")
senao
escreval("Efetuar compra")
fimse

Fimalgoritmo