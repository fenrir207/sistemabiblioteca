/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AutorController;
import controller.LivroController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

/**
 *
 * @author Aluno
 */
public class frmTelaBiblioteca extends javax.swing.JFrame {


    LivroController lController;
    AutorController aController;


    /**
     * Creates new form frmTelaBiblioteca
     */
    public frmTelaBiblioteca() {
        initComponents();
        aController = new AutorController(this);
        lController = new LivroController(this);
        try {
            lController.getTableLivro();
        } catch (SQLException ex) {
            Logger.getLogger(frmTelaBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JTable getTblTabela() {
        return tblTabela;
    }

    public JTextField getTxtPesquisar() {
        return txtPesquisar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        rbId = new javax.swing.JRadioButton();
        rbNome = new javax.swing.JRadioButton();
        rbAutor = new javax.swing.JRadioButton();
        rbIdioma = new javax.swing.JRadioButton();
        rbDataLancamento = new javax.swing.JRadioButton();
        rbCodigo = new javax.swing.JRadioButton();
        rbDataCadastro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Vitual");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
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
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        lblPesquisar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        lblPesquisar.setText("Pesquisar:");

        lblBiblioteca.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        lblBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBiblioteca.setText("BIBLIOTECA VIRTUAL");

        cbBiblioteca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livros", "Autores" }));
        cbBiblioteca.setToolTipText("");
        cbBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBibliotecaActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Idioma", "Data de Lançamento", "Data de Cadastro" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "País", " " }));

        buttonGroup1.add(rbId);
        rbId.setText("ID");

        buttonGroup1.add(rbNome);
        rbNome.setText("Nome");

        buttonGroup1.add(rbAutor);
        rbAutor.setText("Autor");

        buttonGroup1.add(rbIdioma);
        rbIdioma.setText("Idioma");

        buttonGroup1.add(rbDataLancamento);
        rbDataLancamento.setText("Data de Lançamento");

        buttonGroup1.add(rbCodigo);
        rbCodigo.setText("Código");

        buttonGroup1.add(rbDataCadastro);
        rbDataCadastro.setText("Data de Cadastro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAutor)
                    .addComponent(rbDataLancamento)
                    .addComponent(rbIdioma)
                    .addComponent(rbNome)
                    .addComponent(rbId)
                    .addComponent(rbCodigo)
                    .addComponent(rbDataCadastro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPesquisar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btSair)
                                .addGap(155, 155, 155)
                                .addComponent(btExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btCadastrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbBiblioteca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAutor, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbId)
                    .addComponent(lblPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbCodigo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbIdioma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDataLancamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDataCadastro)))
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

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        frmLivro frmLivro = new frmLivro();
        frmLivro.setLocationRelativeTo(this);
        frmLivro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutorActionPerformed
        frmAutor frmAutor = new frmAutor();
        frmAutor.setLocationRelativeTo(this);
        frmAutor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btAutorActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (escolha == 0) {
            frmTelaBiblioteca.this.dispose();
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void cbBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBibliotecaActionPerformed
        frmTelaBiblioteca biblioteca = new frmTelaBiblioteca();

        if (cbBiblioteca.getSelectedIndex() == 0) {
            rbCodigo.setText("Código");
            rbNome.setText("Nome");
            rbAutor.setText("Autor");
            rbIdioma.setText("Idioma");
            rbDataLancamento.setText("Data de Lançamento");
            rbDataCadastro.setText("Data de Cadastro");
            rbIdioma.setVisible(true);
            rbDataLancamento.setVisible(true);
            rbDataCadastro.setVisible(true);
            try {
                for (int i = 0; i < 4; i++) {
                    tblTabela.addColumn(new TableColumn());
                }
                lController.getTableLivro();
            } catch (SQLException ex) {
                Logger.getLogger(frmTelaBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                aController.getTableAutor();
                rbCodigo.setText("Nome");
                rbNome.setText("País");
                rbAutor.setText("Data de Cadastro");
                rbIdioma.setVisible(false);
                rbDataLancamento.setVisible(false);
                rbDataCadastro.setVisible(false);

            } catch (SQLException ex) {
                Logger.getLogger(frmTelaBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cbBibliotecaActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (cbBiblioteca.getSelectedIndex() == 0) {

        } else {
            try {
                aController.delete();
                aController.getTableAutor();
            } catch (SQLException ex) {
                Logger.getLogger(frmTelaBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        aController.initViewCadastrarAutor();
        aController.getDataField();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        if (cbBiblioteca.getSelectedIndex() == 0) {

        } else {
            aController.getData();
        }
    }//GEN-LAST:event_txtPesquisarKeyReleased
  

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbBiblioteca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JRadioButton rbAutor;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbDataCadastro;
    private javax.swing.JRadioButton rbDataLancamento;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JRadioButton rbIdioma;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
