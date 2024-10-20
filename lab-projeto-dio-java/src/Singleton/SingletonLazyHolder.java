package Singleton;

/*
 * Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela.
 */
public class SingletonLazyHolder {
    
    private static class Holder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){

        return Holder.instancia;
    }

}
