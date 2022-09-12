import java.util.Scanner;

public class loopnomeidade {
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int idade = 0; String nome; 
       
        while(true)
        {
            System.out.println("Digite seu nome e idade: "); 
            nome = leitor.next();
            if(nome.equals("0"))
                break;
            idade = leitor.nextInt(); 
        }
        System.out.println(idade); //so pra esse idade parar de encher o saco "a variavel idade nao esta sendo usada tmnc"
        leitor.close();
    }
}
