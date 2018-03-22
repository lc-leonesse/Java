/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author lcleo
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, total=0, pares=0, impares=0, acima=0, media=0, soma=0;
        
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: "
                    + "<br><em>(valor 0 interrompe)</em></html>"));
            total+=1;
            if (n%2==0){
                pares+=1;
            }else{
                impares+=1;
            }
            if (n>100){
                acima+=1;
            }
            soma+=n;        
            
        }while (n != 0);
        media = soma/(total-1);
        JOptionPane.showMessageDialog(null, "<html>Resultado:<hr><br>" + "Total de Valores: " + (total-1)  
                + "<br>Total de Pares: " + (pares-1) + "<br>Total de Ímpares: " + (impares) + 
                "<br>Acima de 100: " + acima + "<br>Média dos valores: " + media + "</html>");
        
    }
    
}
