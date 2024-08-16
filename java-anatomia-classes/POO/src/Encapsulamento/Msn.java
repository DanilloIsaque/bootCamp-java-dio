package Encapsulamento;

public class Msn {

    //encapsular é só esconder
   
    private void validarConectadoInternet() {
        System.out.println("Verificar conexão.");
    }

    private void enviatMensagem() {
        System.out.println("Enviar");
    }

    private void salvarMensagem() {
        System.out.println("Salvar");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagemm.");
    }
}
