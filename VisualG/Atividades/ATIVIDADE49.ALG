Algoritmo "atividade49"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Acrescenta uma mensagem 'NOVO CÁLCULO(S/N)?' ao final do exercício [48].
// Autor(a)    : Beatriz
// Data atual  : 29/03/2023
Var
// Seção de Declarações das variáveis
nota1, nota2, media: real
novo: caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("Digite a nota da primeira avaliação:")
leia(nota1)
escreval("Digite a nota da segunda avaliação:")
leia(nota2)

enquanto (nota1 < 0) ou (nota2 < 0) ou (nota1 > 10) ou (nota2 > 10) faca
escreval("DIGITE SOMENTE VALORES VÁLIDOS, ENTRE 0 E 10!")
escreval("Digite a nota da primeira avaliação:")
leia(nota1)
escreval("Digite a nota da segunda avaliação:")
leia(nota2)
fimenquanto

media<-(nota1+nota2)/2

escreval("A média das duas notas tiradas nas avaliações é:",media)

escreval("Novo calculo? (S/N)")
leia(novo)

se(novo = "S")entao
escreval("Digite a nota da primeira avaliação:")
leia(nota1)
escreval("Digite a nota da segunda avaliação:")
leia(nota2)

enquanto (nota1 < 0) ou (nota2 < 0) ou (nota1 > 10) ou (nota2 > 10) faca
escreval("DIGITE SOMENTE VALORES VÁLIDOS, ENTRE 0 E 10!")
escreval("Digite a nota da primeira avaliação:")
leia(nota1)
escreval("Digite a nota da segunda avaliação:")
leia(nota2)
fimenquanto

media<-(nota1+nota2)/2

escreval("A média das duas notas tiradas nas avaliações é:",media)
senao
Escreval("Tchau tchau")
fimse

Fimalgoritmo