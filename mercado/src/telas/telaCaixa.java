/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.conexao;
import static classes.conexao.statement;
import classes.converte;
import classes.funcionario;
import static classes.funcionario.numCaixa;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
//import org.jbars.Barcode;

public class telaCaixa extends javax.swing.JFrame {

    Calendar now = Calendar.getInstance();
    Date dataHora = new Date();
    SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
    
    converte conv = new converte();
    
    /**
     * Creates new form telaCaixa
     */
    public telaCaixa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovaCompra = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JLabel();
        txtValor = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        txtColocaCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRecebido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnCupom = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbNumCupom = new javax.swing.JLabel();
        dhCupom = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lbCompras = new javax.swing.JLabel();
        lbCompra = new javax.swing.JLabel();
        lbRecebido = new javax.swing.JLabel();
        lbTroco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txtTotal = new javax.swing.JLabel();
        txtTroco = new javax.swing.JLabel();
        lbImagemProduto = new javax.swing.JLabel();
        lbBarra = new javax.swing.JLabel();
        lbNomeFuncionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caixa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNovaCompra.setBackground(new java.awt.Color(255, 51, 51));
        btnNovaCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnNovaCompra.setText("Nova Compra");
        btnNovaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovaCompraMouseClicked(evt);
            }
        });
        jPanel1.add(btnNovaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, 40));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Preço");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPreco.setForeground(new java.awt.Color(255, 255, 255));
        txtPreco.setText("R$00,00");
        jPanel2.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 51, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantidade");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtQtd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQtd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtd.setText("1");
        txtQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtdKeyReleased(evt);
            }
        });
        jPanel2.add(txtQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 91, 69, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 125, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Produto");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 11, -1, -1));

        txtNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 11, 230, 22));

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtValor.setForeground(new java.awt.Color(255, 255, 255));
        txtValor.setText("R$00,00");
        jPanel2.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, 200, 29));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 380, 160));

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNome.setForeground(new java.awt.Color(255, 0, 0));
        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 30));

        txtColocaCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColocaCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtColocaCodigoKeyReleased(evt);
            }
        });
        jPanel1.add(txtColocaCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 230, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("TOTAL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("RECEBIDO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("TROCO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        txtRecebido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRecebido.setText("R$0,00");
        txtRecebido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRecebidoKeyReleased(evt);
            }
        });
        jPanel1.add(txtRecebido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 90, -1));

        jLabel9.setBackground(new java.awt.Color(255, 51, 51));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enter - Confirma      F1 - Finaliza a compra      F5 - Altera a quantidade      ESC - Encerra ");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 660, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 270, 20));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoMercado.PNG"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 100, 100));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 270, 170));

        pnCupom.setBackground(new java.awt.Color(255, 204, 153));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Mercado Super");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel13.setText("Rua do Mercado 19 - Bairro");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setText("CEP: 19283-735 - Atibaia - SP");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel15.setText("------------------------------------------------------");

        lbNumCupom.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbNumCupom.setText("Cupom Fiscal ###");

        dhCupom.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        dhCupom.setText("Data: xx/xx/xxxx Hora: xx:xx:xx");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel23.setText("CNPJ: 19.371.438/0001-64");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel24.setText("IE: 72396396-NO        ");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel25.setText("IM: 8373214734-38");

        lbCompras.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbCompras.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lbCompra.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbCompra.setText(" COMPRA ..............");

        lbRecebido.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbRecebido.setText("RECEBIDO ............");

        lbTroco.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbTroco.setText("TROCO ................");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("------------------------------------------------------");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel17.setText("------------------------------------------------------");

        javax.swing.GroupLayout pnCupomLayout = new javax.swing.GroupLayout(pnCupom);
        pnCupom.setLayout(pnCupomLayout);
        pnCupomLayout.setHorizontalGroup(
            pnCupomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCupomLayout.createSequentialGroup()
                .addGroup(pnCupomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel12))
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel24))
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel25))
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15))
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbNumCupom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dhCupom, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17))
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(pnCupomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCompra)
                            .addGroup(pnCupomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTroco)
                                .addComponent(lbRecebido))))
                    .addGroup(pnCupomLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(8, 8, 8))
        );
        pnCupomLayout.setVerticalGroup(
            pnCupomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCupomLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addComponent(jLabel13)
                .addGap(1, 1, 1)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel23)
                .addGap(6, 6, 6)
                .addComponent(jLabel24)
                .addGap(6, 6, 6)
                .addComponent(jLabel25)
                .addGap(6, 6, 6)
                .addComponent(jLabel15)
                .addGap(6, 6, 6)
                .addComponent(lbNumCupom)
                .addGap(6, 6, 6)
                .addComponent(dhCupom)
                .addGap(2, 2, 2)
                .addComponent(jLabel17)
                .addGap(10, 10, 10)
                .addComponent(lbCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(lbCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRecebido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTroco)
                .addContainerGap())
        );

        jPanel1.add(pnCupom, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 270, 430));

        lbData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbData.setForeground(new java.awt.Color(255, 51, 51));
        lbData.setText("Data");
        jPanel1.add(lbData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 110, 20));

        lbHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbHora.setForeground(new java.awt.Color(255, 51, 51));
        lbHora.setText("Hora");
        jPanel1.add(lbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 90, -1));

        tabela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Preço", "Quantidade", "Total"
            }
        ));
        jScrollPane2.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(1).setMaxWidth(80);
            tabela.getColumnModel().getColumn(2).setMaxWidth(80);
            tabela.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 380, 270));

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal.setText("R$00,00");
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 90, -1));

        txtTroco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTroco.setText("R$00,00");
        jPanel1.add(txtTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 100, -1));
        jPanel1.add(lbImagemProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 220, 250));

        lbBarra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(lbBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 180, 40));

        lbNomeFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNomeFuncionario.setForeground(new java.awt.Color(255, 102, 0));
        lbNomeFuncionario.setText("Bem vindo funcionário!");
        jPanel1.add(lbNomeFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String codProduto;
    String nomeProduto;
    int recebido, maxNum = 0, num, sequencia = 1;
    Double preco, valor = 0.0, totalGeral = 0.0, troco = 0.0;
    
    private void consulta()
    {
        String sql = "SELECT * FROM tb01_produtos  WHERE tb01_cod_produto = '"+ txtColocaCodigo.getText() + "' ";
             
        
        try{
            conexao objetoBD = new conexao();
            objetoBD.conectar();
        
            ResultSet rs = statement.executeQuery(sql);
       
            if (rs.next()) 
            {
                nomeProduto = rs.getString("tb01_descricao");
                codProduto = rs.getString("tb01_cod_produto");
                preco = rs.getDouble("tb01_preco");
            }

            
            
            valor = preco * Integer.parseInt(txtQtd.getText());
        
            objetoBD.desconectar();
        }
        catch (Exception e)
        {
           System.out.println(e.getMessage());
        } 
       
    }
    
    private void carregaTabela()
    {
       try 
      { 
         String sql = "SELECT * FROM tb01_produtos WHERE tb01_cod_produto = "+txtColocaCodigo.getText()+"";

         conexao bd = new conexao();
         bd.conectar();
         ResultSet resultSet = statement.executeQuery(sql);
         
         DefaultTableModel tab = (DefaultTableModel) tabela.getModel();
        
        while (resultSet.next())
        {
            nomeProduto = resultSet.getString("tb01_descricao");
            codProduto = resultSet.getString("tb01_cod_produto");
            preco = resultSet.getDouble("tb01_preco");
            valor = preco * Integer.parseInt(txtQtd.getText());
            totalGeral = totalGeral + valor;
            
            String preco = conv.ConvMoeda(resultSet.getString("tb01_preco"));
            String quantidade = txtQtd.getText();
            String total = conv.ConvMoeda(String.valueOf(valor));
          
            tab.addRow(new Object[]{nomeProduto, preco, quantidade, total});  
            
       }
        
        tabela.setModel(tab);
        bd.desconectar();
        resultSet.close();
        statement.close();   
     }
        catch (Exception e)
        {
           System.out.println(e.getMessage());
        } 
    }
    
    private void pegaNumeroCupom(){
        String sql = "Select max(tb03_num_cupom) from tb03_cupom";
            
        try{

            conexao objetoBD = new conexao();
                        
            objetoBD.conectar();

            ResultSet rs = statement.executeQuery(sql);  
       
        if (rs.next()) 
        {
            maxNum = rs.getInt(1);
        }
        
        num = maxNum + 1; 
        objetoBD.desconectar();
        }
        catch (Exception e){
             System.out.println(e.getMessage());
         }
    }
    
    private void insertVendas () {
        
        String sql = "INSERT INTO tb02_vendas (tb02_num_caixa, tb02_cupom, tb02_sequencia, tb02_cod_produto, tb02_valor, tb02_quantidade)"
        +"VALUES ( '"+numCaixa+"', '"+num+"', '"+sequencia+"', '"+codProduto+"', '"+preco+"', '"+txtQtd.getText()+"')";
        
        try{
        conexao objetoBD = new conexao();
        objetoBD.conectar();
        int qtdreg = objetoBD.runSQL(sql);
        objetoBD.desconectar();
        }
        catch (Exception e){
             System.out.println(e.getMessage());
         }
    }
    
    private void insertCupom () {
        String sql = "INSERT INTO tb03_cupom (tb03_num_cupom, tb03_valor, tb03_data, tb03_hora)"
        +"VALUES ('"+num+"', '"+txtTotal.getText()+"', NOW(), '"+lbHora.getText()+"')";
        
        try{
        conexao objetoBD = new conexao();
        objetoBD.conectar();
        int qtdreg = objetoBD.runSQL(sql);
        objetoBD.desconectar();
        }
        catch (Exception e){
             System.out.println(e.getMessage());
         }
    }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        class dataHora implements ActionListener{
            
            public void actionPerformed(ActionEvent ae){
                Calendar now = Calendar .getInstance();
                lbHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
            }
        }
        
        Timer timer = new Timer(1000, new dataHora());
        timer.start();
        lbHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        lbData.setText(dt.format(dataHora));
        
        ImageIcon imagem = new  ImageIcon(telaCaixa.class.getResource("/imagens/logoMercado.PNG"));
        
        Image imag = imagem.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT);
        
        logo.setIcon(new ImageIcon(imag));
        
        txtColocaCodigo.requestFocus();
        
        txtQtd.setEditable(false);
        txtRecebido.setEditable(false);
        pnCupom.setVisible(false);
        
        funcionario obj = new funcionario();
        lbNomeFuncionario.setText("Bem vindo " + obj.pegaNome() + "! Caixa: " + obj.pegaNum());
    }//GEN-LAST:event_formWindowOpened
    
    private void colocaImagem(){
        ImageIcon imageIcon = new ImageIcon(new ImageIcon( "E:\\Escola\\2 DS\\Desenvolvimento de Sistemas (tpa 2)\\mercado\\src\\imagens\\"+txtColocaCodigo.getText()+".jpg").getImage().getScaledInstance(lbImagemProduto.getWidth(), lbImagemProduto.getHeight(), Image.SCALE_DEFAULT));

        lbImagemProduto.setIcon(imageIcon);
    }
    
    private void carregaBarCode()
    {
        float altura = 47;
        int fonteSize = 14;
        
        Image imagem;
        //imagem = Barcode.createImage(Barcode.TYPE_CODE128,txtColocaCodigo.getText(), altura, Font.SERIF, fonteSize,true, Barcode.ALIGN_CENTER,Font.ITALIC,Color.BLACK, Color.BLACK, 0);
        //imagem = Barcode.createImage(Barcode.TYPE_CODE128,txtColocaCodigo.getText(), altura, Font.DIALOG, fonteSize, true, Barcode.ALIGN_CENTER,Font.BOLD,Color.BLACK, Color.BLACK, 0);
        //lbBarra.setIcon(new ImageIcon(imagem)); 
    }
    
    private void colocaNomes(){
        txtNomeProduto.setText(String.valueOf(nomeProduto));
        txtPreco.setText(conv.ConvMoeda(String.valueOf(preco)));
        txtValor.setText(conv.ConvMoeda(String.valueOf(valor)));
        txtTotal.setText(conv.ConvMoeda(String.valueOf(totalGeral)));
        lbNumCupom.setText("Cupom Fiscal " + num);
        
        lbNome.setText(nomeProduto);
    }
    
    private void movimento()
    {
        new Thread()
        {
            public void run()
            { 

               int x = 700;
               int y = -300;
               
                while(true)
                {
                    if( y < 180 )
                    {
                        y = y+1; 
                        pnCupom.setLocation(x , y);  
                    }
                    try
                    {
                        sleep(6);
                    }
                    catch (Exception e)
                    {
                    }
                }
            }
            
        }.start();
    }

    String compras = "";
    
    private void txtColocaCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColocaCodigoKeyReleased
        if (txtColocaCodigo.getText().length() == 13)
        {
               evt.setKeyCode(KeyEvent.VK_ENTER);
        }

        
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) 
        {
                 //carregaBarCode();
                 colocaImagem();
                 //consulta();
                 //pegaNumeroCupom();
                 //insertVendas();
                 sequencia += 1;
                 
                 carregaTabela();
                 colocaNomes();
                 txtColocaCodigo.setText("");
                 
                 compras = compras + nomeProduto + "<br>" + conv.ConvMoeda(String.valueOf(preco)) + " * " + txtQtd.getText() + " = " + conv.ConvMoeda(String.valueOf(valor)) + "<br>";
                 lbCompras.setText("<html><p>"+compras+"</p></html>");
                 
                 txtQtd.setText("1");
        }
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_F5) 
        {  
                 txtColocaCodigo.setEnabled(false);
                 txtQtd.setEnabled(true);
                 txtQtd.setEditable(true);
                 txtQtd.setText("");
                 txtQtd.requestFocus();
        }  
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ESCAPE) 
        {  
            JOptionPane sair = new JOptionPane();
            System.out.print("funciona");
            int Sair = sair.showConfirmDialog(null,"Tem certeza que quer sair?","Sair",JOptionPane.YES_NO_OPTION);
            
            if(Sair == JOptionPane.YES_OPTION)
            {
                 System.exit(0);           
            }  
        }
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_F1) 
        {  

            if  (txtRecebido.getText().equals("R$0,00"))
            {
                 txtColocaCodigo.setEnabled(false);

                 txtRecebido.setText("");
                 txtRecebido.setEnabled(true);
                 txtRecebido.setEditable(true);
                 txtRecebido.requestFocus();
                 
            }
        }  
    }//GEN-LAST:event_txtColocaCodigoKeyReleased

    private void txtQtdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdKeyReleased
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) 
        {
            txtQtd.setEnabled(false);
            txtColocaCodigo.setEnabled(true);
            txtColocaCodigo.requestFocus();
        }
                
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ESCAPE) 
        {  
            JOptionPane sair = new JOptionPane();
            System.out.print("funciona");
            int Sair = sair.showConfirmDialog(null,"Tem certeza que quer sair?","Sair",JOptionPane.YES_NO_OPTION);
            
            if(Sair == JOptionPane.YES_OPTION)
            {
                 System.exit(0);           
            }  
        }
    }//GEN-LAST:event_txtQtdKeyReleased

    String verificaEnter = "naoDeu";
    
    private void txtRecebidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecebidoKeyReleased
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            
            recebido = Integer.parseInt(txtRecebido.getText());
            
            if (recebido < totalGeral) {
                JOptionPane.showMessageDialog(null , "O valor recebido é menor que o total.", "Valor inválido!", JOptionPane.ERROR_MESSAGE);
                verificaEnter = "naoDeu";
            }
            else {
                troco = recebido - totalGeral;
            
                txtTroco.setText(conv.ConvMoeda(String.valueOf(troco)));
            
                txtRecebido.setText(conv.ConvMoeda(txtRecebido.getText()));
                
                verificaEnter = "deu";
            }
            
        }
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ESCAPE) 
        {  
            JOptionPane sair = new JOptionPane();
            System.out.print("funciona");
            int Sair = sair.showConfirmDialog(null,"Tem certeza que quer sair?","Sair",JOptionPane.YES_NO_OPTION);
            
            if(Sair == JOptionPane.YES_OPTION)
            {
                 System.exit(0);           
            }  
        }
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_F1) {

            if (verificaEnter == "deu") {
                JOptionPane finalizar = new JOptionPane();
                int Finalizar = finalizar.showConfirmDialog(null,"Deseja mesmo finalizar a compra?","Finalizar",JOptionPane.YES_NO_OPTION);
            
                if(Finalizar == JOptionPane.YES_OPTION){
                    pnCupom.setVisible(true);
                    dhCupom.setText("Data: " + lbData.getText() + " Hora: " + lbHora.getText());
            
                    lbCompra.setText("COMPRA .......... " + conv.ConvMoeda(String.valueOf(totalGeral)));
                    lbRecebido.setText("RECEBIDO ....... " + conv.ConvMoeda(String.valueOf(recebido)));
                    lbTroco.setText("TROCO ............ " + conv.ConvMoeda(String.valueOf(troco)));
            
                    movimento();  
                    insertCupom();
                }   
            }
                  
        }
        
    }//GEN-LAST:event_txtRecebidoKeyReleased

    private void btnNovaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovaCompraMouseClicked
        this.dispose();
        telaCaixa novaTela = new telaCaixa();
        novaTela.setVisible(true);
    }//GEN-LAST:event_btnNovaCompraMouseClicked

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
            java.util.logging.Logger.getLogger(telaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovaCompra;
    private javax.swing.JLabel dhCupom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbBarra;
    private javax.swing.JLabel lbCompra;
    private javax.swing.JLabel lbCompras;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbImagemProduto;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeFuncionario;
    private javax.swing.JLabel lbNumCupom;
    private javax.swing.JLabel lbRecebido;
    private javax.swing.JLabel lbTroco;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pnCupom;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtColocaCodigo;
    private javax.swing.JLabel txtNomeProduto;
    private javax.swing.JLabel txtPreco;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtRecebido;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtTroco;
    private javax.swing.JLabel txtValor;
    // End of variables declaration//GEN-END:variables
}
