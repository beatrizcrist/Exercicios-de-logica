function exercicioA(){
    let contadora = 15;
    let resultado = 0;

    do {
        resultado = contadora * contadora;
        console.log(contadora + "² = " + resultado);
        contadora++;
    } while (contadora <= 200);

}

function exercicioB(){
    let soma = 0;
    let contador = 0;

    do {
        contador += 2;
        soma += contador;
    } while (contador <= 500);

    alert("Total das somas dos números pares de 1 a 500 é: " + soma);
}

function exercicioC(){
    let contador = 0;
    do {
        if (contador % 4 == 0) {
            alert(contador);
        }
        contador++;
    } while (contador <= 200);
}

function exercicioD(){
    let acumuladora = 0, graos = 0, contador = 0

    do{
        contador++;
        graos = 2 ** (contador - 1)
        acumuladora += graos
        console.log(acumuladora)
    } while (contador <= 64)
}

function exercicioE(){
    let contador = 1, numero = 1, valor = 0, fatorial = 1, soma = 0

   do{
       valor = Number(prompt("Digite um valor: "))

       numero = 1;
       fatorial = 1;

       do{
           fatorial *= numero
           numero++
       } while(numero <= valor)
       
       alert("Fatoria do valor digitado"+fatorial)
 
       soma += fatorial
 
       contador++
   } while (contador <= 15)


   alert("O somatório das fatoriais é: "+soma)
}

function exercicioF(){
    let valor = 0, soma = 0, total = 0, media=0

    do{
        valor = Number(prompt("Digite um valor:"))
        soma += valor
        total++
        media = soma / total
    } while (valor > 0)

     alert("A soma de todos os numeros digitados é: "+soma)
     alert("A média de todos os numeros digitados é: "+media)
     alert("O total de numeros digitados é: "+total)
}

function exercicioG(){
    let contador = 0;
    let fatorial = 0;

    do {
        contador++;

        if (contador % 2 !== 0) {
            fatorial = 1;

            for (let numero = contador; numero > 0; numero--) {
                fatorial *= numero;
            }

            alert("Fatorial de " + contador + " = " + fatorial);
        }

    } while (contador < 10);


}

function exercicioH(){
    let comodo, continuar
    let largura = 0
    let comprimento = 0
    let area = 0
    let total = 0

    do{
        comodo = prompt("Digite o nome do comodo")
        largura = Number(prompt("Digite a largura do comodo:"))
        comprimento = Number(prompt("Digite o comprimento do comodo:"))

        area = largura * comprimento
        total += area

        alert("A área do comodo "+comodo+" é: "+area+"m²")

        continuar = prompt("Gostaria de calcular a área de mais comodos? (SIM/NAO)")
    } while(continuar == "SIM")

    alert("O total da área de todos os comodos calculados é: "+total+"m²")
}

function exercicioI(){
    let valor = 0, maior = 0

    do{
        valor = Number(prompt("Digite um número"))

        if(valor > 0){
            if(valor > maior){
                maior = valor
            }
        }
    } while (valor >= 0)
    
    alert("O maior valor digitado foi: "+maior)
    alert("O menor valor digitado foi: "+valor)
}

function exercicioJ(){
    let divisor = Number(prompt("Digite um numero para ser divisor:"))
    let dividendo = Number(prompt("Digite um numero para se dividir:"))
    let quociente =0

    do{
        dividendo -= divisor
        quociente++
    } while(dividendo >= divisor)

   alert("O resultado inteiro da divisão é: "+quociente)
}