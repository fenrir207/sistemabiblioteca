/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Livro {
    
    
    private int id;
    private String isbn;
    private String nome;
    private List autor;
    private List idioma;
    private LocalDate data_lancamento;
    private LocalDate data_criacao;
    
    private ArrayList<LivroTableModel> livros;

    public List getAutor() {
        return autor;
    }

    public void setAutor(List autor) {
        this.autor = autor;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String ISBN) {
        this.isbn = ISBN;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List getIdioma() {
        return idioma;
    }

    public void setIdioma(List idioma) {
        this.idioma = idioma;
    }

    public LocalDate getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(LocalDate data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public LocalDate getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDate data_criacao) {
        this.data_criacao = data_criacao;
    }

    public ArrayList<LivroTableModel> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<LivroTableModel> livros) {
        this.livros = livros;
    }
    
    
    public Livro() {
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", isbn=" + isbn + ", nome=" + nome + ", autor=" + autor + ", idioma=" + idioma + ", data_lancamento=" + data_lancamento + ", data_criacao=" + data_criacao + ", livros=" + livros + '}';
    }
    


}
