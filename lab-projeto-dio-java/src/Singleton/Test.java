package Singleton;

public class Test {
    public static void main(String[] args) {

        //testes design pattern Singleton

        SingletonLazy lazy =  SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager =  SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder =  SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }
}
