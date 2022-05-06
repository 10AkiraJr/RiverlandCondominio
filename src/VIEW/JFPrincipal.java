/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

/**
 *
 * @author Roberto Junior Akira
 */
public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jfPrincipal
     */
    public JFPrincipal() {
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

        jbMoradores = new javax.swing.JButton();
        jbApartamentos = new javax.swing.JButton();
        jbRecados = new javax.swing.JButton();
        jbSobre = new javax.swing.JButton();
        jdpPrincipal = new javax.swing.JDesktopPane();
        jbSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbMoradores.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        jbMoradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/1 Botões/perfil32px.png"))); // NOI18N
        jbMoradores.setText("Moradores");
        jbMoradores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbMoradores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbMoradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoradoresActionPerformed(evt);
            }
        });

        jbApartamentos.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        jbApartamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/1 Botões/casa32px.png"))); // NOI18N
        jbApartamentos.setText("Apartamentos");
        jbApartamentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbApartamentos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbApartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbApartamentosActionPerformed(evt);
            }
        });

        jbRecados.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        jbRecados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/1 Botões/post-it32px.png"))); // NOI18N
        jbRecados.setText("Recados");
        jbRecados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbRecados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbRecados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRecadosActionPerformed(evt);
            }
        });

        jbSobre.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        jbSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/1 Botões/sobre32px.png"))); // NOI18N
        jbSobre.setText("Sobre");
        jbSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSobreActionPerformed(evt);
            }
        });

        jdpPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1244, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );

        jbSair.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/1 Botões/desligar32px.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbMoradores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbApartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbRecados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbMoradores, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbApartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbRecados, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbMoradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoradoresActionPerformed
        JIFMoradores janela = new JIFMoradores();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jbMoradoresActionPerformed

    private void jbApartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbApartamentosActionPerformed
        JIFApartamentos janela = new JIFApartamentos();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jbApartamentosActionPerformed

    private void jbRecadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRecadosActionPerformed
        JIFRecados janela = new JIFRecados();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jbRecadosActionPerformed

    private void jbSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSobreActionPerformed
        JIFSobre janela = new JIFSobre();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jbSobreActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        new JFSair().setVisible(true);
    }//GEN-LAST:event_jbSairActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbApartamentos;
    private javax.swing.JButton jbMoradores;
    private javax.swing.JButton jbRecados;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSobre;
    private javax.swing.JDesktopPane jdpPrincipal;
    // End of variables declaration//GEN-END:variables
}
