import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Informe a quantidade do produto A");
        double a = teclado.nextDouble();
        System.out.println("Informe a quantidade do produto B");
        double b = teclado.nextDouble();
        System.out.println("Informe a quantidade do produto C");
        double c = teclado.nextDouble();
        System.out.println("Informe a quantidade do produto D");
        double d = teclado.nextDouble();

        // Processo
        double diferenca = ((a * b) - (c * d));
    
        // Saída
        System.out.println("A diferença do produto de A e B com o produto de C e D é " + diferenca);
        teclado.close();
      }
      
    }