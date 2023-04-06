Algoritmo "atividade62"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê quantos alunos há na sala, as notas deles e mostra a media da sala
// Autor(a)    : Beatriz
// Data atual  : 04/04/2023
Var
// Seção de Declarações das variáveis 
alunos, notas, soma, contador: inteiro
media:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreval("Digite a quantidade de alunos existentes na turma:")
   leia(alunos)
   
   para contador de 1 ate alunos faca
   escreval("Digite a nota do aluno ",contador," :")
   leia(notas)
   soma<-soma+notas
   media<-soma/alunos
   fimpara
   
   escreval("A média de todas as notas dos alunos é:",media)
   

Fimalgoritmo