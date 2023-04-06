Algoritmo "atividade38"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Obama
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Beatriz
// Data atual  : 26/03/2023
Var
   // Seção de Declarações das variáveis
   codigo,senha: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite o código de usuário:")
   leia(codigo)

   se(codigo = 1234)entao
      escreval("Digite a senha de acesso:")
      leia(senha)
      se(senha = 9999)entao
         escreval("Acesso permitido")
      senao
         escreval("Senha incorreta!")
      fimse
   senao
      escreval("Usuário inválido!")
   fimse

Fimalgoritmo