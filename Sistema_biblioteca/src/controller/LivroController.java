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
import model.Livro;
import model.LivroTableModel;
import model.dao.AutorDAO;
import model.dao.LivroDAO;
import view.frmLivro;
import view.frmTelaBiblioteca;

public class LivroController {

    private frmLivro vLivro;
    private frmTelaBiblioteca vBiblioteca;
    private LivroDAO dao;
    private AutorDAO daoa;
    private ArrayList<Livro> listaLivro;
    private ArrayList<Autor> listaAutor;

    public LivroController() {
    }

    public LivroController(frmLivro vLivro) {
        this.vLivro = vLivro;
        dao = new LivroDAO();
        daoa = new AutorDAO();
        try {
            listaAutor = daoa.readAll();
        } catch (SQLException ex) {
            Logger.getLogger(LivroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insert() {

    }

    public void ListarAutores() throws SQLException {
        listaAutor = daoa.readAll();

        for (Autor autor : listaAutor) {
            System.out.println(autor.getNome());
            vLivro.getCbAutor().addItem(autor.getNome());}
    }

}
