public class MinhaClasse {
     public static void main(String[] args) {
        System.out.println("Hello,world");

        // toda variavel q só tem maiuscula, pressupõe que ela é final e não pode ser alterada
        final String BR= "Brasil";

        float pi = 3.14F;
        String nome = "Danillo";
        String valor = concatenarString(BR, nome);

        String concatenacao = "?";
        concatenacao = 1+1+1+"1"; //31
        concatenacao = "1"+1+1+1; //1111; a partir do momento que encontra uma string, ele concatena ao invés de somar

        System.out.println(valor);




        int numero = 5;
        System.out.println(- numero); // converte para negativo
        // para torná lo positivo novamente
        numero = numero * -1;


        int x,y;
        x = 10;
        y = x++; // x é incrementado depois de ser atribuido
        String ternario = x==y ? "igual":"diferente";



        int a,b;
        a = 10;
        b = 9;

        boolean simNao = a==b;



        String nome1="Danillo";
        String nome2="Danillo";

        System.out.println(nome1==nome2); //true


        String nome3="Danillo";
        String nome4= new String("Danillo"); //captado de outra estrutura,

        System.out.println(nome3==nome4); //false,utilize equals()


    }
     
     public static String concatenarString(String word1, String word2){
        return word1.concat(word2);
     }

    /*  public static double dividir(double n1,double n2) throws Exception(){ // a exceção vai tratar caso venha um zero ,por exemplo
        
     }*/
}
