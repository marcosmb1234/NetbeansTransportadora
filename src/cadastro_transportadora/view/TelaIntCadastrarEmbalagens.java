/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cadastro_transportadora.view;

import cadastro_transportadora.model.BancoDeDadosFake; //Banco de dados fake que o Professor ensinou em aula
import static cadastro_transportadora.model.DadosTeste.dadosFicEmb; //Sistema de dados ficticios pois facilita a apresentação do trabalho
import cadastro_transportadora.model.Embalagem; //Referenca nescessaria
import cadastro_transportadora.model.Produto; // Referencia nescessaria
import java.util.ArrayList; // Import nescessario para usar arraylist

public class TelaIntCadastrarEmbalagens extends javax.swing.JInternalFrame {

    public TelaIntCadastrarEmbalagens() {
        initComponents();
        //Preenche a comboBox com os produtos cadastrados e caso não tenha da erro ao cadastrar embalagem
        ArrayList<Produto> produtos = BancoDeDadosFake.getProdutos(); 
        
        for (Produto produto : produtos) {

            cmbProduto.addItem(produto.getNome());

        }
    }
    private int indiceTeste = 0;
    
    private void CadastrarEmbalagem(){
    //erro comentado antes...
    if (cmbProduto.getItemCount() == 0) {
        // O javax.swing... exibe o erro em um pop-up
        javax.swing.JOptionPane.showMessageDialog(this, "Não há produtos cadastrados para associar à embalagem.", "Aviso", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    // "truque" pra pegar o nome do produto 
    int indexProduto = cmbProduto.getSelectedIndex(); 
    Produto produtoAssociado = BancoDeDadosFake.getProdutos().get(indexProduto);

    String tipo = cmbTipo.getSelectedItem().toString();
    double largura = Double.parseDouble(txtLargura.getText());
    double altura = Double.parseDouble(txtAltura.getText());
    double comprimento = Double.parseDouble(txtComprimento.getText());
    double peso = Double.parseDouble(txtPeso.getText());
    boolean empilhavel = chboxEmpilhavel.isSelected();
    String observacoes = jTextArea1.getText();


    Embalagem embalagem = new Embalagem(produtoAssociado, tipo, altura, largura, comprimento, peso, empilhavel, observacoes);
    BancoDeDadosFake banco = new BancoDeDadosFake();
    
    if (banco.addEmbalagem(embalagem)) { // joga no banco de dados e verifica se deu certo ou não
        javax.swing.JOptionPane.showMessageDialog(this, "Embalagem cadastrada com sucesso!");
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao cadastrar embalagem.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbProduto = new javax.swing.JComboBox<>();
        cmbTipo = new javax.swing.JComboBox<>();
        txtLargura = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtComprimento = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        chboxEmpilhavel = new javax.swing.JCheckBox();
        txtAreaObservacoes = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnTeste = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximizable(true);
        setTitle("Cadastrar");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OUTRO", "CAIXA", "TAMBOR", "PALETE", "SACO", "CONTAINER" }));

        chboxEmpilhavel.setText("Empilhável");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        txtAreaObservacoes.setViewportView(jTextArea1);

        jLabel1.setText("Observações:");

        jLabel2.setText("Peso:");

        jLabel10.setText("Dimensões:");

        jLabel11.setText("X");

        jLabel12.setText("Y");

        jLabel13.setText("Z");

        jLabel3.setText("Produto:");

        jLabel4.setText("Tipo:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Cadastro de Embalagem");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");

        btnTeste.setText("Preencher/Teste");
        btnTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTesteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chboxEmpilhavel))
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTeste))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAreaObservacoes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(chboxEmpilhavel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAreaObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimpar)
                    .addComponent(btnTeste))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastrarEmbalagem();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesteActionPerformed
        //esse botão somente facilita os testes e apresentação, não é nescessario para o funcionamento do programa!
        if (cmbProduto.getItemCount() == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Adicione um produto antes de testar.", "Aviso", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    if (indiceTeste == dadosFicEmb.length) {
        indiceTeste = 0;
    }
    String[] dados = dadosFicEmb[indiceTeste];
    cmbTipo.setSelectedItem(dados[0]);
    txtLargura.setText(dados[1]);
    txtAltura.setText(dados[2]);
    txtComprimento.setText(dados[3]);
    txtPeso.setText(dados[4]);
    chboxEmpilhavel.setSelected(Boolean.parseBoolean(dados[5]));
    jTextArea1.setText(dados[6]);
    indiceTeste++;
    }//GEN-LAST:event_btnTesteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnTeste;
    private javax.swing.JCheckBox chboxEmpilhavel;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JScrollPane txtAreaObservacoes;
    private javax.swing.JTextField txtComprimento;
    private javax.swing.JTextField txtLargura;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
