package Métodos;
import java.util.List;
import java.util.ArrayList;


public class Cliente {

    public Integer codigo; 
    public String nome; 
    public String cpf; 

    private List<Endereco> enderecos; 

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void adicionaEndereco(Endereco endereco) {
        if(endereco == null)
            throw new NullPointerException("Endereco nao pode ser nulo."); 

        if(endereco.cep == null)
            throw new NullPointerException("Cep nao pode ser nulo."); 

        getEnderecos().add(endereco);  

    }

    private List<Endereco> getEnderecos() {
        if(enderecos == null)
            enderecos = new ArrayList<Endereco>(); 
            return enderecos;
        }
     
}
