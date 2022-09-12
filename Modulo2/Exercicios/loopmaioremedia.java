import java.util.Scanner;

public class loopmaioremedia {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        int num, media = 0, maior, cont = 0; 

        System.out.println("Digite um numero: "); 
        num = scan.nextInt(); //talvez de problema de eu usar nextINT 
        maior = num; media = media + num; 

        do
        {
            System.out.println("Digite um numero: "); 
            num = scan.nextInt(); //talvez de problema de eu usar nextINT 
            media = media + num; 
            if(num>maior)
                maior = num; 
            cont++; 
        } while(cont <4 );
        
        System.out.println("A media eh " + media/5 + " e o maior numero eh " + maior); 
        scan.close(); 
    }
}
