package dio.web_api.controller;

import dio.web_api.handler.BusinessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CodigoPostalService {
    public String buscarCidade(String ibge){
        if(ibge==null || ibge.isEmpty())
            throw new BusinessException("O campo IBGE precisa ser informado");
        else
            return "São Paulo";
    }
}