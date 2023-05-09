let raio = parseFloat(prompt("Digite o valor do raio da garrafa de oleo:"))
let altura = parseFloat(prompt("Digite a altura da garrafa de óleo:"))

let volume = 3.14 * raio**2 * altura

alert("O valor do volume de uma lata de óleo é: "+volume)

document.getElementById("mostra").innerHTML = "O valor do volume de uma lata de óleo é: "+volume