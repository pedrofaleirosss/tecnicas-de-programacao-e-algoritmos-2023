
package telas;

import classes.converteMoeda;
import java.awt.Color;
import java.awt.Image;
import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.ImageIcon;

public class telaSorteio extends javax.swing.JFrame {
    
    converteMoeda cv = new converteMoeda();
    
    Double creditos = 0.0, valorAposta = 0.0, ganhos = 0.0;
    
    int x, numeroFigura1, numeroFigura2, numeroFigura3;
    
    String nome = "";

    public telaSorteio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoBranco = new javax.swing.JPanel();
        rdb1 = new javax.swing.JRadioButton();
        rdb2 = new javax.swing.JRadioButton();
        rdb3 = new javax.swing.JRadioButton();
        figura1 = new javax.swing.JLabel();
        figura2 = new javax.swing.JLabel();
        figura3 = new javax.swing.JLabel();
        nota2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nota5 = new javax.swing.JLabel();
        nota10 = new javax.swing.JLabel();
        alavancaParaCima = new javax.swing.JLabel();
        alavancaParaBaixo = new javax.swing.JLabel();
        maquina = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbGanhos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbCreditos = new javax.swing.JLabel();
        lbMensagem = new javax.swing.JLabel();
        lbEscolha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteio");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fundoBranco.setBackground(new java.awt.Color(255, 255, 255));
        fundoBranco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rdb1.setBackground(new java.awt.Color(255, 255, 255));
        rdb1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdb1.setForeground(new java.awt.Color(153, 0, 0));
        rdb1.setText("R$5,00");
        rdb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1ActionPerformed(evt);
            }
        });
        fundoBranco.add(rdb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 100, -1));

        rdb2.setBackground(new java.awt.Color(255, 255, 255));
        rdb2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdb2.setForeground(new java.awt.Color(153, 0, 0));
        rdb2.setText("R$10,00");
        rdb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb2ActionPerformed(evt);
            }
        });
        fundoBranco.add(rdb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 100, -1));

        rdb3.setBackground(new java.awt.Color(255, 255, 255));
        rdb3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdb3.setForeground(new java.awt.Color(153, 0, 0));
        rdb3.setText("Tudo");
        rdb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb3ActionPerformed(evt);
            }
        });
        fundoBranco.add(rdb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 110, 30));
        fundoBranco.add(figura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 80, 80));
        fundoBranco.add(figura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 80, 80));
        fundoBranco.add(figura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 80, 80));

        nota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2reais.JPG"))); // NOI18N
        nota2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nota2MouseClicked(evt);
            }
        });
        fundoBranco.add(nota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 64, 147, 57));

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setOpaque(true);
        fundoBranco.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 330, 140));

        nota5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/5reais.jpg"))); // NOI18N
        nota5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nota5MouseClicked(evt);
            }
        });
        fundoBranco.add(nota5, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 139, 147, 57));

        nota10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/10reais.jpg"))); // NOI18N
        nota10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nota10MouseClicked(evt);
            }
        });
        fundoBranco.add(nota10, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 214, 147, 57));

        alavancaParaCima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alavancaParaCimaMouseClicked(evt);
            }
        });
        fundoBranco.add(alavancaParaCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 50, 150));
        fundoBranco.add(alavancaParaBaixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 50, 150));

        maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/maquina.png"))); // NOI18N
        fundoBranco.add(maquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 410, 220));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Ganhos");
        fundoBranco.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        lbGanhos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbGanhos.setText("R$00,00");
        fundoBranco.add(lbGanhos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Créditos");
        fundoBranco.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        lbCreditos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbCreditos.setText("R$00,00");
        fundoBranco.add(lbCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        lbMensagem.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        lbMensagem.setForeground(new java.awt.Color(153, 0, 0));
        lbMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fundoBranco.add(lbMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 410, 50));

        lbEscolha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbEscolha.setForeground(new java.awt.Color(204, 204, 0));
        lbEscolha.setText("Escolha um valor para duplicar:");
        fundoBranco.add(lbEscolha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Nome:");
        fundoBranco.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });
        fundoBranco.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 98, 210, 30));

        btnSalvar.setBackground(new java.awt.Color(153, 0, 0));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        fundoBranco.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 100, -1));

        btnEditar.setBackground(new java.awt.Color(153, 0, 0));
        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        fundoBranco.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, -1));

        getContentPane().add(fundoBranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jogar()
    {
            Random aleatorio = new Random();

            //figura1.setIcon(null);
            //figura2.setIcon(null);
            //figura3.setIcon(null);
            
            creditos -= valorAposta;
            lbCreditos.setText(cv.ConvMoeda(String.valueOf(creditos)));

            x = 0;
            
            lbMensagem.setText("");

            alavancaParaCima.setVisible(false);
            alavancaParaCima.setEnabled(false);
            alavancaParaBaixo.setVisible(true);
            
        new Thread(){
            public void run()
            {        
                
                while (x < 10)
                {
                    numeroFigura1 = aleatorio.nextInt(4);
                    ImageIcon fig1 = new ImageIcon(new ImageIcon("E:\\Escola\\2 DS\\Desenvolvimento de Sistemas (tpa 2)\\sorteio\\src\\imagens\\emoji" + numeroFigura1 + ".png").getImage().getScaledInstance(figura1.getWidth(), figura1.getHeight(), Image.SCALE_DEFAULT));        
                    figura1.setIcon(fig1);
                    x++;
                    try
                    {
                       sleep(150);
                    }
                    catch (Exception e){
                        
                    }
                }

                while (x < 20)
                {
                    numeroFigura2 = aleatorio.nextInt(4);
                    ImageIcon fig2 = new ImageIcon(new ImageIcon("E:\\Escola\\2 DS\\Desenvolvimento de Sistemas (tpa 2)\\sorteio\\src\\imagens\\emoji" + numeroFigura2 + ".png").getImage().getScaledInstance(figura2.getWidth(), figura2.getHeight(), Image.SCALE_DEFAULT));        
                    figura2.setIcon(fig2);
                    x++;
                    try
                    {
                       sleep(150);
                    }
                    catch (Exception e){
                        
                    }
                }

                while (x < 30)
                {
                    numeroFigura3 = aleatorio.nextInt(4);
                    ImageIcon fig3 = new ImageIcon(new ImageIcon("E:\\Escola\\2 DS\\Desenvolvimento de Sistemas (tpa 2)\\sorteio\\src\\imagens\\emoji" + numeroFigura3 + ".png").getImage().getScaledInstance(figura3.getWidth(), figura3.getHeight(), Image.SCALE_DEFAULT));        
                    figura3.setIcon(fig3);
                    x++;
                    try
                    {
                       sleep(150);
                    }
                    catch (Exception e){
                        
                    }
                }


                if (numeroFigura1 == numeroFigura2 && numeroFigura2 == numeroFigura3)
                {
                    lbMensagem.setText("Parabéns!! Você ganhou!!");
                    lbMensagem.setForeground(Color.blue);
                    ganhos += valorAposta * 2;
                    lbGanhos.setText(cv.ConvMoeda(String.valueOf(ganhos)));
                }
                else {
                    lbMensagem.setText("Perdeu hhahhaha");
                    lbMensagem.setForeground(Color.red);
                    
                }

                
                alavancaParaCima.setEnabled(true);
                alavancaParaBaixo.setVisible(false);
                alavancaParaCima.setVisible(true);
            }            
        }.start();
 
    }
    
    private void verificaValorAposta () {
        if (rdb1.isSelected()){
            valorAposta = 5.0;
        }
        else if (rdb2.isSelected()){
            valorAposta = 10.0;
        }
        else if (rdb3.isSelected()){
            valorAposta = creditos;
        }
    }
    
    private void salvaNome () {
        nome = txtNome.getText();
        txtNome.setEditable(false);
    }
    
    
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon imagem = new  ImageIcon(telaSorteio.class.getResource("/imagens/2reais.JPG"));
        
        Image imag = imagem.getImage().getScaledInstance(nota2.getWidth(), nota2.getHeight(), Image.SCALE_DEFAULT);
        
        nota2.setIcon(new ImageIcon(imag));
        
        ImageIcon imagem2 = new  ImageIcon(telaSorteio.class.getResource("/imagens/5reais.jpg"));
        
        Image imag2 = imagem2.getImage().getScaledInstance(nota5.getWidth(), nota5.getHeight(), Image.SCALE_DEFAULT);
        
        nota5.setIcon(new ImageIcon(imag2));
        
        ImageIcon imagem3 = new  ImageIcon(telaSorteio.class.getResource("/imagens/10reais.jpg"));
        
        Image imag3 = imagem3.getImage().getScaledInstance(nota10.getWidth(), nota10.getHeight(), Image.SCALE_DEFAULT);
        
        nota10.setIcon(new ImageIcon(imag3));
        
        
        ImageIcon alavancaCima = new  ImageIcon(telaSorteio.class.getResource("/imagens/lever.png"));
        
        Image alavancaC = alavancaCima.getImage().getScaledInstance(alavancaParaCima.getWidth(), alavancaParaCima.getHeight(), Image.SCALE_DEFAULT);
        
        alavancaParaCima.setIcon(new ImageIcon(alavancaC));
        
        ImageIcon alavancaBaixo = new  ImageIcon(telaSorteio.class.getResource("/imagens/lever-down.png"));
        
        Image alavancaB = alavancaBaixo.getImage().getScaledInstance(alavancaParaBaixo.getWidth(), alavancaParaBaixo.getHeight(), Image.SCALE_DEFAULT);
        
        alavancaParaBaixo.setIcon(new ImageIcon(alavancaB));
        
        alavancaParaBaixo.setVisible(false);
        
        
        
        ImageIcon imagem4 = new  ImageIcon(telaSorteio.class.getResource("/imagens/maquina.png"));
        
        Image imag4 = imagem4.getImage().getScaledInstance(maquina.getWidth(), maquina.getHeight(), Image.SCALE_DEFAULT);
        
        maquina.setIcon(new ImageIcon(imag4));
        
        
        
        
        ImageIcon imagem5 = new  ImageIcon(telaSorteio.class.getResource("/imagens/emoji0.png"));
        
        Image imag5 = imagem5.getImage().getScaledInstance(figura1.getWidth(), figura1.getHeight(), Image.SCALE_DEFAULT);
        
        figura1.setIcon(new ImageIcon(imag5));
        
        ImageIcon imagem6 = new  ImageIcon(telaSorteio.class.getResource("/imagens/emoji1.png"));
        
        Image imag6 = imagem6.getImage().getScaledInstance(figura2.getWidth(), figura2.getHeight(), Image.SCALE_DEFAULT);
        
        figura2.setIcon(new ImageIcon(imag6));
        
        ImageIcon imagem7 = new  ImageIcon(telaSorteio.class.getResource("/imagens/emoji2.png"));
        
        Image imag7 = imagem7.getImage().getScaledInstance(figura3.getWidth(), figura3.getHeight(), Image.SCALE_DEFAULT);
        
        figura3.setIcon(new ImageIcon(imag7));

    }//GEN-LAST:event_formWindowOpened

    private void nota2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nota2MouseClicked
        creditos += 2;
        lbCreditos.setText(cv.ConvMoeda(String.valueOf(creditos)));
    }//GEN-LAST:event_nota2MouseClicked

    private void nota5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nota5MouseClicked
        creditos += 5;
        lbCreditos.setText(cv.ConvMoeda(String.valueOf(creditos)));
    }//GEN-LAST:event_nota5MouseClicked

    private void nota10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nota10MouseClicked
        creditos += 10;
        lbCreditos.setText(cv.ConvMoeda(String.valueOf(creditos)));
    }//GEN-LAST:event_nota10MouseClicked
  
    private void alavancaParaCimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alavancaParaCimaMouseClicked

        verificaValorAposta();
        
        
        if (creditos > 0 && valorAposta != 0 && creditos >= valorAposta && nome != ""){
            jogar();
        } 
        else if (nome == ""){
            lbMensagem.setText("Escreva o seu nome!");
        }
        else if (creditos == 0){
            lbMensagem.setText("Coloque créditos para apostar!");
        } 
        else if (valorAposta == 0.0) {
            lbMensagem.setText("Escolha o valor da aposta!");
        }
        else if (valorAposta > creditos) {
            lbMensagem.setText("Créditos insuficientes!");
        }
        
    }//GEN-LAST:event_alavancaParaCimaMouseClicked

    private void rdb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1ActionPerformed
        rdb2.setSelected(false);
        rdb3.setSelected(false);
    }//GEN-LAST:event_rdb1ActionPerformed

    private void rdb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb2ActionPerformed
        rdb1.setSelected(false);
        rdb3.setSelected(false);
    }//GEN-LAST:event_rdb2ActionPerformed

    private void rdb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb3ActionPerformed
        rdb1.setSelected(false);
        rdb2.setSelected(false);
    }//GEN-LAST:event_rdb3ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvaNome();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        txtNome.setEditable(true);
        txtNome.requestFocus();
        nome = "";
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            salvaNome();
        }
    }//GEN-LAST:event_txtNomeKeyReleased
 static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaSorteio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alavancaParaBaixo;
    private javax.swing.JLabel alavancaParaCima;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel figura1;
    private javax.swing.JLabel figura2;
    private javax.swing.JLabel figura3;
    private javax.swing.JPanel fundoBranco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbCreditos;
    private javax.swing.JLabel lbEscolha;
    private javax.swing.JLabel lbGanhos;
    private javax.swing.JLabel lbMensagem;
    private javax.swing.JLabel maquina;
    private javax.swing.JLabel nota10;
    private javax.swing.JLabel nota2;
    private javax.swing.JLabel nota5;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    private javax.swing.JRadioButton rdb3;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
