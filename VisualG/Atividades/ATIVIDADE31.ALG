Algoritmo "atividade31"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Lê 3 valores e mostra se pode ser ou não um triângulo
// Autor(a)    : Beatriz
// Data atual  : 26/03/2023
Var
// Seção de Declarações das variáveis 
a,b,c: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("---------É um triangulo?---------")
escreval("Digite o valor do primeiro lado:")
leia(a)
escreval("Digite o valor do segundo lado:")
leia(b)
escreval("Digite o valor do terceiro lado:")
leia(c)

se(c < a + b) e (a < b + c) e (b < c + a)entao
escreval("Pode formar um triângulo!")
senao
escreval("Não pode formar um triângulo!")
fimse

Fimalgoritmo
