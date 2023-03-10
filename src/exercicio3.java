import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Informe a nota 1");
        double nota1 = teclado.nextDouble();
        if (nota1 < 0 || nota1 > 10)
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("A nota 1 deve estar entre 0 e 10. Redigite a nota 1.");
                nota1 = teclado.nextDouble();
            }            

        System.out.println("Informe a nota 2");    
        double nota2 = teclado.nextDouble();     
        if (nota2 < 0 || nota2 > 10)
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("A nota 2 deve estar entre 0 e 10. Redigite a nota 2.");
                nota2 = teclado.nextDouble();
        }

        // Processo
        double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;
    
        // Saída
        System.out.println("Média: " + media);
        teclado.close();
    
    }
      
    }