function exercicio5(){
    let numero = Number(prompt("Digite um número:"))
    let antecessor = numero - 1
    alert(`o antecessor do número ${numero} é ${antecessor}`)
}



function exercicio6(){
    let base = Number(prompt("Digite o valor para a base do triângulo:"))
    let altura = Number(prompt("Digite o valor para a altura do triângulo:"))
    let area = (base * altura) / 2

    alert(`O valor da área do trângulo é ${area}`)
}



function exercicio7(){
    let anos = Number(prompt("Digite quantos anos você tem:"))
    let meses = Number(prompt("Digite quantos meses se passaram desde seu aniversário:"))
    let dias = Number(prompt("Digite quantos dias se passaram desde seu ultimo mesversário:"))

    anos = anos * 365
    meses = meses * 30
    let idade = anos + meses + dias

    alert(`A sua idade expressa em dias é: ${idade}`)
}



function exercicio8(){
    let votos = Number(prompt("Digite o total de pessoas que votaram:"))
    let branco = Number(prompt("Digite a quantidade de pessoas que votaram em branco:"))
    let nulo = Number(prompt("Digite a quantidade de pessoas que votaram nulo:"))

    let valido = (votos-(nulo+branco))/votos*100
    nulo = (nulo / votos) * 100
    branco = (branco / votos) * 100

    alert(`A porcentagem de votos nulos: ${nulo}%`)
    alert(`A porcentagem de votos brancos: ${branco}%`)
    alert(`A porcentagem de votos válidos: ${valido}%`)
}



function exercicio9(){
    let salarioAtual = Number(prompt("Digite seu salário mensal atual"))
    let reajuste = Number(prompt("Digite o percentual de reajuste"))

    let salarioNovo = salarioAtual-(-reajuste * salarioAtual)/100

    alert(`O salário com reajuste de ${reajuste}%: ${salarioNovo}`)
}



function exercicio10(){
    let precoDeFabrica = Number(prompt("Digite o preço do carro de fábrica"))

    let final = (73/100*precoDeFabrica)+precoDeFabrica

    alert(`O preço do carro para o consumidor será: ${final}`)
}



function exercicio11(){
    let carrosVendidos = Number(prompt("Digite o número de carros vendidos pelo vendedor"))
    let totalVendas = Number(prompt("Digite o valor total das vendas efetuadas"))
    let salarioFixo = Number(prompt("Digite o salário fixo do vendedor"))
    let comissao = Number(prompt("Digite o valor que o vendedor recebe por carro vendido"))
    
    let salario = salarioFixo + (carrosVendidos * comissao) + (totalVendas * 5) /100

    alert(`O salário final do vendedor será: ${salario}`)
}



function exercicio12(){
    let Fahrenheit = parseFloat(prompt("Digite a temperatura em Fahrenheit:"))
    let celsius = (Fahrenheit - 32) * (5/9)

    alert(Fahrenheit+" graus fahrenheit = "+celsius+" graus celsius")
}



function exercicio13(){
    let nota1 = Number(prompt("Digite o valor da primeira nota:"))
    let nota2 = Number(prompt("Digite o valor da segunda nota:"))
    let nota3 = Number(prompt("Digite o valor da terceira nota:"))

    let mediaPonderada = ((nota1*2) + (nota2*3) + (nota3*5)) / 10

    alert(`A média ponderada das notas é: ${mediaPonderada}`)
}