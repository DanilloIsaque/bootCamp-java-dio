package Facade;

import sub2.CepApi;
import sub1.Crm;

public class Facade {

    public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		Crm.gravarCliente(nome, cep, cidade, estado);
	}
}
