
import java.util.Scanner;

public class ativbee12 {
  public static void main(String[] args) {
    Scanner readLine = new Scanner(System.in);
    
    
    int duracaoSegundos = readLine.nextInt();

    int horas = duracaoSegundos / 3600;
    duracaoSegundos %= 3600;
    int minutos = duracaoSegundos / 60;
    int segundos = duracaoSegundos % 60;

    System.out.println(horas + ":"+ minutos+":"+segundos);

    readLine.close();
  }
}