
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;


public class ResolucaoTela {

   
    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension tamanho = resolucao.getScreenSize();
        
        System.out.println("A resolução da sua tela é: " + tamanho.width + " X " + tamanho.height);
        /**System.out.println(tamanho.width + " X " + tamanho.height);**/
        
    }
    
}
