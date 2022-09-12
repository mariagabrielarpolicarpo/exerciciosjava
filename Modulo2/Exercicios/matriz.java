import java.util.Random; 

public class matriz {
    public static void main(String[] args)
    {
        int i, j, menor = 10, i2 = 0, j2 = 0; int m[][]= new int[4][4]; 
        Random random = new Random(); 

        for(i=0; i < 4; i++)
        {
            for(j=0; j < 4 ; j++)
            {
                m[i][j] = random.nextInt(10);
                if(m[i][j] <= menor)
                {
                    menor = m[i][j];
                    i2 = i; 
                    j2 = j; 
                } 
            }
        } 

        for(i=0; i < 4; i++)
        {
            System.out.println("\n");
            for(j=0; j < 4 ; j++)
            {
                System.out.println(m[i][j]);
            }
        } 
        System.out.println("O menor numero eh " + menor + " que esta na linha e coluna seguintes: " + i2 + j2);
    }
    

}
