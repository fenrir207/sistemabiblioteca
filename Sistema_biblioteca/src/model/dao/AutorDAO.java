package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Autor;
import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class AutorDAO implements DAO {

    @Override
    public void insert(Object o) throws SQLException {
        Autor autor = (Autor) o;
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tb_autores (nome_autor,pais_autor,data_criacao)VALUES(?,?,?)");
            stmt.setString(1, autor.getNome());
            stmt.setString(2, autor.getPais());
            stmt.setString(3, autor.getDataCriacao().toString());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    @Override
    public ArrayList readAll() throws SQLException {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Autor> listaAutor = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tb_autores");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Autor a = new Autor();

                a.setId(rs.getInt("id_autor"));
                a.setNome(rs.getString("nome_autor"));
                a.setPais(rs.getString("pais_autor"));
                a.setDataCriacao(rs.getDate("data_criacao").toLocalDate());
                listaAutor.add(a);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AutorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaAutor;

    }

    @Override
    public ArrayList search(String desc) throws SQLException {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Autor> listaAutor = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tb_autores WHERE nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Autor a = new Autor();

                a.setId(rs.getInt("id_autor"));
                a.setNome(rs.getString("nome_autor"));
                a.setPais(rs.getString("pais_autor"));
                a.setLivros(rs.getString("livros_autor"));
                a.setDataCriacao(rs.getDate("data_criacao_autor").toLocalDate());
                listaAutor.add(a);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AutorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaAutor;

    }

    @Override
    public void update(Object o) throws SQLException {
        Autor autor = (Autor) o;
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        //tentativa do comando UPDATE
        try {

            stmt = con.prepareStatement("UPDATE tb_autores SET nome_autor = ? ,pais_autor = ?,data_criacao = ? WHERE id_autor = ?");
            stmt.setString(1, autor.getNome());
            stmt.setString(2, autor.getPais());
            stmt.setDate(3, Date.valueOf(LocalDate.now()));
            stmt.setInt(4, autor.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } //tratamento de exceção SQL
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } //finalmente fecha a conexao com o banco
        finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    @Override
    public void delete(int id) throws SQLException {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tb_autores WHERE id_autor = " + id);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
