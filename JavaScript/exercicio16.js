function macas(){
    let maca = document.querySelector("#macas").value
    let mostra = document.getElementById('mostra')

    if(maca < 12){
        preco = Number(maca) * 1.30
        mostra.innerHTML = 'O valor total a ser pago pelas maças R$'+preco
    } else{
        preco = Number(maca) * 1.00
        mostra.innerHTML = 'O valor total a ser pago pelas maças R$'+preco
    }
}