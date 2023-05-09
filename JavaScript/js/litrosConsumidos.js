let tempo = Number(prompt("Digite o tempo de viagem:"))
let velocidade = Number(prompt("Digite a velocidade média durante a viagem:"))

let distancia = tempo * velocidade
let LitrosUsados = distancia / 12

alert("Tempo de viagem: "+tempo+" horas \nVelocidade média da viagem:"+velocidade+"Km/hrs \nDistancia percorrida: "+distancia+"Km \nLitros de combustivel utilizados: "+LitrosUsados+" litros")

document.getElementById("m1").innerHTML = "Tempo de viagem: "+tempo+" horas"
document.getElementById("m2").innerHTML = "Velocidade média da viagem:"+velocidade+"Km/hrs"
document.getElementById("m3").innerHTML = "Distancia percorrida: "+distancia+"Km"
document.getElementById("m4").innerHTML = "Litros de combustivel utilizados: "+LitrosUsados+" litros"