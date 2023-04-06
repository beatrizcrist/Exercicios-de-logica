Algoritmo "eleicao"
// Disciplina   : [Lógica de Programação]
// Professor   : Obama
// Descrição   : Lê  o  número  total  de  eleitores  de um  município,  o  número  de  votos brancos, nulos e válidos e exibir o percentual
// Autor(a)    : Beatriz
// Data atual  : 15/03/2023
Var
// Seção de Declarações das variáveis 
votos, nulo, branco, valido,final: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
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