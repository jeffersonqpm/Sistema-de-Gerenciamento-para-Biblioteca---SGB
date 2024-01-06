
package model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ClienteDao {
    
    Connection conn;
    ResultSet rs;
    
    
        public ResultSet autenticacaoCliente(Leitor leitor) {
        try {
            conn = new ConexaoDAO().conectaBd();
            
            String sql = "SELECT * FROM leitor WHERE usuario = ? AND senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,leitor.getUsuario());
            pstm.setString(2,leitor.getSenha());
            
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuárioDAO: " + erro);
            return null;
        }
    }
    
    
}
