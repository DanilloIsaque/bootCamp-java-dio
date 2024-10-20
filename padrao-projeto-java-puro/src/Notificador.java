public class Notificador {
    
    private NotificacaoStrategy notificacaoStrategy;

    public Notificador(NotificacaoStrategy notificacaoStrategy) {
        this.notificacaoStrategy = notificacaoStrategy;
    }

    public void enviarNotificacao(String mensagem) {
        notificacaoStrategy.mensagem(mensagem);
    }

    public void setNotificacaoStrategy(NotificacaoStrategy notificacaoStrategy) {
        this.notificacaoStrategy = notificacaoStrategy;
    }
}
