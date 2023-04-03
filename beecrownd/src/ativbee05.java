import java.util.Scanner; 

//import java.text.DecimalFormat;  

  

public class ativbee05 { 

    public static void main(String[] args) throws Exception { 

  

        Scanner readLine = new Scanner(System.in);     

      //  DecimalFormat df = new DecimalFormat("0.00000"); 

  

        int A = readLine.nextInt(); 

        int B = readLine.nextInt(); 

        int C = readLine.nextInt(); 

        int D = readLine.nextInt(); 

            

        int DIFERENCA = ((A * B) - (C * D)); 

         

        System.out.println("DIFERENCA = "+DIFERENCA); 
        readLine.close();

    } 

} 

 