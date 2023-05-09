function comodos(){
    let continuar = 'sim'
    let area = 0
    let areaTotal = 0
    let comodos = 0

    while(continuar == 'sim'){
        let comodo = prompt("Digite o nome do cômodo")
        let largura = Number(prompt("Digite a largura do cômodo"))
        let comprimento = Number(prompt("Digite o comprimento do cômodo"))

        area = largura*comprimento

        alert(`A área do cômodo ${comodo} é ${area}m2`)
        areaTotal += area
        comodos++
        continuar = prompt("Quer continuar a calcular novos cômodos? (sim/não)")
    }
    alert(`Quntidade de cômodos lidos: ${comodos}`)
    alert(`A soma total da área dos comodos lidos é: ${areaTotal}m2`)
}