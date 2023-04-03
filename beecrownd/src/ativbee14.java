//import java.text.DecimalFormat;
import java.util.Scanner;

public class ativbee14 {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    //DecimalFormat df = new DecimalFormat("0");
    double valor = sc.nextDouble();

    int notas100 = (int) valor / 100;
    valor %= 100.0;

    int notas50 = (int) valor / 50;
    valor %= 50.0;

    int notas20 = (int) valor / 20;
    valor %= 20.0;

    int notas10 = (int) valor / 10;
    valor %= 10.0;

    int notas5 = (int) valor / 5;
    valor %= 5.0;

    int notas2 = (int) valor / 2;
    valor %= 2.0;

    int moedas1 = (int) valor / 1;
    valor %= 1.0;

    int moedas50 = (int) (valor / 0.50);
    valor %= 0.50;

    int moedas25 = (int) (valor / 0.25);
    valor %= 0.25;

    int moedas10 = (int) (valor / 0.10);
    valor %= 0.10;

    int moedas5 = (int) (valor / 0.05);
    valor %= 0.05;
    
    double moedas1cent = (valor / 0.01);
    moedas1cent = Math.round(moedas1cent);
    int moedas1centavo = (int) moedas1cent;

    
    
    System.out.println("NOTAS: \n"+ (notas100)+" nota(s) de R$ 100.00 \n"+ (notas50)+" nota(s) de R$ 50.00 \n"+ (notas20)+" nota(s) de R$ 20.00 \n"+ (notas10)+" nota(s) de R$ 10.00 \n"+ (notas5)+" nota(s) de R$ 5.00 \n"+ (notas2)+ 

    " nota(s) de R$ 2.00\nMOEDAS:\n"+ (moedas1)+" moeda(s) de R$ 1.00\n"+ (moedas50)+" moeda(s) de R$ 0.50 \n"+ (moedas25)+" moeda(s) de R$ 0.25\n"+ (moedas10)+" moeda(s) de R$ 0.10\n"+ (moedas5)+ 

    " moeda(s) de R$ 0.05\n"+ (moedas1centavo)+" moeda(s) de R$ 0.01");  
    
    sc.close();
  }
}