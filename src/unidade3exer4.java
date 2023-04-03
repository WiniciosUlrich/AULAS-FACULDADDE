import java.util.Scanner;

public class unidade3exer4 
{
    
        public static void main(String[] args) 
        {
            Scanner teclado = new Scanner(System.in);
            
    
            System.out.println("Informe a nota 1 (peso 5)");
            int nota1 = teclado.nextInt();
            System.out.println("Informe a nota 2 (peso 3)");
            int nota2 = teclado.nextInt();
            System.out.println("Informe a nota 3 (peso 2)");
            int nota3 = teclado.nextInt();
    
            double media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10 ;
    
            System.out.println("A média ponderada é: " + (media));
            
            teclado.close();
        }
        
    }