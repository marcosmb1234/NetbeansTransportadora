/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cadastro_transportadora.view;

import cadastro_transportadora.model.BancoDeDadosFake;


public class TelaIntResumodeCadastro extends javax.swing.JInternalFrame {

  
    public TelaIntResumodeCadastro() {
        initComponents();
        carregarResumo();
    }
    private void carregarResumo() {
    StringBuilder veiculoResumo = new StringBuilder();
    BancoDeDadosFake.getVeiculosPorTipo().forEach((tipo, qtd) -> {
        veiculoResumo.append("Tipo: ").append(tipo).append(" - Quantidade: ").append(qtd).append("\n");
    });
    veiculoResumo.append("Total: ").append(BancoDeDadosFake.getTotalVeiculos());
    txtAreaVeiculosTipoTotal1.setText(veiculoResumo.toString());

    StringBuilder produtoResumo = new StringBuilder();
    BancoDeDadosFake.getProdutosPorTipo().forEach((tipo, qtd) -> {
        produtoResumo.append("Tipo: ").append(tipo).append(" - Quantidade: ").append(qtd).append("\n");
    });
    produtoResumo.append("Total: ").append(BancoDeDadosFake.getTotalProdutos());
    txtAreaProdutosTipoTotal1.setText(produtoResumo.toString());

    StringBuilder embalagemResumo = new StringBuilder();
    BancoDeDadosFake.getEmbalagensPorTipo().forEach((tipo, qtd) -> {
        embalagemResumo.append("Tipo: ").append(tipo).append(" - Quantidade: ").append(qtd).append("\n");
    });
    embalagemResumo.append("Total: ").append(BancoDeDadosFake.getTotalEmbalagens());
    txtAreaEmbalagensTipoTotal1.setText(embalagemResumo.toString());

    txtNumFamiliaProdutos1.setText(String.valueOf(BancoDeDadosFake.getTotalFamilias()));

    txtNumTiposProdutos1.setText(String.valueOf(BancoDeDadosFake.getTotalTiposProduto()));

    txtNumLotesCadastrados1.setText(String.valueOf(BancoDeDadosFake.getTotalLotes()));
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaVeiculosTipoTotal1 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAreaProdutosTipoTotal1 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAreaEmbalagensTipoTotal1 = new javax.swing.JTextArea();
        txtNumFamiliaProdutos1 = new javax.swing.JTextField();
        txtNumTiposProdutos1 = new javax.swing.JTextField();
        txtNumLotesCadastrados1 = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setTitle("Resumo de Cadastros");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Resumo de Cadastros");

        jLabel9.setText("Numero de veiculos por tipo e total:");

        jLabel10.setText("Numero de produtos por tipo e total:");

        jLabel11.setText("Quantidade de embalagens por tipo e total:");

        jLabel12.setText("Número de Famílias de produtos:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Número de tipos de produto:");

        jLabel14.setText("Número de lotes cadastrados:");

        txtAreaVeiculosTipoTotal1.setEditable(false);
        txtAreaVeiculosTipoTotal1.setColumns(20);
        txtAreaVeiculosTipoTotal1.setRows(5);
        jScrollPane6.setViewportView(txtAreaVeiculosTipoTotal1);

        txtAreaProdutosTipoTotal1.setEditable(false);
        txtAreaProdutosTipoTotal1.setColumns(20);
        txtAreaProdutosTipoTotal1.setRows(5);
        jScrollPane7.setViewportView(txtAreaProdutosTipoTotal1);

        txtAreaEmbalagensTipoTotal1.setEditable(false);
        txtAreaEmbalagensTipoTotal1.setColumns(20);
        txtAreaEmbalagensTipoTotal1.setRows(5);
        jScrollPane8.setViewportView(txtAreaEmbalagensTipoTotal1);

        txtNumFamiliaProdutos1.setEditable(false);

        txtNumTiposProdutos1.setEditable(false);

        txtNumLotesCadastrados1.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumFamiliaProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumLotesCadastrados1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumTiposProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNumFamiliaProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumTiposProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNumLotesCadastrados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea txtAreaEmbalagensTipoTotal1;
    private javax.swing.JTextArea txtAreaProdutosTipoTotal1;
    private javax.swing.JTextArea txtAreaVeiculosTipoTotal1;
    private javax.swing.JTextField txtNumFamiliaProdutos1;
    private javax.swing.JTextField txtNumLotesCadastrados1;
    private javax.swing.JTextField txtNumTiposProdutos1;
    // End of variables declaration//GEN-END:variables
}
