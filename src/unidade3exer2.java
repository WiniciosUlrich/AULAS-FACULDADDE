import java.text.DecimalFormat;
import java.util.Scanner;

public class unidade3exer2 
{
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Informe o preço do par de sapatos");
        double preco = teclado.nextDouble();

        double vlrdesconto = preco * 12 / 100;
        double precofinal = preco - vlrdesconto;

        System.out.println("O valor do desconto é de R$:" + df_2.format(vlrdesconto));
        System.out.println("O preço do par de sapatos com desconto é R$:" + df_2.format(precofinal));
        
        teclado.close();
    }
    
}
