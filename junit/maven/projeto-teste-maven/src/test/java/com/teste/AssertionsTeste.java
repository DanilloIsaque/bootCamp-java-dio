package com.teste;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


public class AssertionsTeste {
    @Test
    void validarLancamentos(){
        int [] primeiroLancamento = {10,20,30,40,50};  
        int [] segundoLancamento = {-1,5,2,3,10,};


       assertArrayEquals(primeiroLancamento, segundoLancamento); //valida cada um dos indices
        //assertNotEquals vau retornar verdadeiro por ser diferente mesmo
    }

    @Test
    void validaSeEstaNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);    

       pessoa = new Pessoa("Cassio", LocalDateTime.now());
        assertNotNull(pessoa);   
    }

}
