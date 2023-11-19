package model;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Dao {

    Connection conexao;
    PreparedStatement st;
    ResultSet rs;

    public boolean conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
//            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3307/biblioteca", "root", "");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3312/biblioteca", "root", "");
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }

    }

    public void desconectar() {

        try {
            conexao.close();
        } catch (SQLException ex) {

        }
    }

//    public int SalvarUsuario(Usuario usuario) {
//        int status;
//        try {
//            st = conexao.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?)");
//            st.setString(1, usuario.getLogin());
//            st.setString(2, usuario.getNome());
//            st.setString(3, usuario.getSenha());
//            st.setString(4, usuario.getNome());
//            status = st.executeUpdate();
//            return status;
//        } catch (SQLException ex) {
//            return ex.getErrorCode();
//        }
//
//    }
    public int salvarLeitor(Leitor leitor) {

        int status;

        try {
//            Dao dao = new Dao();
            st = conexao.prepareStatement("INSERT INTO leitor VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//            st = conexao.prepareStatement("INSERT INTO leitor VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setInt(1, 0);
            st.setString(2, leitor.getNome());
            st.setString(3, leitor.getDataNascimento());
            st.setString(4, leitor.getCpf());
            st.setString(5, leitor.getTelefone());
            st.setString(6, leitor.getEmail());
            st.setString(7, leitor.getEndereco());
            st.setString(8, leitor.getNumero());
            st.setString(9, leitor.getBairro());
            st.setString(10, leitor.getCidade());
            st.setString(11, leitor.getUf());
            st.setString(12, leitor.getCep());
            st.setString(13, leitor.getComplemento());
            st.setString(14, leitor.getUsuario());
            st.setString(15, leitor.getSenha());
            status = st.executeUpdate();
            return status;// retorna 1 se salvar

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getErrorCode());
            return ex.getErrorCode();
        }

    }

    public int salvarUsuario(Usuario usuario) {

        int status;
        try {

            st = conexao.prepareStatement("INSERT INTO usuario VALUES (?,?,?,?,?)");
//            st.setInt(1, usuario.getIdUsuario());
            st.setInt(1, 0);
            st.setString(2, usuario.getNome());
            st.setString(3, usuario.getNomeUsuario());
            st.setString(4, usuario.getSenha());
            st.setString(5, usuario.getNivelHierarquico());
            status = st.executeUpdate();
            return status;//retorna 1 se salvar

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getErrorCode());
            return ex.getErrorCode();
        }
    }

    public int salvarLivro(Livro livro) {

        int status;
        try {
            st = conexao.prepareStatement("INSERT INTO livro VALUES(?,?,?,?,?,?,?)");
//            st.setInt(1, livro.getIdLivro());
            st.setInt(1, 0);
            st.setString(2, livro.getTitulo());
            st.setString(3, livro.getAutor());
            st.setString(4, livro.getEditora());
            st.setString(5, livro.getAnoEdicao());
            st.setInt(6, livro.getVolume());
            st.setString(7, livro.getLocal());
            status = st.executeUpdate();
            return status;//retorna 1 se salvar

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getErrorCode());
            return ex.getErrorCode();
        }

    }

    public String usuarioLogado(String usuario) {

//        Login login = new Login();
//        String logado = login.setLogado(usuario);
//        String logado2 = new String();
        return usuario;

    }

    public int salvarAutor(Autor autor) {

        int status;
        try {
            st = conexao.prepareStatement("INSERT INTO autor VALUES(?,?)");
            st.setInt(1, 0);// ENVIA PARA O BD O VALO DE ZERO, O IDAUTOR ESTÁ COMO PRIMARY KEY E COM AUTO INCREMENTO
            st.setString(2, autor.getNome());// ENVIA PARA O BD NA SEGUNDA COLUNA DA TABELA AUTOR O NOME INSERIDO NO CAMPO DE TEXTO AUTOR
            status = st.executeUpdate();
            return status;//retorna 1 se salvar

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getErrorCode());
            return ex.getErrorCode();
        }

    }

    public int salvarEditora(Editora editora) {

        int status;

        try {
            st = conexao.prepareStatement("INSERT INTO editora VALUES(?,?)");

            st.setInt(1, 0);// ENVIA PARA O BD O VALO DE ZERO, O IDAEDITORA ESTÁ COMO PRIMARY KEY E COM AUTO INCREMENTO
            st.setString(2, editora.getNome());// ENVIA PARA O BD NA SEGUNDA COLUNA DA TABELA editora O NOME INSERIDO NO CAMPO DE TEXTO EDITORA
            status = st.executeUpdate();
            return status;//retorna 1 se salvar

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getErrorCode());
            return ex.getErrorCode();
        }

    }

    public int salvarEmprestimo(Emprestimo emprestimo) {

        int status;

        try {
            st = conexao.prepareStatement("INSERT INTO emprestimo VALUES(?,?,?,?,?)");

            st.setInt(1, 0);// ENVIA PARA O BD O VALO DE ZERO, O IDAEDITORA ESTÁ COMO PRIMARY KEY E COM AUTO INCREMENTO
            st.setString(2, emprestimo.getNome());// ENVIA PARA O BD NA SEGUNDA COLUNA DA TABELA editora O NOME INSERIDO NO CAMPO DE TEXTO EDITORA
            st.setString(3, emprestimo.getLivro());// ENVIA PARA O BD NA SEGUNDA COLUNA DA TABELA editora O NOME INSERIDO NO CAMPO DE TEXTO EDITORA
            st.setString(4, emprestimo.getData());// ENVIA PARA O BD NA SEGUNDA COLUNA DA TABELA editora O NOME INSERIDO NO CAMPO DE TEXTO EDITORA
            st.setString(5, emprestimo.getDataDevolucao());// ENVIA PARA O BD NA SEGUNDA COLUNA DA TABELA editora O NOME INSERIDO NO CAMPO DE TEXTO EDITORA

            status = st.executeUpdate();
            return status;//retorna 1 se salvar

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getErrorCode());
            return ex.getErrorCode();
        }

    }

    public int salvarLog(Log log) {

        int status;

        try {
            st = conexao.prepareStatement("INSERT INTO log VALUES(?,?)");

            st.setInt(1, 0);// ENVIA PARA O BD O VALO DE ZERO, O IDAEDITORA ESTÁ COMO PRIMARY KEY E COM AUTO INCREMENTO
            st.setString(2, log.getUsuario());// ENVIA PARA O BD NA SEGUNDA COLUNA DA TABELA editora O NOME INSERIDO NO CAMPO DE TEXTO EDITORA
            // st.setString(3, log.getSenha());// ENVIA PARA O BD NA TERCEIRA COLUNA DA TABELA log O TEXTO INSERIDO NO CAMPO NIVEL HIERARQUICO

            status = st.executeUpdate();
            return status;//retorna 1 se salvar

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getErrorCode());
            return ex.getErrorCode();
        }

    }

//    public List<Autor> listaAutores() {
//
//        List<Autor> lista = new ArrayList<>();
//        String sql = "select * from fornecedores";
//
//        PreparedStatement stmt = conexao.prepareStatement(sql);
//
//    }

}
