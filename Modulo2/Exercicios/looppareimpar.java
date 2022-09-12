import java.util.Scanner; 

public class looppareimpar {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        int n, par = 0, impar = 0, cont = 0, num; 

        System.out.println("Digite n: "); 
        n = scan.nextInt(); //talvez de problema de eu usar nextINT 

        do
        {
            System.out.println("Digite um numero: "); 
            num = scan.nextInt(); //talvez de problema de eu usar nextINT 
            if(num%2==0)
                par++; 
            else 
                impar++; 
            cont++; 
        } while(cont < n);
        
        System.out.println("Quantidade de pares: " + par + " e de impares: " + impar); 
        scan.close();
    }
}
