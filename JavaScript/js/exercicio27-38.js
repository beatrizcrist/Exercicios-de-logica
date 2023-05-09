function exercicio27(){
    let valor = Number(prompt("Digite o valor"))

    if(valor == 0){
        alert("O valor digitado é igual a zero")
    } else if(valor > 0){
        alert("O valor digitado é positivo")
    } else{
        alert("O valor digitado é negativo")
    }
}



function exercicio28(){
    let valor1 = Number(prompt("Digite o primeiro valor:"))
    let valor2 = Number(prompt("Digite o segundo valor:"))
    let valor3 = Number(prompt("Digite o terceiro valor:"))

    if(valor1 > valor2 && valor1 > valor3){
        alert(`O maior valor digitado é: ${valor1}`)
    } else if(valor2 > valor3){
        alert(`O maior valor digitado é: ${valor2}`)
    } else{
        alert(`O maior valor digitado é: ${valor3}`)
    }
}



function exercicio29(){
    let valor1 = Number(prompt("Digite o primeiro valor:"))
    let valor2 = Number(prompt("Digite o segundo valor:"))
    let valor3 = Number(prompt("Digite o terceiro valor:"))
    let soma = 0

    if(valor1 > valor2 && valor1 > valor3){

        if(valor2 > valor3){
            soma = valor1 + valor2
        } else{
            soma = valor1 + valor3
        }

    } else if(valor2 > valor1 && valor2 > valor3){

        if(valor1 > valor3){
            soma = valor2 + valor1
        } else{
            soma = valor2 + valor3
        }

    } else{

        if(valor1 > valor2){
            soma = valor3 + valor1
        } else{
            soma = valor3 + valor2
        }

    }
    alert(`A soma dos dois maiores valores digitados é: ${soma}`)
}



function exercicio30(){
    let valor1 = Number(prompt("Digite o primeiro valor:"))
    let valor2 = Number(prompt("Digite o segundo valor:"))
    let valor3 = Number(prompt("Digite o terceiro valor:"))

    if(valor1 < valor2 && valor1 < valor3){

        if(valor2 < valor3){
            alert(`Os números digitados em ordem crescente é: ${valor1}, ${valor2} e ${valor3}`)
        } else{
            alert(`Os números digitados em ordem crescente é: ${valor1}, ${valor3} e ${valor2}`)
        }

    } else if(valor2 < valor1 && valor2 < valor3){

        if(valor1 < valor3){
            alert(`Os números digitados em ordem crescente é: ${valor2}, ${valor1} e ${valor3}`)
        } else{
            alert(`Os números digitados em ordem crescente é: ${valor2}, ${valor3} e ${valor1}`)
        }

    } else{

        if(valor1 < valor2){
            alert(`Os números digitados em ordem crescente é: ${valor3}, ${valor1} e ${valor2}`)
        } else{
            alert(`Os números digitados em ordem crescente é: ${valor3}, ${valor2} e ${valor1}`)
        }

    }
}



function exercicio31(){
    let a = Number(prompt("Digite o valor do primeiro lado:"))
    let b = Number(prompt("Digite o valor do segundo lado:"))
    let c = Number(prompt("Digite o valor do terceiro lado:"))

    if(c < a + b && a < b + c && b < c + a){
        alert("Pode formar um triângulo!")
    } else{
        alert("Não pode formar um triângulo!")
    }
}



function exercicio32(){
    let time1 = prompt("Digite o nome do time 1")
    let time2 = prompt("Digite o nome do time 2")
    let golsTime1 = Number(prompt(`Digite quantos gols o time ${time1} marcou`))
    let golsTime2 = Number(prompt(`Digite quantos gols o time ${time2} marcou`))

    if(golsTime1 == golsTime2){
        alert("O jogo deu EMPATE!")
    } else if(golsTime1 > golsTime2){
        alert(`O time ${time1} é o vencedor!`)
    } else{
        alert(`O time ${time2} é o vencedor!`)
    }
}



function exercicio33(){
    let valor1 = Number(prompt("Digite um número"))
    let valor2 = Number(prompt("Digite outro número"))

    if(valor1 == valor2){
        alert("Número iguais")
    } else if(valor1 > valor2){
        alert("O primeiro número é maior")
    } else{
        alert("O segundo número é maior")
    }
}



function exercicio34(){
    let x = Number(prompt("Digite o valor para x"))
    let y = Number(prompt("Digite o valor para y"))
    let resposta
    let z = (x*y) + 5

    if(z <= 0){
        resposta = "A"
    } else if(z <= 100){
        resposta = "B"
    } else{
        resposta = "C"
    }

    alert(`Z = ${z}     resposta = ${resposta}`)
}



function exercicio35(){
    let litros = Number(prompt("Quantos litros de combustivel foram vendidos"))
    let combustivel = Number(prompt("Tipo de combustivel vendido (A para álcool ou G para gasolina)"))
    let desconto, total = 0
    let alcool = 2.90
    let gasolina = 3.30

    if(combustivel == "A"){

        if(litros <= 20){
            desconto = alcool*0.03
            total = (alcool * litros) - (desconto * litros)
        } else{
            desconto = alcool*0.05
            total = (alcool * litros) - (desconto * litros)
        }

    } else{

        if(litros <= 20){
            desconto = gasolina*0.04
            total = (gasolina * litros) - (desconto * litros)
        } else{
            desconto = gasolina*0.06
            total = (gasolina * litros) - (desconto * litros)
        }

    }

    alert(`O total a ser pago pelo combustivel é: R$${total}`)
}



function exercicio36(){
    let mulher1 = Number(prompt("Digite a idade da primeira mulher"))
    let mulher2 = Number(prompt("Digite a idade da segunda mulher"))
    let homem1 = Number(prompt("Digite a idade do primeiro homem"))
    let homem2 = Number(prompt("Digite a idade do segundo homem"))
    let soma, produto = 0

    if(homem1 > homem2){

        if(mulher1 < mulher2){
            soma = homem1 + mulher1
            produto = homem2 * mulher2
        } else{
            soma = homem1 + mulher2
            produto = homem2 * mulher1
        }

    } else{

        if(mulher1< mulher2){
            soma = homem2 + mulher1
            produto = homem1 * mulher1
        } else{
            soma = homem2 + mulher2
            produto = homem1 * mulher1
        }

    }

    alert(`A soma das idades do homem mais velho com a mulher mais nova é: ${soma}`)
    alert(`O produto das idades do homem mais novo com a mulher mais velha é: ${produto}`)
}



function exercicio37(){
    let kiloMorando = Number(prompt("Digite quantos kilos de morango foram comprados"))
    let kiloMaca = Number(prompt("Digite quantos kilos de maça foram comprados"))
    let total, totalMaca, totalMorango, desconto = 0

    if(kiloMorando <= 5){
        totalMorango = kiloMorando * 2.50
        alert(`O preço total dos morangos comprados é: R$${totalMorango}`)
    } else{
        totalMorango = kiloMorando * 2.20
        alert(`O preço total dos morangos comprados é: R$${totalMorango}`)
    }

    if(kiloMaca <= 5){
        totalMaca = kiloMaca * 1.80
        alert(`O preço total das maças compradas é: R$${totalMaca}`)
    } else{
        totalMaca = kiloMaca * 1.50
        alert(`O preço total das maças compradas é: R$${totalMaca}`)
    }

    total = totalMaca + totalMorango

    if(kiloMorando + kiloMaca > 8 || total > 25){
        desconto = total + (total * 0.10)
        alert(`Total a ser pago pelo cliente: R$${desconto}`)
    } else{
        alert(`Total a ser pago pelo cliente: R$${total}`)
    }
}



function exercicio38(){
    let codigo = Number(prompt("Digite o código de usuário"))

    if(codigo == 1234){
        let senha = Number(prompt("Digite a senha de acesso"))

        if(senha == 9999){
            alert("Acesso permitido!")
        } else{
            alert('Senha incorreta!')
        }

    } else{
        alert("Usuário inválido!")
    }
}