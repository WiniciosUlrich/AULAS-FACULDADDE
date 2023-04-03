import java.util.Scanner;

public class unidade3exer7
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de latas 350ml compradas");
        int latas = teclado.nextInt();
        System.out.println("Informe a quantidade de garrafas 600ml compradas");
        int garrafas = teclado.nextInt();
        System.out.println("Informe a quantidade de garrafas 2L compradas");
        int garrafas2l = teclado.nextInt();

        double litros = ((latas * 0.35) + (garrafas * 0.6) + (garrafas2l * 2)) ;

        System.out.println("A quantidade de litros comprada é: " + (litros));
        
        teclado.close();
    }      
}

  