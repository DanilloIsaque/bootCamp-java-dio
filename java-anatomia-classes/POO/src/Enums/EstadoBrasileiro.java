public enum EstadoBrasileiro {


    SAO_PAULO("SP","SÃO PAULO"),
    MINAS_GERAIS("MG","MINAS GERAIS");
    
    private String sigla;
    private String nome;
    
    private EstadoBrasileiro(String sigla, String nome){
        this.sigla= sigla;
        this.nome =nome;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNome(){
        return nome;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
   
}
