/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class frmTelaBiblioteca extends javax.swing.JFrame {

    /**
     * Creates new form frmTelaBiblioteca
     */
    public frmTelaBiblioteca() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btCadastrar = new javax.swing.JButton();
        btAutor = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        lblPesquisar = new javax.swing.JLabel();
        lblBiblioteca = new javax.swing.JLabel();
        cbBiblioteca = new javax.swing.JComboBox<>();
        btExcluir = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Vitual");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Autor", "Idioma", "Data de Lançamento", "Data de Cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTabela);

        btCadastrar.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btCadastrar.setText("Cadastrar Livro");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btAutor.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        btAutor.setText("Cadastrar Autor");
        btAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutorActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btAlterar.setText("Alterar");

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyTyped(evt);
            }
        });

        lblPesquisar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        lblPesquisar.setText("Pesquisar:");

        lblBiblioteca.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        lblBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBiblioteca.setText("BIBLIOTECA VIRTUAL");

        cbBiblioteca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livros", "Autores" }));

        btExcluir.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btExcluir.setText("Excluir");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Autor", "Idioma", "Data de Lançamento", "Data de Cadastro" }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "País", "Livros", "Data de Cadastro" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPesquisar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btSair)
                                .addGap(164, 164, 164)
                                .addComponent(btExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btCadastrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbBiblioteca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAutor, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAlterar)
                        .addComponent(btCadastrar)
                        .addComponent(btAutor)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarKeyTyped

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
    
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutorActionPerformed
        
    }//GEN-LAST:event_btAutorActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
         
        
    }//GEN-LAST:event_btSairActionPerformed

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
            java.util.logging.Logger.getLogger(frmAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                   frmTelaBiblioteca frmTelaBiblioteca = new frmTelaBiblioteca();
                frmTelaBiblioteca.setLocationRelativeTo(frmTelaBiblioteca);
                frmTelaBiblioteca.setVisible(true);
            }
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btAutor;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbBiblioteca;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
