package com.teste;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class ConsultarDadosDePessoasTeste {

    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.iniciarConexao();
    }
    
    @BeforeEach
    static void inserirDados(){
        BancoDeDados.inserir(new Pessoa("João",LocalDateTime.now()));
    }

    @AfterEach // toda vez que terminar algo
    static void removerDados(){
        BancoDeDados.remover(new Pessoa("João",LocalDateTime.now()));
    }
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }

}
