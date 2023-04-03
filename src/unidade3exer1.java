import java.util.Scanner;

public class unidade3exer1
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);  
        System.out.print("Insira o valor da base do terreno: ");
        float baseterreno = teclado.nextFloat();
        System.out.print("Insira o valor da altura do terreno: ");
        float alturaterreno = teclado.nextFloat();

        float area = baseterreno * alturaterreno;
        System.out.print("A area do terreno é:  " + area +"M");
        teclado.close();

    }
    
}
