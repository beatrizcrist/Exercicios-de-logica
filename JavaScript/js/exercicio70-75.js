function exercicio70(){
    let valores = Number(prompt("Digite o 1° número"))
    let maior = valores
    let menor = valores

    for(let contador = 2; contador <= 100; contador++){
        valores = Number(prompt(`Digite o ${contador}° número`))

        if(valores > maior){
            maior = valores
        } 

        if(valores < menor){
            menor = valores
        }
    }

    alert("O maior valor digitado foi: "+maior)
    alert("O menor valor digitado foi: "+menor)

}



function exercicio71(){
    let quantidade = Number(prompt("Digite a quantidade de números a serem lidos"))
    let soma = 0, maior = 0, media

    for(let contador = 1; contador <= quantidade; contador++){
        let valores = Number(prompt(`Dgite o ${contador}° número`))

        if(valores > maior){
            maior = valores
        } 

        soma += valores
        media = soma / quantidade
    }
    alert("O maior valor digitado foi: "+maior)
    alert("A média dos números digitados foi: "+media)

}



function exercicio72(){
    let soma = 0, maior = 0, media
    for(let contador = 1; contador <= 15; contador++){
        let codigo = Number(prompt("Digite o código do produto"))
        let preco = Number(prompt("Digite o preço do produto"))

        if(preco > maior){
            maior = preco
        }

        soma += preco
        media = soma / contador
    }

    alert("O maior preço digitado foi: "+maior)
    alert("A média dos preços digitados foi: "+media)
}



function exercicio73(){
    let habitantes = 0, filhos = 0, media = 0, mediaFilhos = 0, salario = 1, percentual = 0, maior = 0, soma1 = 0, soma2 = 0, salarioBaixo = 0

    while(salario > 0){
        salario = Number(prompt("Digite o seu salário"))
        filhos = Number(prompt("Digite o número de filhos que você tem"))

        habitantes++

        soma1 = soma1+salario
        media = soma1/habitantes

        soma2 = soma2+filhos
        mediaFilhos = soma2/habitantes

        if(salario > maior){
            maior = salario
        }

        if(salario < 150){
            salarioBaixo++
        }
    }

    percentual<-(salarioBaixo/habitantes)*100

    alert(`Média do salário da população: ${media}`)
    alert(`Média do número de filhos: ${mediaFilhos}`)
    alert(`Maior salário da população: ${maior}`)
    alert(`Percentual de pessoas com salário menor que R$ 150,00: ${salarioBaixo}`)
}



function exercicio74(){
    for(let contador = 1; contador <= 10; contador++){
        for(let numero = 1; numero <= 10; numero++){
            let tabuada = contador * numero
            console.log(`${contador} X ${numero} = ${tabuada}`)
        }
    }
    alert("Veja o resultado no console, clicando com o botão direito do mouse, inspecionar")
}



function exercicio75(){
    for(let contador = 1; contador <= 10; contador++){
        console.log(contador+", ")
        for(let numero = 1; numero <= 10; numero++){
            console.log(numero)
        }
    }
    alert("Veja o resultado no console, clicando com o botão direito do mouse, inspecionar")
}