import java.util.Scanner; 

import java.text.DecimalFormat;  

  

public class ativbee08 { 

    public static void main(String[] args) throws Exception { 

  

        Scanner readLine = new Scanner(System.in); 

        DecimalFormat df = new DecimalFormat("0.000"); 

  

        double A = readLine.nextDouble(); 

        double B = readLine.nextDouble(); 

        double C = readLine.nextDouble(); 

         

        double areaTriangulo = (A * C) / 2; 

        double areaCirculo = (C * 3.14159)* C; 

        double areaTrapezio = ((A + B) * C) / 2; 

        double areaQuadrado = B * B; 

        double areaRetangulo = A * B; 

  

        System.out.println("TRIANGULO: " + df.format(areaTriangulo) + "\nCIRCULO: " + df.format(areaCirculo) + "\nTRAPEZIO: " + df.format(areaTrapezio) + 

        "\nQUADRADO: " + df.format(areaQuadrado) + "\nRETANGULO: " + df.format(areaRetangulo)); 
        readLine.close();

    } 

} 

 

 