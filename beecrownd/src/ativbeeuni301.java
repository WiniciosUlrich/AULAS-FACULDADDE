import java.util.Scanner;  

  

public class ativbeeuni301 { 

    public static void main(String[] args) {  

         

    Scanner readline = new Scanner(System.in);  

  

    int A = readline.nextInt(); 

    int B = readline.nextInt(); 

    int C = readline.nextInt(); 

    int D = readline.nextInt(); 

  

    var resposta = ""; 

  

    if((B > C) && (D > A) && ((A + B) < (C + D)) && (A % 2 == 0)) 

    { 

      resposta = "Valores aceitos";   

    } 

    else 

    { 

      resposta = "Valores nao aceitos"; 

    } 

     

    System.out.println(resposta); 

  

    readline.close();  

  

    }  

  

} 