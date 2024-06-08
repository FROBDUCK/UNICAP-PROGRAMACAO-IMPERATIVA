package pacote;


class Pessoa{
	int idade;
	String nome;
}

public class classe {

public static void main(String[] args) {
	
    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa();
    Pessoa p3 = new Pessoa();
    
    Pessoa[] pessoas = new Pessoa[3];
    
    p1.idade = 10;
    p1.nome = "pedro";
    
    p2.idade = 15;
    p2.nome = "gustavo";
    
    p3.idade = 5;
    p3.nome = "manu";
    
    pessoas[0] = p1;
    pessoas[1] = p2;
    pessoas[2] = p3;
    
    for(int i = 0; i < pessoas.length; i++) {
    	System.out.println(pessoas[i].nome);
    	System.out.println(pessoas[i].idade);
    
    }
}
}
