/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aluno
 */
public class LivroTableModel extends AbstractTableModel {

    public LivroTableModel(ArrayList<Livro> lista) {
        this.livros = lista;
    }

    private final String[] colunas = {
        "Placa", "Modelo", "Cor"
    };
    private final ArrayList<Livro> livros;

    public LivroTableModel() {
        livros = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return livros.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Livro l = livros.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return l.getISBN();
            case 1:
                return l.getNome();
            case 2:
                return l.getIdioma();
            case 3:
                return l.getData_lancamento();
            case 4:
                return l.getData_criacao();
                
        }
        return l;
    }

    public void addRow(Livro c) {
        livros.add(c);
    }

    @Override
    public String getColumnName(int index) {
        return colunas[index];
    }

    @Override
    public String toString() {
        return "TableLivros{" + "colunas=" + colunas + ", livros=" + livros + '}';
    }

}
