package connection;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.TabelaAutor;

/**
 *
 * @author Samuelson
 */
public class TabelaAutorDAO {

    public void create(TabelaAutor p) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produto (descricao,qtd,preco)VALUES(?,?,?)");
            stmt.setString(1, p.getNome());
//            stmt.setInt(2, p.getQtd());
//            stmt.setDouble(3, p.getPreco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
//******************************************************************************************************************

    public List<TabelaAutor> read() {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<TabelaAutor> informacoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM autor");
            rs = stmt.executeQuery();

            while (rs.next()) {

                TabelaAutor tabelaAutor = new TabelaAutor();

                tabelaAutor.setId(rs.getInt("idautor"));
                tabelaAutor.setNome(rs.getString("nome"));
//                tabela.setQtd(rs.getInt("qtd"));
//                tabela.setPreco(rs.getDouble("preco"));
                informacoes.add(tabelaAutor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TabelaAutorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return informacoes;

    }

    public List<TabelaAutor> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<TabelaAutor> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE descricao LIKE ?");
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                TabelaAutor tabela = new TabelaAutor();

                tabela.setId(rs.getInt("id"));
                tabela.setNome(rs.getString("descricao"));
//                tabela.setQtd(rs.getInt("qtd"));
//                tabela.setPreco(rs.getDouble("preco"));
                produtos.add(tabela);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TabelaAutorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }

    public void update(TabelaAutor p) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE autor SET nome = ? WHERE idautor = ?");
            stmt.setString(1, p.getNome());
//            stmt.setInt(2, p.getQtd());
//            stmt.setDouble(3, p.getPreco());
            stmt.setInt(2, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void delete(TabelaAutor p) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM autor WHERE idautor = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Autor excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
