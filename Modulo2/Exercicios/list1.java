import java.util.List; 
import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.Collections; 
import java.util.Iterator; 

public class list1 {
    public static void main(String[] args)
    {
        List<Double> notas = new ArrayList<Double>(); 
        List<Double> notas2 = Arrays.asList(7d, 8.5,9.3,5.8);
        System.out.println(notas2); 
        notas.add(7d); 
        notas.add(5d); 
        notas.add(0d); 
        notas.add(6d); 
        System.out.println(notas); 

        //exiba a posição da nota 0 
        System.out.println("Exiba a posicao da nota 0: " + notas.indexOf(0d)); 

        //adicione na lista a nota 8 na posicao 4 
        notas.add(4,8d); 
        System.out.println(notas); 

        //substitua a nota 5 pela nota 0 
        notas.set(2,5d); 
        System.out.println(notas);

        // confira se a nota 5 está na lista
        System.out.println("Confira se a nota 5 esta na lista: " + notas.contains(5d)); // vai retornar true ou false

        //exiba a segunda nota
        System.out.println(notas.get(1)); 

        //exiba a menor nota
        System.out.println(Collections.min(notas)); 

        //exiba a maior nota
        System.out.println(Collections.max(notas)); 

        //exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator(); 
        Double soma = 0d; 
        while(iterator.hasNext())
        {
            Double next = iterator.next(); 
            soma += next; 
        }
        System.out.println(soma); 

        //exiba a media das notas
        System.out.println(soma/notas.size()); 

        //remova a nota que esta na posicao 4 
        notas.remove(4); 
        System.out.println(notas);

        // remova a nota 6 
        notas.remove(6d); 
        System.out.println(notas);
        
        //remova as notas menores que 6 
        Iterator<Double> iterator1 = notas.iterator(); 

        while(iterator1.hasNext())
        {
            Double next = iterator1.next(); 
            if(next < 6) iterator1.remove(); 
        }
        System.out.println(notas); 

        //apague toda a lista
        notas.clear(); 
        System.out.println(notas); 

        //confira se a lista esta vazia 
        System.out.println(notas.isEmpty()); // vai me retornar true ou false 

    }

}