Algoritmo "atividade43"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : l� valores a, b e c e mostra que tivo de triangulo pode ser, ou se nao pode ser um triangulo
// Autor(a)    : Beatriz
// Data atual  : 29/03/2023
Var
   // Se��o de Declara��es das vari�veis
   a, b, c: real
   mens: caractere

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("-----QUE TIPO DE TRI�NGULO �?-----")
   escreval("Digite um valor para a:")
   leia(a)
   escreval("Digite um valor para b:")
   leia(b)
   escreval("Digite um valor para c:")
   leia(c)

   se(a < b+c) e (b < a+c) e (c < a+b)ent�o
      se(a=b) e (b=c)ent�o
         mens<-"Tri�ngulo Equil�tero"
      sen�o
         se(a=b) ou (b=c) ou (a=c)ent�o
            mens<-"Tri�ngulo Is�sceles"
         senao
            mens<-"Tri�ngulo Escaleno"
         fimse
      fimse

   senao
      mens<-"N�o � poss�vel formar um tri�ngulo"
   fimse

   escreval(mens)


   //1-nao � possivel
   //2-escaleno
   //3- nao tem
   //4- equilatero
   //5-isosceles
Fimalgoritmo