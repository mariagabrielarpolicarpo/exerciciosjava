import java.util.Scanner;
public class vetorordeminv {
    public static void main(String[] args)
    {
        try (Scanner scan = new Scanner(System.in)) {
            int i; int v[];
            v = new int[5]; 
            System.out.println("Digite os valores do vetor: ");
            for(i=0; i < 5; i++)
                v[i] = scan.nextInt(); 
            for(i=4; i >=0; i--)
                System.out.println("Posicao "+ i + ":" + v[i]); 
            scan.close();
        }
    }
}
