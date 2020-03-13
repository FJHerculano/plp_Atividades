
package atividade_plp2;


public class Atividade_plp2 {

    // Atividade para entender camadas de niveis do sistema, 
    // a main seria meu nivel zero, ou seja o ponto inicial do codigo
    //a classe seria meu primeiro nivel sendo ela a ContaBanco
    
    public static void main(String[] args) {
    
        
		ContaBanco cc = new ContaBanco();	
		cc.saldo = 200.00;
		
		
		cc.sacar(1000);
		
    }
    
}
