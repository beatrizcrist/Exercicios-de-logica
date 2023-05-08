let celsius = parseFloat(prompt("Digite a temperatura em celsius:"))
let fahrenheit = (9 * celsius + 160) / 5

alert(celsius+" graus celsius = "+fahrenheit+" graus fahrenheit")

document.getElementById("mostra").innerHTML = celsius+" graus celsius = "+fahrenheit+" graus fahrenheit"