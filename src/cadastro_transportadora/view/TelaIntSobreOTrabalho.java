/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cadastro_transportadora.view;


public class TelaIntSobreOTrabalho extends javax.swing.JInternalFrame {

    
    public TelaIntSobreOTrabalho() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximizable(true);
        setTitle("Sobre");

        jLabel2.setText("<html>   <h2>Sistema de Gerenciamento para Transportadora</h2>   <p>     Este sistema tem como objetivo facilitar a gestão de uma transportadora,     permitindo o cadastro e organização dos principais elementos operacionais:   </p>   <ul>     <li><b>Veículos:</b> Registro com placa, tipo, dimensões internas e capacidade de carga.</li>     <li><b>Produtos:</b> Cadastro com tipo, lote, dimensões, peso e grau de fragilidade.</li>     <li><b>Embalagens:</b> Associação com produtos, incluindo tipo, empilhamento e medidas.</li>   </ul>   <p>     O sistema também conta com um <b>Painel de Resumo</b> que apresenta estatísticas gerais     como totais de veículos, produtos e embalagens, tipos cadastrados e mais.   </p>   <p>     Simples, funcional e organizado, o sistema visa otimizar a rotina logística com foco em controle e eficiência.   </p>   <br><p><i>Feito por: Marcos Vinicios</i></p> </html> ");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    
}
