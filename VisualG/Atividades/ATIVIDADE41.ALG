Algoritmo "atividade41"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : l� tres notas e a media dos exercicios, e mostra a media de aproveitamento e o conceito do aluno
// Autor(a)    : Beatriz
// Data atual  : 28/03/2023
Var
   // Se��o de Declara��es das vari�veis
   nota1, nota2, nota3, mediaExercicio, mediaAproveitamento: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("Digite a primera nota:")
   leia(nota1)
   escreval("Digite a segunda nota:")
   leia(nota2)
   escreval("Digite a terceira nota:")
   leia(nota3)
   escreval("Digite a m�dia dos exerc�cios que fazem parte da avalia��o:")
   leia(mediaExercicio)

   mediaAproveitamento<-(((nota1+nota2)*2)+(nota3*3)+mediaExercicio)/7

   escreval("M�dia de aproveitamento: ",mediaAproveitamento)
   se(mediaAproveitamento >= 9)entao
      escreval("O conceito do aluno � A!")
   senao
      se(mediaAproveitamento >= 7.5) e (mediaAproveitamento < 9.0)entao
         escreval("O conceito do aluno � B!")
      senao
         se(mediaAproveitamento >= 6.0) e (mediaAproveitamento < 7.5 )entao
            escreval("O conceito do aluno � C!")
         senao
            escreval("O conceito do aluno � D!")
         fimse
      fimse
   fimse


Fimalgoritmo