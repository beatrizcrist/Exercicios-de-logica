public class ContaBancaria {
    private double saldo;
    private int codigoConta = 190217;

    public void entrar(int codigoConta){
        if(codigoConta != this.codigoConta){
            System.out.println("Código inválido");
        } else{
            System.out.println("Seja bem vindo ao BBank");
            System.out.println("Saldo atual: "+ getSaldo());
        }
    }

    public void depositar(double valor){
        if(valor < 0){
            System.out.println("Não pode depositar número negativo!");
        } else{
            saldo +=valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: "+saldo);
        }
    }

    public double getSaldo(){
        return saldo;
    }

}
