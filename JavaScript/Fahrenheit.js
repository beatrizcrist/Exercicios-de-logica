let Fahrenheit = parseFloat(prompt("Digite a temperatura em Fahrenheit:"))
let celsius = (Fahrenheit - 32) * (5/9)

alert(Fahrenheit+" graus fahrenheit = "+celsius+" graus celsius")

document.getElementById("mostra").innerHTML = Fahrenheit+" graus fahrenheit = "+celsius+" graus celsius"