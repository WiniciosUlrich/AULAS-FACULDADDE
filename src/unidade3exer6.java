import java.util.Scanner;

public class unidade3exer6 
{
    public static void main(String[] args)
    
    {
        Scanner teclado = new Scanner(System.in);

        //float preçodokilo = 25;
        System.out.print("Insira o peso em kilos:  ");
        float quantdekilos = teclado.nextFloat();
        float valorapagar = (quantdekilos-0.75f) * 25;
        System.out.print("valor a pagar: "+valorapagar);
        teclado.close();
    }


}
