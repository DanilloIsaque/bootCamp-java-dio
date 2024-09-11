package com.teste;

public class TransferenciasEntreContas {
    
    public void transfere(Conta contaOrigem, Conta contaDestino, int valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor menor ou igual a 0");
        }
    }
}
