import java.util.Scanner; 

import java.text.DecimalFormat;  

  

public class ativbee06 { 

    public static void main(String[] args) throws Exception { 

  

        Scanner readLine = new Scanner(System.in); 

        DecimalFormat df = new DecimalFormat("0.00"); 

         

        int NUMBER = readLine.nextInt(); 

        int qtdHoras = readLine.nextInt(); 

        double valorHora = readLine.nextDouble(); 

  

        double salario = qtdHoras * valorHora; 

  

        System.out.println("NUMBER = "+NUMBER); 

        System.out.println("SALARY = U$ "+df.format(salario)); 
        readLine.close();
    } 

} 

 

 

 

 