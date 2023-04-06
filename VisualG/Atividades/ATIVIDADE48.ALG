Algoritmo "atividade48"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê duas notas e mostra a media, mas so podem ser lidos valores entre 0 e 10
// Autor(a)    : Beatriz
// Data atual  : 29/03/2023
Var
// Seção de Declarações das variáveis 
nota1, nota2, media: real

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

Fimalgoritmo