package IphoneUML;

public class IphoneFuncionando {
   
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.adicionarNovaAba();
        iphone.atender();
        iphone.atualizarPagina();
        iphone.exibirPagina("www.google.com");
        iphone.iniciarCorreioVoz();
        iphone.ligar("123456789");
        iphone.selecionarMusica("Kanye West - Father Stretch my Hands");
        
    }
}
