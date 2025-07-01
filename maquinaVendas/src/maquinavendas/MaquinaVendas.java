
package maquinavendas;

import javax.swing.ImageIcon;
import telas.telaMaquina;

public class MaquinaVendas {

    public static void main(String[] args) {
        telaMaquina tela = new telaMaquina();
        ImageIcon icone = new  ImageIcon(telaMaquina.class.getResource("/imagens/dentadura.jpg"));
        tela.setIconImage(icone.getImage());
        tela.setVisible(true);
    }
    
}
