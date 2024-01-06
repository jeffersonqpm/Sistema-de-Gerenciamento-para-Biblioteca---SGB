
package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import model.TabelaEditora;

/**
 *
 * @author Jefferson
 */
public class TabelaEditoraDAO {
    
    public List<TabelaEditora> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<TabelaEditora> informacoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM editora");
            rs = stmt.executeQuery();

            while (rs.next()) {

                TabelaEditora tabelaEditora = new TabelaEditora();

                tabelaEditora.setId(rs.getInt("ideditora"));
                tabelaEditora.setNomeEditora(rs.getString("nome"));

                informacoes.add(tabelaEditora);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TabelaAutorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return informacoes;

    }
    
     public void update(TabelaEditora e) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE editora SET nome = ? WHERE ideditora = ?");
            stmt.setString(1, e.getNomeEditora());
            stmt.setInt(2, e.getId());
//            stmt.setInt(2, p.getQtd());
//            stmt.setDouble(3, p.getPreco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
     public void delete(TabelaEditora e) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM editora WHERE ideditora = ?");
            stmt.setInt(1, e.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Editora excluída com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
