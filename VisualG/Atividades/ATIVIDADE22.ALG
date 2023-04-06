Algoritmo "horaExtra"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : lê horas trabalhadas e salario por hora trabalhada, e mostra o salario final com o acrescimo de horas extras, se o funcinario tiver feito
// Autor(a)    : Beatriz
// Data atual  : 17/03/2023
Var
// Seção de Declarações das variáveis 
horasTrabalhadas, salarioHora, salario, horaExtra, extra, total: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite quantas horas foram trabalhadas no mês:")
leia(horasTrabalhadas)
escreval("Digite quanto é o salario por hora trabalhada:")
leia(salarioHora)

salario<-horasTrabalhadas*salarioHora

se(horasTrabalhadas > 160)entao
horaExtra<-horasTrabalhadas - 160  //quantas horas de hora extra foram feitas
total<-(horaExtra*salarioHora)*1.5   //multiplica o valor das horas extras e agrecenta 50%
salario<-total+(salarioHora *160)   //soma as horas extras com o salario total
escreval("O salário total do funcionário é: R$",salario)
senao
escreval("O salário total do funcionário é: R$",salario)
fimse

Fimalgoritmo
