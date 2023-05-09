function exercicio14(){
    let numero = document.getElementById("numero").value
    if(numero > 10){
        document.getElementById('mostra1').innerHTML = "Numero maior que 10!"
    } else{
        document.getElementById('mostra1').innerHTML = "Numero menor que 10!"
    }
}



function exercicio15(){
    let valor = document.getElementById("valor").value

    if(valor < 0){
        document.getElementById("mostra2").innerHTML = "Valor negativo!"
    } else{
        document.getElementById("mostra2").innerHTML = "Valor positivo!"
    }
}



function exercicio16(){
    let maca = document.querySelector("#macas").value
    let mostra = document.getElementById('mostra3')

    if(maca < 12){
        preco = Number(maca) * 1.30
        mostra.innerHTML = 'O valor total a ser pago pelas maças R$'+preco
    } else{
        preco = Number(maca) * 1.00
        mostra.innerHTML = 'O valor total a ser pago pelas maças R$'+preco
    }
}



function exercicio17(){
    let nota1 = Number(prompt("Digite a primeira nota:"))
    let nota2 = Number(prompt("Digite a segunda nota:"))

    let media = (nota1 + nota2) / 2

    alert("A média das duas notas é: "+media)

    if(media > 6){
        alert("Aluno aprovado")
    } else{
        alert("Aluno reprovado")
    }
}



function exercicio18(){
    let mostrar = document.getElementById('mostra4')
    let mostrar1 = document.getElementById('mostra5')
    let anoAtual = document.getElementById("anoAtual").value
    let anoNascimento = document.getElementById("anoNascimento").value

    let idade = Number(anoAtual - anoNascimento)

    mostrar.innerHTML = "Você tem "+idade+" anos"
    if(idade < 16){
        mostrar1.innerHTML = "Você ainda não pode votar"
    } else{
        mostrar1.innerHTML = "Você já pode votar"
    }
}



function exercicio19(){
    let valor1 = Number(prompt("Digite um valor:"))
    let valor2 = Number(prompt("Digite outro valor:"))

    if(valor1 > valor2){
        alert("O maior valor digitado: "+valor1)
    } else{
        alert("O maior valor digitado: "+valor2)
    }
}



function exercicio20(){
    let valor1 = Number(prompt("Digite um valor:"))
    let valor2 = Number(prompt("Digite outro valor:"))

    if(valor1 < valor2){
        alert("Valores digitados em ordem crescente: "+valor1+", "+valor2)
    } else{
        alert("Valores digitados em ordem crescente: "+valor2+", "+valor1)
    }
}



function exercicio21(){
    let inicio = Number(prompt("Digite o horário de inicio do jogo de xadrez:"))
    let fim = Number(prompt("Digite o horário que acabou o jogo de xadrez:"))
    let duracao = 0

    if(fim <= inicio){
        duracao = 24 - inicio + fim
    } else{
        duracao = fim - inicio
    }

    alert(`O jogo de xadrez durou ${duracao} horas`)
}



function exercicio22(){
    let horasTrabalhadas = Number(prompt("Horas trabalhadas no mês pelo funcionario"))
    let salarioHora = Number(prompt("Salário recebido por hora"))

    let salario = horasTrabalhadas * salarioHora

    if(horasTrabalhadas > 160){
        let horaExtra = horasTrabalhadas - 160  //quantas horas de hora extra foram feitas
        let total = (horaExtra*salarioHora)*1.5   //multiplica o valor das horas extras e agrecenta 50%
        salario = total+(salarioHora *160)   //soma as horas extras com o salario total
    }

    alert(`O salário total do funcionário: ${salario}`)
}



function exercicio23(){
    let nome = prompt("Digite seu nome")
    let altura = Number(prompt("Digite sua altura"))
    let sexo = prompt("Digite o seu sexo (F para feminino e M para masculino):")
    let pesoIdeal = 0

    if(sexo == 'M'){
        pesoIdeal = (72.7 * altura) - 58
    } else{
        pesoIdeal = (62.1 * altura) - 44.7
    }

    alert(`${nome} seu peso ideal é ${pesoIdeal}`)
}



function exercicio24(){
    let salarioFixo = Number(prompt("DIgite o salário fixo do vendedor"))
    let valorVendas = Number(prompt("Digite o valor das vendas feitas pelo vendedor"))
    let comissao = valorVendas * 0.03
    let salarioTotal = 0

    if(valorVendas > 1500){
        salarioTotal = (((valorVendas-1500)*0.05)+(1500 * 0.03))+salarioFixo
    } else{
        salarioTotal = comissao+salarioFixo
    }

    alert(`O salário total do vendedor com comissão inclusa é: ${salarioTotal}`)
}



function exercicio25(){
    let numeroConta = Number(prompt("Digite o número de sua conta"))
    let saldo = Number(prompt("Digite o saldo disponivel em sua conta"))
    let debito = Number(prompt("Digite o valor que deseja debitar de sua conta"))
    let credito = Number(prompt("Digite o valor que deseja creditar à sua conta"))
    
    let saldoAtual = saldo - debito + credito

    alert(`O saldo atual disponivel em sua conta é: ${saldoAtual}`)

    if(saldoAtual >= 0){
        alert("Saldo Positivo!")
    } else{
        alert("Saldo Negativo!")
    }
}



function exercicio26(){
    let quantidadeEstoque = Number(prompt("Digite a quantidade atual do produto em estoque"))
    let quantidadeMaxima = Number(prompt("Digite a quantidade máxima do produto que o estoque pode ter"))
    let quantidadeMinima = Number(prompt("Digite a quantidade mínima em estoque de um produto"))
    
    let quantidadeMedia = ((quantidadeMaxima + quantidadeMinima)/2)

    alert("Quantidade média do produto em estoque: "+quantidadeMedia)

    if(quantidadeEstoque >+ quantidadeMedia){
        alert("Não efetuar compra")
    } else{
        alert('Efetuar compra')
    }
}