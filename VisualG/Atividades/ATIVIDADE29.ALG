Algoritmo "atividade29"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : L�  3  valores e  escrever  a  soma  dos  2 maiores.
// Autor(a)    : Beatriz
// Data atual  : 26/03/2023
Var
   // Se��o de Declara��es das vari�veis
   valor1, valor2, valor3,soma: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("Digite o primeiro valor: ")
   leia(valor1)
   escreval("Digite o segundo valor: ")
   leia(valor2)
   escreval("Digite o terceiro valor: ")
   leia(valor3)

   se(valor1 > valor2) e (valor1 > valor3)entao
      se(valor2 > valor3)entao
         soma<-valor1+valor2
         escreval("A soma de",valor1," com",valor2," �: ",soma)
      senao
         soma<-valor1+valor3
         escreval("A soma de",valor1," com",valor3," �: ",soma)
      fimse
      
   senao
      se(valor2 > valor1) e (valor2 > valor3)entao
         se(valor1 > valor3)entao
            soma<-valor2+valor1
            escreval("A soma de",valor2," com",valor1," �: ",soma)
         senao
            soma<-valor2+valor3
            escreval("A soma de",valor2," com",valor3," �: ",soma)
         fimse

      senao
         se(valor1 > valor2)entao
            soma<-valor3+valor1
            escreval("A soma de",valor3," com",valor1," �: ",soma)
         senao
            soma<-valor3+valor2
            escreval("A soma de",valor3," com",valor2," �: ",soma)
         fimse
         
      fimse
   fimse

Fimalgoritmo