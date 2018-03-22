/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author lcleo
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m); */
        
        /*int numero = 10;
        int valor = 4 + --numero;
        
        System.out.println("Pós Incremento: " + valor);
        System.out.println("Número: " + numero);*/
        
        /*int x = 4;
        x += 2; // x = x + 2
        
        System.out.println(x);*/
        
        /*float v = 8.4f;
        int ar = (int) Math.round(v);
        System.out.println(ar);*/
        
        double ale = Math.random();
        int num = (int) (0 + ale * (50-0)); // gera um número aleatório entre 0 e 50.
        // Para mudar o intervalo: o primeiro número do intervalo é o número a ser somado 
        // O último número do intervalo vai ser diminuído do primeiro número do itervalo
        // Ex: Número aleatório em 10 e 100: 10 + ale *(100-10)
        System.out.println(num);
        
        
      
            
                
        
    }
    
}
