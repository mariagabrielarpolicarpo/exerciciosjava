package Heranças;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(); 

        // upcast 
        Funcionario gerente = new Gerente(); 
        Funcionario vendedor = new Vendedor(); 
        Funcionario faxineiro = new Faxineiro(); 

        //downcast 
        //Vendedor vendedor2 = (Vendedor) new Funcionario(); 
        //NAO USAR DOWNCAST EM ORIENTAÇÃO A OBJETOS 


        //so para parar de dar o problema que a variável não está sendo usada no codigo -_- 
        System.out.println(funcionario);
        System.out.println(gerente); 
        System.out.println(vendedor); 
        System.out.println(faxineiro); 
    }
}
