import java.util.Scanner;

public class ativ2uni4 
{
    public static void main(String[] args) 
    {
        System.out.println("Entre com um valor inteiro maior que 0");
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();

        if (valor % 2 == 0) 
        { 
            System.out.println("Numero é par");
        }    
        else 
        {
            System.out.println("Numero é impar");
        }
        scan.close();
}
}
