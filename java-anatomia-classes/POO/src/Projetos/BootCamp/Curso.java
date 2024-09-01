package BootCamp;

public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    

    @Override
    public void imprimirInfos() {
        super.imprimirInfos();
        System.out.println(String.format("Carga Horária: %d horas", this.cargaHoraria));
    }
}
