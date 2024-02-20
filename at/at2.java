import java.util.Scanner;
public class at2 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
  double a, b, c;

  System.out.println("digite um número");
  a = teclado.nextInt();


  System.out.println("digite um número");
  b = teclado.nextInt();
  
  System.out.println("digite um número");
  c = teclado.nextInt();

  if ((a==b)&&(b==c)) {
    System.out.println("triangulo equilatero");
  }else if ((a==b)&&(b!=c)||(a==c)&&(b!=a)||((b==c)&&(c!=a))) {
    System.out.println("triangulo isocele");
    
  }else {
    System.out.println("triangulo escaleno");
  }
}
}
