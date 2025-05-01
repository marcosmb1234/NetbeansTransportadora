/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cadastro_transportadora.view;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;


public class TelaPrincipal extends javax.swing.JFrame {
    public TelaPrincipal() {
        initComponents();
        this.setSize(800, 700); // é o tamanho de quando abre a tela
        TelaIntSobreOTrabalho telaInterna = new TelaIntSobreOTrabalho();
        desktop.add(telaInterna);
        telaInterna.setVisible(true);
        telaInterna.setClosable(false);
        telaInterna.setMaximizable(false);
        try {
        telaInterna.setMaximum(true); //é o negocio de aumentar a tela
} catch (PropertyVetoException ex) {
    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
}
 
    }
    
    public void abrirJanela(JInternalFrame novaJanela) {
   
    for (JInternalFrame janela : desktop.getAllFrames()) {
        janela.dispose();
    }
    desktop.add(novaJanela);
    novaJanela.setVisible(true);
    novaJanela.setClosable(false);
    novaJanela.setMaximizable(false);
    novaJanela.setOpaque(false);
    try {
        novaJanela.setMaximum(true); 
    } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        btnVeiculos = new javax.swing.JMenuItem();
        btnProdutos = new javax.swing.JMenuItem();
        btnEmbalagens = new javax.swing.JMenuItem();
        btnResumo = new javax.swing.JMenu();
        btnSobre = new javax.swing.JMenu();
        btnSair = new javax.swing.JMenu();
        btnSairAplicacao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(0, 0, 0));
        setFont(new java.awt.Font("Microsoft JhengHei", 0, 10)); // NOI18N

        desktop.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        menuCadastrar.setText("Cadastrar");

        btnVeiculos.setText("Veiculos");
        btnVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeiculosActionPerformed(evt);
            }
        });
        menuCadastrar.add(btnVeiculos);

        btnProdutos.setText("Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        menuCadastrar.add(btnProdutos);

        btnEmbalagens.setText("Embalagens");
        btnEmbalagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmbalagensActionPerformed(evt);
            }
        });
        menuCadastrar.add(btnEmbalagens);

        jMenuBar1.add(menuCadastrar);

        btnResumo.setText("Painel de Resumo");
        btnResumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResumoMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnResumo);

        btnSobre.setText("Sobre");
        btnSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnSobre);

        btnSair.setText("Sair");

        btnSairAplicacao.setText("Sair da aplicação");
        btnSairAplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairAplicacaoActionPerformed(evt);
            }
        });
        btnSair.add(btnSairAplicacao);

        jMenuBar1.add(btnSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeiculosActionPerformed
        TelaIntCadastrarVeiculos telaInterna = new TelaIntCadastrarVeiculos();
        abrirJanela(telaInterna);
    }//GEN-LAST:event_btnVeiculosActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        TelaIntCadastrarProdutos telaInterna = new TelaIntCadastrarProdutos();
        abrirJanela(telaInterna);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnEmbalagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmbalagensActionPerformed
        TelaIntCadastrarEmbalagens telaInterna = new TelaIntCadastrarEmbalagens();
        abrirJanela(telaInterna);
    }//GEN-LAST:event_btnEmbalagensActionPerformed

    private void btnResumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResumoMouseClicked
        TelaIntResumodeCadastro telaInterna= new TelaIntResumodeCadastro();
        abrirJanela(telaInterna);
    }//GEN-LAST:event_btnResumoMouseClicked

    private void btnSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSobreMouseClicked
        TelaIntSobreOTrabalho telaInterna = new TelaIntSobreOTrabalho();
        abrirJanela(telaInterna);
    }//GEN-LAST:event_btnSobreMouseClicked

    private void btnSairAplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairAplicacaoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairAplicacaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnEmbalagens;
    private javax.swing.JMenuItem btnProdutos;
    private javax.swing.JMenu btnResumo;
    private javax.swing.JMenu btnSair;
    private javax.swing.JMenuItem btnSairAplicacao;
    private javax.swing.JMenu btnSobre;
    private javax.swing.JMenuItem btnVeiculos;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCadastrar;
    // End of variables declaration//GEN-END:variables
}
