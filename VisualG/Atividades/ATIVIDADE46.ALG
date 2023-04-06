Algoritmo "atividade46"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício [44] caso o segundo  valor informado seja ZERO.
// Autor(a)    : Beatriz
// Data atual  : 29/03/2023
Var
// Seção de Declarações das variáveis
valor1, valor2, divisao: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("Digite o primeiro valor:")
leia(valor1)
escreval("Digite o segundo valor:")
leia(valor2)

se valor2 = 0 entao
repita
escreval("VALOR INVÁLIDO!")
escreval("Digite o segundo valor:")
leia(valor2)
ate valor2 <> 0
fimse

divisao<-valor1/valor2

escreval("A divisão do primeiro valor pelo segundo valor é:",divisao)

Fimalgoritmo