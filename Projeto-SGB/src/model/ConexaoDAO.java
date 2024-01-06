
package model;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;

//=========


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoDAO {
    
    public Connection conectaBd() {
        Connection conn = null;

        try {
//            String url = "jdbc:mysql://localhost:3307/biblioteca?user=root&password=";
            String url = "jdbc:mysql://localhost:3312/biblioteca?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ConexãoDAO " + ex.getMessage());
        }
        return conn;
    }
    
    public void desconectar(){
        Dao dao = new Dao();
        dao.desconectar();
    }
    
    // nova conexão do bando de dados para capturar o ultimo usuário logado
    
  public static void main(String[] args) {
        ConexaoDAO conexao = new ConexaoDAO();
        Connection conn = conexao.conectarlog();
        conexao.desconectarLog(conn);
    }

    public Connection conectarlog() {

        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3312/biblioteca", "root", "");
            System.out.println("Conectado com o bando de dados");
            
        } catch (SQLException ex) {
            System.out.println("Erro: Sem conexão com o bando de dados.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro: Não foi encontrado o drive do bando de dados.");
        }
        return conn;
    }

    public void desconectarLog(Connection conn) {

        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Desconectou com o dando de dados.");

            }
        } catch (SQLException ex) {
            System.out.println("Não consegui desconectar com o dando de dados.");
            Logger.getLogger(ConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
