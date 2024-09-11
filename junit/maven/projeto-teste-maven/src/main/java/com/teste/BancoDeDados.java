package com.teste;

import java.util.logging.Logger;

public class BancoDeDados {
    
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());


    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexão!");
    }

    public static void finalizarConexao(){
        LOGGER.info("Finalizou conexão!");
    }

    public static void inserir(Pessoa pessoa){
        LOGGER.info("Cadastrou pessoa!");
    }

    public static void remover(Pessoa pessoa){
        LOGGER.info("Removeu pessoa!");
    }
}
