
import java.util.*; 
public class exercicio3 {
	
	
	public static void retirar_vogais(String frase ) {
	
		
		 for(int i=0; i<frase.length(); i++) {
			  
			    
			    if (frase.charAt(i)!='a'&&
			    frase.charAt(i)!='e'&&
			    frase.charAt(i)!='i'&&
			    frase.charAt(i)!='o'&&
			    frase.charAt(i)!='u')
			    
			    {
			    
		    	 System.out.print(frase.charAt(i));	    	
		    }	
	}
}
	public static void main(String[] args) {
		
		String frase ;
		int tam_frase=0;
		
		//entrada de dados
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Digite uma frase:");
	    frase= entrada.nextLine();
	    
        retirar_vogais(frase );
	    
	}
}
