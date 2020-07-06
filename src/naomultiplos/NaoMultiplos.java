package naomultiplos;
import java.util.Scanner;
public class NaoMultiplos 
{
    public static void main(String[] args) 
    {
        int exit = 1;
        while(exit != 0)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe um valor: ");
            int a = sc.nextInt();
            System.out.println("Informe outro valor: ");
            int b = sc.nextInt();
            if (a % b == 0) System.out.println("Os valores "+a+" e "+b+" são múltiplos.");
            else System.out.println ("Os valores "+a+" e "+b+" não são múltiplos.");
            System.out.println("sair? digite 0: ");
            exit = sc.nextInt();
        }
    }   
}
