Algoritmo "AprovadoReprovado"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : L� duas notas, calcula a m�dia e mostra se o aluno foi aprovado ou nao
// Autor(a)    : Beatriz
// Data atual  : 17/03/2023
Var
// Se��o de Declara��es das vari�veis 
nota1, nota2, media : real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite a nota tirada da primeira avalia��o:")
leia(nota1)
escreval("Digite a nota tirada da segunda avalia��o:")
leia(nota2)

media<-(nota1+nota2)/2

escreval("M�dia das duas notas digitadas: ", media)

se(media >= 6)entao
escreval("Aluno aprovado!")
senao
escreval("Aluno reprovado!")
fimse

Fimalgoritmo