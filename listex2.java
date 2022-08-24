import java.util.Scanner;import java.util.List;import java.util.ArrayList; import java.util.Iterator; 

public class listex2 {
    public static void main(String[] args)
    {
        int count = 0, sim = 0; 
        List<String> list = new ArrayList<>(); 

        try (Scanner scan = new Scanner(System.in)) { 
                switch(count) {
                case(0): {System.out.println("Telefonou para a vítima?"); String resp = scan.next(); list.add(resp);}; 
                case(1): {System.out.println("Esteve no local do crime?");String resp = scan.next();list.add(resp);};
                case(2): {System.out.println("Mora perto da vítima?");String resp = scan.next(); list.add(resp);};
                case(3): {System.out.println("Devia para a vítima?");String resp = scan.next(); list.add(resp);};
                case(4): {System.out.println("Já trabalhou para a vítima?");String resp = scan.next();list.add(resp);};
                break; 
                }
        } 

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
        {
            String next = iterator.next(); 
            if(next.contains("s"))
                sim = sim + 1;
        } 
        
        if(sim==2) System.out.println("Suspeita");
        else if(sim==3 || sim ==4) System.out.println("Cúmplice");
        else if(sim==5) System.out.println("Assassina");
    }
}
