Algoritmo "maca"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê  o  número  de  maçãs  compradas e calcule o total da compra.
// Autor(a)    : Beatriz
// Data atual  : 17/03/2023
Var
// Seção de Declarações das variáveis 
maca, total:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite o número de maças compradas:")
leia(maca)

se(maca < 12)entao
total<-maca*1.30
escreval("O custo total da compra de ",maca," maça(s) é: R$",total)
senao
total<-maca*1.00
escreval("O custo total da compra de ",maca," maças é: R$",total)
fimse

Fimalgoritmo