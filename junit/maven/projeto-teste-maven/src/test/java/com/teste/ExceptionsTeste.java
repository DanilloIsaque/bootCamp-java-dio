package com.teste;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
       Conta contaOrigem=  new Conta("123456",0);
       Conta contaDestino=  new Conta("123456",100);

       TransferenciasEntreContas transferencia = new TransferenciasEntreContas();

       Assertions.assertThrows(IllegalArgumentException.class ,()->
       transferencia.transfere(contaOrigem,contaDestino,-1));


    }
}
