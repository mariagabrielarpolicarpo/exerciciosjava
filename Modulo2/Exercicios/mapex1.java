import java.util.*;

public class mapex1 {

    public static void main(String[] args) {

    // a) Crie um dicionário e relacione os estados e suas populações;
    Map <String,Integer> estados = new HashMap<>() {{
        put("PE", 9616621); 
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
    }};
    System.out.println(estados); 

    // b) Substitua a população do estado do RN por 3.534.165;
        estados.put("RN", 3534165); 
    
    System.out.println("b) Substituindo a população do estado de RN: " + estados); 

    // c) Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
    System.out.println("c) Conferindo se PB está no dicionário: " + estados.containsKey("PB")); 

    estados.put("PB", 4039277); 

    System.out.println("c) Adicionando PB ao dicionário: " + estados);
    
    // d)Exiba a população PE;
    System.out.println("d) População de PE: " + estados.get("PE")); 

    // e) Exiba todos os estados e suas populações na ordem que foi informado;
    Map <String,Integer> estados2 = new LinkedHashMap<>() {{
        put("PE", 9616621); 
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
        put("PB", 4039277);
    }};
    System.out.println("e) Ordem de inserção: " + estados2); 

    // f)Exiba os estados e suas populações em ordem alfabética;
    Map <String,Integer> estados3 = new TreeMap<>() {{ 
        put("PE", 9616621); 
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
        put("PB", 4039277);
    }}; 
    System.out.println("f) Ordem Alfabética: " + estados3);

    // g) Exiba o estado com o menor população e sua quantidade;
    Integer popMenos = Collections.min(estados.values());
        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        String ufMenos = "";

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(popMenos)) {
                ufMenos = entry.getKey();
                System.out.println("h) Menor população: " + ufMenos + " - " + popMenos);
            }
        }

    // h) Exiba o estado com a maior população e sua quantidade;
    Integer popMais = Collections.max(estados.values());
        String ufMais = "";

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(popMais)) {
                ufMais = entry.getKey();
                System.out.println("h) Maior população: " + ufMais + " - " + popMais);
            }
        }

    // i) Exiba a soma da população desses estados;
    Iterator<Integer> iterator = estados.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
    System.out.println("i) A soma das populações é de: " + soma); 

    // j) Exiba a média da população deste dicionário de estados;
    System.out.println("j) A média da população é de: " + soma/estados.size()); 

    // k) Remova os estados com a população menor que 4.000.000; 
    Iterator<Integer> iterator1 = estados.values().iterator(); 
        while(iterator1.hasNext()){
            int aux = iterator1.next();  
            if(aux < 4000000)
            iterator1.remove(); 
        }
        System.out.println("k) Removendo estados: " + estados); 

    // l) Apague o dicionário de estados;
    estados.clear(); 
    System.out.println("l) Apagando dicionário: " + estados); 

    // m) Confira se o dicionário está vazio. 
    System.out.println("Conferindo se está vazio: " + estados.isEmpty()); 

    }
}
