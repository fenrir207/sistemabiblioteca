
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
        String pais = vAutor.getTxtPais().getText();
        
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
        vAutor.getTxtPais().setText("");
        
        vAutor.getTxtNome().requestFocus();
    }
}
