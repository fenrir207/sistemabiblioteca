package controller;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import model.Autor;
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

    public void insert() {

    }

    public void ListarAutores() throws SQLException {

        String country[] = {"India", "Aus", "U.S.A", "England", "Newzealand"};

        daoLivro = new LivroDAO();
        daoAutor = new AutorDAO();
        listaAutor = daoAutor.readAll();
        for (Autor autor : listaAutor) {
            System.out.println(autor.getNome());
            vLivro.getCbAutor().addItem(autor.getNome());
        }
    }

    public void Update() {
        String nome = vLivro.getTxtNomeLivro().getText();
        String autor = vLivro.getTxtNomeLivro().getText();
        String idioma = vLivro.getTxtNomeLivro().getText();
        String data = vLivro.getTxtDataLancamento().getText();
        String id = vLivro.getTxtId().getText();
        if (verificarCampoVazio(nome, autor, idioma) && !id.isEmpty()) {
            Livro l = new Livro();
            l.setId(Integer.parseInt(id));
            l.setNome(nome);
            l.setAutor(autor);
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
