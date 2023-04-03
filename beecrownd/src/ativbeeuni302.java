import java.util.Scanner; 

  

public class ativbeeuni302{       

    public static void main(String[] args)  

  

    {      

        Scanner readLine = new Scanner(System.in);       

  

        double number = readLine.nextDouble();  

        String answer = "";  

  

        if((number < 0) || (number > 100))  

        {  

            answer = "Fora do intervalo";  

        }  

        else if(number <= 25)  

        {  

            answer = "Intervalo [0,25]";  

        }  

        else if((number > 25) && (number <= 50))  

        {  

            answer =  "Intervalo (25,50]";  

        }  

        else if((number > 50) && (number <= 75))  

        {  

            answer = "Intervalo (50,75]";  

        }  

        else if((number > 75) && (number <= 100))  

        {  

            answer = "Intervalo (75,100]";  

  

        }  

  

        System.out.println(answer);    

        readLine.close();  

  

    }  

} 