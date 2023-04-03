import java.util.Scanner;

public class unidade3exer8 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a cotação do dolar atual");
        int cotdoll = teclado.nextInt();
        System.out.println("Informe a quantidade de dolares");
        int qntdoll = teclado.nextInt();
        System.out.println("O atendente tera que devolver R$: "+cotdoll * qntdoll);

        teclado.close();
    }
}
