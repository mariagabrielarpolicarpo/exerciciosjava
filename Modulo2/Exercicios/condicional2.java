public class condicional2 {
    public static void main(String[] args) {
        String dia = "sexta"; 
        int var = 0; 

        switch(dia) {
            case "domingo": var = 1;; 
            break; 
            case "segunda": var = 2;
            break; 
            case "terca": var = 3;
            break; 
            case "quarta": var = 4;
            break; 
            case "quinta": var = 5;
            break; 
            case "sexta": var = 6;
            break; 
            case "sabado": var = 7;
            break; 
        }

        if(var<4)
            System.out.println("Certo");
        else if(var==4)
            System.out.println("Errado");
        else if(var==5)
            System.out.println("Talvez");
        else 
            System.out.println("Valor indefinido");
        
        System.out.println(var); 


    }
}
