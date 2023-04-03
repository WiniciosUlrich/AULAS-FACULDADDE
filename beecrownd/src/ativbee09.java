import java.util.Scanner; 

import java.text.DecimalFormat;  

  

public class ativbee09 { 

    public static void main(String[] args) throws Exception { 

  

        Scanner readLine = new Scanner(System.in); 

        DecimalFormat df = new DecimalFormat("0.0000"); 

  

        double x1 = readLine.nextDouble(); 

        double y1 = readLine.nextDouble();  

        double x2 = readLine.nextDouble(); 

        double y2 = readLine.nextDouble(); 

  

        double x = x2 - x1; 

        x = Math.pow(x, 2); 

  

        double y = y2 - y1; 

        y = Math.pow(y, 2); 

  

        double z = x + y; 

        z = Math.sqrt(z); 

  

        // System.out.println(x + "-" + y); 

  

        System.out.println(df.format(z)); 
        readLine.close();

    } 

} 