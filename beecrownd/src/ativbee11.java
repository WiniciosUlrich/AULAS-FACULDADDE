
import java.util.Scanner;

public class ativbee11 {
  public static void main(String[] args) {
    Scanner readLine = new Scanner(System.in); 
    int valor = readLine.nextInt();
    

    int valor1 = valor;

    int cem = valor / 100;
    valor %= 100;

    int cinquenta = valor / 50;
    valor %= 50;

    int vinte = valor / 20;
    valor %= 20;

    int dez = valor / 10;
    valor %= 10;

    int cinco = valor / 5;
    valor %= 5;

    int dois = valor / 2;
    valor %= 2;

    int um = valor;
    valor %= 1;

    System.out.println( valor1+ "\n"+ cem +" nota(s) de R$ 100,00" + "\n"+ cinquenta+ " nota(s) de R$ 50,00" + "\n"+ vinte + " nota(s) de R$ 20,00"+ "\n"+ dez +" nota(s) de R$ 10,00"  + 
     "\n" + cinco +" nota(s) de R$ 5,00"+ "\n"+ dois + " nota(s) de R$ 2,00"+ "\n"+ um +" nota(s) de R$ 1,00");

    readLine.close();
  }
}