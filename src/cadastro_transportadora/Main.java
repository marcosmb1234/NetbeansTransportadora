/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastro_transportadora;

import cadastro_transportadora.view.TelaPrincipal; // Importe a TelaPrincipal de seu pacote view

public class Main {

    public static void main(String[] args) {
        // Inicia a aplicação e exibe a tela principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true); // Abre a TelaPrincipal
            }
        });
    }
}