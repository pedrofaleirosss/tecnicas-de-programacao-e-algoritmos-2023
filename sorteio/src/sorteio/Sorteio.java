
package sorteio;

import javax.swing.ImageIcon;
import telas.telaSorteio;

public class Sorteio {

    public static void main(String[] args) {
        telaSorteio tela = new telaSorteio();
        
        ImageIcon icone = new  ImageIcon(telaSorteio.class.getResource("/imagens/trevo.PNG"));
        tela.setIconImage(icone.getImage());
        
        tela.setVisible(true);
    }
}
