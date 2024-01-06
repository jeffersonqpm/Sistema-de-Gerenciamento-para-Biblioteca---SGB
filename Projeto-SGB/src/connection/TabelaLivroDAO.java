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
import model.Livro;
import model.TabelaAutor;

public class TabelaLivroDAO {

    public List<Livro> read() {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Livro> informacoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM livro");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Livro livro = new Livro();

                livro.setIdLivro(rs.getInt("idlivro"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setEditora(rs.getString("editora"));
                livro.setAnoEdicao(rs.getString("anoEdicao"));
                livro.setVolume(rs.getInt("quantidade"));
                livro.setLocal(rs.getString("local"));

                informacoes.add(livro);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TabelaAutorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return informacoes;

    }

    public void update(Livro l) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE livro SET  titulo = ?, autor = ?, editora =?, anoEdicao = ?, quantidade = ?, local =? WHERE idlivro = ?");
            stmt.setString(1, l.getTitulo());
            stmt.setString(2, l.getAutor());
            stmt.setString(3, l.getEditora());
            stmt.setString(4, l.getAnoEdicao());
            stmt.setInt(5, l.getVolume());
            stmt.setString(6, l.getLocal());
            stmt.setInt(7, l.getIdLivro());

//            stmt.setInt(2, p.getQtd());
//            stmt.setDouble(3, p.getPreco());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Livro atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
