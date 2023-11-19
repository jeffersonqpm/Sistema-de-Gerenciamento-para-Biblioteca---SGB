package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Leitor extends Pessoa {

    private int idLeitor;
    private String senha;
    private String usuario;
    

    public Leitor() {
    }

    public int getIdLeitor() {
        return idLeitor;
    }

    public void setIdLeitor(int idLeitor) {
        this.idLeitor = idLeitor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

//    public int salvarLeitor(Leitor leitor) {
//
//        int status;
//        try {
//
//            Dao dao = new Dao();
//            dao.st = dao.conexao.prepareStatement("INSERT INTO biblioteca.leitor VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
//            dao.st.setInt(1,leitor.getIdLeitor());
//            dao.st.setString(2,leitor.getNome());
//            dao.st.setString(3,leitor.getDataNascimento());
//            dao.st.setString(4,leitor.getCpf());
//            dao.st.setString(5,leitor.getTelefone());
//            dao.st.setString(6,leitor.getEmail());
//            dao.st.setString(7,leitor.getEndereco());
//            dao.st.setString(8,leitor.getNumero());
//            dao.st.setString(9,leitor.getBairro());
//            dao.st.setString(10,leitor.getCidade());
//            dao.st.setString(11,leitor.getUf());
//            dao.st.setString(12,leitor.getCep());
//            status = dao.st.executeUpdate();
//            return status;// retorna 1 se salvar
//            
//            
//        } catch (SQLException ex) {
//            System.out.println("Erro: " + ex.getErrorCode());
//            return ex.getErrorCode();
//        }
//
//    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
