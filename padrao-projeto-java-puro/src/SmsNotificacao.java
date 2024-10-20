public class SmsNotificacao implements NotificacaoStrategy {

        @Override
        public void mensagem(String mensagem) {
            System.out.println("Enviando SMS: " + mensagem);
        }
    }
