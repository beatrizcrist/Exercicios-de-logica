Algoritmo "notaMedia"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : l� tr�s  notas  de  um  aluno,  calcule  e  escreva  a  m�dia  final  deste  aluno.
// Autor(a)    : Beatriz
// Data atual  : 17/03/2023
Var
// Se��o de Declara��es das vari�veis 
nota1, nota2, nota3, media:real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite a primeira nota:")
leia(nota1)
escreval("Digite a segunda nota:")
leia(nota2)
escreval("Digite a terceira nota:")
leia(nota3)

media<-((nota1*2)+(nota2*3)+(nota3*5))/10

escreval("A m�dia ponderada das notas do aluno �: ",media)

Fimalgoritmo