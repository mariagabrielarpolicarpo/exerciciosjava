import java.util.List; 
import java.util.ArrayList; 
import java.util.Scanner; 
import java.util.Iterator; 

public class listex1 {
    public static void main(String[] args){
        List<Double> lista = new ArrayList<>(); 
        try (Scanner scan = new Scanner(System.in)) {
            int i; 
            for(i=0; i<6; i++)
            {   
                System.out.println("Digite a temperatura do mes " + i); 
                 double temp = scan.nextDouble(); 
                 lista.add(temp); 
            }
        } 

        Iterator<Double> iterator = lista.iterator(); 
        Double soma = 0d; 
        while(iterator.hasNext())
        {
            Double next = iterator.next(); 
            soma += next; 
        }
        System.out.println("A media eh " + soma/lista.size()); 

        Iterator<Double> iterator1 = lista.iterator(); 
        int count = 0; 
        while(iterator1.hasNext())
        {
            Double tempe = iterator1.next(); 
            if(tempe > soma/lista.size())
            { 
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", tempe);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", tempe);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", tempe);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", tempe);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", tempe);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", tempe);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++; 
        }
    }
}
