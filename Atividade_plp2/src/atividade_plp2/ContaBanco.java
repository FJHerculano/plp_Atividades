
package atividade_plp2;


public class ContaBanco {
    
	double saldo;
	//O metodo sacar seria o segundo nivel 
	public boolean sacar(double valor){
		// e a minha estrutura condicional seria o terceiro nivel do codigo
		if(saldo > valor){
                    
			saldo -= valor;
			return true;					
                        
			}else{
				return false;
			}
		}
	}
	
	


