
function soma(a,b){
    let resultado = a + b
    document.getElementById('demo').innerHTML = resultado
}

function somaDoisNumeros(){
    let numero = Number(prompt("Digite um número:"))
    let numero1= Number(prompt('Digite outro numero'))
    let soma = numero + numero1
    alert("A soma dos valores é: "+soma)
}

function somaDoisNumerosInput(){
    let numero = document.getElementById('num1').value
    let numero1= document.getElementById('num2').value
    let soma = Number(numero) + Number(numero1)
    document.getElementById('demo').innerHTML = "A soma dos dois número é: "+soma;
}

function entrada(){
    let idade = parseInt(prompt("Digite a sua idade:"))

    if(idade >= 18){
        alert("Pode entrar na balada")
    } else{
        alert("Não pode entrar na baçada")
    }
}

