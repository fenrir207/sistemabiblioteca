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
public class AutorTableModel extends AbstractTableModel {

    private final String[] colunas = {
        "Nome", "País", "Livros", "Data de Criação"
    };
    private final ArrayList<Autor> autores;

    public AutorTableModel(ArrayList<Autor> listaAutor) {
        autores = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return autores.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Autor autor = autores.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return autor.getNome();
            case 1:
                return autor.getPais();
            case 2:
                return autor.getLivros();
            case 3:
                return autor.getData_criacao();
        }
        return autor;
    }

    public void addRow(Autor autor) {
        autores.add(autor);
    }

    @Override
    public String getColumnName(int index) {
        return colunas[index];
    }

    @Override
    public String toString() {
        return "TableLivros{" + "colunas=" + colunas + ", livros=" + autores + '}';
    }

}
