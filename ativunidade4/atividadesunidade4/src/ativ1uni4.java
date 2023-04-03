import java.util.Scanner;
import java.text.DecimalFormat;
       
public class ativ1uni4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // ENTRADAS
        System.out.print("Entre com as horas trabalhadas no mês: ");
        double horasMes = teclado.nextDouble();
        System.out.print("Entre com o valor pago por hora: ");
        double horasValor = teclado.nextDouble();

        // PROCESSO
        double salarioTotal = horasMes * horasValor;
        if (horasMes > 160) {
            double salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }

        // SAÍDA
        System.out.println("O salário total é: " + df_2.format(salarioTotal));

        teclado.close();
    }
}