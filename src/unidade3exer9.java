import java.util.Scanner;

public class unidade3exer9
{
    public static void main(String[] args)
    {
        Double pi = 3.14;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do raio");
        Double raio = teclado.nextDouble();
        System.out.println("Informe o valor da altura");
        Double altura = teclado.nextDouble();
        System.out.println("O volume é = " + pi*(raio*raio)*altura + "L") ;
        
        teclado.close();
    }    
}
