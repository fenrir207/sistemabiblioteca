/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Autor;
import model.Livro;

/**
 *
 * @author Aluno
 */
public class LivroDAO implements DAO {
// CRUD create (criar)/insert(inserir)

    @Override
    public void insert(Object o) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            Livro livro = (Livro) o;
            stmt = con.prepareStatement("INSERT INTO tb_livros (id_autor, isbn_livro, nome_livro, idioma_livro, data_lancamento_livro, data_criacao_livro)VALUES(?,?,?,?,?,?)");
            stmt.setInt(1, livro.getAutor().getId());
            stmt.setString(2, livro.getISBN());
            stmt.setString(3, livro.getNome());
            stmt.setString(4, livro.getIdioma());
            stmt.setDate(5,Date.valueOf(livro.getData_lancamento()));
            stmt.setDate(6, Date.valueOf(LocalDate.now()));
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
//CRUD read (ler/preencher)

    @Override
    public ArrayList readAll() throws SQLException{
        //instancia a conexao com banco de dados
        Connection con = ConnectionFactory.getConnection();
        //instancia os argumentos do banco
        PreparedStatement stmt = null;

        ResultSet rs = null;
        //instancia novo arraylist
        ArrayList<Livro> livros = new ArrayList<>();
        //tentativa do comando read
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_livros tl JOIN tb_autores ta on tl.id_autor = ta.id_autor");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Autor a = new Autor();
                Livro l = new Livro();
                
                a.setId(rs.getInt("ta.id_autor"));
                a.setNome(rs.getString("ta.nome_autor"));
                a.setPais(rs.getString("ta.pais_autor"));
                a.setDataCriacao(rs.getDate("ta.data_criacao").toLocalDate());
                

                l.setId(rs.getInt("tl.id_livro"));
                l.setISBN(rs.getString("tl.isbn_livro"));
                l.setNome(rs.getString("tl.nome_livro"));
                l.setAutor(a);
                l.setIdioma(rs.getString("tl.idioma_livro"));
                l.setData_lancamento(rs.getDate("tl.data_lancamento_livro").toLocalDate());
                l.setData_criacao(rs.getDate("data_criacao_livro").toLocalDate());

                livros.add(l);
            }

        } //tratamento de exceção 
        catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        } //finalmente fecha a conexao com o banco 
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        //retorna array list
        return livros;

    }
// CRUD search (pesquisar)

    @Override
    public ArrayList<Livro> search(String desc) throws SQLException {
        //conexao com o banco de dados
        Connection con = ConnectionFactory.getConnection();
        //instancia os argumentos do banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;
        // instancia novo ArrayList 
        ArrayList<Livro> livros = new ArrayList<>();
        //tentativa do comando readForDesc
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_livros tl JOIN tb_autores ta ON tl.id_autor = ta.id_autor WHERE nome_livro LIKE ?");
            //objeto(palavra/frase) da pesquisa
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Autor a = new Autor();
                Livro l = new Livro();
                
                a.setId(rs.getInt("ta.id_autor"));
                a.setNome(rs.getString("ta.nome_autor"));
                a.setPais(rs.getString("ta.pais_autor"));
                a.setDataCriacao(rs.getDate("ta.data_criacao").toLocalDate());

                l.setId(rs.getInt("id_livro"));
                l.setISBN(rs.getString("isbn_livro"));
                l.setNome(rs.getString("nome_livro"));
                l.setAutor(a);
                l.setIdioma(rs.getString("idioma_livro"));
                l.setData_lancamento(rs.getDate("data_lancamento_livro").toLocalDate());
                l.setData_criacao(rs.getDate("data_criacao_livro").toLocalDate());
                livros.add(l);
            }
            //tratamento de exceção
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //finalmente fecha a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        //retorna o array list
        return livros;

    }

    //CRUD update (atualizar) 
    @Override
    public void update(Object o) throws SQLException{
        //instancia a conexao com o banco de dados
        Connection con = ConnectionFactory.getConnection();
        //instancia os argumentos do banco de dados
        PreparedStatement stmt = null;
        //tentativa do comando update
        try {
            Livro l = (Livro) o;
            stmt = con.prepareStatement("UPDATE tb_livros SET isbn_livro = ? ,nome_livro = ? ,id_autor = ? ,"
                    + "idioma_livro = ? ,data_lancamento_livro = ? ,data_criacao_livro = ? WHERE id_livro = ?");
            
            stmt.setString(1, l.getISBN());
            stmt.setString(2, l.getNome());
            stmt.setInt(3, l.getAutor().getId());
            stmt.setString(4, l.getIdioma());
            stmt.setDate(5, Date.valueOf(l.getData_lancamento()));
            stmt.setDate(6, Date.valueOf(LocalDate.now()));
            stmt.setInt(7, l.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } //tratamento de exceção //tratamento de exceção
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } //finalmente fecha a conexao com o banco
        finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
//CRUD DROP/DELETE (deletar)

    @Override
    public void delete(int id) throws SQLException {
        //instancia nova conexao com o banco de dados
        Connection con = ConnectionFactory.getConnection();
        //instancia os argumentos do banco de dados
        PreparedStatement stmt = null;
        //tentativa de executar o comando
        try {
            Livro livro = new Livro();
            stmt = con.prepareStatement("DELETE FROM tb_livros WHERE id_livro = ?");
            stmt.setInt(1, livro.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } //tratamento de exceção da tentativa //tratamento de exceção da tentativa
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } //finalmente fecha a conexao com o banco 
        finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

  
}
