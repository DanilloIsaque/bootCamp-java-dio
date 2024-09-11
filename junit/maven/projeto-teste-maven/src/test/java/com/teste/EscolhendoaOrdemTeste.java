package com.teste;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //OrderName: ele vai respeitar a ordem alfabetica do nome dos métodos ,DisplayName: recurso para nomear o teste de alguma forma
public class EscolhendoaOrdemTeste {

    //@DisplayName("A")
    @Order(4)
    @Test
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }

    
    //@DisplayName("B")
    @Order(3)
    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }

    
    //@DisplayName("C")
    @Order(2)
    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }


    //@DisplayName("D")
    @Order(1)
    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }
}
