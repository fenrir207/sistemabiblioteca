package view;

import javax.swing.JOptionPane;
import controller.LivroController;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Autor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Aluno
 */
public class frmLivro extends javax.swing.JFrame {

    LivroController lc;
    ArrayList<Autor> listaAutor;
    
    

    /**
     * Creates new form frmLivro
     */
    public frmLivro() {
        initComponents();
        lc = new LivroController(this);
        try {
            listaAutor = lc.ListarAutores();
        } catch (SQLException ex) {
            Logger.getLogger(frmLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    public JButton getBtnVoltar() {
        return btnVoltar;
    }

    public JComboBox<String> getCbIdiomas() {
        return cbIdiomas;
    }

    public JComboBox<String> getCbAutor() {
        return cbAutor;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public JLabel getLblAutor() {
        return lblAutor;
    }

    public JLabel getLblCodigo() {
        return lblCodigo;
    }

    public JLabel getLblDataLancamento() {
        return lblDataLancamento;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public JLabel getLblIdiomas() {
        return lblIdiomas;
    }

    public JLabel getLblNomeLivro() {
        return lblNomeLivro;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public JTextField getTxtDataLancamento() {
        return txtDataLancamento;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtNomeLivro() {
        return txtNomeLivro;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNomeLivro = new javax.swing.JLabel();
        txtNomeLivro = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        lblIdiomas = new javax.swing.JLabel();
        lblDataLancamento = new javax.swing.JLabel();
        txtDataLancamento = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        cbIdiomas = new javax.swing.JComboBox<>();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cbAutor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastrar Livro");

        lblNomeLivro.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        lblNomeLivro.setText("Nome :");

        lblAutor.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        lblAutor.setText("Autor:");

        lblIdiomas.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        lblIdiomas.setText("Idioma:");

        lblDataLancamento.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        lblDataLancamento.setText("Data de Lançamento:");

        btnCadastrar.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        cbIdiomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Português", "Inglês", "Espanhol" }));

        lblId.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        lblId.setText("ID :");

        txtId.setEditable(false);

        lblCodigo.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        lblCodigo.setText("Código");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIdiomas, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                            .addComponent(cbIdiomas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomeLivro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastrar))
                            .addComponent(txtDataLancamento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDataLancamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigo)
                            .addComponent(cbAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60))))
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIdiomas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDataLancamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnCadastrar))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        frmTelaBiblioteca frmTelaBiblioteca = new frmTelaBiblioteca();
        frmTelaBiblioteca.setLocationRelativeTo(this);
        frmTelaBiblioteca.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if (txtCodigo.getText().matches("^[a-zA-Z]+$")) {
            JOptionPane.showMessageDialog(null, "Você só Pode Cadastrar Números!!", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtCodigo.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "Você Atingiu o Máximo de Números!!!", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seu Código Está Vazio!!", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtNomeLivro.getText().matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Você só Pode Cadastrar Caracteres!!", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtNomeLivro.getText().length() > 60) {
            JOptionPane.showMessageDialog(null, "Você Atingiu o Máximo de Caracteres no Nome!!!", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtNomeLivro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O Nome não Pode Estar Vazio!!", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbAutor.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Você Deve Selecionar Algum Autor!!!", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbIdiomas.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Você Deve Selecionar Algum Idioma!!!", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        } else if (!txtDataLancamento.getText().matches("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$")) {
            JOptionPane.showMessageDialog(null, "O formato da data deve ser dd/mm/aaaa", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
        }else{
            lc.insert(listaAutor.get(cbAutor.getSelectedIndex()));
        }
    
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmLivro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLivro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLivro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLivro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmLivro frmLivro = new frmLivro();
                frmLivro.setLocationRelativeTo(frmLivro);
                frmLivro.setVisible(true);
                frmLivro.getLblId().setVisible(false);
                frmLivro.getTxtId().setVisible(false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbAutor;
    private javax.swing.JComboBox<String> cbIdiomas;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataLancamento;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdiomas;
    private javax.swing.JLabel lblNomeLivro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDataLancamento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeLivro;
    // End of variables declaration//GEN-END:variables
}
