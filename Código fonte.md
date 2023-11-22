# Model

### Classe Autor

```
package model;

public class Autor {
    
    private String nome;

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
          
}
```

### Classe Editora
```
package model;

public class Editora {

    private String nome;

    public Editora(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

} 
```

### Classe Empréstimo
```
package model;

import java.util.Date;

public class Emprestimo {

    private String nome;
    private String livro;
    private String data;
    private String dataDevolucao;

    public Emprestimo(String nome, String livro, String data, String dataDevolucao) {
        this.nome = nome;
        this.livro = livro;
        this.data = data;
        this.dataDevolucao = dataDevolucao;
    }

    public String getNome() {
        return nome;
    }

    public String getLivro() {
        return livro;
    }

    public String getData() {
        return data;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

}
```

  ### Classe Leitor

```
package model;


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
}

```

### Classe Livro

```

package model;

import java.sql.SQLException;

public class Livro {
    
    private int idLivro;
    private String titulo;
    private String autor;
    private String editora;
    private String anoEdicao;
    private String local;
    private int volume;

    public Livro() {
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(String anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    
    
     public int salvarLivro(Livro livro) {

        int status;
        Dao dao = new Dao();
        try {
            dao.st = dao.conexao.prepareStatement("INSERT INTO livro VALUES(?,?,?,?,?,?)");
            dao.st.setInt(1,livro.getIdLivro());
            dao.st.setString(2,livro.getTitulo());
            dao.st.setString(3,livro.getAutor());
            dao.st.setString(4,livro.getEditora());
            dao.st.setString(5,livro.getAnoEdicao());
            dao.st.setInt(6, livro.getVolume());
            status = dao.st.executeUpdate();
            return status;//retorna 1 se salvar
           

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getErrorCode());
            return ex.getErrorCode();
        }
    }
    
}
```

### Classe Log

```
package model;

public class Log {

    private String usuario;
    // private String senha;
    // private String nivelHierarquico;

    public Log(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

}

```

### Classe LoginCliente

```

package model;

public class LoginCliente {
    
    private String ClienteLogado;
   

    public LoginCliente() {
    }

    public String getClienteLogado() {
        return ClienteLogado;
    }

    public void setClienteLogado(String ClienteLogado) {
        this.ClienteLogado = ClienteLogado;
    }


    
}
```

### Classe LoginUsuario

```

package model;


public class LoginUsuario {
    
    private String Logado;
   

    public LoginUsuario() {
    }

    public String getLogado() {
        return Logado;
    }

    public void setLogado(String Logado) {
        this.Logado = Logado;
    }
    
    public String setUsuarioLogado(String user){
        
        return user;
        
    }
   
}
```

### Classe Pessoa

```
package model;

public class Pessoa {

    private String nome;
    private String dataNascimento;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String complemento;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    

}
```

### Classe Usuario

```
package model;

import java.net.PasswordAuthentication;

public class Usuario {

    //private int idUsuario;
    private String nome;
    private String nomeUsuario;
    private String senha;
    private String nivelHierarquico;


    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

//    public int getIdUsuario() {
//        return idUsuario;
//    }
//
//    public void setIdUsuario(int idUsuario) {
//        this.idUsuario = idUsuario;
//    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }



    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelHierarquico() {
        return nivelHierarquico;
    }

    public void setNivelHierarquico(String nivelHierarquico) {
        this.nivelHierarquico = nivelHierarquico;
    }
    
}
```

### Classe UsuarioDAO

```

package model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UsuarioDAO {
    
    Connection conn;
    ResultSet rs;
    
    public ResultSet autenticacaoUsuario(Usuario usuario) {
        try {
            conn = new ConexaoDAO().conectaBd();
            
            String sql = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,usuario.getNomeUsuario());
            pstm.setString(2,usuario.getSenha());
            
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuárioDAO: " + erro);
            return null;
        }
    }
    
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
```

### Classe DAO

```
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
```

### Classe ConexaoDAO

```

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
```

### Classe ClienteDAO

```

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
```




