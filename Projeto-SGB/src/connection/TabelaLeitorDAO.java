
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
import model.Leitor;

public class TabelaLeitorDAO {
    
     public List<Leitor> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Leitor> informacoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM leitor");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Leitor leitor = new Leitor();

                leitor.setIdLeitor(rs.getInt("idleitor"));
                leitor.setNome(rs.getString("nome"));
                leitor.setDataNascimento(rs.getString("dataNascimento"));
                leitor.setCpf(rs.getString("cpf"));
                leitor.setTelefone(rs.getString("telefone"));
                leitor.setEmail(rs.getString("email"));
                leitor.setEndereco(rs.getString("endereco"));
                leitor.setNumero(rs.getString("numero"));
                leitor.setBairro(rs.getString("bairro"));
                leitor.setCidade(rs.getString("cidade"));
                leitor.setUf(rs.getString("uf"));
                leitor.setCep(rs.getString("cep"));
                leitor.setComplemento(rs.getString("complemento"));
                leitor.setUsuario(rs.getString("usuario"));
               // leitor.setSenha(rs.getString("senha"));

                informacoes.add(leitor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TabelaAutorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return informacoes;

    }
     
       public void update(Leitor l) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE leitor SET nome = ?, dataNascimento = ?,cpf = ?, telefone = ?, email = ?, endereco = ?, numero = ?, bairro = ?, cidade = ?, uf = ?, cep = ?, complemento = ?, usuario = ?, senha = ? WHERE idleitor = ?");
            stmt.setString(1, l.getNome());
            stmt.setString(2 ,l.getDataNascimento());
            stmt.setString(3, l.getCpf());
            stmt.setString(4, l.getTelefone());
            stmt.setString(5, l.getEmail());
            stmt.setString(6, l.getEndereco());
            stmt.setString(7, l.getNumero());
            stmt.setString(8, l.getBairro());
            stmt.setString(9, l.getCidade());
            stmt.setString(10, l.getUf());
            stmt.setString(11, l.getCep());
            stmt.setString(12, l.getComplemento());
            stmt.setString(13, l.getUsuario());
            stmt.setString(14, l.getSenha());
            stmt.setInt( 15,l.getId());


            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Leitor atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
       

}
