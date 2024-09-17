package com.exemplo.mockito;

import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {
    
    @Spy// referencia o objeto real de uma classe, ver o que está acontecendo naquela classe
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentoDaClasse(){
        Mockito.verifyNoInteractions(enviarMensagem);
        Mensagem mensagem = new Mensagem("Hello,world");
        enviarMensagem.adicionarMensagem(mensagem);

        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem); // verificar se esse método recebeu alguma chamada com essa mensagem
        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
    }

}
