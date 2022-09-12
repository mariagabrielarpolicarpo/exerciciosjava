import java.util.Scanner;

public class loopfatorial {
    public static void main(String[] args)
    {
        try (Scanner scan = new Scanner(System.in)) {
            int n, i, fat = 1; 

            System.out.println("De qual numero voce quer ver o fatorial?: "); 
            n = scan.nextInt(); 

            for(i=1; i <= n; i++)
                fat = fat*i;
            System.out.println("O fatorial de "+ n + " eh " + fat); 
            scan.close();
        }
    }
}
