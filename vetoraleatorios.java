import java.util.Random; 

public class vetoraleatorios {
    public static void main(String[] args)
    {
        int i; int v[] = new int[20]; 
        Random random = new Random(); 

        for(i=0; i < 20; i++)
            v[i] = random.nextInt(100); 

        for(i=0; i < 20; i++)
            System.out.println("Numero "+ v[i]); 
    }
}
