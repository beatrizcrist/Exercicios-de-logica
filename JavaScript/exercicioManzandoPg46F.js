function potencia(){
    let base=Number(prompt('Escreva a base da operação:'));
    let expoente=Number(prompt('Escreva a exponenciação da operação:'));
    let contadora=1;
    let potencia=1;
    while(contadora<=expoente){
        potencia *= base;
        contadora++
    }
    document.getElementById('mostra').innerHTML = (base+" elevado a "+expoente+" é = "+potencia)
}