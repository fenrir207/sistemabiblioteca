/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public interface DAO {
    //metodo adicionar/inserir

    public void insert(Object o) throws SQLException;

    // metdodo editar/atualizar
    public void update(Object o) throws SQLException;

    // metodo excluir/deletar
    public void delete(String where) throws SQLException;

    //metodo listarTodos
    public ArrayList readAll() throws SQLException;

    //metodo para pesquisar dados
    public ArrayList search(String desc) throws SQLException;

}
