public class simplificandovar {
    public static void main(String[] args)
    {
        double salarioMensal = 18234.2; 
        double mediaSalario = 14542.2; 

        int quantidadeDependentes = 4; 
        int mediaDependentes = 2; 

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)); 

        boolean salarioBaixo = salarioMensal < mediaSalario; 
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes; 

        System.out.println((salarioBaixo)&& (muitosDependentes)); 

        boolean recebeAuxilio = ((salarioBaixo) && (muitosDependentes)); 
        System.out.println("recebeAuxilio " + recebeAuxilio); 
    }
    
}
