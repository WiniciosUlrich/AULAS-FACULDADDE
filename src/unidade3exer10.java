import java.util.Scanner;

public class unidade3exer10 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Informe o valor do cateto 1");
        Double cateto1 = teclado.nextDouble();
        System.out.println("Informe o valor da cateto 2");
        Double cateto2 = teclado.nextDouble();
        Double hipotenusa2 = (cateto1 * cateto1) + (cateto2 * cateto2);
        Double Hipotenusa = Math.sqrt(hipotenusa2);
        
        System.out.println("O valor da Hipotenusa é de: " + Hipotenusa) ;


        teclado.close();
    }   
}
