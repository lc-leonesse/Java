/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author lcleo
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 30;
        //String valor = idade; -> Não funciona. Dá erro. Java não converte int para string dessa maneira.
        //String valor = (String) idade; -> Não funciona. Dá erro. Java não converte int para string dessa maneira.
        String valor = Integer.toString(idade); // Assim funciona. Usando o método toString da classe invólucro Integer
        System.out.println(valor);
        
        String teste = "30";
        //int novo_teste = teste;
        //int novo_teste = (int) teste;
        int novo_teste = Integer.parseInt(teste); //parse = converter
        System.out.println(novo_teste);
        
        String teste2 = "30.5";
        float teste3 = Float.parseFloat(teste2);
        System.out.println(teste3);
        
        
           
    }
    
}
