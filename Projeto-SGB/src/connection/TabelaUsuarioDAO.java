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

import model.Usuario;

/**
 *
 * @author Jefferson
 */
public class TabelaUsuarioDAO {

    public List<Usuario> read() {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> informacoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setIdUsuario(rs.getInt("idusuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setNomeUsuario(rs.getString("usuario"));
//                usuario.setNivelHierarquico(rs.getString("nivelHierarquico"));
                usuario.setNivelHierarquico(rs.getString("nivelHierarquico"));

                informacoes.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TabelaAutorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return informacoes;

    }

    public void update(Usuario u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE usuario SET Nome = ?, usuario = ?, senha = ?, nivelHierarquico = ?  WHERE idusuario = ?");
            
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getNomeUsuario());
            stmt.setString(3, u.getSenha());
            stmt.setString(4, u.getNivelHierarquico());
            stmt.setInt(5, u.getIdUsuario());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário tualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void delete(Usuario u) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM usuario WHERE idusuario = ?");
            stmt.setInt(1, u.getIdUsuario());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
