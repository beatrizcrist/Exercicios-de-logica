public class ContaNetflix {
    //colocar como private informaçoes que nao precisam ser acessadas fora da classe para prevenir bugs
    private String idiomaPreferencial;
    private String resolucaoTela;

    public void entrar(){
        buscarPreferenciasDoUsuario();
        identificarResolucao();
    }

    private void buscarPreferenciasDoUsuario(){
        idiomaPreferencial = "PT-BR";
    }

    private void identificarResolucao(){
        resolucaoTela = "Full HD";
    }

    public void assistirFilme(String nomeFilme){
        System.out.println("Iniciando o filme " + nomeFilme);
        System.out.println("Carregando o filme na resolução "+resolucaoTela);
        carregarAudioFilme();
    }

    private void carregarAudioFilme(){
        if(idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US"){
            System.out.println("Carregando o aúdio em "+idiomaPreferencial);
        } else{
            System.out.println("Carregando o audio em EN-US");
        }
    }
}
