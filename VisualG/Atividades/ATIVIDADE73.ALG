Algoritmo "atividade73"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : l� o salario e o numero de filhos dos habitantes, e mostra a media de salario e de numero de filhos da populacao.tambem mostra o maior salario e o percentual de pessoas que ganha menos que 150 reais
// Autor(a)    : Beatriz
// Data atual  : 05/04/2023
Var
   // Se��o de Declara��es das vari�veis
   numeroHabitantes, filhos: inteiro
   media, mediaFilhos, salario, percentual, maior, soma1, soma2:real
   salarioBaixo:real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   salario<-1
   enquanto salario > 0 faca
      escreval("Digite o seu sal�rio:")
      leia(salario)
      escreval("Digite o n�mero de filhos que voc� tem:")
      leia(filhos)

      numeroHabitantes<-numeroHabitantes+1

      soma1<-soma1+salario
      media<-soma1/numeroHabitantes

      soma2<-soma2+filhos
      mediaFilhos<-soma2/numeroHabitantes

      se salario > maior entao
         maior<-salario
      fimse

      se salario < 150 entao
         salarioBaixo <- salarioBaixo + 1
      fimse

   fimenquanto

   percentual<-(salarioBaixo/numeroHabitantes)*100

   escreval("M�dia de sal�rio da popula��o:",media)
   escreval("M�dia do n�mero de filhos:",mediaFilhos)
   escreval("Maior sal�rio dos habitantes:",maior)
   escreval("Percentual de pessoas com sal�rio menor que R$ 150,00:",salarioBaixo,"%")

Fimalgoritmo