Algoritmo "AprovadoReprovado"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Lê duas notas, calcula a média e mostra se o aluno foi aprovado ou nao
// Autor(a)    : Beatriz
// Data atual  : 17/03/2023
Var
// Seção de Declarações das variáveis 
nota1, nota2, media : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite a nota tirada da primeira avaliação:")
leia(nota1)
escreval("Digite a nota tirada da segunda avaliação:")
leia(nota2)

media<-(nota1+nota2)/2

escreval("Média das duas notas digitadas: ", media)

se(media >= 6)entao
escreval("Aluno aprovado!")
senao
escreval("Aluno reprovado!")
fimse

Fimalgoritmo