package com.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
//import org.junit.jupiter.api.condition.JRE.JAVA_8;

public class CondicionaisTeste {
    @Test
    @EnabledIfEnvironmentVariable(named="USER", matches = "isa") // named: variavel q quer q a notação olhe
   // @DisabledIfEnvironmentVariable(named="USER", matches = "root") // quando eu quero q o usuário não precise acessar esse test
  //  @EnabledOnOs(OS.LINUX)  executar somente quando o SO for linux
  //  @EnabledOnJre(JAVA_17)  executar somente quando der match com a versão do java
  //  @EnabledForJreRange(min =JAVA_11 max =JAVA_17)  executar somente quando der match com a versão do java
    void validarAlgoSomentedoUsuario(){
          Assertions.assertEquals(20, 10+10);
         //só executa algo se o usuario for...
    }
}
