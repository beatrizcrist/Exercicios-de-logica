function crescente(){
    let valor1 = Number(prompt("Digite um valor:"))
    let valor2 = Number(prompt("Digite outro valor:"))

    if(valor1 < valor2){
        alert("Valores digitados em ordem crescente: "+valor1+", "+valor2)
    } else{
        alert("Valores digitados em ordem crescente: "+valor2+", "+valor1)
    }
}