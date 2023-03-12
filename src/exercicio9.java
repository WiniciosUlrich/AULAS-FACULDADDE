import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);  

        System.out.println("INSIRA A QUANTIDADE DE DOLARES");
        
        Double quantdolar = teclado.nextDouble();

        System.out.println("INSIRA A COTAÇÃO DO DOLAR");

        float cotadolar = teclado.nextFloat();

        System.out.println("O valor a ser pago em reais é de: "+quantdolar * cotadolar);

        teclado.close();

    }

}
    

