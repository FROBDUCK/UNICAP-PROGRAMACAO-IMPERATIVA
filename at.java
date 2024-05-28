import java.util.Scanner;

public class at{
    public static void main(String[] args){
        Scanner s = new Scanner();
        
        Garagem garagem = new Garagem();
        garagem.id = "123";
        garagem.carro = new Carro[10];

        for (int i - 0; i < garagem.carro.length; i++) {
            garagem.carro[i] = new Carro();
            garagem.carro[i].ano = s.nextint();
            garagem.carro[i].marca = s.next();
            garagem.carro[i].placa = s.next();
        }
        System.out.println("================");
        for (int i = 0; i < garagem.carro.length; i++){
            System.out.println(garagem.carro[i]);
            System.out.println(garagem.carro[i].ano);
            System.out.println(garagem.carro[i].marca);
            System.out.println(garagem.carro[i].placa);

        }

    }
}