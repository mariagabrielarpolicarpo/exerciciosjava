import java.util.*;

public class setex1 {
    public static void main(String[] args) {
        Set<String> arcoiris = new TreeSet<>(Arrays.asList( "vermelha", "laranja", "amarela",
         "verde", "azul", "azul-escuro","violeta"));

        // a) Exiba todas as cores o arco-íris uma abaixo da outra;
        Iterator<String> iterator0 = arcoiris.iterator();
        
        while(iterator0.hasNext()) {
            String next = iterator0.next();
                System.out.println(next);  
        } 

        // b) A quantidade de cores que o arco-íris tem;
        System.out.println(arcoiris.size()); 

        // c) Exiba as cores em ordem alfabética;
        System.out.println(arcoiris);

        //d) Exiba as cores na ordem inversa da que foi informada;
        List<String> arcoirisinverso = new ArrayList<>(); 
        arcoirisinverso.addAll(arcoiris); 
        Collections.reverse(arcoirisinverso); 
        System.out.println(arcoirisinverso); 

        // e) Exiba todas as cores que começam com a letra ”v”;
        Iterator<String> iterator = arcoiris.iterator();
        
        while(iterator.hasNext()) {
            String next = iterator.next();
            if(next.contains("v"))
                System.out.println(next);  
        }

        // f) Remova todas as cores que não começam com a letra “v”;
        Set<String> arcoiris2 = new TreeSet<>();
        arcoiris2.addAll(arcoiris);

        Iterator<String> iterator1 = arcoiris2.iterator();
        
        while(iterator1.hasNext()) {
            String next = iterator1.next();
            if(next.contains("v"))
                iterator1.remove();   
        }
        System.out.println(arcoiris2); 

        // g) Limpe o conjunto;
        arcoiris.clear(); 
        System.out.println(arcoiris); 

        // h) Confira se o conjunto está vazio;
        System.out.println(arcoiris.isEmpty()); 

    }
}
