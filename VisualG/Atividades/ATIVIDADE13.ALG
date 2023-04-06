Algoritmo "notaMedia"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê três  notas  de  um  aluno,  calcule  e  escreva  a  média  final  deste  aluno.
// Autor(a)    : Beatriz
// Data atual  : 17/03/2023
Var
// Seção de Declarações das variáveis 
nota1, nota2, nota3, media:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite a primeira nota:")
leia(nota1)
escreval("Digite a segunda nota:")
leia(nota2)
escreval("Digite a terceira nota:")
leia(nota3)

media<-((nota1*2)+(nota2*3)+(nota3*5))/10

escreval("A média ponderada das notas do aluno é: ",media)

Fimalgoritmo