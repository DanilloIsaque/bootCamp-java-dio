package com.teste;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa danillo = new Pessoa("Danillo", LocalDateTime.of(2003, 11, 22, 15, 0, 0)); // cria um cenário
        Assertions.assertEquals(20, danillo.getIdade()); // quando eu chamar o objeto "danillo" , ele tem q retornar 20 
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa danillo = new Pessoa("Danillo", LocalDateTime.of(2003, 11, 22, 15, 0, 0));
        Assertions.assertTrue(danillo.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

    @Test
    void validaIgualdade() {
        Pessoa pessoa = new Pessoa("Pessoa 1", LocalDateTime.now());
        Assertions.assertSame(pessoa, pessoa);
    }
}