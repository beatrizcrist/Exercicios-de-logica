Algoritmo "AtividadeManzandoPg50D"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : Mostra quantos graos de trigo cabeiria num tabuleiro de xadrez
// Autor(a)    : Beatriz
// Data atual  : 02/04/2023
Var
// Se��o de Declara��es das vari�veis 
acumuladora, graos: real
contador: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

    repita
    contador<-contador+1
    graos<-2^(contador-1)
    acumuladora<-acumuladora+graos
    escreval(acumuladora)
    ate contador = 64

Fimalgoritmo