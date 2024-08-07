public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 5;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void escolherCanal(int novoCanal ){
        canal = novoCanal;
    }

    //private : acesso apenas dentro da classe
    //protected : acesso por classes do mesmo pacote e subclasses
}
