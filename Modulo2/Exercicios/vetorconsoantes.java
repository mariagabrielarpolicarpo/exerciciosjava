import java.util.Scanner; 

public class vetorconsoantes {
    public static void main(String[] args)
    {
        try (Scanner scan = new Scanner(System.in)) {
            int i; char v[];
            v = new char[6]; 
            System.out.println("Digite os valores do vetor: ");
            for(i=0; i < 6; i++)
                v[i] = scan.next().charAt(0);
            for(i=0; i < 6; i++)
            {
                if(v[i] != 'a' && v[i] != 'e' && v[i] != 'i' && v[i] != 'o' && v[i] != 'u')
                System.out.println("Consoante "+ v[i]); 
            }
            scan.close();
        } 
    }
}
