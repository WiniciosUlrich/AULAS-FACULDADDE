import java.util.Scanner;

public class unidade3exer3 
{
    public static void main(String[] args)
    { 
    
    Scanner teclado = new Scanner(System.in);
    
    
    System.out.print("Insira o preço do litro da gasolina em R$: ");
    float valorgasolina = teclado.nextFloat();
    System.out.print("Insira valor pago em R$: ");
    float valorgasto = teclado.nextFloat();
    
    float litros = valorgasto / valorgasolina;
    System.out.print("A quantidade de litros abastecido é de: "+litros);

     teclado.close();
    }


}
