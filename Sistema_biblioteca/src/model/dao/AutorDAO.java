
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Autor;

/**
 *
 * @author Aluno
 */
public class AutorDAO implements DAO {

    @Override
    public void insert() throws SQLException{

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            Autor cliente = new Autor();
            stmt = con.prepareStatement("INSERT INTO tb_usuario (nome,endereco,cpf,telefone,email)VALUES(?,?,?,?,?)");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getEmail());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    @Override
    public ArrayList readAll() throws SQLException{

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Autor> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Autor c = new Autor();

                c.setId(rs.getInt("id_usuario"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                c.setCpf(rs.getString("cpf"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
                clientes.add(c);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AutorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

    @Override
    public ArrayList search(String desc) throws SQLException{

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Autor> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tb_usuario WHERE nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Autor c = new Autor();

                c.setId(rs.getInt("id_usuario"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                c.setCpf(rs.getString("cpf"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
                clientes.add(c);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AutorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

    }
    
    @Override
    public void update() throws SQLException{

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        //tentativa do comando UPDATE
        try {
            Autor cliente = new Autor();
            stmt = con.prepareStatement("UPDATE tb_usuario SET nome = ? ,endereco = ? ,cpf = ? ,telefone = ? ,email = ? WHERE id_cliente = ?");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getEmail());
            stmt.setInt(6, cliente.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } 
        //tratamento de exceção SQL
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }
        //finalmente fecha a conexao com o banco
        finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    @Override
    public void delete(String where) throws SQLException{

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            Autor cliente = new Autor();
            stmt = con.prepareStatement("DELETE FROM tb_usuario WHERE id = ?");
            stmt.setInt(1, cliente.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
