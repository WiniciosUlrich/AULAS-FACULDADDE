import java.util.Scanner;

public class unidade3exer5 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
       
        System.out.print("quantidade de frangos: ");
        float qntfrangos = teclado.nextFloat();

        float preçanilhadireita = 4;
        float preçanilhaesquerda = 3.5f;
        float preçoident = qntfrangos * preçanilhadireita + (preçanilhaesquerda * 2);
        
        
        System.out.print("o custo para identificação dos frangos foi de: R$" + preçoident);

        teclado.close();
    }


}

