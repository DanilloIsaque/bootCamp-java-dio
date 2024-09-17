package com.exemplo.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Teste da classe {@link CadastrarPessoa} apresentando cenários básicos de uso do Mockito, usando o recurso
 * de mocks e a manipulação de retornos, da forma mais simples e com manipulação de erros
 */
@ExtendWith(MockitoExtension.class) // plugar mockito no cenário

public class CadastrarPessoaTeste {

    // mesma coisa que: private ApiDosCorreios apiDosCorreios = Mockito.mock(ApiDosCorreios.class);
    @Mock //mockando objetos
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks //
    private CadastrarPessoa cadastrarPessoa;
    
    @Test
    void validarDadosdeCadastro(){

    
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP", "São Paulo", "Rua Castro Alves", "Casa", "Nova Floresta");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("7986767")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Danillo", "123456789", LocalDate.of(2003, 11,22), "69317300");

        assertEquals("Danillo", pessoa.getNome());
        assertEquals("123456789", pessoa.getDocumento());
        assertEquals("SP", pessoa.getEndereco().getUf()); // quero validar os dados de localização
    }

    @Test
    void cadastrarPessoa() {

        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Uberaba", "Rua Castro Alves", "Casa", "Nova Floresta");

        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("7986767")).thenReturn(dadosLocalizacao);

        Pessoa jose = cadastrarPessoa.cadastrarPessoa("José", "28578527976", LocalDate.of(1947, 1, 15), "69317300");

        DadosLocalizacao enderecoJose = jose.getEndereco();
        assertEquals(dadosLocalizacao.getBairro(), enderecoJose.getBairro());
        assertEquals(dadosLocalizacao.getCidade(), enderecoJose.getCidade());
        assertEquals(dadosLocalizacao.getUf(), enderecoJose.getUf()); // validar se de fato o mockito 
    }

    @Test
    void tentaCadastrarPessoaMasSistemaDosCorreiosFalha() {

        // lança excecao quando chama o método
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("69317300")).thenThrow(RuntimeException.class);

        Assertions.assertThrows(RuntimeException.class, () -> cadastrarPessoa.cadastrarPessoa("José", "28578527976", LocalDate.of(1947, 1, 15), "69317300"));
    }


}
