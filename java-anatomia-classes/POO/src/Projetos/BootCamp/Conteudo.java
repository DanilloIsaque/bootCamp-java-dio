package BootCamp;

public abstract class Conteudo {
      protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    protected void imprimirInfos() {
        System.out.println(String.format("Título: %s", this.titulo));
        System.out.println(String.format("Descrição: %s", this.descricao));
        System.out.println(String.format("XP: %.2f", calcularXp()));
    }
    
}
