Algoritmo "eleicao"
// Disciplina   : [L�gica de Programa��o]
// Professor   : Obama
// Descri��o   : L�  o  n�mero  total  de  eleitores  de um  munic�pio,  o  n�mero  de  votos brancos, nulos e v�lidos e exibir o percentual
// Autor(a)    : Beatriz
// Data atual  : 15/03/2023
Var
// Se��o de Declara��es das vari�veis 
votos, nulo, branco, valido,final: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite o total de pessoas que votaram:")
leia(votos)
escreval("Digite quantos pessoas votaram nulo:")
leia(nulo)
escreval("Digite quantas pessoas votaram branco:")
leia(branco)

valido<- (votos-(nulo+branco))/votos*100
nulo<-(nulo/votos)*100
branco<-(branco/votos)*100


escreval("Porcentagem de votos nulos: ",nulo,"%")
escreval("Porcentagem de votos brancos: ",branco,"%")
escreval("Porcentagem de votos validos: ",valido,"%")


Fimalgoritmo