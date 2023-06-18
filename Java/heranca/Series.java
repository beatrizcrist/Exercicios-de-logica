package heranca;

import heranca.classes.Serie;

public class Series {
    public static void main(String[] args) {
        Serie serie1 = new Serie("Greys anatomy", 20, 2005);
        //System.out.println(serie1.pegarInformacoes()); 

        //tostring = mostra o nome da clase@ endereco da memoria do computador
        System.out.println(serie1.toString()); //explicita = ta mostrando claramente que esta chamando o metodo .tostring
        System.out.println(serie1); //implicito = o java ja presume que se esta assim é pq voce qur que apareça como se estivesse com .tostring
    
        //classe Object = todas as classe herdam coisas dela, a classe mae de todas as classes

    }
}
