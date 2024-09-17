package Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> { // tipo genérico

    //inicializar array

    private List<T> ferramentas ;

    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

    //colocar ferramentas na lista

    public void addFerramentas(T ferramenta){
        ferramentas.add(ferramenta);
    }
    

    public void mostrarLista(){
        for(T ferramenta : ferramentas){
        System.out.println(ferramenta);
        }
    }
}
