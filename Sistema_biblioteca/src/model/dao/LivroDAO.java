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
    public void insert() throws SQLException{
        
        LocalDate date;
        
        
        

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            Livro livro = new Livro();
            Date nahnha = Date.valueOf(livro.getData_lancamento());
            stmt = con.prepareStatement("INSERT INTO tb_livros (isbn_livro ,nome_livro ,autor_livro ,idioma_livro ,)VALUES(?,?,?)");
            stmt.setString(1, livro.getISBN());
            stmt.setString(2, livro.getNome());
            stmt.setString(3, livro.getAutor().toString());
            stmt.setString(4, livro.getIdioma().toString());
            stmt.setDate(5, nahnha);
            

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
        ArrayList<Livro> carros = new ArrayList<>();
        //tentativa do comando read
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_veiculo");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Livro c = new Livro();

                c.setId(rs.getInt("id_veiculo"));
                c.setPlaca(rs.getString("placa"));
                c.setModelo(rs.getString("modelo"));

                carros.add(c);
            }

        } //tratamento de exceção //tratamento de exceção
        catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        } //finalmente fecha a conexao com o banco //finalmente fecha a conexao com o banco
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        //retorna array list
        return carros;

    }
// CRUD readfordesc (pesquisar)

    @Override
    public ArrayList<Livro> search(String desc) throws SQLException {
        //conexao com o banco de dados
        Connection con = ConnectionFactory.getConnection();
        //instancia os argumentos do banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;
        // instancia novo ArrayList 
        ArrayList<Livro> carros = new ArrayList<>();
        //tentativa do comando readForDesc
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_veiculo WHERE ? LIKE ?");
            //fazer um if-else com os radio buttons para filtrar o conteúdo!!!
            stmt.setString(1, "%" + desc + "%");
            //objeto(palavra/frase) da pesquisa
            stmt.setString(2, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Livro c = new Livro();

                c.setId(rs.getInt("id_veiculo"));
                c.setPlaca(rs.getString("placa"));
                c.setModelo(rs.getString("modelo"));
                c.setCor(rs.getString("cor"));
                carros.add(c);
            }
            //tratamento de exceção
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //finalmente fecha a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        //retorna o array list
        return carros;

    }

    //CRUD update (atualizar) 
    @Override
    public void update() throws SQLException{
        //instancia a conexao com o banco de dados
        Connection con = ConnectionFactory.getConnection();
        //instancia os argumentos do banco de dados
        PreparedStatement stmt = null;
        //tentativa do comando update
        try {
            Livro carro = new Livro();
            stmt = con.prepareStatement("UPDATE tb_veiculo SET placa = ? ,modelo = ?,cor = ? WHERE id_carro = ?");
            stmt.setString(1, carro.getPlaca());
            stmt.setString(2, carro.getModelo());
            stmt.setString(3, carro.getCor());
            stmt.setInt(4, carro.getId());

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
    public void delete(String where) throws SQLException {
        //instancia nova conexao com o banco de dados
        Connection con = ConnectionFactory.getConnection();
        //instancia os argumentos do banco de dados
        PreparedStatement stmt = null;
        //tentativa de executar o comando
        try {
            Livro carro = new Livro();
            stmt = con.prepareStatement("DELETE FROM tb_veiculo WHERE id_veiculo = ?");
            stmt.setInt(1, carro.getId());

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
