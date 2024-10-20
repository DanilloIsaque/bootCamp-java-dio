public class EmailNotificacao implements NotificacaoStrategy {

    @Override
    public void mensagem(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
    
}




