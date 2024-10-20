package Singleton;

public class SingletonLazy {
    
    private static SingletonLazy instancia;

    // garantir que ninguém instaciara externamente

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia ==null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
