
package controller;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Autor;
import model.AutorTableModel;
import model.dao.AutorDAO;
import view.frmAutor;
import view.frmTelaBiblioteca;


public class AutorController {
    private frmAutor vAutor;
    private frmTelaBiblioteca vBiblioteca;
    private AutorDAO dao;
    private ArrayList<Autor> listaAutor;
    
    public AutorController(frmAutor vAutor){
        this.vAutor = vAutor;
        dao = new AutorDAO();
    }
    
    public AutorController(frmTelaBiblioteca vBiblioteca){
        this.vBiblioteca = vBiblioteca;
        dao = new AutorDAO();
        try {
            listaAutor = dao.readAll();
        } catch (SQLException ex) {
            Logger.getLogger(AutorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(){
        String nome = vAutor.getTxtNome().getText();
        String pais = vAutor.getCbPais().getSelectedItem().toString();
        
        if(verificarCampoVazio(nome, pais)){
            Autor a = new Autor();
            a.setNome(nome);
            a.setPais(pais);
            a.setDataCriacao(LocalDate.now());
            
            try {
                dao.insert(a);
                limparCampos();
            } catch (SQLException ex) {
                Logger.getLogger(AutorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void update(){
        String nome = vAutor.getTxtNome().getText();
        String pais = vAutor.getCbPais().getSelectedItem().toString();
        System.out.println(pais);
        String id = vAutor.getTxtId().getText();
        if(verificarCampoVazio(nome, pais) && !id.isEmpty()){
            Autor a = new Autor();
            a.setId(Integer.parseInt(id));
            a.setNome(nome);
            a.setPais(pais);
            a.setDataCriacao(LocalDate.now());
            
            try {
                dao.update(a);
                limparCampos();
            } catch (SQLException ex) {
                Logger.getLogger(AutorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void delete() throws SQLException{
        int row;
        row = vBiblioteca.getTblTabela().getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Nenhum autor selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            int id = Integer.parseInt(vBiblioteca.getTblTabela().getValueAt(row, 0).toString());
            String nome = vBiblioteca.getTblTabela().getValueAt(row, 1).toString();
            boolean opc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir " + nome + "?","Excluir",
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == 0;
            
            if(opc){
                dao.delete(id);
            }else{
                JOptionPane.showMessageDialog(null, "Operação cancelada!");
            }
        }
    }
    
    public void getTableAutor() throws SQLException{
        listaAutor = dao.readAll();
        AutorTableModel aModel = new AutorTableModel(listaAutor);
        
        for (int i = 0; i < aModel.getColumnCount(); i++) {
            vBiblioteca.getTblTabela().getColumnModel().getColumn(i).setHeaderValue(aModel.getColumnName(i));
        }
        
        for (Autor autor : listaAutor) {
            aModel.addRow(autor);
        }
        vBiblioteca.getTblTabela().setModel(aModel);
    }
    
    public void getTableAutor(String search) throws SQLException{
        listaAutor = dao.search(search);
        AutorTableModel aModel = new AutorTableModel(listaAutor);
        
        for (int i = 0; i < aModel.getColumnCount(); i++) {
            vBiblioteca.getTblTabela().getColumnModel().getColumn(i).setHeaderValue(aModel.getColumnName(i));
        }
        
        for (Autor autor : listaAutor) {
            aModel.addRow(autor);
        }
        vBiblioteca.getTblTabela().setModel(aModel);
    }
    
    public void getDataField(){
        int row = vBiblioteca.getTblTabela().getSelectedRow();
        
        if(row != -1){
            vAutor.getTxtId().setText(String.valueOf(listaAutor.get(row).getId()));
            vAutor.getTxtNome().setText(listaAutor.get(row).getNome());
            vAutor.getCbPais().setSelectedItem(listaAutor.get(row).getPais());
            
            vAutor.getBtCadastrar().setText("Alterar");
            vAutor.getLblCadastrar().setText("Alterar autor");
        }
    }
    
    public void getData(){
        
        if(vBiblioteca.getTxtPesquisar().getText().trim().isEmpty()){
            try {
                getTableAutor();
            } catch (SQLException ex) {
                Logger.getLogger(AutorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                getTableAutor(vBiblioteca.getTxtPesquisar().getText());
            } catch (SQLException ex) {
                Logger.getLogger(AutorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }
    
    public boolean verificarCampoVazio(String nome, String pais){
        if(nome.isEmpty()){
            JOptionPane.showMessageDialog(null, "Informe o nome do autor!", "Erro no cadastro", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(pais.isEmpty()){
            JOptionPane.showMessageDialog(null, "Informe o país!", "Erro no cadastro", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    public void verificarQtdCaracterNome(KeyEvent evt, String nome){
        if(nome.length() >= 50){
            evt.consume();
        }
    }
    
    public void verificarQtdCaracterPais(KeyEvent evt, String pais){
        if(pais.length() >= 40){
            evt.consume();
        }
    }
    
    public void limparCampos(){
        vAutor.getTxtNome().setText("");
        vAutor.getCbPais().setSelectedIndex(0);
        vAutor.getTxtNome().requestFocus();
    }
    
    public void initViewCadastrarAutor(){
        vAutor = new frmAutor();
        vAutor.setLocationRelativeTo(null);
        vAutor.setVisible(true);
        
        vBiblioteca.dispose();
    }
}
