import java.util.Scanner;



import java.text.DecimalFormat;

public class ativbee04 
{
    public static void main(String[] args) 
    {
    Scanner readLine = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00000");


    double A = readLine.nextDouble();
    double B = readLine.nextDouble();
    double MEDIA = ((A*3.5) + (B*7.5)) / 11;

    
 
    System.out.println("MEDIA = "+df.format(MEDIA));
    readLine.close();
}
}
