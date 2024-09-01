package BootCamp;
import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }



  @Override
    public void imprimirInfos() {
        super.imprimirInfos();
        System.out.println(String.format("Data: %s", this.data));
    }
    
}
