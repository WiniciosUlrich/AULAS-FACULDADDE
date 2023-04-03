import java.util.Scanner;

public class ativbee03 
{
    public static void main(String[] args) 
    {
        Scanner readLine = new Scanner(System.in);

        int A = readLine.nextInt();
        
        int B = readLine.nextInt();
       
        int PROD = A*B;
      
        System.out.println("PROD = "+PROD);
        readLine.close();
    }
}
