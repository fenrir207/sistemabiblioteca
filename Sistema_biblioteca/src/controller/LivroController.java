package controller;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
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
    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public LivroController() {
    }

    public LivroController(frmLivro vLivro) {
        this.vLivro = vLivro;
        daoLivro = new LivroDAO();
        daoAutor = new AutorDAO();
        try {
            listaAutor = daoAutor.readAll();
            listaLivro = daoLivro.readAll();

        } catch (SQLException ex) {
            Logger.getLogger(LivroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LivroController(frmTelaBiblioteca vBiblioteca) {
        this.vBiblioteca = vBiblioteca;
        daoLivro = new LivroDAO();
        daoAutor = new AutorDAO();
        try {
            listaLivro = daoLivro.readAll();
            listaAutor = daoAutor.readAll();
        } catch (SQLException ex) {
            Logger.getLogger(LivroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean verificarCampoVazio(String isbn, String nome, Autor autor, String idioma, String data) {
        if (isbn.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o código do livro!", "Erro no cadastro", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome do livro!", "Erro no cadastro", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (autor == null) {
            JOptionPane.showMessageDialog(null, "Informe um autor", "Erro no cadastro", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (idioma.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe um idioma!", "Erro no cadastro", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (data.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a data de lançamento!", "Erro no cadastro", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public void insert(Autor a) {
        String codigo = vLivro.getTxtCodigo().getText();
        String nome = vLivro.getTxtNomeLivro().getText();
        String autor = vLivro.getCbAutor().getSelectedItem().toString();
        String idioma = vLivro.getCbIdiomas().getSelectedItem().toString();
        String data = vLivro.getTxtDataLancamento().getText();

        if (verificarCampoVazio(codigo, nome, a, idioma, data)) {
            Livro l = new Livro();
            l.setISBN(codigo);
            l.setNome(nome);
            l.setIdioma(idioma);
            l.setAutor(a);
            l.setData_lancamento(LocalDate.parse(data, fmt));
            l.setData_criacao(LocalDate.now());

            try {
                daoLivro.insert(l);
                limparCampos();
            } catch (SQLException ex) {
                Logger.getLogger(AutorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void getTableLivro() throws SQLException {
        listaLivro = daoLivro.readAll();
        LivroTableModel lModel = new LivroTableModel(listaLivro);
        
        System.out.println(listaLivro);

        for (int i = 0; i < lModel.getColumnCount(); i++) {
            vBiblioteca.getTblTabela().getColumnModel().getColumn(i).setHeaderValue(lModel.getColumnName(i));
        }
        
        vBiblioteca.getTblTabela().setModel(lModel);
    }

    public ArrayList ListarAutores() throws SQLException {

        daoLivro = new LivroDAO();
        daoAutor = new AutorDAO();
        listaAutor = daoAutor.readAll();
        for (Autor autor : listaAutor) {
            System.out.println(autor.getNome());
            vLivro.getCbAutor().addItem(autor.getNome());
        }

        return listaAutor;
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

    public void Update(Autor a) {
        String codigo = vLivro.getTxtCodigo().getText();
        String nome = vLivro.getTxtNomeLivro().getText();
        String autor = vLivro.getTxtNomeLivro().getText();
        String idioma = vLivro.getTxtNomeLivro().getText();
        String data = vLivro.getTxtDataLancamento().getText();
        String id = vLivro.getTxtId().getText();
        if (verificarCampoVazio(codigo, nome, a, idioma, data) && !id.isEmpty()) {
            Livro l = new Livro();

            l.setId(Integer.parseInt(id));
            l.setISBN(codigo);
            l.setNome(nome);
            l.setAutor(a);
            l.setIdioma(idioma);
            l.setData_lancamento(LocalDate.parse(data));

            try {
                daoLivro.update(l);
                limparCampos();
            } catch (SQLException ex) {
                Logger.getLogger(AutorController.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }

    public void limparCampos() {
        vLivro.getTxtNomeLivro().setText("");
        vLivro.getCbAutor().setSelectedIndex(0);
        vLivro.getCbIdiomas().setSelectedIndex(0);

        vLivro.getTxtNomeLivro().requestFocus();
    }

}
