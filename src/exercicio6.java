import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        //entrada
        String Nome = teclado.next();
        Double SalBase = teclado.nextDouble();
        Double Vendas = teclado.nextDouble();
    
        //processo
        Double comissão = Vendas * 15 / 100;
        Double aReceber = SalBase + comissão;

        //saida
        System.out.println("Vendedor:" +Nome+"A Receber" + df_2.format(SalBase+comissão));
        
        
        
        teclado.close();
    }
}
