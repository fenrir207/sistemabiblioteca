package controller;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import model.Autor;
import model.AutorTableModel;
import model.Livro;
import model.LivroTableModel;
import model.dao.AutorDAO;
import model.dao.LivroDAO;
import view.frmLivro;
import view.frmTelaBiblioteca;

public class LivroController {

    private frmLivro vLivro;
    private frmTelaBiblioteca vBiblioteca;
    private LivroDAO daoLivro;
    private AutorDAO daoAutor;
    private ArrayList<Livro> listaLivro;
    private ArrayList<Autor> listaAutor;

    public LivroController() {
    }

    public LivroController(frmLivro vLivro) {
        this.vLivro = vLivro;
        daoLivro = new LivroDAO();
        daoAutor = new AutorDAO();
        try {
            listaAutor = daoAutor.readAll();
        } catch (SQLException ex) {
            Logger.getLogger(LivroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean verificarCampoVazio(String codigo, String nome, String autor, String idioma, String data) {
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome do autor!", "Erro no cadastro", JOptionPane.WARNING_MESSAGE);

        }
        return false;
    }

    public void insert() {
        String codigo = vLivro.getTxtCodigo().getText();
        String nome = vLivro.getTxtNomeLivro().getText();
        String autor = vLivro.getCbAutor().getSelectedItem().toString();
        String idioma = vLivro.getCbIdiomas().getSelectedItem().toString();
        String data = vLivro.getTxtDataLancamento().getText();

        if (verificarCampoVazio(codigo, nome, autor, idioma, data)) {
            Livro l = new Livro();
            l.setISBN(codigo);
            l.setNome(nome);
            l.setAutor(autor);
            l.setData_lancamento(LocalDate.parse(data));
            l.setData_criacao(LocalDate.now());

            try {
                daoLivro.insert(l);
               // limparCampos();
            } catch (SQLException ex) {
                Logger.getLogger(AutorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    public void getTableLivro() throws SQLException{
        listaLivro = daoLivro.readAll();
        LivroTableModel aModel = new LivroTableModel(listaLivro);
        
        for (int i = 0; i < aModel.getColumnCount(); i++) {
            vBiblioteca.getTblTabela().getColumnModel().getColumn(i).setHeaderValue(aModel.getColumnName(i));
        }
        
        for (Livro livro : listaLivro) {
            aModel.addRow(livro);
        }
        vBiblioteca.getTblTabela().setModel(aModel);
    }


    public void ListarAutores() throws SQLException {

        daoLivro = new LivroDAO();
        daoAutor = new AutorDAO();
        listaAutor = daoAutor.readAll();
        for (Autor autor : listaAutor) {
            System.out.println(autor.getNome());
            vLivro.getCbAutor().addItem(autor.getNome());
        }
    }


    public void delete() throws SQLException {
        int row;
        row = vBiblioteca.getTblTabela().getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum livro selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            int id = Integer.parseInt(vBiblioteca.getTblTabela().getValueAt(row, 0).toString());
            String nome = vBiblioteca.getTblTabela().getValueAt(row, 1).toString();
            boolean opc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir " + nome + "?", "Excluir",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0;

            if (opc) {
                daoLivro.delete(id);
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada!");
            }
        }
    }

}
