package com.exemplo.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import  org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTeste {
    
    @Spy
    private Conta conta = new Conta(1000);


    @Test
    void validarOrdemdeChamadas(){
        InOrder inOrder = Mockito.inOrder(conta); //quero observar a ordem q vai acontecer algo
        inOrder.verify(conta).pagaBoleto(300);
        inOrder.verify(conta).validaSaldo(300);
        inOrder.verify(conta).debita(300);
        inOrder.verify(conta).enviaCreditoParaEmissor(300);

        //verifica se passou pelos métodos


    }

    @Test
    void validaQuantidadeDeChamadas(){
        conta.validaSaldo(300);
        conta.validaSaldo(500);
        conta.validaSaldo(600);

        Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyInt()); // verifica se chamou 3 vezes o método validaSaldo
    }

    @Test
    void verificaSeChamouMetodoDebita() {
        conta.pagaBoleto(300);
        Mockito.verify(conta).debita(300);
    }

    @Test
    void verificaSeNadaFoiChamado() {
        Mockito.verifyNoInteractions(conta);
    }

    @Test
    void validaQuantidadeDeVezesQueMétodoFoiChamado() {

        conta.validaSaldo(100);
        conta.validaSaldo(100);
        conta.validaSaldo(100);

        Mockito.verify(conta, Mockito.times(3)).validaSaldo(100);
    }

    @Test
    void retornaTrueParaQualquerValorSaldo(){
        Mockito.doNothing().when(conta).validaSaldo(ArgumentMatchers.anyInt());
    }
}
