function exercicio01(){
    let numero = parseInt(prompt("Digite o primeiro número:"))
    let numero2 = parseInt(prompt("Digite o segundo número:"))

    let soma = numero + numero2

    alert(numero+" + "+numero2+" = "+soma)

    document.getElementById('oi').innerHTML = numero+" + "+numero2+" = "+soma
}



function exercicio02(){
    let numero1 = parseInt(prompt("Digite o primeiro número"))
    let numero2 = parseInt(prompt("Digite o segundo número"))

    let subtracao = numero1 - numero2

    window.alert(numero1+" - "+numero2+" = "+subtracao)

    document.getElementById('oi').innerHTML = numero1+" - "+numero2+" = "+subtracao
}



function exercicio03(){
    let numero1 = parseFloat(prompt("Digite um número:"))
    let numero2 = parseFloat(prompt("Digite outro número:"))

    let divisao = numero1 / numero2

    alert(numero1+" / "+numero2+" = "+divisao)

    document.getElementById('oi').innerHTML = numero1+" / "+numero2+" = "+divisao
}



function exercicio04(){
    let numero1 = parseInt(prompt("Digite um número:"))
    let numero2 = parseInt(prompt("Digite outro número:"))

    let multiplicacao = numero1 * numero2

    alert(numero1+" * "+numero2+" = "+multiplicacao)

    document.getElementById('oi').innerHTML = numero1+" * "+numero2+" = "+multiplicacao
}