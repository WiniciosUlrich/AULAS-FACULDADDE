import java.text.DecimalFormat;
import java.util.Scanner;
public class ativbee02



{
    public static void main(String[] args) 
    {
        Scanner readLine = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.0000");

        double n = 3.14159;
        double R = readLine.nextDouble();

        double A = n * (R*R);
        System.out.println("A="+df.format(A));
        readLine.close();
    }
}

