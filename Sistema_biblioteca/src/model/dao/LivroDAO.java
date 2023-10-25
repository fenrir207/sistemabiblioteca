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
            Livro livro = new Livro();
            stmt = con.prepareStatement("INSERT INTO tb_livros (isbn_livro ,nome_livro ,autor_livro ,idioma_livro ,data_lancamento_livro ,data_criacao_livro)VALUES(?,?,?,?,?,?)");
            stmt.setString(1, livro.getISBN());
            stmt.setString(2, livro.getNome());
            stmt.setString(3, livro.getAutor());
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
            stmt = con.prepareStatement("SELECT * FROM tb_veiculo");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Livro c = new Livro();
                
                
     

                c.setId(rs.getInt("id_livro"));
                c.setISBN(rs.getString("isbn_livro"));
                c.setNome(rs.getString("nome_livro"));
                c.setAutor(rs.getString("autor_livro"));
                c.setIdioma(rs.getString("idioma_livro"));
                c.setData_lancamento(rs.getDate("data_lancamento_livro").toLocalDate());
                c.setData_criacao(rs.getDate("data_criacao_livro").toLocalDate());

                livros.add(c);
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
            stmt = con.prepareStatement("SELECT * FROM tb_livros WHERE nome_livro LIKE ?");
            //objeto(palavra/frase) da pesquisa
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Livro c = new Livro();

                c.setId(rs.getInt("id_livro"));
                c.setISBN(rs.getString("isbn_livro"));
                c.setNome(rs.getString("nome_livro"));
                c.setAutor(rs.getString("autor_livro"));
                c.setIdioma(rs.getString("idioma_livro"));
                c.setData_lancamento(rs.getDate("data_lancamento_livro").toLocalDate());
                c.setData_criacao(rs.getDate("data_criacao_livro").toLocalDate());
                livros.add(c);
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
            Livro c = new Livro();
            stmt = con.prepareStatement("UPDATE tb_livros SET isbn_livro = ? ,nome_livro = ? ,autor_livro = ? ,"
                    + "idioma_livro = ? ,data_lancamento_livro = ? ,data_criacao_livro = ? WHERE id_carro = ?");
            
            stmt.setString(1, c.getISBN());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getAutor());
            stmt.setString(4, c.getIdioma());
            stmt.setDate(5, Date.valueOf(c.getData_lancamento()));
            stmt.setDate(6, Date.valueOf(LocalDate.now()));
            stmt.setInt(7, c.getId());

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
