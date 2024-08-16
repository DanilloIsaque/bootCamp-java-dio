package Heranca;

public class Computador {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.enviarMensagem();
        
        WhatsApp whatsApp = new WhatsApp();
        whatsApp.enviarMensagem();
    }
    
}
