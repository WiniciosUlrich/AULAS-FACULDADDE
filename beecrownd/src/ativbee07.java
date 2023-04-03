import java.util.Scanner; 

import java.text.DecimalFormat;  

  

public class ativbee07 { 

    public static void main(String[] args) throws Exception { 

  

        Scanner readLine = new Scanner(System.in); 

        DecimalFormat df = new DecimalFormat("0.00"); 

         

      //  String nome = readLine.next(); 

  

        double salarioFixo = readLine.nextDouble(); 

        double totalVendas = readLine.nextDouble(); 

        double salarioTotal = (salarioFixo + (totalVendas * 0.15)); 

  

        System.out.println("TOTAL = R$ "+df.format(salarioTotal)); 
        readLine.close();
    } 

} 