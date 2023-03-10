import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // Entrada
        System.out.println("Informe o código do funcionário");
        double codfun = teclado.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas");
        double qtdhoras = teclado.nextDouble();
        System.out.println("Informe o valor hora do funcionário");
        double vlrhora = teclado.nextDouble();
        
        // Processo
        double salario = qtdhoras * vlrhora;
    
        // Saída
        System.out.println("Código do Funcionário: " + codfun + " Salário: " + df_2.format(salario));        
        teclado.close();
    }
}