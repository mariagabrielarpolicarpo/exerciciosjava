import java.util.List; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Comparator;

public class list2 {
    public static void main(String[] args)
    {
        List<Gatos> meusGatos = new ArrayList<>(){{ 
            add(new Gatos("Jon", 18, "preto")); 
            add(new Gatos("Simba", 6, "tigrado"));
            add(new Gatos("Shelby", 12, "amarelo"));
        }}; 
        System.out.println(meusGatos); 

        //ordene a lista de forma aleatoria 
        Collections.shuffle(meusGatos); 
        System.out.println(meusGatos); 

        //ordene a lista por ordem alfabetica de nome 
        Collections.sort(meusGatos); 
        System.out.println(meusGatos); 

        //ordene a lista por idade
        meusGatos.sort(new ComparatorIdade()); 
        System.out.println(meusGatos);

        //ordene a lista por cor 
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        //ordene por nome/cor/idade 
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos); 
        
    }
}

class Gatos implements Comparable<Gatos>{
    private String nome; 
    private Integer idade; 
    private String cor; 

    public Gatos (String nome, Integer idade, String cor)
    {
        this.nome = nome; 
        this.idade = idade; 
        this.cor = cor; 
    }
    public String getNome() {
        return nome; 
    }
    public Integer getIdade() {
        return idade; 
    }
    public String getCor() {
        return cor; 
    }

    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';}

    public int compareTo(Gatos gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
            }
}

class ComparatorIdade implements Comparator<Gatos> {
    @Override
    public int compare(Gatos g1, Gatos g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gatos> {

    @Override
    public int compare(Gatos g1, Gatos g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gatos> {

    @Override
    public int compare(Gatos g1, Gatos g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}
