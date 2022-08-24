package Métodos;

public class Endereco {

    public enum TipoEndereco {RESIDENCIAL, ENTREGA, TRABALHO}

    public String endereco; 
    public String numero; 
    public String complemento; 
    public String cep; 
    public String estado; 
    public String cidade; 
    public String bairro; 
    public TipoEndereco tipo; 

}
