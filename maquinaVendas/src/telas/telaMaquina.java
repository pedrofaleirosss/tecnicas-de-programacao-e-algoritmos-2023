
package telas;

import classes.conexao;
import static classes.conexao.statement;
import classes.converteMoeda;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class telaMaquina extends javax.swing.JFrame {

    public telaMaquina() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        produto1 = new javax.swing.JLabel();
        produto2 = new javax.swing.JLabel();
        produto3 = new javax.swing.JLabel();
        produto4 = new javax.swing.JLabel();
        produto5 = new javax.swing.JLabel();
        produto6 = new javax.swing.JLabel();
        produto7 = new javax.swing.JLabel();
        produto8 = new javax.swing.JLabel();
        produto9 = new javax.swing.JLabel();
        preco1 = new javax.swing.JLabel();
        preco2 = new javax.swing.JLabel();
        preco3 = new javax.swing.JLabel();
        preco4 = new javax.swing.JLabel();
        preco5 = new javax.swing.JLabel();
        preco6 = new javax.swing.JLabel();
        preco7 = new javax.swing.JLabel();
        preco8 = new javax.swing.JLabel();
        preco9 = new javax.swing.JLabel();
        saida = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        lbTroco = new javax.swing.JLabel();
        nota1 = new javax.swing.JLabel();
        nota2 = new javax.swing.JLabel();
        nota4 = new javax.swing.JLabel();
        nota3 = new javax.swing.JLabel();
        lbCreditos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Máquina de Vendas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));

        produto1.setBackground(new java.awt.Color(255, 255, 255));
        produto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        produto1.setOpaque(true);

        produto2.setBackground(new java.awt.Color(255, 255, 255));
        produto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        produto2.setOpaque(true);

        produto3.setBackground(new java.awt.Color(255, 255, 255));
        produto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        produto3.setOpaque(true);

        produto4.setBackground(new java.awt.Color(255, 255, 255));
        produto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        produto4.setOpaque(true);

        produto5.setBackground(new java.awt.Color(255, 255, 255));
        produto5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        produto5.setOpaque(true);

        produto6.setBackground(new java.awt.Color(255, 255, 255));
        produto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        produto6.setOpaque(true);

        produto7.setBackground(new java.awt.Color(255, 255, 255));
        produto7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        produto7.setOpaque(true);

        produto8.setBackground(new java.awt.Color(255, 255, 255));
        produto8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        produto8.setOpaque(true);

        produto9.setBackground(new java.awt.Color(255, 255, 255));
        produto9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        produto9.setOpaque(true);

        preco1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        preco1.setForeground(new java.awt.Color(255, 255, 255));
        preco1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preco1.setText("R$0,00");

        preco2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        preco2.setForeground(new java.awt.Color(255, 255, 255));
        preco2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preco2.setText("R$0,00");

        preco3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        preco3.setForeground(new java.awt.Color(255, 255, 255));
        preco3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preco3.setText("R$0,00");

        preco4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        preco4.setForeground(new java.awt.Color(255, 255, 255));
        preco4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preco4.setText("R$0,00");

        preco5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        preco5.setForeground(new java.awt.Color(255, 255, 255));
        preco5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preco5.setText("R$0,00");

        preco6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        preco6.setForeground(new java.awt.Color(255, 255, 255));
        preco6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preco6.setText("R$0,00");

        preco7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        preco7.setForeground(new java.awt.Color(255, 255, 255));
        preco7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preco7.setText("R$0,00");

        preco8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        preco8.setForeground(new java.awt.Color(255, 255, 255));
        preco8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preco8.setText("R$0,00");

        preco9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        preco9.setForeground(new java.awt.Color(255, 255, 255));
        preco9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preco9.setText("R$0,00");

        saida.setBackground(new java.awt.Color(204, 204, 204));
        saida.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(preco1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(produto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(preco2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(produto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(produto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(preco3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(produto7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(preco7, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(preco8, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(produto8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(produto9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(preco9, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(produto4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(preco4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(produto5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(preco5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(preco6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(produto6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(produto1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(produto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preco1)
                    .addComponent(preco2)
                    .addComponent(preco3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(produto5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(produto4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(produto6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preco4)
                    .addComponent(preco5)
                    .addComponent(preco6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(produto7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produto8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produto9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preco7)
                    .addComponent(preco8)
                    .addComponent(preco9))
                .addGap(39, 39, 39)
                .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btn1.setBackground(new java.awt.Color(102, 102, 102));
        btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(102, 102, 102));
        btn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(102, 102, 102));
        btn3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(102, 102, 102));
        btn4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setToolTipText("");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(102, 102, 102));
        btn5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(102, 102, 102));
        btn6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(102, 102, 102));
        btn7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(102, 102, 102));
        btn8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(102, 102, 102));
        btn9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        lbTroco.setBackground(new java.awt.Color(153, 153, 153));
        lbTroco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTroco.setForeground(new java.awt.Color(255, 255, 255));
        lbTroco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTroco.setText("Troco");
        lbTroco.setOpaque(true);

        nota1.setBackground(new java.awt.Color(153, 153, 153));
        nota1.setOpaque(true);
        nota1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nota1MouseClicked(evt);
            }
        });

        nota2.setBackground(new java.awt.Color(153, 153, 153));
        nota2.setOpaque(true);
        nota2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nota2MouseClicked(evt);
            }
        });

        nota4.setBackground(new java.awt.Color(153, 153, 153));
        nota4.setOpaque(true);
        nota4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nota4MouseClicked(evt);
            }
        });

        nota3.setBackground(new java.awt.Color(153, 153, 153));
        nota3.setOpaque(true);
        nota3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nota3MouseClicked(evt);
            }
        });

        lbCreditos.setBackground(new java.awt.Color(153, 153, 153));
        lbCreditos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCreditos.setForeground(new java.awt.Color(255, 255, 255));
        lbCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCreditos.setText("R$00,00");
        lbCreditos.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(nota4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(lbTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(lbCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nota4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(lbCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(lbTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
Double credito = 0.0;   
int i = 0;
String preco;
    
conexao con = new conexao();
converteMoeda cv = new converteMoeda();
    
 JLabel [] lbproduto;
 JLabel [] lbpreco;
 
 Double precoVetor[] = new Double[9];
 //int quantidade[] = new int[9];
 
 private void carregaProdutos () {
     lbproduto = new JLabel[] {produto1, produto2, produto3, produto4, produto5, produto6, produto7, produto8, produto9};
     lbpreco = new JLabel [] {preco1, preco2, preco3, preco4, preco5, preco6, preco7, preco8, preco9};
     
     String sql = "select * from tb01_produtos";
     
     try {
         con.conectar();
         
         ResultSet resultSet = statement.executeQuery(sql);
         
         while (resultSet.next())
        {  
          preco = resultSet.getString("tb01_preco");
          
          precoVetor[i] = resultSet.getDouble("tb01_preco");
          //quantidade[i] = resultSet.getInt("tb01_quantidade");
          
          lbpreco[i].setText(cv.ConvMoeda(preco));
          
          Image img = Toolkit.getDefaultToolkit().createImage(resultSet.getBytes("tb01_foto"));
          ImageIcon foto = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbproduto[i].getWidth(),lbproduto[i].getHeight(), Image.SCALE_DEFAULT));
          lbproduto[i].setIcon(foto);
         
          i++;
        }
         
        con.desconectar();
        resultSet.close();
        statement.close();  
     }
     
     catch (Exception e) {
        System.out.println(e.getMessage());
    } 
 }
 
 
 private void calculaPreco(int n){
     if (credito < precoVetor[n]){
         JOptionPane.showMessageDialog(null , "Coloque mais dinheiro!", "Valor insuficiente!", JOptionPane.ERROR_MESSAGE);
     }
     else {
         credito -= precoVetor[n];
         lbCreditos.setText(cv.ConvMoeda(String.valueOf(credito)));
         lbTroco.setText(cv.ConvMoeda(String.valueOf(credito)));
     }
 }
 

    private void carregaNotas() {
        ImageIcon imagem = new  ImageIcon(telaMaquina.class.getResource("/imagens/2reais.JPG"));
        
        Image imag = imagem.getImage().getScaledInstance(nota1.getWidth(), nota1.getHeight(), Image.SCALE_DEFAULT);
        
        nota1.setIcon(new ImageIcon(imag));
        
        ImageIcon imagem2 = new  ImageIcon(telaMaquina.class.getResource("/imagens/5reais.jpg"));
        
        Image imag2 = imagem2.getImage().getScaledInstance(nota2.getWidth(), nota2.getHeight(), Image.SCALE_DEFAULT);
        
        nota2.setIcon(new ImageIcon(imag2));
        
        ImageIcon imagem3 = new  ImageIcon(telaMaquina.class.getResource("/imagens/10reais.jpg"));
        
        Image imag3 = imagem3.getImage().getScaledInstance(nota3.getWidth(), nota3.getHeight(), Image.SCALE_DEFAULT);
        
        nota3.setIcon(new ImageIcon(imag3));
        
        ImageIcon imagem4 = new  ImageIcon(telaMaquina.class.getResource("/imagens/20reais.jpg"));
        
        Image imag4 = imagem4.getImage().getScaledInstance(nota4.getWidth(), nota4.getHeight(), Image.SCALE_DEFAULT);
        
        nota4.setIcon(new ImageIcon(imag4));
    }
    
    public void movimento(int i)
    {
        if (credito >= precoVetor[i]) {
            new Thread()
            {
                public void run()
                { 
                   int x = lbproduto[i].getX();
                   int y = lbproduto[i].getY();
                   
                   int xSaida = saida.getX() + (saida.getWidth() / 2) - (lbproduto[i].getWidth() / 2);
                   int ySaida = saida.getY();
                   
                    while(true)
                    {
                        if( y < ySaida){
                            y += 1; 
                            lbproduto[i].setLocation(x , y);  
                        }
                        
                        if (x < xSaida && y == ySaida){
                            x += 1;
                            lbproduto[i].setLocation(x, y);
                        }
                        
                        if (x > xSaida && y == ySaida){
                            x -= 1;
                            lbproduto[i].setLocation(x, y);
                        }
                        
                        try
                        {
                            sleep(5);
                        }
                        catch (Exception e)
                        {
                        }
                    }
                }

            }.start();
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregaProdutos();
        carregaNotas();   
    }//GEN-LAST:event_formWindowOpened

    private void nota1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nota1MouseClicked
        credito += 2;
        lbCreditos.setText(cv.ConvMoeda(String.valueOf(credito)));
    }//GEN-LAST:event_nota1MouseClicked

    private void nota2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nota2MouseClicked
        credito += 5;
        lbCreditos.setText(cv.ConvMoeda(String.valueOf(credito)));
    }//GEN-LAST:event_nota2MouseClicked

    private void nota3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nota3MouseClicked
        credito += 10;
        lbCreditos.setText(cv.ConvMoeda(String.valueOf(credito)));
    }//GEN-LAST:event_nota3MouseClicked

    private void nota4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nota4MouseClicked
        credito += 20;
        lbCreditos.setText(cv.ConvMoeda(String.valueOf(credito)));
    }//GEN-LAST:event_nota4MouseClicked


    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        movimento(0);
        calculaPreco(0);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        movimento(1);
        calculaPreco(1);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        movimento(2);
        calculaPreco(2);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        movimento(3);
        calculaPreco(3);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        movimento(4);
        calculaPreco(4);    
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       calculaPreco(5);
       movimento(5);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        movimento(6);
        calculaPreco(6); 
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       movimento(7);
       calculaPreco(7); 
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       movimento(8);
       calculaPreco(8);
    }//GEN-LAST:event_btn9ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMaquina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCreditos;
    private javax.swing.JLabel lbTroco;
    private javax.swing.JLabel nota1;
    private javax.swing.JLabel nota2;
    private javax.swing.JLabel nota3;
    private javax.swing.JLabel nota4;
    private javax.swing.JLabel preco1;
    private javax.swing.JLabel preco2;
    private javax.swing.JLabel preco3;
    private javax.swing.JLabel preco4;
    private javax.swing.JLabel preco5;
    private javax.swing.JLabel preco6;
    private javax.swing.JLabel preco7;
    private javax.swing.JLabel preco8;
    private javax.swing.JLabel preco9;
    private javax.swing.JLabel produto1;
    private javax.swing.JLabel produto2;
    private javax.swing.JLabel produto3;
    private javax.swing.JLabel produto4;
    private javax.swing.JLabel produto5;
    private javax.swing.JLabel produto6;
    private javax.swing.JLabel produto7;
    private javax.swing.JLabel produto8;
    private javax.swing.JLabel produto9;
    private javax.swing.JLabel saida;
    // End of variables declaration//GEN-END:variables
}
