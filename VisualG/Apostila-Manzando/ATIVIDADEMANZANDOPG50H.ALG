Algoritmo "AtividadeManzandoPg50H"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : le a largura e comprimento de um comodo e mostra a area
// Autor(a)    : Beatriz
// Data atual  : 03/04/2023
Var
// Se��o de Declara��es das vari�veis
comodo, continuar: caractere
largura, comprimento: inteiro
area, total:real

Inicio
     repita
     escreval("Digite o nome do comodo:")
     leia(comodo)
     escreval("Digite a largora do comodo:")
     leia(largura)
     escreval("Digite o comprimento do comodo:")
     leia(comprimento)

     area<-largura*comprimento
     total<-total+area

     escreval("A �rea do comodo ",comodo," �:",area,"m�")

     escreval("Gostaria de calcular a �rea de mais comodos? (SIM/NAO)")
     leia(continuar)

     ate continuar = "NAO"

     escreval("O total da �rea de todos os comodos calculados �:",total,"m�")
Fimalgoritmo
