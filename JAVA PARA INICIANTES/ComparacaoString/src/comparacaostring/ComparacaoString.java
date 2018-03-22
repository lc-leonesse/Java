/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author lcleo
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res, res2, res3;
        
        res = (nome1==nome2)?"igual":"diferente";
        // o == compara os 2 objetos
        res2 = (nome1==nome3)?"igual":"diferente";
        // o método equals compara o conteúdo dos 2 objetos
        res3 = (nome1.equals(nome3))?"igual":"diferente";
        
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
    
}
