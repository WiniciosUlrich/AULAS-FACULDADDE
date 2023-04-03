
import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args)
    {
      //entrada
        Scanner teclado = new Scanner(System.in);  
        
        System.out.println("Informe o codigo de peça 1");
        //int codPeca1 = teclado.nextInt();
        System.out.println("Informe o numero de peça 1");
        int nrPeca1 = teclado.nextInt();
        System.out.println("Informe o valor unitario da peça 1");
        Double vlrPeca1 = teclado.nextDouble();

        System.out.println("Informe o codigo de peça 2");
        //int codPeca2 = teclado.nextInt();
        System.out.println("Informe o numero de peça 2");
        int nrPeca2 = teclado.nextInt();
        System.out.println("Informe o valor unitario da peça 2");
        Double vlrPeca2 = teclado.nextDouble();
     
        //processo

        double vltAPagar = (nrPeca1 * vlrPeca1) + (nrPeca2 * vlrPeca2);
        System.out.println("A pagar: "+vltAPagar);

        teclado.close();
        // cod das peças sao pedidos mas nunca usados, feito pois estava no enunciado;
    }
    
}
