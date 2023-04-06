Algoritmo "atividade41"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lÊ tres notas e a media dos exercicios, e mostra a media de aproveitamento e o conceito do aluno
// Autor(a)    : Beatriz
// Data atual  : 28/03/2023
Var
   // Seção de Declarações das variáveis
   nota1, nota2, nota3, mediaExercicio, mediaAproveitamento: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite a primera nota:")
   leia(nota1)
   escreval("Digite a segunda nota:")
   leia(nota2)
   escreval("Digite a terceira nota:")
   leia(nota3)
   escreval("Digite a média dos exercícios que fazem parte da avaliação:")
   leia(mediaExercicio)

   mediaAproveitamento<-(((nota1+nota2)*2)+(nota3*3)+mediaExercicio)/7

   escreval("Média de aproveitamento: ",mediaAproveitamento)
   se(mediaAproveitamento >= 9)entao
      escreval("O conceito do aluno é A!")
   senao
      se(mediaAproveitamento >= 7.5) e (mediaAproveitamento < 9.0)entao
         escreval("O conceito do aluno é B!")
      senao
         se(mediaAproveitamento >= 6.0) e (mediaAproveitamento < 7.5 )entao
            escreval("O conceito do aluno é C!")
         senao
            escreval("O conceito do aluno é D!")
         fimse
      fimse
   fimse


Fimalgoritmo