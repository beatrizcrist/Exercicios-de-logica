Algoritmo "horaExtra"
// Disciplina   : [L�gica de Programa��o com JavaScript]
// Professor   : Obama
// Descri��o   : l� horas trabalhadas e salario por hora trabalhada, e mostra o salario final com o acrescimo de horas extras, se o funcinario tiver feito
// Autor(a)    : Beatriz
// Data atual  : 17/03/2023
Var
// Se��o de Declara��es das vari�veis 
horasTrabalhadas, salarioHora, salario, horaExtra, extra, total: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite quantas horas foram trabalhadas no m�s:")
leia(horasTrabalhadas)
escreval("Digite quanto � o salario por hora trabalhada:")
leia(salarioHora)

salario<-horasTrabalhadas*salarioHora

se(horasTrabalhadas > 160)entao
horaExtra<-horasTrabalhadas - 160  //quantas horas de hora extra foram feitas
total<-(horaExtra*salarioHora)*1.5   //multiplica o valor das horas extras e agrecenta 50%
salario<-total+(salarioHora *160)   //soma as horas extras com o salario total
escreval("O sal�rio total do funcion�rio �: R$",salario)
senao
escreval("O sal�rio total do funcion�rio �: R$",salario)
fimse

Fimalgoritmo
