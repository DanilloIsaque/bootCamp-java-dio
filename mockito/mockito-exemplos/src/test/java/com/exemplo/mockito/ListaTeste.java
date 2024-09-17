package com.exemplo.mockito;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {
    
    private List<String> letras;
    
    @Test
    void adicionarItemNaLista(){
        Mockito.when(letras.get(0)).thenReturn("B"); // quando chamar , retorne a letra B
        assertEquals("B", letras.get(0));
    }
}
