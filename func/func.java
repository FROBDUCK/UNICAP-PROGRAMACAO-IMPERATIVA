import java.util.Scanner;

public class func {
    public static void dados(String nome, int idade, float renda){
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("renda: " + renda);


    }
    public static int soma(int a, int b){
        int resultado = a + b;
        return resultado;
    }

public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    String n = s.next();
    int id = s.nextInt();
    float renda = s.nextFloat();
    s.close();
    dados(n,id,renda);

}
}