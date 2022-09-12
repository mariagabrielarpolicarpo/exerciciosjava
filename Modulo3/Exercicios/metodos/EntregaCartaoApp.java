package Métodos;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(); 
        endereco.cep = "00000"; 

        Cliente cliente = new Cliente(); 
        
        cliente.adicionaEndereco(endereco); 
        System.out.println("Endereço adicionado com sucesso!");
    }
}
