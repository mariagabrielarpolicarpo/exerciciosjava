import java.util.Scanner; 

public class looptabuada {
    public static void main(String[] args)
    {
        try (Scanner scan = new Scanner(System.in)) {
            int n, i; 

            System.out.println("De qual numero voce quer ver a tabuada?: "); 
            n = scan.nextInt(); 

            for(i=0; i <= 10; i++)
            {
                System.out.println(n + "x" + i + "=" + n*i);
            }
            scan.close();
        } 
    }
}
