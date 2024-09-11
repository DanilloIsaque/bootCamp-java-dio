package com.teste;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;


public class AssumptionsTeste {
    @Test
    void validarAlgoSomentedoUsuario(){
        Assumptions.assumeTrue("isa".equals(System.getenv("USER"))); //só executa algo se o usuario for...
    }
}
