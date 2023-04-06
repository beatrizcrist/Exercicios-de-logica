Algoritmo "atividade73"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê o salario e o numero de filhos dos habitantes, e mostra a media de salario e de numero de filhos da populacao.tambem mostra o maior salario e o percentual de pessoas que ganha menos que 150 reais
// Autor(a)    : Beatriz
// Data atual  : 05/04/2023
Var
   // Seção de Declarações das variáveis
   numeroHabitantes, filhos: inteiro
   media, mediaFilhos, salario, percentual, maior, soma1, soma2:real
   salarioBaixo:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   salario<-1
   enquanto salario > 0 faca
      escreval("Digite o seu salário:")
      leia(salario)
      escreval("Digite o número de filhos que você tem:")
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

   escreval("Média de salário da população:",media)
   escreval("Média do número de filhos:",mediaFilhos)
   escreval("Maior salário dos habitantes:",maior)
   escreval("Percentual de pessoas com salário menor que R$ 150,00:",salarioBaixo,"%")

Fimalgoritmo