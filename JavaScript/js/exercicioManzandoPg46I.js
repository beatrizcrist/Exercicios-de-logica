function media(){
    let contador = 1
    let soma = 0
    let media = 0
    while(contador <= 10){
        let valores = Number(prompt(`Digite o ${contador} número`))
        soma += valores
        media = soma / contador 
        contador++
    }
    document.getElementById('mostra').innerHTML = (`A soma dos valores digitados é ${soma} <br> A média aritimética dos valores é ${media}`)
}