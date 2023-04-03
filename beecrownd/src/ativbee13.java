import java.util.Scanner;  

import java.text.DecimalFormat;   

public class ativbee13 {  

  public static void main(String[] args) {  

    Scanner readLine = new Scanner(System.in);  

    DecimalFormat df = new DecimalFormat("0");  

    double valor = readLine.nextDouble();  

    double cem = valor / 100;  

    valor %= 100;  

    double cinquenta = valor / 50;  

    valor %= 50;  

    double vinte = valor / 20;  

    valor %= 20;  

    double dez = valor / 10;  

    valor %= 10;  

    double cinco = valor / 5;  

    valor %= 5;  
 
    double dois = valor / 2;  

    valor %= 2;  

    double umReal = valor;  

    valor %= 1; 

    // moedas

    double cinqCent = valor;  

    valor %= 0.5;  

    double vintCincCent = valor;  

    valor %= 0.25;  

    double dezCent = valor;  

    valor %= 0.1;  

    double cincCent = valor;  

    valor %= 0.05; 
     
    double umCent = valor;  

    valor %= 0.01; 


    System.out.println("NOTAS: \n"+df.format(cem)+" nota(s) de R$ 100,00 \n"+df.format(cinquenta)+" nota(s) de R$ 50,00 \n"+df.format(vinte)+" nota(s) de R$ 20,00 \n"+df.format(dez)+" nota(s) de R$ 10,00 \n"+df.format(cinco)+" nota(s) de R$ 5,00 \n"+df.format(dois)+ 

    "nota(s) de R$ 2,00\nMOEDAS:\n"+df.format(umReal)+" moeda(s) de R$ 1.00\n"+df.format(cinqCent)+" moeda(s) de R$ 0.50 \n"+df.format(vintCincCent)+" moeda(s) de R$ 0.25\n"+df.format(dezCent)+" moeda(s) de R$ 0.10\n"+df.format(cincCent)+ 

    " moeda(s) de R$ 0.05\n"+df.format(umCent)+" moeda(s) de R$ 0.01");  

 
 

    readLine.close();  

  }  

 
 

} 

 