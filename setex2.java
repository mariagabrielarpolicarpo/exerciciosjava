import java.util.*;

public class setex2 {
    public static void main(String[] args) {

        Set<LinguagemFavorita> lings = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Python", 1993, "Pycharm")); 
            add(new LinguagemFavorita("C", 1970, "VSCODE"));
            add(new LinguagemFavorita("JAVA", 1990, "Eclipse"));
            add(new LinguagemFavorita("JAVA", 1990, "VSCODE"));
            add(new LinguagemFavorita("JAVA", 1995, "Eclipse"));
            add(new LinguagemFavorita("JAVA", 1995, "VSCODE"));
        }}; 

        // a) Ordem de inserção;
        for (LinguagemFavorita linguagemFavorita: lings) System.out.println(linguagemFavorita.getNome() + " - "
                + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIDE());
        System.out.println("\n");
        //System.out.println(lings.toString()); 

        // b) Ordem natural(nome);
        Set<LinguagemFavorita> lings2 = new TreeSet<>(lings); 

        for (LinguagemFavorita linguagemFavorita: lings2) {System.out.println(linguagemFavorita.getNome() + " - "
               + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIDE());}
        System.out.println("\n");

        // c) IDE;
        Set<LinguagemFavorita> lings3 = new TreeSet<>(new ComparatorIde()); 
        lings3.addAll(lings); 

        for (LinguagemFavorita linguagemFavorita: lings3) System.out.println(linguagemFavorita.getNome() + " - "
               + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIDE());

        System.out.println("\n");

        // d) Ano de criação e nome;
        Set<LinguagemFavorita> lings4 = new TreeSet<>(new ComparatorAnoNome()); 
        lings4.addAll(lings); 

        for (LinguagemFavorita linguagemFavorita: lings4) System.out.println(linguagemFavorita.getNome() + " - "
               + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIDE());

        System.out.println("\n");

        // e) Nome, ano de criação e IDE;

        Set<LinguagemFavorita> lings5 = new TreeSet<>(new ComparatorNomeAnoIde()); 
        lings5.addAll(lings); 

        for (LinguagemFavorita linguagemFavorita: lings5) System.out.println(linguagemFavorita.getNome() + " - "
               + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIDE());

        System.out.println("\n");

    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome; 
    private Integer anoDeCriacao; 
    private String IDE; 

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", ano de criacao='" + anoDeCriacao + '\'' +
                ", IDE=" + IDE +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome); 
    }

}

class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIDE().compareToIgnoreCase(lf2.getIDE());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        
        int anoDeCriacao = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;

        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;

        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
    
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        
        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;

        int anoDeCriacao = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;

        return l1.getIDE().compareToIgnoreCase(l2.getIDE());
    }
    
}
