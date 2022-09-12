import java.util.Scanner; 

public class loopnota {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        int nota; 

        System.out.println("Digite a nota: ");
        nota = scan.nextInt();

        while(nota< 0 || nota>10)
        {
            System.out.println("Valor invalido. Digite novamente: "); 
            nota = scan.nextInt(); 
        }
        scan.close();
    }
}
