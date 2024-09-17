package com.exemplo.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEmailTeste {
    
    @Mock
    private PlataformaDeEnvio plataformaDeEnvio;

    @InjectMocks // injetar mock pq a plataforma é uma dependencia dessa classe
    private ServicoEnvioEmail servicoEnvioEmail; // classe de tste

    @Captor // classe do mockito que consegue capturar argumento de um método
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaPlataforma(){
        String enderecoEmail = "teste@gmail.com";
        String mensagem= "Olá, mundo";
        boolean ehFormatoHtml = false;

        servicoEnvioEmail.enviaEmail(enderecoEmail, mensagem, ehFormatoHtml);

        //verificar no mock o email q foi enviadod
        Mockito.verify(plataformaDeEnvio).enviaEmail(captor.capture());

        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());
    
    }
}
