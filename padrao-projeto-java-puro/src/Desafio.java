public class Desafio {
    public static void main(String[] args) {
        Notificador notificador = new Notificador(new EmailNotificacao());
        notificador.enviarNotificacao("Este é um email!");

        notificador.setNotificacaoStrategy(new SmsNotificacao());
        notificador.enviarNotificacao("Este é um SMS!");
    }
}
