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
### Classe Emprestimo
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


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
```

### Classe Livro
```
package model;
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

    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
```

### Classe TabelaAutor
```

package model;

public class TabelaAutor {
    
    private int id;
    private String nome;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
```
### Classe TabelaEditora
```

package model;


public class TabelaEditora {
    
    private int id;
    private String nomeEditora;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }
    
}
```
### Classe Usuario

```
package model;

import java.net.PasswordAuthentication;

public class Usuario {

    private int idUsuario;
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

//    public void setNomeUsuario(String nomeUsuario) {
//        this.nomeUsuario = nomeUsuario;
//    }

    public Usuario(int idUsuario, String nome, String nomeUsuario, String senha, String nivelHierarquico) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.nivelHierarquico = nivelHierarquico;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    

    public void setNivelHierarquico(String nivelHierarquico) {
        this.nivelHierarquico = nivelHierarquico;
    }
    
        @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }
       
}
```
# Connection
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

### Classe ConnectionFactory

```
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuelson
 */
public class ConnectionFactory {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3312/biblioteca";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
```

### Classe TabelaAutorDAO
```
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
```
### Classe TabelaEditoraDAO
```

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
```
### Classe TabelaLeitorDAO
```

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
```
### Classe TabelaLivroDAO
```

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
```
### Classe TabelaLivroDAO
```
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
```

### Classe TabelaUsuarioDAO
```
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
```
# View
### Classe CadastroAutor
```
package view;

import connection.TabelaAutorDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Autor;
import model.Dao;
import model.TabelaAutor;

/**
 *
 * @author Jefferson
 */
public class CadastroAutor extends javax.swing.JFrame {

    /**
     * Creates new form CadastroAutor
     */
    public CadastroAutor() {
        setTitle("Sistema de Gerenciamento de Biblioteca – SGB - Cadastro de Autor");
        initComponents();
        setResizable(false);

        DefaultTableModel modelo = (DefaultTableModel) tabelaAutor.getModel();
        tabelaAutor.setRowSorter(new TableRowSorter(modelo));
        readTabela();

    }

    public void readTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tabelaAutor.getModel();
        modelo.setNumRows(0);
        TabelaAutorDAO pdao = new TabelaAutorDAO();

        for (TabelaAutor autor : pdao.read()) {
            modelo.addRow(new Object[]{
                autor.getId(),
                autor.getNome()
            });

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAutor = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setResizable(false);

        jLabel1.setText("Nome do Autor");

        txtAutor.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        tabelaAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Autor"
            }
        ));
        tabelaAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAutorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAutor);
        if (tabelaAutor.getColumnModel().getColumnCount() > 0) {
            tabelaAutor.getColumnModel().getColumn(0).setMinWidth(30);
            tabelaAutor.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEditar.setText("Atualizar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Cadastro de Autor");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Autor.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btEditar)
                                .addGap(43, 43, 43)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(785, 758));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                         

        if ("".equals(txtAutor.getText())) {// SE O CAMPO txtautor FOR VAZIO, ABRIRÁ UMA CAIXA DE MENSAGEM SOLICITANDO QUE ESCRE O NOME.
            JOptionPane.showMessageDialog(null, "Digite o nome do Autor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else {//SE FOR ESCRITO ALGO NO CAMPO TEXTO, SERÁ EXECUTADO O CÓDIGO ABAIXO

            Autor autor = new Autor(txtAutor.getText());

            Dao dao = new Dao();

            int resp;
            boolean status;

            status = dao.conectar();
            if (status == false) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            } else {
                resp = dao.salvarAutor(autor);
                if (resp == 1) {
                    JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso!");

//                    DefaultTableModel tbprodutos = (DefaultTableModel) tabelaAutor.getModel();
//                    Object[] dados = {txtAutor.getText()};
//                    tbprodutos.addRow(dados);
                    readTabela();

                    txtAutor.setText(null);//APÓS CLICAR EM OK, O TEXTO É APAGADO
                    txtAutor.requestFocus();// APÓS CLICAR EM OK, O CURSOR SERÁ APONTADO PARA O CAMPO DE TEXTO txt.autor

                } else if (resp == 1062) {
                    JOptionPane.showMessageDialog(null, "Matricula já cadastrada.");
                    txtAutor.requestFocus();//APÓS CLICAR EM OK, O CURSOR SERÁ APONTADO PARA O CAMPO DE TEXTO txt.autor

                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar salvar os dados.");

                }

                dao.desconectar();
            }

        }


    }                                        

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {                                         

        if (tabelaAutor.getSelectedRow() != -1) {

            // tabelaAutor.setValueAt(txtAutor.getText(),tabelaAutor.getSelectedRow(),1);
            TabelaAutor a = new TabelaAutor(); // estancia a tabelaAutor

            TabelaAutorDAO dao = new TabelaAutorDAO(); //estancia a tabelaAutorDAO

            a.setNome(txtAutor.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome

            a.setId((int) tabelaAutor.getValueAt(tabelaAutor.getSelectedRow(), 0));// capta o ID selecionado e seta no atributo ID
            dao.update(a); // chama o metodo UPDATE

            txtAutor.setText(null);// limpa o campo de texto
            readTabela(); // atualiza a tabela

        }

    }                                        

    private void tabelaAutorMouseClicked(java.awt.event.MouseEvent evt) {                                         

        if (tabelaAutor.getSelectedRow() != -1) {

            // txtIDold.setText(tabelaAutor.getValueAt(tabelaAutor.getSelectedRow(), 0).toString());
            txtAutor.setText(tabelaAutor.getValueAt(tabelaAutor.getSelectedRow(), 1).toString());

//            txtID.setText(tabelaAutor.getValueAt(tabelaAutor.getSelectedRow(), 1).toString());
//            txtAutor.setText(tabelaAutor.getValueAt(tabelaAutor.getSelectedRow(), 2).toString());
//            txtAutor.setText(tabelaAutor.getValueAt(tabelaAutor.getSelectedRow(), 3).toString());
        }
    }                                        

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                          

        int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir " + txtAutor.getText()+ "?" , "Confirmação",JOptionPane.YES_NO_OPTION);
       
        if (resposta == JOptionPane.YES_OPTION) {

            if (tabelaAutor.getSelectedRow() != -1) {

                // tabelaAutor.setValueAt(txtAutor.getText(),tabelaAutor.getSelectedRow(),1);
                TabelaAutor a = new TabelaAutor(); // estancia a tabelaAutor

                TabelaAutorDAO dao = new TabelaAutorDAO(); //estancia a tabelaAutorDAO

                a.setNome(txtAutor.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome

                a.setId((int) tabelaAutor.getValueAt(tabelaAutor.getSelectedRow(), 0));// capta o ID selecionado e seta no atributo ID
                dao.delete(a); // chama o metodo UPDATE

                txtAutor.setText(null);// limpa o campo de texto
                readTabela(); // atualiza a tabela

            }
        }else{
            
        }

    }                                         

    /**
         * @param args the command line arguments
         */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAutor;
    private javax.swing.JTextField txtAutor;
    // End of variables declaration                   
}
```
### Classe CadastroEditora
```

package view;


import connection.TabelaEditoraDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Dao;
import model.Editora;

import model.TabelaEditora;

public class CadastroEditora extends javax.swing.JFrame {

    public CadastroEditora() {
                setTitle("Sistema de Gerenciamento de Biblioteca – SGB - Cadastro de Editora");
        setResizable(false);
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tabelaEditora.getModel();
        tabelaEditora.setRowSorter(new TableRowSorter(modelo));
        readTabela();
    }

    public void readTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tabelaEditora.getModel();
        modelo.setNumRows(0);
        TabelaEditoraDAO pdao = new TabelaEditoraDAO();

        for (TabelaEditora editora : pdao.read()) {// referencia a classe
            modelo.addRow(new Object[]{
                editora.getId(),
                editora.getNomeEditora()
            });

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEditora = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEditora = new javax.swing.JTable();
        bteditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel1.setText("Editora");

        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        tabelaEditora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Editora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEditoraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEditora);
        if (tabelaEditora.getColumnModel().getColumnCount() > 0) {
            tabelaEditora.getColumnModel().getColumn(0).setMinWidth(30);
            tabelaEditora.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        bteditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bteditar.setText("Atualizar");
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Cadastro de Editora");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editora3.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txtEditora)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(bteditar)
                                .addGap(55, 55, 55)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bteditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(757, 775));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                         

        if ("".equals(txtEditora.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o nome da Editora.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else {

            Editora editora = new Editora(txtEditora.getText());

            Dao dao = new Dao();

            int resp;
            boolean status;

            status = dao.conectar();
            if (status == false) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

            } else {
                resp = dao.salvarEditora(editora);
                if (resp == 1) {
                    JOptionPane.showMessageDialog(null, "Editora cadastrada com sucesso!");
                    readTabela();
                    txtEditora.setText(null);//Apagar o campo de texto após salvar no Banco de dados.
                    txtEditora.requestFocus();

                } else if (resp == 1062) {
                    JOptionPane.showMessageDialog(null, "Matricula já cadastrada.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar salvar os dados.");
                }
                dao.desconectar();
            }
        }
    }                                        

    private void tabelaEditoraMouseClicked(java.awt.event.MouseEvent evt) {                                           
        if (tabelaEditora.getSelectedRow() != -1) {

            //txtID.setText(tabelaEditora.getValueAt(tabelaEditora.getSelectedRow(), 0).toString());
            txtEditora.setText(tabelaEditora.getValueAt(tabelaEditora.getSelectedRow(), 1).toString());

        }
    }                                          

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        if (tabelaEditora.getSelectedRow() != -1) {

            // tabelaAutor.setValueAt(txtAutor.getText(),tabelaAutor.getSelectedRow(),1);
            TabelaEditora e = new TabelaEditora(); // estancia a tabelaEditora

            TabelaEditoraDAO dao = new TabelaEditoraDAO(); //estancia a tabelaEditoraDAO

            e.setNomeEditora(txtEditora.getText()); // capta os dados do campo de texto txtEditora e seta no atributo nome
            e.setId((int)tabelaEditora.getValueAt(tabelaEditora.getSelectedRow(),0));// capta o ID selecionado e seta no atributo ID
            
            dao.update(e); // chama o metodo UPDATE
            txtEditora.setText(null);// limpa o campo de texto
            readTabela(); // atualiza a tabela

        }
    }                                        

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir " + txtEditora.getText()+ "?" , "Confirmação",JOptionPane.YES_NO_OPTION);
       
        if (resposta == JOptionPane.YES_OPTION) {

            if (tabelaEditora.getSelectedRow() != -1) {

                // tabelaAutor.setValueAt(txtAutor.getText(),tabelaAutor.getSelectedRow(),1);
                TabelaEditora e = new TabelaEditora(); // estancia a tabelEditora

                TabelaEditoraDAO dao = new TabelaEditoraDAO(); //estancia a tabelaEditora
                

                e.setNomeEditora(txtEditora.getText()); // capta os dados do campo de texto txtNomeEditora e seta no atributo nome

                e.setId((int) tabelaEditora.getValueAt(tabelaEditora.getSelectedRow(), 0));// capta o ID selecionado e seta no atributo ID
                dao.delete(e); // chama o metodo delete

                txtEditora.setText(null);// limpa o campo de texto
                readTabela(); // atualiza a tabela

            }
        }else{
            
        }
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEditora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton bteditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEditora;
    private javax.swing.JTextField txtEditora;
    // End of variables declaration                   
}
```
### Classe CadastroEmprestimo

```
package view;

import javax.swing.JOptionPane;
import model.Dao;
import model.Emprestimo;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

// para somar data
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.table.DefaultTableModel;

public class CadastroEmprestimo extends javax.swing.JFrame {

    /**
     * Creates new form Emprestimo
     */
    public CadastroEmprestimo() {
                setTitle("Sistema de Gerenciamento de Biblioteca – SGB - Empréstimo de livros.");
        initComponents();
        setResizable(false);

        // AO INICIAR A TELA A DATA ATUAL SERA INSERIDA NO CAMPO DATA.
        Date data1;
        lbData.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        txtNome.requestFocus();
//       txtDataDevolucao.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
//        txtDataDevolucao.setText("08/09/2023");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmprestimo = new javax.swing.JTable();
        jcLivro = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDataDevolucao = new javax.swing.JTextField();
        btOk = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btOk1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel1.setText("Nome");

        jLabel2.setText("Livro");

        tbEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Livro", "Devolução"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbEmprestimo);
        if (tbEmprestimo.getColumnModel().getColumnCount() > 0) {
            tbEmprestimo.getColumnModel().getColumn(1).setMinWidth(100);
            tbEmprestimo.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        jcLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Rede de computdores", "Dominando JavaScript", "Código Limpo: habilidades práticas do Agile Software", "Microsoft .NET – architecting applications for the enterprise", "O universo da programação", "O codificador limpo: um código de conduta para programadores profissionais", "Refatoração", "O programador pragmático – de aprendiz a mestre ", "Expressões regulares – uma abordagem divertida" }));
        jcLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcLivroActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        jLabel3.setText("Data");

        lbData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbData.setText("data");

        jLabel4.setText("Devolver até");

        btOk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btOk.setText("Reservar");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Empréstimo");

        jLabel6.setText("ID");

        btOk1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btOk1.setText("Devolver");
        btOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOk1ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emprestimo.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel7)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbData, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(btAdicionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btOk1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(77, 77, 77))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(46, 46, 46)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbData)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        setSize(new java.awt.Dimension(1006, 793));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {                                     

        if ("".equals(txtNome.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o nome do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("Selecionar".equals(jcLivro.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Escolha o livro a ser inserido.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(txtDataDevolucao.getText())) {
            JOptionPane.showMessageDialog(null, "Informe a data de devolução.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else {

            Emprestimo emprestimo = new Emprestimo(txtNome.getText(), jcLivro.getSelectedItem().toString(), lbData.getText(), txtDataDevolucao.getText());

            Dao dao = new Dao();

            int resp;
            boolean status;

            status = dao.conectar();

            if (status == false) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

            } else {
                resp = dao.salvarEmprestimo(emprestimo);
                if (resp == 1) {
                    JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!");
                    txtNome.setText(null);//APAGAR O TEXTO NO CAMPO txtNome
                    jcLivro.setSelectedItem("Selecionar");//selecionar o item "Selecionar"
                    txtDataDevolucao.setText(null);//Apagar o texto no campo txtDataDevolucao
                    txtNome.requestFocus();//O cursor irá permanecer no campo txtNome
                } else if (resp == 1062) {
                    JOptionPane.showMessageDialog(null, "Matricula já cadastrada.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar salvar os dados.");
                }
                dao.desconectar();
            }
        }

    }                                    

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if ("".equals(txtNome.getText())) {
            JOptionPane.showMessageDialog(null, "Informe o nome do leitor");

        } else if ("Selecionar".equals(jcLivro.getSelectedItem())) {
            JOptionPane.showMessageDialog(null, "Selecione o livro que deseja alugar");

        } else {
            somaDias();
//       String temp = txtDataDevolucao.getText();

            DefaultTableModel tbprodutos = (DefaultTableModel) tbEmprestimo.getModel();
            Object[] dados = {jcLivro.getSelectedItem(), txtDataDevolucao.getText()};
            tbprodutos.addRow(dados);
            //jcLivro.setSelectedItem("Selecionar");

        }

    }                                           

    private void btOk1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jcLivroActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroEmprestimo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEmprestimo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEmprestimo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEmprestimo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEmprestimo().setVisible(true);
            }
        });
    }

    public void somaDias() {

        // Obter a data atual
        LocalDate dataAtual = LocalDate.now();

        // Somar 10 dias à data atual
        LocalDate novaData = dataAtual.plus(10, ChronoUnit.DAYS);

        // Definir o formato da saída
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatar as datas
        //String dataAtualFormatada = dataAtual.format(formato);
        String novaDataFormatada = novaData.format(formato);

//      txtDataDevolucao.setText(String.valueOf(novaData));
        txtDataDevolucao.setText(String.valueOf(novaDataFormatada));

    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btOk1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcLivro;
    private javax.swing.JLabel lbData;
    private javax.swing.JTable tbEmprestimo;
    private javax.swing.JTextField txtDataDevolucao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration                   

    private String toString(LocalDate dataAtual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
```
### Classe CadastroLeitor
```
package view;

import connection.TabelaLeitorDAO;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Dao;
import model.Leitor;


public class CadastroLeitor extends javax.swing.JFrame {

    public CadastroLeitor() {
        setTitle("Sistema de Gerenciamento de Biblioteca – SGB - Cadastro de Leitor.");
        setResizable(false);

        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tabelaLeitor.getModel();
        tabelaLeitor.setRowSorter(new TableRowSorter(modelo));
        readTabela();
        jLabel13.setVisible(false);
        txtId.setVisible(false);
    }

    public void readTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tabelaLeitor.getModel();
        modelo.setNumRows(0);
        TabelaLeitorDAO ldao = new TabelaLeitorDAO();

        for (Leitor leitor : ldao.read()) {
            modelo.addRow(new Object[]{
                leitor.getIdLeitor(),
                leitor.getNome(),
                leitor.getDataNascimento(),
                leitor.getCpf(),
                leitor.getTelefone(),
                leitor.getEmail(),
                leitor.getEndereco(),
                leitor.getNumero(),
                leitor.getBairro(),
                leitor.getCidade(),
                leitor.getUf(),
                leitor.getCep(),
                leitor.getComplemento(),
                leitor.getUsuario(), //leitor.getSenha(),
            });

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNomeLeitor = new javax.swing.JTextField();
        txtCpfLeitor = new javax.swing.JTextField();
        txtEmailLeitor = new javax.swing.JTextField();
        txtTelefoneLeitor = new javax.swing.JTextField();
        txtEnderecoLeitor = new javax.swing.JTextField();
        txtBairroLeitor = new javax.swing.JTextField();
        txtNumeroLeitor = new javax.swing.JTextField();
        txtNascimentoLeitor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCidadeLeitor = new javax.swing.JTextField();
        txtCepLeitor = new javax.swing.JTextField();
        btEditarLeitor = new javax.swing.JButton();
        btSalvarLeitor = new javax.swing.JButton();
        jcUfleitor = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtComplementoLeitor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        txtSenhaConfirmacao = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLeitor = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(104, 36));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro de leitor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jLabel3.setText("Data de Nasc.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jLabel4.setText("CPF");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        jLabel5.setText("E-mail");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        jLabel6.setText("Telefone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, -1, -1));

        jLabel7.setText("Endereço");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        jLabel8.setText("Número");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, -1));

        jLabel9.setText("Bairro");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));
        getContentPane().add(txtNomeLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 440, -1));
        getContentPane().add(txtCpfLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 132, -1));
        getContentPane().add(txtEmailLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 438, -1));
        getContentPane().add(txtTelefoneLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 175, -1));
        getContentPane().add(txtEnderecoLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 290, -1));
        getContentPane().add(txtBairroLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 132, -1));
        getContentPane().add(txtNumeroLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 120, -1));
        getContentPane().add(txtNascimentoLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 132, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setText("Cidade");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        jLabel11.setText("UF");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        jLabel12.setText("CEP");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, -1, -1));
        getContentPane().add(txtCidadeLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 180, -1));

        txtCepLeitor.setName(""); // NOI18N
        getContentPane().add(txtCepLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 132, -1));

        btEditarLeitor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEditarLeitor.setText("Atualizar");
        btEditarLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarLeitorActionPerformed(evt);
            }
        });
        getContentPane().add(btEditarLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, -1, -1));

        btSalvarLeitor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalvarLeitor.setText("Salvar");
        btSalvarLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarLeitorActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvarLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 110, -1));

        jcUfleitor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "PE", "RN", "PB", "PI", "CE", "BA", "MG" }));
        getContentPane().add(jcUfleitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, -1, -1));

        jLabel13.setText("ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        txtId.setFocusCycleRoot(true);
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 132, -1));

        jLabel14.setText("Complemento");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));
        getContentPane().add(txtComplementoLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 180, -1));

        jLabel15.setText("Senha");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, -1, -1));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 200, -1));

        jLabel16.setText("Nome do usuário (Login)");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));
        getContentPane().add(txtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 180, -1));

        txtSenhaConfirmacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSenhaConfirmacaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSenhaConfirmacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSenhaConfirmacaoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSenhaConfirmacaoMousePressed(evt);
            }
        });
        txtSenhaConfirmacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaConfirmacaoActionPerformed(evt);
            }
        });
        txtSenhaConfirmacao.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtSenhaConfirmacaoPropertyChange(evt);
            }
        });
        getContentPane().add(txtSenhaConfirmacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, 200, -1));

        jLabel17.setText("Confirmar senha");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/leitores2.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        tabelaLeitor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Data de nascimento", "CPF", "Telefone", "E-mail", "Rua", "Nº", "Bairro", "Cidade", "UF", "CEP", "Complemento", "Usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaLeitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaLeitorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaLeitor);
        if (tabelaLeitor.getColumnModel().getColumnCount() > 0) {
            tabelaLeitor.getColumnModel().getColumn(0).setMinWidth(50);
            tabelaLeitor.getColumnModel().getColumn(0).setMaxWidth(50);
            tabelaLeitor.getColumnModel().getColumn(1).setMinWidth(120);
            tabelaLeitor.getColumnModel().getColumn(1).setMaxWidth(120);
            tabelaLeitor.getColumnModel().getColumn(7).setMinWidth(70);
            tabelaLeitor.getColumnModel().getColumn(7).setMaxWidth(70);
            tabelaLeitor.getColumnModel().getColumn(10).setMinWidth(30);
            tabelaLeitor.getColumnModel().getColumn(10).setMaxWidth(30);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 1550, 200));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 110, -1));

        setSize(new java.awt.Dimension(1651, 787));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btSalvarLeitorActionPerformed(java.awt.event.ActionEvent evt) {                                               

        String senha = new String(txtSenha.getPassword());
        String senha2 = new String(txtSenhaConfirmacao.getPassword());

//        if ("".equals(txtId.getText())) {
//            JOptionPane.showMessageDialog(null, "Digite o ID válido para o leitor.","ATENÇÃO!" ,JOptionPane.ERROR_MESSAGE);
//
//        } else 
        if ("".equals(txtNomeLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o nome do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtNomeLeitor.requestFocus();

        } else if ("".equals(txtNascimentoLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite a data de nascimento do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtNascimentoLeitor.requestFocus();

        } else if ("".equals(txtCpfLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o CPF do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtCpfLeitor.requestFocus();

        } else if ("".equals(txtTelefoneLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o telefone do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtTelefoneLeitor.requestFocus();

        } else if ("".equals(txtEmailLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o e-mail do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtEmailLeitor.requestFocus();

        } else if ("".equals(txtEnderecoLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o endereço do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtEnderecoLeitor.requestFocus();

        } else if ("".equals(txtNumeroLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o numero do endereço do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtNumeroLeitor.requestFocus();

        } else if ("".equals(txtBairroLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o bairro do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtBairroLeitor.requestFocus();
        } else if ("".equals(txtCidadeLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite a cidade do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtCidadeLeitor.requestFocus();
        } else if ("--".equals(jcUfleitor.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Selecione o estado do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(txtCepLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o CEP do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtCepLeitor.requestFocus();
        } else if ("".equals(txtNomeUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o nome do usuário.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtNomeUsuario.requestFocus();
        } else if ("".equals(senha)) {
            JOptionPane.showMessageDialog(null, "Digite a senha.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtSenha.requestFocus();
        } else if ("".equals(senha2)) {
            JOptionPane.showMessageDialog(null, "Confirme a senha.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtSenhaConfirmacao.requestFocus();
        } else if (!senha.equals(senha2)) {
            JOptionPane.showMessageDialog(null, "As senhas não correspondem.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtSenha.requestFocus();

        } else {

            Leitor leitor = new Leitor();

            //leitor.setIdLeitor(Integer.parseInt(txtId.getText()));
            leitor.setNome(txtNomeLeitor.getText());
            leitor.setDataNascimento(txtNascimentoLeitor.getText());
            leitor.setCpf(txtCpfLeitor.getText());
            leitor.setTelefone(txtTelefoneLeitor.getText());
            leitor.setEmail(txtEmailLeitor.getText());
            leitor.setEndereco(txtEnderecoLeitor.getText());
            leitor.setNumero(txtNumeroLeitor.getText());
            leitor.setComplemento(txtComplementoLeitor.getText());
            leitor.setBairro(txtBairroLeitor.getText());
            leitor.setCidade(txtCidadeLeitor.getText());
//        leitor.setUf(jcUfleitor.getItemAt(WIDTH));
            leitor.setUf(jcUfleitor.getSelectedItem().toString());
            leitor.setCep(txtCepLeitor.getText());
            leitor.setUsuario(txtNomeUsuario.getText());
            leitor.setSenha(String.valueOf(txtSenha.getPassword()));

            Dao dao = new Dao();

            int resp;
            boolean status;
            String nomeLeitor;

            status = dao.conectar();
            if (status == false) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");

            } else {
                resp = dao.salvarLeitor(leitor);

                if (resp == 1) {
                    JOptionPane.showMessageDialog(null, " Leitor cadastrado com sucesso!");
                    readTabela();
                    limparCampos();

                } else if (resp == 1062) {
                    JOptionPane.showMessageDialog(null, "Matricula já cadastrada.");
                    //txtId.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar salvar os dados.");

                }
                dao.desconectar();
            }
        }

    }                                              

    private void txtSenhaConfirmacaoMouseClicked(java.awt.event.MouseEvent evt) {                                                 

    }                                                

    private void txtSenhaConfirmacaoMouseEntered(java.awt.event.MouseEvent evt) {                                                 

    }                                                

    private void txtSenhaConfirmacaoMouseExited(java.awt.event.MouseEvent evt) {                                                

    }                                               

    private void txtSenhaConfirmacaoMousePressed(java.awt.event.MouseEvent evt) {                                                 

    }                                                

    private void txtSenhaConfirmacaoActionPerformed(java.awt.event.ActionEvent evt) {                                                    

    }                                                   

    private void txtSenhaConfirmacaoPropertyChange(java.beans.PropertyChangeEvent evt) {                                                   

    }                                                  

    private void tabelaLeitorMouseClicked(java.awt.event.MouseEvent evt) {                                          

        if (tabelaLeitor.getSelectedRow() != -1) {

            // txtIDold.setText(tabelaAutor.getValueAt(tabelaAutor.getSelectedRow(), 0).toString());
            txtNomeLeitor.setText(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 1).toString());
            txtNascimentoLeitor.setText(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 2).toString());
            txtCpfLeitor.setText(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 3).toString());
            txtTelefoneLeitor.setText(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 4).toString());
            txtEmailLeitor.setText(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 5).toString());
            txtEnderecoLeitor.setText(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 6).toString());
            txtNumeroLeitor.setText(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 7).toString());
            txtBairroLeitor.setText(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 8).toString());
            txtCidadeLeitor.setText(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 9).toString());
            jcUfleitor.setSelectedItem(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 10));
            txtCepLeitor.setText(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 11).toString());
            txtComplementoLeitor.setText(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 12).toString());
            txtNomeUsuario.setText(tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 13).toString());

//            txtID.setText(tabelaAutor.getValueAt(tabelaAutor.getSelectedRow(), 1).toString());
//            txtAutor.setText(tabelaAutor.getValueAt(tabelaAutor.getSelectedRow(), 2).toString());
//            txtAutor.setText(tabelaAutor.getValueAt(tabelaAutor.getSelectedRow(), 3).toString());
        }
    }                                         

    private void btEditarLeitorActionPerformed(java.awt.event.ActionEvent evt) {                                               

        String senha = new String(txtSenha.getPassword());
        String senha2 = new String(txtSenhaConfirmacao.getPassword());

        if ("".equals(txtNomeLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o nome do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtNomeLeitor.requestFocus();

        } else if ("".equals(txtNascimentoLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite a data de nascimento do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtNascimentoLeitor.requestFocus();

        } else if ("".equals(txtCpfLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o CPF do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtCpfLeitor.requestFocus();

        } else if ("".equals(txtTelefoneLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o telefone do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtTelefoneLeitor.requestFocus();

        } else if ("".equals(txtEmailLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o e-mail do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtEmailLeitor.requestFocus();

        } else if ("".equals(txtEnderecoLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o endereço do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtEnderecoLeitor.requestFocus();

        } else if ("".equals(txtNumeroLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o numero do endereço do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtNumeroLeitor.requestFocus();

        } else if ("".equals(txtBairroLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o bairro do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtBairroLeitor.requestFocus();
        } else if ("".equals(txtCidadeLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite a cidade do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtCidadeLeitor.requestFocus();
        } else if ("--".equals(jcUfleitor.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Selecione o estado do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(txtCepLeitor.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o CEP do leitor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtCepLeitor.requestFocus();
        } else if ("".equals(txtNomeUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o nome do usuário.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtNomeUsuario.requestFocus();
        } else if ("".equals(String.valueOf(txtSenha.getPassword()))) {
            JOptionPane.showMessageDialog(null, "Digite a senha.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtSenha.requestFocus();
        } else if ("".equals(String.valueOf(txtSenhaConfirmacao.getPassword()))) {
            JOptionPane.showMessageDialog(null, "Confirme a senha.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtSenhaConfirmacao.requestFocus();
        } else if (!senha.equals(senha2)) {
            JOptionPane.showMessageDialog(null, "As senhas não correspondem.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtSenha.requestFocus();

        } else {

            if (tabelaLeitor.getSelectedRow() != -1) {

                // tabelaAutor.setValueAt(txtAutor.getText(),tabelaAutor.getSelectedRow(),1);
                Leitor l = new Leitor(); // estancia a tabelaAutor

                TabelaLeitorDAO dao = new TabelaLeitorDAO(); //estancia a tabelaAutorDAO

                l.setNome(txtNomeLeitor.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome
                l.setId((int) tabelaLeitor.getValueAt(tabelaLeitor.getSelectedRow(), 0));// capta o ID selecionado e seta no atributo ID
                l.setDataNascimento(txtNascimentoLeitor.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome
                l.setCpf(txtCpfLeitor.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome
                l.setTelefone(txtTelefoneLeitor.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome
                l.setEmail(txtEmailLeitor.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome
                l.setEmail(txtEmailLeitor.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome
                l.setEndereco(txtEnderecoLeitor.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome
                l.setNumero(txtNumeroLeitor.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome
                l.setComplemento(txtComplementoLeitor.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome
                l.setBairro(txtBairroLeitor.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome
                l.setCidade(txtCidadeLeitor.getText());
                l.setUf(String.valueOf(jcUfleitor.getSelectedItem()));
                l.setCep(txtCepLeitor.getText());
                l.setUsuario(txtNomeUsuario.getText());
                l.setSenha(String.valueOf(txtSenha.getPassword()));

                dao.update(l); // chama o metodo UPDATE

//            txtAutor.setText(null);// limpa o campo de texto
                readTabela(); // atualiza a tabela
                apagar();
            }
        }
    }                                              

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        apagar();
    }                                        
    public void apagar() {

        txtNomeLeitor.setText(null);

        txtNascimentoLeitor.setText(null);
        txtCpfLeitor.setText(null);
        txtTelefoneLeitor.setText(null);
        txtEmailLeitor.setText(null);
        txtEnderecoLeitor.setText(null);
        txtNumeroLeitor.setText(null);
        txtBairroLeitor.setText(null);
        txtCidadeLeitor.setText(null);
        jcUfleitor.setSelectedItem("--");
        txtCepLeitor.setText(null);
        txtComplementoLeitor.setText(null);
        txtNomeUsuario.setText(null);
        txtSenha.setText(null);
        txtSenhaConfirmacao.setText(null);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLeitor().setVisible(true);
            }
        });
    }

    void limparCampos() {
        txtId.setText(null);
        txtNomeLeitor.setText(null);
        txtNascimentoLeitor.setText(null);
        txtCpfLeitor.setText(null);
        txtTelefoneLeitor.setText(null);
        txtEmailLeitor.setText(null);
        txtEnderecoLeitor.setText(null);
        txtNumeroLeitor.setText(null);
        txtComplementoLeitor.setText(null);
        txtBairroLeitor.setText(null);
        txtCidadeLeitor.setText(null);
        jcUfleitor.setSelectedItem("--");
        txtCepLeitor.setText(null);
        txtNomeUsuario.setText(null);
        txtSenha.setText(null);
        txtSenhaConfirmacao.setText(null);
        txtNomeLeitor.requestFocus();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btEditarLeitor;
    private javax.swing.JButton btSalvarLeitor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcUfleitor;
    private javax.swing.JTable tabelaLeitor;
    private javax.swing.JTextField txtBairroLeitor;
    private javax.swing.JTextField txtCepLeitor;
    private javax.swing.JTextField txtCidadeLeitor;
    private javax.swing.JTextField txtComplementoLeitor;
    private javax.swing.JTextField txtCpfLeitor;
    private javax.swing.JTextField txtEmailLeitor;
    private javax.swing.JTextField txtEnderecoLeitor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNascimentoLeitor;
    private javax.swing.JTextField txtNomeLeitor;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtNumeroLeitor;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenhaConfirmacao;
    private javax.swing.JTextField txtTelefoneLeitor;
    // End of variables declaration                   
}
```
### Classe CadastroLivro
```
package view;

import connection.TabelaLivroDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Dao;
import model.Livro;

/**
 *
 * @author Jefferson
 */
public class CadastroLivro extends javax.swing.JFrame {

    /**
     * Creates new form CadastroLivro
     */
    public CadastroLivro() {
        setTitle("Sistema de Gerenciamento de Biblioteca – SGB - Cadastro de Livro");
        setResizable(false);
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tabelaCadastroLivro.getModel();
        tabelaCadastroLivro.setRowSorter(new TableRowSorter(modelo));
        readTabela();

        //txtId.setVisible(false);
        //jLabel6.setVisible(false);
        txtTitulo.requestFocus();

        jcEditora.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Selecionar", "Companhia das Letras", "Editora Rocco", "Darkside",
            "Editora Wish", "Editora Pipoca e Nanquim", "Grupo Editorial Record", "Editora Arqueiro", "Globo"}));

        jcAutor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Selecionar", "Alckmar Luiz dos Santos", "Alcides Villaça", "Alcides B. Garcia", "Albino José Ferreira Coutinho", "Alberto Maduar", "Alberto da Costa e Silva", "Albarus Andreos", "Alana Menk", "Aguinaldo Peres", "Agostinho Minicucci", "Agostina Sasaoka", "Afonso Schmidt", "Afonso Luiz Pereira", "Afonso Henriques de Lima Barreto", "Afonso Arinos", "Affonso Romano de Sant'Anna", "Adriano Siqueira", "Adriano Cardoso", "Adriana Simon", "Adriana Portes", "Adriana Araújo", "Adonias Filho", "Adirson Teles", "Ademir Pascale", "Ademir Assunção", "Adelpho Monjardim", "Adelino dos Santos Abreu", "Adela Figueroa Panisse", "Addam", "Adam Minhoto", "Adalzira Bittencourt", "Adalberto José dos Santos", "Abílio Godoy", "Abelardo Pedroga",
            "Cristiano Konno", "Cristiano de Oliveira Marinho", "Cris Lasaitis", "Corvo", "Constância Lima Duarte", "Conrado Ramazini", "Coelho Neto", "Clóvis Garcia", "Clinton Davisson", "Claudio Villa", "Claudio Parreira", "Cláudio Oliveira Egalon", "Cláudio Moreno", "Claudio Lobato", "Cláudio Figueiredo", "Cláudio Brites", "Claudia Modell", "Claudia Maria Freitas da Silva", "Cláudia Furtado", "Cláudia Curcio", "Clarice Lispector", "Clarice Kowacs", "Clara A. A. Giron", "Cirilo S. Lemos", "Cilaine Alves Cunha", "Cid Vale Ferreira", "Cid Fernandez", "Cícero Leitão", "Cícero de Cesero", "Christian Kirby", "Christian David", "Chris Sevla", "Chico Pascoal", "Chico Buarque", "Chico Anis", "Charles Kiefer", "Charles Dias", "Cezar Alcázar", "César Silva", "César Alcázar", "Celso Santos", "Celso P. Santos", "Celso Leopoldo Pagnan", "Celso Júnior", "Celso Gajo", "Celso Barroso", "Celly Borges", "Celina Portocarrero", "Célia A. N. Passoni", "Cecy Fernandes de Assis", "Cavaleiro de Cervantes - André Luís", "Cássio K.", "Cassandra Rios", "Carolina Mancini", "Carol Chiovatto", "Carmen Seganfredo", "Carlos Silveira Filho", "Carlos Santos", "Carlos Ribeiro", "Carlos Relva", "Carlos Patati", "Carlos Paraná", "Carlos Orsi Martinho", "Carlos Orsi", "Carlos Margarido", "Carlos Henrique Alves", "Carlos Gregório", "Carlos Fred Gz. Morato", "Carlos Faraco", "Carlos Eric", "Carlos Emílio Correia Lima", "Carlos Eduardo Novaes", "Carlos Drummond de Andrade", "Carlos Bornhofen", "Carlos Araújo", "Carlos Angelo", "Carlos André Mores", "Carlos Alberto Ramos", "Carlos Alberto Machado", "Carlos Abreu", "Carlos Abraham Duarte", "Carla Cristina Pereira", "Carla C. Waltrick", "Cardoso", "Capitolina", "Camilo Vannuchi", "Camilo da Anunciação", "Camila Fernandes", "C. M. Poco", "Bruno Schlatter", "Bruno Nunes Ribeiro", "Bruno Mattos", "Bruno Freitas Oliveira", "Bruno Cobbi", "Bruna Dantas Lobato", "Bruna Caroline", "Brontops Baruq", "Brontops", "Braulio Tavares", "Bob Fernandes", "Bertoldo Schneider Jr.", "Bernardo Moraes", "Bernardo Guimarães", "Berilo Neves", "Benigno Salteador", "Beatriz Rinaldi", "Beatriz Berrini", "B. B. Jenitez", "Avery Veríssimo", "Augusto Emílio Zaluar", "Ataíde Tartari", "Assis Brasil", "Assis Arruda", "Artur Vecchi", "Artur Neves", "Artur César Ferreira Reis", "Arthur Dapieve", "Arthur Bonaventura", "Arthur Bastos", "Arlindo Pereira", "Arlete Sobral", "Arlete Nogueira da Cruz", "Arlete Cavaliere", "Arieni Dissenha", "Ariano Suassuna", "Argos Arruda Pinto", "Arcano Soturno", "Aran", "Aparecida de Fátima Bueno", "Antônio Xerxenesky", "Antonio Vicente Seraphim Pietroforte", "Antônio Olinto", "Antônio Nogueira", "Antonio Moreno", "Antonio Luiz M. C. Costa", "António José da Silva", "Antônio Dimas", "Antonio de Jesus", "Antonio Cesar de Oliveira", "Antônio César Chuquer", "Antonio Borgia", "Antonio Balbe", "Antonio Augusto Shaftiel", "Antônio Arnoni Prado", "Anny Lucard", "Annie Piagetti Müller", "Anna Creuza Zacharias", "Anna Creusa", "Anita C. Prado", "Aníbal M. Machado", "Angelo Miranda", "Angel", "Andréa Fátima dos Santos", "Andrea del Fuego", "Andrea Carvalho", "André Vianco", "André Valente", "André Telles", "André Soares Silva", "André Simões", "André Sanches", "André S. Silva", "André Ricardo Aguiar", "André Luís Soares", "André L. Pavesi", "André Kenji", "André Carneiro", "André Bozzetto Jr.", "Anderson Siqueira", "Anderson Santos", "Anatole Ramos", "Ana Paula Pacheco", "Ana Luiza da Silva Garcia", "Ana Lúcia Merege", "Ana Letícia de Fiori", "Ana Cristina Rodrigues", "Ana Claudia Giassone", "Ana Chamorro", "Ana Carolina Silveira", "Ana Carolina Bomfim Jacó", "Ana Beatriz Cabral", "Amílcar Quintella Jr.", "Amaral", "Amândio Sobral", "Amanda Hoelzel", "Alysson F. Ferrari", "Alyne Botelho", "Alvaro Pereira", "Álvaro Malheiros", "Alvaro Luis", "Álvaro Domingues", "Álvares de Azevedo", "Aluísio Azevedo", "Almir Pascale", "Almir Correia", "Almeida Fischer", "Alma Kazur", "Alliah", "Alina Galante", "Alícia Azevedo", "Alfredo Sirkis", "Alfredo Keppler", "Alfredo Gomes", "Alexis Lemos", "Alexei Bueno", "Alexandre Soares", "Alexandre Raposo", "Alexandre Pereira dos Santos", "Alexandre Nicoletti Camargo", "Alexandre Matheus Bliska", "Alexandre Mandarino", "Alexandre Lobão", "Alexandre Heredia", "Alexandre de Souza", "Alexandre Costa", "Alexandre Coslei", "Alexandre Benevides Cabral", "Alexandre Beluco", "Alexander Lancaster", "Alex Antunes", "Alessandro Reiffer", "Alessandro Garcia", "Alecsander Machado",
            "Isolina Bresolin Vianna", "Isaias Edson Sidney", "Isabella Sturzeneker Lemgruber", "Isabel Cristina Van Hien", "Isaac Moraes",
            "Inglês de Souza", "Igor Rosa Dias de Jesus", "Ignácio de Loyola Brandão", "Ícaro França", "Iba Mendes", "Humberto Werneck",
            "Humberto Plínio Ribeiro Filho", "Humberto Fimiani", "Humberto de Campos", "Hugo Vera", "Hugo Pedro Carradore", "Homero Gomes",
            "Hilton James Kutscka", "Hildon Rocha", "Hidemberg Alves da Frota", "Heyder de Siqueira Gomes", "Herberto Sales", "Herbert Eustáquio de Carvalho",
            "Herbert Daniel", "Heraldo Assis Barber", "Henry Evaristo", "Henry Alfred Bugalho", "Henrique J. B.", "Henrique Flory", "Heloísa Seixas",
            "Hélio Guimarães", "Hélio Gomes", "Hélio de Seixas Guimarães", "Helena Gomes", "Helando Marques de Souza", "Heidi Gisele Borges", "Hector Lima",
            "Haroldo de Campos", "Hanna Liis-Baxter", "H. V. Flory", "Gustavo Lopes", "Gustavo Faraon", "Gustavo Brauner", "Gustavo Aquino dos Reis",
            "Gumercindo Rocha Dorea", "Guilherme Solari", "Guilherme Smee", "Guilherme Kujawski", "Guilherme Figueiredo", "Guilherme da Silva Braga",
            "Guido Wilmar Sassi", "Greta Benitez", "Grégor Marcondes", "Graciliano Ramos", "Gonzaga Duque", "Gomes Netto", "Godofredo E. Barnsley",
            "Glauco Mattoso", "Gláucio Santos dos Reis", "Giulia Pierro", "Giulia Moon", "Giselle Natsu Sato", "Gisele Oliveira", "Gisele G. Garcia",
            "Gilberto Schoereder", "Gilberto Garcia da Silva", "Gian Danton", "Ghad Arddhu", "Gerson Lodi-Ribeiro", "Germano do Carmo", "Geraldo Lima",
            "Geraldo Galvão Ferraz", "Gerald C. Izaguirre", "Georgiana Calimeris", "Georgette Silen", "Gastão Cruls", "Garcia de Paiva", "Galpi",
            "Galdino Fernandes Pinheiro", "Gadiego Silvestrini", "Gabriel Torres", "Gabriel Réquiem", "Gabriel Coelho", "Gabriel Cantareira",
            "Gabriel Bozano", "Gabriel Boz", "G. Carmo", "Fúlvio Fonseca", "Frodo Oliveira", "Fritz Peter Bendinelli", "Frederico Cabral",
            "Frederico Branco", "Francisco Marques", "Francisco de Assis Barbosa", "Franklin Cascaes", "Floro Freitas de Andrade",
            "Flávio Paranhos", "Flávio Moutinho", "Flávio Moreira da Costa", "Flávio Medeiros", "Flávio J. Cardozo", "Flávio de Souza",
            "Flávio Carneiro", "Flávia Muniz", "Flávia Côrtes", "Flávia Casarejos", "Finisia Fideli", "Ferreira de Albuquerque",
            "Fernando Trevisan", "Fernando Santos de Oliveira", "Fernando Rezende", "Fernando Moretti", "Fernando Messina", "Fernando Mantelli",
            "Fernando Ferric", "Fernando David", "Fernando Correia da Silva", "Fernando Carneiro", "Fernando C. de Araújo Gomes",
            "Fernando Bonassi", "Fernandes & Fernandes", "Fernanda Salla", "Fernanda Furquim", "Fernanda Bohm", "Felipe Kramer",
            "Felipe Castilho", "Felipe Augusto Geraldo", "Fausto Fawcett", "Fausto Cunha", "Fabíola Colares", "Fábio Rezende",
            "Fábio Madrigal Barreto", "Fabio Luiz Haag", "Fábio Fernandes", "Fábio Fabrício Fabretti", "Fábio Aresi", "Fabi Deschamps",
            "F. P. Andrade", "F. Medina", "Euro Oscar C. Nogueira", "Eunice Vartan Nurin", "Eugênio Gomes", "Estevão Ribeiro",
            "Estêvão Luís Bertoni e Silva", "Estevan Lutz", "Ernesto Nakamura", "Ernâni Fornári", "Érico Veríssimo", "Érico Borgo",
            "Erick Santos Cardoso", "Eric Novello", "Eric M. Souza", "Epaminondas Martins", "Enéas Lintz", "Emir Ross", "Emir Ribeiro",
            "Emílio Satoshi Hamaya", "Emília Freitas", "Elson Gomes Alves", "Elsen Pontual", "Elisa Celino", "Elio Antonio Bonavigo",
            "Elias Manjoulento Neto", "Eleazar", "Elara Reis Sanderssonn", "Êferos Masopias", "Edweine Loureiro", "Edward Gapfinder",
            "Eduardo Torres", "Eduardo Spohr", "Eduardo Kasse", "Eduardo Francisco Torres Ferreira", "Eduardo Borsatto", "Edson Bini",
            "Edson Arantes", "Edmundo Donato", "Edla van Steen", "Edison Luis Raffi Silveira", "Edilberto Coutinho", "Edgard Powell",
            "Edgard Guimarães", "Edgard Cavalheiro", "Edgar Smaniotto", "Edgar Franco", "Edgar Cézar Nolasco", "Éder Scarrot", "Eddie Van Feu",
            "Eddie Nunes", "E. R. Correa", "Duílio Gomes", "Duda Falcão", "Douglas Tufano", "Douglas Quinta Reis", "Douglas MCT", "Douglas Eralldo",
            "Dóris Fleury", "Donizete Galvão", "Domingos Pellegrini", "Domingos Carvalho da Silva", "Domenium", "Diva Bernardes Sepulveda",
            "Dirceu Borges", "Dione Mara Souto da Rosa", "Dino J. Braga", "Dinah Silveira de Queiroz", "Diego Protta Casati", "Diego Possamai",
            "Deuszânia G. Almeida", "DEUS NOiTE", "Deonísio da Silva", "Deoclécio Albuquerque Brito", "Denyse Cantuária", "Dennis Vinicius",
            "Denise Reis", "Denise Crispun", "Denis da Cruz", "Denílson E. Ricci", "Denílson Carareto", "Délio Freire", "Delfin", "Deise J. T. de Freitas",
            "Decio One", "Débora Ramires", "Débora Moraes", "Davi Melo", "Davi M. Gonzales", "Davi Arrigucci Jr.", "Daniel Tréz", "Daniel Portes",
            "Daniel Pereira dos Santos", "Daniel Munduruku", "Daniel I. Dutra", "Daniel HDR", "Daniel Gomes", "Daniel Fresnot", "Daniel Folador",
            "Daniel Borba", "Daniel Alvarez", "Dana Guedes", "Dalma Nascimento", "Cristovam Buarque", "Cristina Vergnano", "Cristina Rodriguez",
            "Cristina Lasaitis", "Cristina Faga", "Zora Seljan", "Zenon", "Zé Wellington", "Yvis Tomazini", "Yuri Vieira", "Yêda Schmaltz",
            "Xico Sá", "Wolmyr Alcantara", "Wilton Pacheco", "Wilson Vieira", "Wilson Bueno", "Willian Oliveira", "William Goldoni",
            "William Agel de Mello", "Welington Almeida Pinto", "Warta Nurin", "Walter Paulo Vieira", "Walter Martins", "Walter Costa",
            "Walnice Nogueira Galvão", "Walmir Ayala", "Walmes Nogueira Galvão", "W. Bariani Ortencio", "Volmar Camargo Junior",
            "Viviane Scholtz", "Vitor Hugo Brandini Ribeiro", "Vítor Basílio", "Vitor Alexandre Chnee", "Viriato Correa", "Vincente Sodak",
            "Victor Snaga", "Victor Poe Lovecraft", "Victor Maduro", "Victor Bertazzo", "Victor Berigo", "Verônica Maria de Araújo Pontes",
            "Verônica Freitas", "Vero de Lima", "Veiga Miranda", "Vasco Ribeiro da Costa", "Valéria Hadel", "Valdomiro Silveira", "Valdo Omirax",
            "Valdeci Lopes", "V. Netto", "Ullians Furloni", "Ubiratan Peleteiro", "Túlio Siqueira", "Trabanom", "Tibor Moricz", "Tiago Toy",
            "Tiago Eloy Zaidan", "Tiago Araújo", "Thomaz Lopes", "Thomaz Albornoz", "Thomas Fairchild", "Thiago Lobo", "Thiago Cabello",
            "Terezinha Monteiro Deutsch", "Tereza Ariel", "Teresa Cabanãs", "Teotonio Simões", "Telê Santana", "Tatiana Alves", "Tânia Souza",
            "Tânia Rebelo Costa Serra", "Tânia Nakamura", "Tânia Franco Carvalhal", "Tadeu Pereira", "Sylvio Gonçalves", "Sybylla °°",
            "Suzy M. Hekamiah", "Susete Mendes", "Susana Lorena de Souza", "Susana Lorena", "Sumaya Sarran", "Sueli Tsumori", "Suelen Marinho",
            "Stephan McSucker", "Som", "Solone de Arruda", "Solange Castanheira", "Soares de Faria", "Simone Saueressig", "Simone O. Marques",
            "Simone Caputo Gomes", "Silvio Roberto Mello Moraes", "Sílvio Ribas", "Sílvio Pilau", "Silvio Alexandre", "Silvia Vieira Fragoso",
            "Silvia Randazzo", "Sílvia Helena Penhalbel", "Silveira Júnior", "Silvana Guimarães", "Silas Corrêa Leite", "Sidemar V. de Castro",
            "Sid Castro", "Shirley Souza", "Shaftiel", "Sergio Sparsbrod", "Sergio Napp", "Sergio Fonseca de Castro", "Sérgio Fiúza",
            "Sérgio Bernardo", "Senbur T. Enovacs", "Sebastião Moreira Duarte", "Santiago Santos", "Santiago Nazarian", "Sandro Quintana",
            "Sandra Nunes", "Sandra Franzoso", "Samuel Peregrino", "Samir S. Souza", "Samir Machado de Machado", "Saint-Clair Stockler",
            "Sabá Gervásio", "Ruy Tapioca", "Ruy Jungmann", "Ruth dos Anjos", "Ruth de Biasi", "Rudyard Leão", "Rudá Almeida",
            "Ruby Felisbino Medeiros", "Rúbia Cunha", "Rubens Teixeira Scavone", "Rubens Figueiredo", "Rubens Austro", "Rubenildo P. de Barros",
            "Rossana Santos", "Rosita Silveirinha Paneiro Corrêa", "Rose Santos", "Rosane Gava", "Rosana Rios", "Rosa Sílvia López",
            "Rosa Amanda Strausz", "Ronyglay Carvalho Fonseca", "Ronnie Wells", "Ronaldo Sergio de Biasi", "Ronaldo Sémper Fidelis",
            "Ronaldo Rogério de Freitas Mourão", "Ronaldo Mourão", "Ronaldo Fernandes", "Ronaldo Carlos", "Ronaldo Bressane", "Romeu Martins",
            "Rogers Silva", "Rogério Silvério de Farias", "Rogerio Saladino", "Rogério Paulo Vieira", "Rogério P. Vieira",
            "Rogério Amaral de Vasconcellos", "Roger Techima", "Roger Jones", "Rodrigo van Kampen", "Rodrigo Silva", "Rodrigo Schwarz",
            "Rodrigo Salvador", "Rodrigo Rosf", "Rodrigo Prata", "Rodrigo Novaes de Almeida", "Rodrigo Moreno", "Rodrigo Garrit",
            "Rodrigo Alfonso Figueira", "Rodolfo Teófilo", "Rodolfo Rorato Londero", "Roderico Reis", "Roberval Barcellos",
            "Roberto Schmitt-Prym", "Roberto Schima", "Roberto Protti", "Roberto Melfra", "Roberto Gambini", "Roberto de Sousa Causo",
            "Roberto César Nascimento", "Roberto Brandão", "Roberto Alves", "Roberta Spindler", "Roberta Nunes", "Roberta Larini",
            "Roberley Antonio", "Roberlandio A. Pinheiro", "Rober Pinheiro", "Rioky Inoue", "Rinaldo de Fernandes", "Richard Diegues",
            "Ricardo Teixeira", "Ricardo Jorge Teixeira Martins", "Ricardo E. Caceffo", "Ricardo Delfin", "Ricardo Christe", "Ribeiro Couto",
            "Renê Belmonte", "Renato Rosatti", "Renato Pereira de Souza", "Renato Arfelli", "Renato A. Azevedo", "Renata Ramirez", "Renata Corte",
            "Renata Cantanhede", "Renard Perez", "Renan da Paula Santos", "Renan Barcellos", "Régis Cavini Ferreira", "Regina Drummond",
            "Regina Benitez", "Raymundo Magalhães", "Raul Fiker", "Raul Feteira", "Raphael Draccon", "Ramon Giraldi", "Ramon Bacelar",
            "Ramiro Giroldo", "Ramiro Brizola", "Raimundo Carrero", "Rafael Spinelli", "Rafael Monteiro", "Rafael Lima", "Rafael Kasper",
            "Rafael", "Iron", "Olhaberriet", "Rafael de Agostini Ferreira", "Rafael Cruz", "Rafael Ban Jacobsen", "Rachel de Queiroz",
            "R. Magalhães Junior", "R. Lovato", "R. F. Lucchetti", "R. C. Nascimento", "Priscilla Matsumoto", "Pólo Noel Atan",
            "Plínio Martins Filho", "Plínio Cabral", "Phaulo Gonçalves", "Peterso Rissatti", "Pete Rissatti", "Pereira Lima", "Pena Cabreira",
            "Pedro José Ferreira da Silva", "Pedro Faria", "Pedro Cavini Ferreira", "Paulo Vicente dos Santos Alves", "Paulo Soriano",
            "Paulo Silveira", "Paulo Sandrini", "Paulo Rónai", "Paulo Rios", "Paulo Rangel", "Paulo Mendes Campos", "Paulo Franchetti",
            "Paulo Fodra", "Paulo Elache", "Paulo Dumi", "Paulo Chede Domingos", "Paulo César Born Martinelli", "Paula Mastroberti",
            "Patrícia Ananias da Silva", "Paola Victória Baggio", "Pantaleão Antonio Aniello Perillo", "Paffomiloff der Engel", "Paffomiloff",
            "Ozias Filho", "Otávio Niewinski", "Otacílio Costa d'Assunção Barros", "Otacílio Colares", "Ota", "Osmarco Valladão", "Osman Matos",
            "Osíris Reis", "Osias Gomes", "Oscar Cesarotto", "Osame Kinouchi Filho", "Orlando Paes Filho", "Orígenes Lessa", "Orfeu Brocco",
            "Omar Albio dos Santos Filho", "Olivia Maia", "Oghan N'Thanda", "Odete Rios", "Octávio de Faria", "Octavio Cariello", "Octavio Aragão",
            "O. B. R. Diamor", "Norberto Silva", "Nilza Amaral", "Nilson D. Martello", "Nikelen Witter", "Nicolau Sevcenko", "Nicolas Vasconcelos",
            "Newton Ribeiro Rocha", "Neusa Ximenes", "Nelson Palma Travassos", "Nelson de Oliveira", "Nelson Moraes", "Nelson Magrini",
            "Nelly Cecília Paiva Barreto da Rocha", "Nazarethe Fonseca", "Natalia Yudenitsch", "Natália Couto Azevedo", "Nahum Sirotsky",
            "Murilo Rubião", "Mr. Quadrinhos", "Morgana de Avalon", "Monteiro Lobato", "Mônica Virgo", "Monica Sicuro", "Moisés Baumstein",
            "Moebius Ring", "Moacyr Scliar", "Moacyr Godoy Moreira", "Milton Hatoum", "Millôr Fernandes", "Miguel Yasbeck", "Miguel Pérez",
            "Miguel Patrício Gomes", "Miguel M. Abrahão", "Miguel Jorge", "Miguel Carqueija", "Miguel Angel Pérez Correa", "Michelle Klautau",
            "Michael Santana", "Menotti del Picchia", "Menalton Braff", "Mello Franco, Jr.", "Melissa de Sá", "Medeiros e Albuquerque", "MCPOCO",
            "Mayrant Gallo", "May Parreira e Ferreira", "Maxwell Gun", "Maxs Portes", "Máximo Martins", "Maximiano de Figueiredo Portes",
            "Maximiano Campos", "Max Mallmann", "Mauro Chaves", "Mauro Brandão Lopes", "Maurício Wojciekowski", "Maurício Robe Barbosa",
            "Maurício Montenegro", "Maurício Gagliardi", "Maurício Bugarin", "Mauren Guedes Müller", "Matias Perazoli", "Martha Argel",
            "Marta Rolim", "Marta Machado", "Marta de Senna", "Marne Lucio Guedes", "Marlon Teske", "Mário Sanchez", "Mário Kuperman",
            "Mário Carneiro Jr.", "Mário Carneiro", "Marien Calixte", "Mariana Albuquerque", "Maria Theresa Abelha Alves", "Maria Teresa Rodrigues",
            "Maria Nazareth Alvim de Barros", "Maria Lúcia Perrone Passos", "Maria José Silveira", "Maria Helena Bandeira",
            "Maria Filomena C. L. dos Santos", "Maria Elisa Cervasco", "Maria de Lourdes Teixeira", "Maria de Lourdes Micaldas",
            "Maria de Lourdes Barbosa Corrêa", "Maria da Glória Bordini", "Maria Clotilde B. Vieira", "Maria Aparecida Santilli",
            "Maria Alzira Brum Lemos", "Maria Alice A. Sampaio Dória", "Marcos Rogério Estevam", "Marcos Rey", "Marcos Menezes",
            "Marcos Lopes", "Marcos Baumann", "Marcos A. Melo", "Marco Fontoura", "Marco Bourguignon", "Marco Aurélio Lucchetti",
            "Marco Antônio de Araújo Bueno", "Márcio Souza", "Márcio Renato Bordin", "Marcio Massula Jr.", "Marcio Domenes",
            "Márcio Dison", "Marcio de Lemos", "Márcio Calegaro", "Márcio Bordin", "Márcio Aragão", "Marcia Szajnbok", "Márcia Olivieri",
            "Márcia Maciel", "Marcia Kupstas", "Márcia Guimarães", "Marcelo Utumi", "Marcelo Santoro", "Marcelo Rubens Paiva",
            "Marcelo Pirani Vieira", "Marcelo Milici", "Marcelo Maluf", "Marcelo L. Bighetti", "Marcelo Juchem", "Marcelo Jacinto Ribeiro",
            "Marcelo Galvão", "Marcelo Forlani", "Marcelo Ferroni", "Marcelo Ferlin Assami", "Marcelo Dias Amado", "Marcelo de Oliveira Souza",
            "Marcelo Cassaro", "Marcelo Biguetti", "Marcelo Baldini", "Marcelo Backes", "Marcello Simão Branco", "Marcelino Freire", "Marcela Godoy",
            "Marcel Breton", "Manuel da Costa Pinto", "Manuel Cavalcanti Proença", "Manuel Bandeira", "Manoel Odorico Mendes", "Mairy Sarmanho",
            "Mairy Saramanho", "Magalhães Neto", "Magalhães de Azeredo", "Madô Martins", "Machado de Assis", "M. R. R. Olivieri", "M. D. Amado",
            "M. Cavalcanti Proença", "Lygia Fagundes Telles", "Luzia de Maria", "Luiz Zatar", "Luiz Roberto Guedes", "Luiz Poleto",
            "Luiz Marcos da Fonseca", "Luiz Hasse", "Luiz Galdino", "Luiz Fernando Riesemberg", "Luiz Felipe Viola", "Luiz Felipe Vasques",
            "Luiz Canabrava", "Luiz Bras", "Luiz Beltrão", "Luiz Armando Braga", "Luís Roberto Amabile", "Luís Henrique Pellanda", "Luís Giffoni",
            "Luis Fernando Veríssimo", "Luis Eduardo Matta", "Luis Dill", "Luís Carlos Lemos da Silva", "Luís Carlos Eiras",
            "Luís Augusto Campello Dill", "Luís A. Navarro", "Lúcio Marassi", "Lúcio Manfredi", "Luciano Rodrigues", "Luciano Barreto",
            "Luciano Alves", "Luciana Thomé", "Luciana Fátima", "Lúcia Sá", "Lúcia Machado de Almeida", "Lúcia Abbondatti", "Lucélia Rodrigues",
            "Lucas Rocha", "Lucas L. Rocha", "Lucas Fernando Maziero", "Luan Montà de Castro Pereira de Souza", "Lu Costa", "Lorna Dannan",
            "Lordsir Cabreira de Oliveira", "Londerson da Costa Araújo", "Lizy Tequila", "Livany Salles", "Lira Vargas", "Linx", "Lino França Jr.",
            "Lima Trindade", "Lima Barreto", "Liliana Medeiros", "Lilia Moritz Schwarcz", "Lília Aparecida Pereira da Silva", "Lidia Zuin",
            "Lia Neiva", "Levy Menezes", "Letícia Velásquez", "Leonel Caldela", "Leonardo Zanon", "Leonardo Siviotti", "Leonardo S.",
            "Leonardo Pezzella", "Leonardo Nunes", "Leonardo Nahum Farias", "Leonardo Nahoum", "Leonardo Fróes", "Leonardo Carrion",
            "Leonardo Cabral", "Leon Eliachar", "Léo Nogueira", "Léo Godoy Otero", "Lélia Maria Parreira Duarte", "Leandro Reis", "Leandro Radrak",
            "Leandro Luiz", "Leandro Leite Leocadio", "Leandro Chernicharo", "Leandra Lambert", "Léa Masina", "Laurita Mourão", "Laura Fuentes",
            "Larissa Redeker", "Larissa Caruso", "Laris Neal", "Lancast Mota", "Laíza Verçosa do Nascimento", "Lainister de Oliveira Esteves",
            "Laila Ribeiro", "Laerte Francisco Lemmi", "Lady Sybylla", "Lady Blond", "L. F. Riesemberg", "Kristian Moura", "Kofal Filho",
            "Kizzy Ysatis", "Késsia Nina", "Kelvin K.", "Kathia Brienza", "Karina Brossi", "Karen Alvares", "Junior Cazeri", "Júlio Emílio Braz",
            "Juliano Sasseron", "Juliano B. Alves", "Juliana Lopes", "Juliana Calderari", "Juarez Guedes Cruz", "Jota Marques", "Josué Oliveira",
            "Josué Montello", "Josué Guimarães", "Josiel Vieira", "Joshua Falken", "José Thomaz Brum", "José S. Fernandes", "Jose Ronaldo Viega Alves",
            "José Roberto Vieira", "José Paulo Paes", "José Neres", "José Maria Rodrigues Filho", "José Maria Doménech Tarafa",
            "José Maria Doménech T.", "José Luiz S. Nóbrega", "José Luiz Nunes", "José Luiz Aidar", "José Joaquim Medeiros de Albuquerque",
            "José Guilherme Correa Pinto", "José Geraldo Vieira", "José Geraldo Couto", "José Fernandes", "José dos Santos Fernandes",
            "José de Paula Ramos, Jr.", "José Castello", "José Carlos Neves", "José Carlos da Silva", "Jorge Schwartz", "Jorge Rachaus",
            "Jorge Murad", "Jorge Moreira Nunes", "Jorge Luiz Calife", "Jorge Amado", "Jonatas Turcato Syrayama", "John Dekowes", "Johannes Newton",
            "Joaquim Manuel de Macedo", "Joaquim Gomes", "João Ubaldo Ribeiro", "João Ribeiro", "João Ribas da Costa", "João Paulo Vaz"}));
    }

    public void readTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tabelaCadastroLivro.getModel();
        modelo.setNumRows(0);
        TabelaLivroDAO ldao = new TabelaLivroDAO();

        for (Livro livro : ldao.read()) {
            modelo.addRow(new Object[]{
                livro.getIdLivro(),
                livro.getTitulo(),
                livro.getAutor(),
                livro.getEditora(),
                livro.getAnoEdicao(),
                livro.getVolume(),
                livro.getLocal(),}
            );

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcEditora = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jcAutor = new javax.swing.JComboBox<>();
        txtVolume = new javax.swing.JTextField();
        txtAnoEdicao = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroLivro = new javax.swing.JTable();
        btEditar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setText("Título");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 200, 30, 16);

        getContentPane().add(jcEditora);
        jcEditora.setBounds(270, 320, 240, 25);

        jLabel2.setText("Autor");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 250, 30, 16);

        jLabel3.setText("Editora");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 300, 60, 16);

        jLabel4.setText("Quant.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 360, 36, 16);

        jLabel5.setText("Edição");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 360, 60, 16);
        getContentPane().add(txtTitulo);
        txtTitulo.setBounds(270, 220, 470, 25);

        jcAutor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcAutorAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAutorActionPerformed(evt);
            }
        });
        getContentPane().add(jcAutor);
        jcAutor.setBounds(270, 270, 240, 25);
        getContentPane().add(txtVolume);
        txtVolume.setBounds(370, 380, 80, 25);
        getContentPane().add(txtAnoEdicao);
        txtAnoEdicao.setBounds(270, 380, 80, 25);

        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(300, 440, 107, 32);

        btEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEditar.setText("Atualizar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(430, 440, 107, 32);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Cadastro de Livro");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 60, 293, 48);
        getContentPane().add(txtId);
        txtId.setBounds(270, 160, 90, 25);

        jLabel6.setText("ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 140, 40, 16);

        jLabel8.setText("(Pesquisa)");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 160, 100, 16);
        getContentPane().add(txtLocal);
        txtLocal.setBounds(510, 380, 190, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/livros.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(67, 34, 128, 128);

        tabelaCadastroLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Autor", "Editora", "Edição", "Quant.", "Local"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCadastroLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCadastroLivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCadastroLivro);
        if (tabelaCadastroLivro.getColumnModel().getColumnCount() > 0) {
            tabelaCadastroLivro.getColumnModel().getColumn(0).setMinWidth(30);
            tabelaCadastroLivro.getColumnModel().getColumn(0).setMaxWidth(30);
            tabelaCadastroLivro.getColumnModel().getColumn(4).setMinWidth(60);
            tabelaCadastroLivro.getColumnModel().getColumn(4).setMaxWidth(60);
            tabelaCadastroLivro.getColumnModel().getColumn(5).setMinWidth(80);
            tabelaCadastroLivro.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 510, 921, 200);

        btEditar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEditar1.setText("Limpar");
        btEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar1);
        btEditar1.setBounds(560, 440, 107, 32);

        jLabel11.setText("Local");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(510, 360, 210, 16);

        setSize(new java.awt.Dimension(990, 792));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                         

        if ("".equals(txtTitulo.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o título do livro", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("Selecionar".equals(jcAutor.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Selecione o autor do livro", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("Selecionar".equals(jcEditora.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Selecione a editora do livro", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(txtAnoEdicao.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o ano da edição do livro", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(txtVolume.getText())) {
            JOptionPane.showMessageDialog(null, "Digite a quantidade que será inserida na biblioteca", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else {

            Livro livro = new Livro();

            //livro.setIdLivro(Integer.parseInt(txtId.getText()));
            livro.setTitulo(txtTitulo.getText());
            livro.setAutor(jcAutor.getSelectedItem().toString());
            livro.setEditora(jcEditora.getSelectedItem().toString());
            livro.setAnoEdicao(txtAnoEdicao.getText());
            livro.setVolume(Integer.parseInt(txtVolume.getText()));
            livro.setLocal(txtLocal.getText());

            Dao dao = new Dao();
            int resp;
            boolean status;

            status = dao.conectar();
            if (status == false) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
            } else {
                resp = dao.salvarLivro(livro);
                if (resp == 1) {
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                    readTabela();
                    limpar();
                } else if (resp == 1062) {
                    JOptionPane.showMessageDialog(null, "ID já cadastrada.");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar salvar os dados.");
                }
                dao.desconectar();
            }
        }


    }                                        
    public void limpar() {//METODO QUE LIMPAR OS CAMPOS PREENCHIDO
        txtId.setText(null);
        txtTitulo.setText(null);
        txtLocal.setText(null);
        txtVolume.setText(null);
        txtAnoEdicao.setText(null);
        jcAutor.setSelectedItem("Selecionar");
        jcEditora.setSelectedItem("Selecionar");
    }
    private void jcAutorActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jcAutorAncestorAdded(javax.swing.event.AncestorEvent evt) {                                      
//       Dao dao = new Dao();
//       List<Autor>ListadeAutores = dao.listaAutores();
//       jcAutor.removeAll();

    }                                     

    private void tabelaCadastroLivroMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        if (tabelaCadastroLivro.getSelectedRow() != -1) {

            // txtIDold.setText(tabelaAutor.getValueAt(tabelaAutor.getSelectedRow(), 0).toString());
            txtId.setText(tabelaCadastroLivro.getValueAt(tabelaCadastroLivro.getSelectedRow(), 0).toString());
            txtTitulo.setText(tabelaCadastroLivro.getValueAt(tabelaCadastroLivro.getSelectedRow(), 1).toString());
            jcAutor.setSelectedItem(tabelaCadastroLivro.getValueAt(tabelaCadastroLivro.getSelectedRow(), 2));
            jcEditora.setSelectedItem(tabelaCadastroLivro.getValueAt(tabelaCadastroLivro.getSelectedRow(), 3));
            txtAnoEdicao.setText(tabelaCadastroLivro.getValueAt(tabelaCadastroLivro.getSelectedRow(), 4).toString());
            txtVolume.setText(tabelaCadastroLivro.getValueAt(tabelaCadastroLivro.getSelectedRow(), 5).toString());
            txtLocal.setText(tabelaCadastroLivro.getValueAt(tabelaCadastroLivro.getSelectedRow(), 6).toString());

        }
    }                                                

    private void btEditar1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        limpar();
    }                                         

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {                                         

        if ("".equals(txtTitulo.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o título do livro", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("Selecionar".equals(jcAutor.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Selecione o autor do livro", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("Selecionar".equals(jcEditora.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Selecione a editora do livro", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(txtAnoEdicao.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o ano da edição do livro", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(txtVolume.getText())) {
            JOptionPane.showMessageDialog(null, "Digite a quantidade que será inserida na biblioteca", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else {
            if (tabelaCadastroLivro.getSelectedRow() != -1) {

                // tabelaAutor.setValueAt(txtAutor.getText(),tabelaAutor.getSelectedRow(),1);
                Livro l = new Livro(); // estancia a tabelaAutor

                TabelaLivroDAO dao = new TabelaLivroDAO(); //estancia a tabelaAutorDAO

                l.setIdLivro((int) tabelaCadastroLivro.getValueAt(tabelaCadastroLivro.getSelectedRow(), 0));// capta o ID selecionado e seta no atributo ID
                l.setTitulo(txtTitulo.getText()); // capta os dados do campo de texto txtTitulo e ceta no atributo nome
                l.setAutor(String.valueOf(jcAutor.getSelectedItem())); // capta os dados do campo de texto jcAutor e ceta no atributo nome
                l.setEditora(String.valueOf(jcEditora.getSelectedItem())); // capta os dados do campo de texto jcEditora e ceta no atributo Editora
                l.setAnoEdicao(txtAnoEdicao.getText()); // capta os dados do campo de texto txtAnoEdicao e ceta no atributo AnoEdicao
                l.setVolume(Integer.parseInt(txtVolume.getText())); //capta os dados do campo txtVolume e ceta no atributo AnoEdicao
                l.setLocal(txtLocal.getText()); // capta os dados do campo de texto txtLocal e ceta no atributo local

                dao.update(l); // chama o metodo UPDATE

                // txtAutor.setText(null);// limpa o campo de texto
                readTabela(); // atualiza a tabela
                limpar();

            }
        }

    }                                        

//    private void apagar() {
//        txtId.setText(null);
//        txtTitulo.setText(null);
//        jcAutor.setSelectedItem(null);
//        jcEditora.setSelectedItem("Selecionar");
//        txtAnoEdicao.setText(null);
//        txtVolume.setText(null);
//        txtLocal.setText(null);
//        txtTitulo.requestFocus();
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEditar1;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcAutor;
    private javax.swing.JComboBox<String> jcEditora;
    private javax.swing.JTable tabelaCadastroLivro;
    private javax.swing.JTextField txtAnoEdicao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtVolume;
    // End of variables declaration                   
}
```
### Classe CadastroUsuario
```
package view;

import connection.TabelaUsuarioDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Dao;
import model.TabelaAutor;
import model.Usuario;

public class CadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
        setTitle("Sistema de Gerenciamento de Biblioteca – SGB - Cadastro de Usuário");
        setResizable(false);
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tabelaCadastroUsuario.getModel();
        tabelaCadastroUsuario.setRowSorter(new TableRowSorter(modelo));
        readTabela();

        txtId.setVisible(false);
        jLabel6.setVisible(false);
    }

    public void readTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tabelaCadastroUsuario.getModel();
        modelo.setNumRows(0);
        TabelaUsuarioDAO edao = new TabelaUsuarioDAO();

        for (Usuario usuario : edao.read()) { //referencia a classe
            modelo.addRow(new Object[]{
                usuario.getIdUsuario(),
                usuario.getNome(),
                usuario.getNomeUsuario(), //usuario.getSenha(),
            // usuario.getNivelHierarquico()
            });

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jcNivelHierarquico = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtSenha2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroUsuario = new javax.swing.JTable();
        btAtualizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        jLabel1.setText("Usuário");

        jLabel2.setText("Confirmar senha");

        jLabel3.setText("Nível Hierárquico");

        jcNivelHierarquico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Administrador", "Atendente", "Gerente" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Cadastro de Usuário");

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtSenha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSenha2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSenha2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSenha2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSenha2MousePressed(evt);
            }
        });
        txtSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenha2ActionPerformed(evt);
            }
        });
        txtSenha2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtSenha2PropertyChange(evt);
            }
        });

        jLabel5.setText("Senha");

        jLabel6.setText("ID");

        jLabel7.setText("Nome");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add usuario.png"))); // NOI18N

        tabelaCadastroUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Nome Usuário"
            }
        ));
        tabelaCadastroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCadastroUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCadastroUsuario);
        if (tabelaCadastroUsuario.getColumnModel().getColumnCount() > 0) {
            tabelaCadastroUsuario.getColumnModel().getColumn(0).setMinWidth(30);
            tabelaCadastroUsuario.getColumnModel().getColumn(0).setMaxWidth(30);
            tabelaCadastroUsuario.getColumnModel().getColumn(1).setMinWidth(500);
            tabelaCadastroUsuario.getColumnModel().getColumn(1).setMaxWidth(800);
        }

        btAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSenha2)
                                            .addComponent(txtUsuario)
                                            .addComponent(txtSenha)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcNivelHierarquico, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAtualizar)
                .addGap(18, 18, 18)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcNivelHierarquico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btAtualizar)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(835, 792));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        String senha = new String(txtSenha.getPassword());
        String senha2 = new String(txtSenha2.getPassword());

//        if ("".equals(txtId.getText())) {
//            JOptionPane.showMessageDialog(null, "Digite o ID do usuário.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
//
//        } else 
        if ("".equals(txtUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o nome do usuário.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(senha)) {
            JOptionPane.showMessageDialog(null, "Digite a senha do usuário.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(senha2)) {
            JOptionPane.showMessageDialog(null, "Confirme a senha do usuário.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("Selecionar".equals(jcNivelHierarquico.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Escolha o nível Hierárquico do usuário.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if (!senha.equals(senha2)) {
            JOptionPane.showMessageDialog(null, "As senhas não correspondem.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtSenha.requestFocus();

        } else {

            Usuario usuario = new Usuario();

            // usuario.setIdUsuario(Integer.parseInt(txtId.getText()));
            usuario.setNome(txtNome.getText());
            usuario.setNomeUsuario(txtUsuario.getText());
            usuario.setSenha(String.valueOf(txtSenha.getPassword()));
//            usuario.setNivelHierarquico(jcNivelHierarquico.getItemAt(WIDTH));
            usuario.setNivelHierarquico(jcNivelHierarquico.getSelectedItem().toString());

            Dao dao = new Dao();

            int resp;
            boolean status;

            status = dao.conectar();
            if (status == false) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.");
            } else {
                resp = dao.salvarUsuario(usuario);
                if (resp == 1) {
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                    readTabela();
//                    JOptionPane.showMessageDialog(null,usuario.getNivelHierarquico());
                    limparCampo();
                } else if (resp == 1062) {
                    JOptionPane.showMessageDialog(null, "Matricula já cadastrada.");
                    txtId.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar salvar os dados.");
                }
                dao.desconectar();
            }

        }
    }                                        

    private void txtSenha2MouseClicked(java.awt.event.MouseEvent evt) {                                       


    }                                      

    private void txtSenha2ActionPerformed(java.awt.event.ActionEvent evt) {                                          

    }                                         

    private void txtSenha2MouseEntered(java.awt.event.MouseEvent evt) {                                       

    }                                      

    private void txtSenha2MouseExited(java.awt.event.MouseEvent evt) {                                      

    }                                     

    private void txtSenha2PropertyChange(java.beans.PropertyChangeEvent evt) {                                         

    }                                        

    private void txtSenha2MousePressed(java.awt.event.MouseEvent evt) {                                       

    }                                      

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir o usuário(a) " + txtUsuario.getText() + "?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {

            if (tabelaCadastroUsuario.getSelectedRow() != -1) {

                // tabelaAutor.setValueAt(txtAutor.getText(),tabelaAutor.getSelectedRow(),1);
                Usuario usuario = new Usuario(); // estancia a tabelaAutor

                TabelaUsuarioDAO dao = new TabelaUsuarioDAO(); //estancia a tabelaAutorDAO

                usuario.setNome(txtNome.getText()); // capta os dados do campo de texto txtAutor e seta no atributo nome

                usuario.setIdUsuario((int) tabelaCadastroUsuario.getValueAt(tabelaCadastroUsuario.getSelectedRow(), 0));// capta o ID selecionado e seta no atributo ID

                dao.delete(usuario); // chama o metodo UPDATE

                txtNome.setText(null);// limpa o campo de texto
                txtUsuario.setText(null);// limpa o campo de texto
                txtSenha.setText(null);// limpa o campo de texto
                txtSenha2.setText(null);// limpa o campo de texto
                readTabela(); // atualiza a tabela

            }
        } else {

        }
    }                                         

    private void tabelaCadastroUsuarioMouseClicked(java.awt.event.MouseEvent evt) {                                                   

        if (tabelaCadastroUsuario.getSelectedRow() != -1) {

            //  txtId.setText(tabelaCadastroUsuario.getValueAt(tabelaCadastroUsuario.getSelectedRow(), 0).toString());
            txtNome.setText(tabelaCadastroUsuario.getValueAt(tabelaCadastroUsuario.getSelectedRow(), 1).toString());
            txtUsuario.setText(tabelaCadastroUsuario.getValueAt(tabelaCadastroUsuario.getSelectedRow(), 2).toString());

        }
    }                                                  

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {                                            

        String senha = new String(txtSenha.getPassword());
        String senha2 = new String(txtSenha2.getPassword());

//        if ("".equals(txtId.getText())) {
//            JOptionPane.showMessageDialog(null, "Digite o ID do usuário.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
//
//        } else 
        if ("".equals(txtUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o nome do usuário.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(senha)) {
            JOptionPane.showMessageDialog(null, "Digite a senha do usuário.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(senha2)) {
            JOptionPane.showMessageDialog(null, "Confirme a senha do usuário.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("Selecionar".equals(jcNivelHierarquico.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Escolha o nível Hierárquico do usuário.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if (!senha.equals(senha2)) {
            JOptionPane.showMessageDialog(null, "As senhas não correspondem.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            txtSenha.requestFocus();

        } else {

            if (tabelaCadastroUsuario.getSelectedRow() != -1) {

                // tabelaAutor.setValueAt(txtAutor.getText(),tabelaAutor.getSelectedRow(),1);
                Usuario u = new Usuario(); // estancia a tabelaAutor

                TabelaUsuarioDAO dao = new TabelaUsuarioDAO(); //estancia a tabelaAutorDAO

                u.setIdUsuario((int) tabelaCadastroUsuario.getValueAt(tabelaCadastroUsuario.getSelectedRow(), 0));// capta o ID selecionado e seta no atributo ID
                u.setNome(txtNome.getText()); // capta os dados do campo de texto txtNome e ceta no atributo nome
                u.setNomeUsuario(txtUsuario.getText());//capta os dados do campo de texto txtUsuario e ceta no atributo nomeUsuario
                u.setNivelHierarquico(String.valueOf(jcNivelHierarquico.getSelectedItem())); //capta a opção selecionada e ceta no atributo NivelHierarquivo
                u.setSenha(String.valueOf(txtSenha.getPassword()));//capta os dados do campo de texto txtUsuario e ceta no atributo nomeUsuario

                dao.update(u); // chama o metodo UPDATE

                limparCampo();
                readTabela(); // atualiza a tabela

            }

        }
    }                                           

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {                                         
        limparCampo();
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    public void limparCampo() {
        //txtId.setText(null);
        txtNome.setText(null);
        txtUsuario.setText(null);
        txtSenha.setText(null);
        txtSenha2.setText(null);
        jcNivelHierarquico.setSelectedItem("Selecionar");
        txtNome.requestFocus();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcNivelHierarquico;
    private javax.swing.JTable tabelaCadastroUsuario;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenha2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration                   
}

```
### Classe ConsultaLivro
```

package view;


public class ConsultaLivro extends javax.swing.JFrame {

    public ConsultaLivro() {
        setTitle("Sistema de Gerenciamento de Biblioteca – SGB - Consulta de Livro.");
        initComponents();
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLivro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEditora = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Consulta de Livros");

        jLabel2.setText("Título");

        jLabel3.setText("Autor");

        jLabel4.setText("Editora");

        btPesquisar.setText("Pesquisar");

        btApagar.setText("Apagar");
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Autor", "Editora", "Quant.", "Local"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/consulta.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAutor)
                                    .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btPesquisar)
                        .addGap(43, 43, 43)
                        .addComponent(btApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar)
                    .addComponent(btApagar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(881, 671));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtAutor.setText(null);
        txtLivro.setText(null);
        txtEditora.setText(null);
        txtLivro.requestFocus();

    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtLivro;
    // End of variables declaration                   
}
```
### Classe Login
```
package view;

//import com.formdev.flatlaf.FlatLightLaf;
//import com.formdev.flatlaf.FlatLightLaf;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ConexaoDAO;
import model.Usuario;
import model.*;

//import view.Login;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
       setResizable(false);
        initComponents();
        txtSenha_OLD.setVisible(false);
        txtUsuario_OLD.setVisible(false);
        txtUsuario.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtUsuario_OLD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtSenha_OLD = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuarioCliente = new javax.swing.JTextField();
        txtSenhaCliente = new javax.swing.JPasswordField();
        btEntrarCliente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento para Biblioteca - SGB - Login");

        jPanel1.setLayout(null);

        txtUsuario_OLD.setEnabled(false);
        txtUsuario_OLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario_OLDActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario_OLD);
        txtUsuario_OLD.setBounds(50, 90, 90, 20);

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Usuário");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 270, 90, 16);

        txtSenha_OLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenha_OLD_OLDActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenha_OLD);
        txtSenha_OLD.setBounds(50, 60, 90, 20);

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 270, 100, 16);

        jLabel5.setFont(new java.awt.Font("Corbel Light", 3, 24)); // NOI18N
        jLabel5.setText("Login Funcionário");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 40, 180, 30);

        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btEntrar);
        btEntrar.setBounds(430, 290, 80, 30);
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(10, 290, 190, 30);
        jPanel1.add(txtSenha);
        txtSenha.setBounds(220, 290, 190, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Livro.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(160, 60, 122, 158);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SGB3.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(270, 130, 120, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sistema2.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(70, 190, 320, 60);

        jTabbedPane1.addTab("Login funcionário", jPanel1);

        jPanel2.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Usuário");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 270, 110, 16);

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Senha");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(220, 270, 100, 16);
        jPanel2.add(txtUsuarioCliente);
        txtUsuarioCliente.setBounds(10, 290, 190, 30);
        jPanel2.add(txtSenhaCliente);
        txtSenhaCliente.setBounds(220, 290, 190, 30);

        btEntrarCliente.setText("Entrar");
        btEntrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btEntrarCliente);
        btEntrarCliente.setBounds(430, 290, 80, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Livro.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(160, 60, 122, 158);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SGB3.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(270, 130, 120, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sistema2.png"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(70, 190, 320, 60);

        jLabel16.setFont(new java.awt.Font("Corbel Light", 3, 24)); // NOI18N
        jLabel16.setText("Login leitor");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(170, 40, 152, 23);

        jTabbedPane1.addTab("Login Cliente", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(539, 429));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        Usuario usuario = new Usuario();
//        usuario.setUsuario(txtUsuario.getText());
//        usuario.setSenha(txtSenha.getText());
//
//        if ("jeff".equals(usuario.getUsuario()) && "123".equals(usuario.getSenha())) {
//
//            TelaPrincipal tela = new TelaPrincipal();
//
//            tela.setVisible(true);
//           // setUndecorated(true);
//            dispose();
//        } else {
//            JOptionPane.showMessageDialog(null, "Usuário e senha inválidos.");
//        }

//        String senha = new String (txtSenha.getPassword());
//        String senha = new String(txtSenha_OLD.getPassword());
        String senha = new String(txtSenha.getPassword());

//        if ("".equals(txtUsuario_OLD.getText())) {
        if ("".equals(txtUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o nome do usuário", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(senha)) {
            JOptionPane.showMessageDialog(null, "Digite a senha do usuário", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else {

            ConexaoDAO conexaoDao = new ConexaoDAO();
            try {
                ResultSet rs;

                Usuario usuario = new Usuario();

                usuario.setNomeUsuario(txtUsuario.getText());
//                usuario.setNomeUsuario(txtUsuario_OLD.getText());
                usuario.setSenha(String.valueOf(txtSenha.getPassword()));
//                usuario.setSenha(String.valueOf(txtSenha_OLD.getPassword()));

                UsuarioDAO usuarioDAO = new UsuarioDAO();

                rs = usuarioDAO.autenticacaoUsuario(usuario);
                if (rs.next()) {

                    String logado = new String(txtUsuario.getText());
//                    String logado = new String(txtUsuario_OLD.getText());
                    // Dao dao = new Dao();
                    model.LoginUsuario logar = new model.LoginUsuario();
                    logar.setLogado(logado);
                    //logado = dao.usuarioLogado(l);

//                    new TelaPrincipal().setVisible(true);
                    logLogin();// CHAMA O METODO PARA GRAVAR NO BD O USUÁRIO LOGADO
                    new Tela().setVisible(true);
                    dispose();
                    conexaoDao.desconectar();

                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválido.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
                    txtUsuario.setText(null);
                    txtSenha.setText(null);
                    txtUsuario.requestFocus();
                    conexaoDao.desconectar();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar logar no sistema.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
                conexaoDao.desconectar();

            }

        }
    }                                        

    public void logLogin() {
        //            Editora editora = new Editora(txtEditora.getText());
        Log log = new Log(txtUsuario.getText());

        Dao dao = new Dao();

        int resp;
        boolean status;

        status = dao.conectar();
        if (status == false) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else {
            resp = dao.salvarLog(log);
            if (resp == 1) {
                //JOptionPane.showMessageDialog(null, "usuário cadastrada com sucesso!");

            } else if (resp == 1062) {
                // JOptionPane.showMessageDialog(null, "Matricula já cadastrada.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao tentar salvar os dados (LOG).");
            }
            dao.desconectar();
        }
    }


    private void btEntrarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                
        String senha = new String(txtSenhaCliente.getPassword());

        if ("".equals(txtUsuarioCliente.getText())) {
            JOptionPane.showMessageDialog(null, "Digite seu usuário", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(senha)) {
            JOptionPane.showMessageDialog(null, "Digite sua senha", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else {

            ConexaoDAO conexaoDao = new ConexaoDAO();
            try {
                ResultSet rs;

//              Usuario usuario = new Usuario();
                Leitor leitor = new Leitor();

                leitor.setUsuario(txtUsuarioCliente.getText());
                leitor.setSenha(String.valueOf(txtSenhaCliente.getPassword()));

//                UsuarioDAO usuarioDAO = new UsuarioDAO();
                ClienteDao clienteDAO = new ClienteDao();

                rs = clienteDAO.autenticacaoCliente(leitor);
                if (rs.next()) {

                    String logado = new String(txtUsuarioCliente.getText());
                    // Dao dao = new Dao();
                    model.LoginCliente logar = new model.LoginCliente();
//                    model.LoginUsuario logar = new model.LoginUsuario();
                    logar.setClienteLogado(logado);
                    //logado = dao.usuarioLogado(l);

//                    new TelaPrincipal().setVisible(true);
                    logLoginCliente();
                    new TelaCliente().setVisible(true);
                    dispose();
                    conexaoDao.desconectar();

                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválido.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
                    conexaoDao.desconectar();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar logar no sistema.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
                conexaoDao.desconectar();

            }
        }
        
    }                                               
    public void logLoginCliente() {
        //            Editora editora = new Editora(txtEditora.getText());
        Log log = new Log(txtUsuarioCliente.getText());

        Dao dao = new Dao();

        int resp;
        boolean status;

        status = dao.conectar();
        if (status == false) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

        } else {
            resp = dao.salvarLog(log);
            if (resp == 1) {
                //JOptionPane.showMessageDialog(null, "usuário cadastrada com sucesso!");

            } else if (resp == 1062) {
                // JOptionPane.showMessageDialog(null, "Matricula já cadastrada.", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao tentar salvar os dados (LOG).");
            }
            dao.desconectar();
        }
    }
    
    private void txtUsuario_OLDActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void txtSenha_OLD_OLDActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
//        FlatLightLaf.setup();//TEMA
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btEntrarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenhaCliente;
    private javax.swing.JPasswordField txtSenha_OLD;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioCliente;
    private javax.swing.JTextField txtUsuario_OLD;
    // End of variables declaration                   

}
```
### Classe ConsultaLivro
```

package view;


public class ConsultaLivro extends javax.swing.JFrame {

    public ConsultaLivro() {
        setTitle("Sistema de Gerenciamento de Biblioteca – SGB - Consulta de Livro.");
        initComponents();
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLivro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEditora = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Consulta de Livros");

        jLabel2.setText("Título");

        jLabel3.setText("Autor");

        jLabel4.setText("Editora");

        btPesquisar.setText("Pesquisar");

        btApagar.setText("Apagar");
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Autor", "Editora", "Quant.", "Local"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/consulta.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAutor)
                                    .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btPesquisar)
                        .addGap(43, 43, 43)
                        .addComponent(btApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar)
                    .addComponent(btApagar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(881, 671));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtAutor.setText(null);
        txtLivro.setText(null);
        txtEditora.setText(null);
        txtLivro.requestFocus();

    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtLivro;
    // End of variables declaration                   
}
```
### Classe RelatorioLivroCadastrado
```
package view;


public class RelatorioLivroCadastrado extends javax.swing.JFrame {

  
    public RelatorioLivroCadastrado() {
        setTitle("Sistema de Gerenciamento de Biblioteca – SGB - Relatório de Livro.");
        initComponents();
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        Grupo2 = new javax.swing.ButtonGroup();
        Grupo3 = new javax.swing.ButtonGroup();
        Grupo4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbAutor = new javax.swing.JRadioButton();
        rbEditora = new javax.swing.JRadioButton();
        rbTitulo = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        rbEmprestimo = new javax.swing.JRadioButton();
        rbSemEmprestimo = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbID = new javax.swing.JRadioButton();
        rbQuant = new javax.swing.JRadioButton();
        rbLocal = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btApagar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Relatório de Livros");

        rbAutor.setText("Autor");

        rbEditora.setText("Editora");

        rbTitulo.setText("Título");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rbEditora))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbTitulo)
                            .addComponent(rbAutor))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAutor)
                .addGap(9, 9, 9)
                .addComponent(rbEditora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rbEmprestimo.setText("Empréstimo");

        rbSemEmprestimo.setText("Sem empréstimo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEmprestimo)
                    .addComponent(rbSemEmprestimo))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbEmprestimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbSemEmprestimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Por:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Com:");

        jLabel5.setText("Download:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Grupo2.add(jRadioButton2);
        jRadioButton2.setText("Excel");

        Grupo2.add(jRadioButton7);
        jRadioButton7.setText("PDF");

        jButton1.setText("Gerar relatório");

        jButton2.setText("Download");

        rbID.setText("ID");

        rbQuant.setText("Quant.");

        rbLocal.setText("Local de armazenamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbID)
                    .addComponent(rbQuant)
                    .addComponent(rbLocal))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rbID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbQuant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbLocal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Outros:");

        btApagar.setText("Apagar");
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/consulta.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(30, 30, 30))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4))
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btApagar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton7)
                    .addComponent(jButton2))
                .addGap(11, 11, 11))
        );

        setSize(new java.awt.Dimension(932, 702));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        apagar();
    }                                        
    public void apagar() {

        rbTitulo.setSelected(false);
        rbAutor.setSelected(false);
        rbEditora.setSelected(false);
        rbEmprestimo.setSelected(false);
        rbSemEmprestimo.setSelected(false);
        rbID.setSelected(false);
        rbQuant.setSelected(false);
        rbLocal.setSelected(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioLivroCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioLivroCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioLivroCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioLivroCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioLivroCadastrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.ButtonGroup Grupo2;
    private javax.swing.ButtonGroup Grupo3;
    private javax.swing.ButtonGroup Grupo4;
    private javax.swing.JButton btApagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbAutor;
    private javax.swing.JRadioButton rbEditora;
    private javax.swing.JRadioButton rbEmprestimo;
    private javax.swing.JRadioButton rbID;
    private javax.swing.JRadioButton rbLocal;
    private javax.swing.JRadioButton rbQuant;
    private javax.swing.JRadioButton rbSemEmprestimo;
    private javax.swing.JRadioButton rbTitulo;
    // End of variables declaration                   
}
```
### Classe Tela (Tela Principal)
```

package view;

import model.ConexaoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Tela extends javax.swing.JFrame {


    public Tela() {
        initComponents();
        usuarioLogado();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }
    
public void usuarioLogado(){ // CONEXÃO COM O BANDO DE DADOS PARA PEGAR NA TABELA LOG O ULTIMO USUARIO LOGADO E MOSTRAR NA TELA
    
      ConexaoDAO conexao = new ConexaoDAO();
        Connection conn =  conexao.conectarlog();

        try {
//            String consulta = "SELECT * FROM pessoa WHERE nome like 'J%'";
            String consulta = "SELECT usuario FROM log ORDER BY id DESC LIMIT 1;";
            Statement stm = conn.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);

            while (resultado.next()) {

//                NewJFrame tela = new NewJFrame();
                String nome = resultado.getString("USUARIO");
                
                String primeiraLetra = nome.substring(0,1).toUpperCase();// a primeira letra do nome digitado fica maiuscula
                String restoDoTexto = nome.substring(1).toLowerCase();// da sgunda letra em diante do nome digitado fica miniscula

                txtUsuarioLogado.setText(primeiraLetra + restoDoTexto);

            }

        } catch (Exception ex) {
            System.out.println("Nao conseguiu consultar os dados de Log");
        } finally {
            conexao.desconectarLog(conn);
        }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btEditora = new javax.swing.JButton();
        btAutores = new javax.swing.JButton();
        btLeitores = new javax.swing.JButton();
        btLivros = new javax.swing.JButton();
        btUsuarios = new javax.swing.JButton();
        txtUsuarioLogado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btEmprestimo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btCobsultaLivro = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btRelatorioLivro = new javax.swing.JButton();
        btRelatorioEmprestimo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Biblioteca – SGB");

        btEditora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEditora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editora3.png"))); // NOI18N
        btEditora.setText("Editoras");
        btEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditoraActionPerformed(evt);
            }
        });

        btAutores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAutores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Autor.png"))); // NOI18N
        btAutores.setText("Autores");
        btAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutoresActionPerformed(evt);
            }
        });

        btLeitores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLeitores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/leitores2.png"))); // NOI18N
        btLeitores.setText("Leitores");
        btLeitores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLeitoresActionPerformed(evt);
            }
        });

        btLivros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/livros.png"))); // NOI18N
        btLivros.setText("Livros");
        btLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLivrosActionPerformed(evt);
            }
        });

        btUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add usuario.png"))); // NOI18N
        btUsuarios.setText("Usuários");
        btUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuariosActionPerformed(evt);
            }
        });

        txtUsuarioLogado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUsuarioLogado.setText("usuario.logado");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Usuario logado.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsuarioLogado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btEditora)
                        .addGap(18, 18, 18)
                        .addComponent(btAutores)
                        .addGap(18, 18, 18)
                        .addComponent(btLeitores)
                        .addGap(18, 18, 18)
                        .addComponent(btLivros)
                        .addGap(18, 18, 18)
                        .addComponent(btUsuarios)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsuarioLogado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditora)
                    .addComponent(btAutores)
                    .addComponent(btLeitores)
                    .addComponent(btLivros)
                    .addComponent(btUsuarios))
                .addContainerGap(379, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        btEmprestimo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emprestimo.png"))); // NOI18N
        btEmprestimo.setText("Empréstimo");
        btEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btEmprestimo)
                .addContainerGap(1122, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btEmprestimo)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empréstimo", jPanel2);

        btCobsultaLivro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btCobsultaLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/consulta.png"))); // NOI18N
        btCobsultaLivro.setText("Livros/Títulos");
        btCobsultaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCobsultaLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btCobsultaLivro)
                .addContainerGap(1207, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btCobsultaLivro)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultas", jPanel3);

        btRelatorioLivro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btRelatorioLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/analise-de-dados.png"))); // NOI18N
        btRelatorioLivro.setText("Livros Cadastrados");
        btRelatorioLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioLivroActionPerformed(evt);
            }
        });

        btRelatorioEmprestimo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btRelatorioEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/analise-de-dados.png"))); // NOI18N
        btRelatorioEmprestimo.setText("Livros Emprestados");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btRelatorioLivro)
                .addGap(73, 73, 73)
                .addComponent(btRelatorioEmprestimo)
                .addContainerGap(727, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRelatorioEmprestimo)
                    .addComponent(btRelatorioLivro))
                .addGap(378, 378, 378))
        );

        jTabbedPane1.addTab("Relatórios", jPanel4);

        btSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btSair)
                .addContainerGap(1219, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btSair)
                .addContainerGap(403, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sair", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1550, 762);
    }// </editor-fold>                        

    private void btAutoresActionPerformed(java.awt.event.ActionEvent evt) {                                          
        CadastroAutor autor = new CadastroAutor();
        autor.setVisible(true);
    }                                         

    private void btLeitoresActionPerformed(java.awt.event.ActionEvent evt) {                                           
        CadastroLeitor leitorCadastro = new CadastroLeitor();
        leitorCadastro.setVisible(true);
    }                                          

    private void btLivrosActionPerformed(java.awt.event.ActionEvent evt) {                                         
        CadastroLivro cadastroLivro = new CadastroLivro();
        cadastroLivro.setVisible(true);
    }                                        

    private void btUsuariosActionPerformed(java.awt.event.ActionEvent evt) {                                           
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        cadastroUsuario.setVisible(true);
    }                                          

    private void btEditoraActionPerformed(java.awt.event.ActionEvent evt) {                                          
       CadastroEditora editora = new CadastroEditora();
       editora.setVisible(true);
    }                                         

    private void btEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {                                             
       CadastroEmprestimo emprestimo = new CadastroEmprestimo();
       emprestimo.setVisible(true);
    }                                            

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {                                       
       Login login = new Login();

        login.setVisible(true);
        dispose();
    }                                      

    private void btCobsultaLivroActionPerformed(java.awt.event.ActionEvent evt) {                                                
        ConsultaLivro consultaLivro = new ConsultaLivro();
        consultaLivro.setVisible(true);
    }                                               

    private void btRelatorioLivroActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        RelatorioLivroCadastrado relatorioLivro = new RelatorioLivroCadastrado();
        relatorioLivro.setVisible(true);
    }                                                

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btAutores;
    private javax.swing.JButton btCobsultaLivro;
    private javax.swing.JButton btEditora;
    private javax.swing.JButton btEmprestimo;
    private javax.swing.JButton btLeitores;
    private javax.swing.JButton btLivros;
    private javax.swing.JButton btRelatorioEmprestimo;
    private javax.swing.JButton btRelatorioLivro;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btUsuarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtUsuarioLogado;
    // End of variables declaration                   
}
```
### Classe TelaCliente
```

package view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.ConexaoDAO;


public class TelaCliente extends javax.swing.JFrame {

  
    public TelaCliente() {
        setTitle("Sistema de Gerenciamento de Biblioteca – SGB - Pesquisa / Histórico");
        initComponents();
        clienteLogado();
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtClienteLogado = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLivro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEditora = new javax.swing.JTextField();
        txtPesquisar = new javax.swing.JButton();
        txtApagar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPesquisa1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Usuario logado.png"))); // NOI18N

        txtClienteLogado.setText("Cliente logado");

        jLabel1.setText("Livro");

        jLabel6.setText("Autor");

        jLabel7.setText("Editora");

        txtEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditoraActionPerformed(evt);
            }
        });

        txtPesquisar.setText("Pesquisar");

        txtApagar.setText("Apagar");
        txtApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApagarActionPerformed(evt);
            }
        });

        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Autor", "Edição", "Editora", "Quant.", "Local"
            }
        ));
        jScrollPane2.setViewportView(tbPesquisa);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Pesquisa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(jLabel4))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(txtPesquisar)
                        .addGap(36, 36, 36)
                        .addComponent(txtApagar)))
                .addContainerGap(427, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar)
                    .addComponent(txtApagar))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        jTabbedPane3.addTab("Pesquisa", jPanel1);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setText("Histórico");

        tbPesquisa1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Autor", "Edição", "Editora", "Quant.", "Data empréstimo", "Data devolução"
            }
        ));
        jScrollPane3.setViewportView(tbPesquisa1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Histórico", jPanel2);

        jMenu1.setText("Arquivo");

        jmSair.setText("Sair");
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        jMenu1.add(jmSair);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClienteLogado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1290, 1290, 1290))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtClienteLogado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1011, 782));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Login login = new Login();

        login.setVisible(true);
        dispose();
    }                                      

    private void txtEditoraActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void txtApagarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        limpartextos();
    }                                         

    public void limpartextos() {

        txtLivro.setText(null);
        txtAutor.setText(null);
        txtEditora.setText(null);
        txtLivro.requestFocus();
    }

    public void clienteLogado() { // CONEXÃO COM O BANDO DE DADOS PARA PEGAR NA TABELA LOG O ULTIMO USUARIO LOGADO E MOSTRAR NA TELA

        ConexaoDAO conexao = new ConexaoDAO();
        Connection conn = conexao.conectarlog();

        try {
//            String consulta = "SELECT * FROM pessoa WHERE nome like 'J%'";
            String consulta = "SELECT usuario FROM log ORDER BY id DESC LIMIT 1;";

            Statement stm = conn.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);

            while (resultado.next()) {

//                NewJFrame tela = new NewJFrame();
                String nome = resultado.getString("USUARIO");

                String primeiraLetra = nome.substring(0, 1).toUpperCase();// a primeira letra do nome digitado fica maiuscula
                String restoDoTexto = nome.substring(1).toLowerCase();// da sgunda letra em diante do nome digitado fica miniscula

                txtClienteLogado.setText(primeiraLetra + restoDoTexto);

            }

        } catch (Exception ex) {
            System.out.println("Nao conseguiu consultar os dados de Log");
        } finally {
            conexao.desconectarLog(conn);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JMenuItem jmSair;
    private javax.swing.JTable tbPesquisa;
    private javax.swing.JTable tbPesquisa1;
    private javax.swing.JButton txtApagar;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JLabel txtClienteLogado;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtLivro;
    private javax.swing.JButton txtPesquisar;
    // End of variables declaration                   
}
```



# Código CREATE - MySQL
### banco biblioteca
```
CREATE DATABASE `biblioteca` 
```
### Tabelas
```
CREATE TABLE `autor` (
	`idautor` INT(11) NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`idautor`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=1
;

CREATE TABLE `editora` (
	`ideditora` INT(11) NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`ideditora`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=1
;

CREATE TABLE `emprestimo` (
	`idemprestimo` INT(11) NOT NULL AUTO_INCREMENT,
	`nomeLeitor` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`livro` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`data` VARCHAR(10) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`dataDevolucao` VARCHAR(10) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`idemprestimo`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=1
;

CREATE TABLE `leitor` (
	`idleitor` INT(11) NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`dataNascimento` VARCHAR(10) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`cpf` VARCHAR(11) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`telefone` VARCHAR(11) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`email` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`endereco` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`numero` VARCHAR(6) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`bairro` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`cidade` VARCHAR(25) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`uf` VARCHAR(2) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`cep` VARCHAR(8) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`complemento` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`usuario` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`senha` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`idleitor`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=1
;

CREATE TABLE `livro` (
	`idlivro` INT(11) NOT NULL AUTO_INCREMENT,
	`titulo` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`autor` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`editora` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`anoEdicao` VARCHAR(4) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`quantidade` INT(10) NULL DEFAULT NULL,
	`local` VARCHAR(20) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`idlivro`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=1
;

CREATE TABLE `usuario` (
	`idusuario` INT(11) NOT NULL AUTO_INCREMENT,
	`Nome` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`usuario` VARCHAR(45) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`senha` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`nivelHierarquico` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`idusuario`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=1
;

CREATE TABLE `log` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`usuario` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=1
;
```
# SQL Inserts
### Inserts
```
//INSERT INTO `usuario` (`idusuario`, `Nome`, `usuario`, `senha`, `nivelHierarquico`) VALUES (1, 'Administrador', 'admin', '1324', 'Administrador');
//INSERT INTO `usuario` (`idusuario`, `Nome`, `usuario`, `senha`, `nivelHierarquico`) VALUES (2, 'Jefferson Queiroz', 'jefferson.queiroz', '4321', 'Gerente');
//INSERT INTO `autor` (`idautor`, `nome`) VALUES (1, 'Alckmar Luiz dos Santos');
//INSERT INTO `autor` (`idautor`, `nome`) VALUES (2, 'Alcides Villaça');
//INSERT INTO `autor` (`idautor`, `nome`) VALUES (3, 'Graciliano Ramos');
//INSERT INTO `autor` (`idautor`, `nome`) VALUES (4, 'Grégor Marcondes');
//INSERT INTO `editora` (`ideditora`, `nome`) VALUES (1, 'Companhia das Letras');
//INSERT INTO `editora` (`ideditora`, `nome`) VALUES (2, 'Editora Rocco');
//INSERT INTO `editora` (`ideditora`, `nome`) VALUES (3, 'Darkside');
//INSERT INTO `editora` (`ideditora`, `nome`) VALUES (4, 'Editora Wish');
//INSERT INTO `leitor`  VALUES (1, 'Ana Luiza', '13/05/1997', '7845124578', '87998745632', 'ana@gmail.com', 'Rua José da Silva', '600', 'Boa Vista', 'Recife', 'PE', '54230875','-', 'ana.luiza', 'ana123');
//INSERT INTO `leitor`  VALUES (2, 'John Frusciante', '05/03/1970', '0778451298', '87997842101', 'john@rhcp.com', 'Rua João Fernandes', '2009', 'Casa Amarela', 'Recife', 'PE', '54875875', '--', 'jonh.frusciante', 'rhcp');
//INSERT INTO `leitor`  VALUES (3, 'Maria Rosiane', '13/05/1966', '4657984512', '81979874587', 'rosi@gmail.com', 'Av. Domingos Ferreira', '2987', 'Boa Viagem', 'Recife', 'PE', '54782458', 'Apto-1205', 'rosi', '1234');
//INSERT INTO `leitor`  VALUES (4, 'Aloizio Antônio', '16/05/1933', '79845612354', '81998754137', 'aloizio.antonio@gmail.com', 'Av. Conde da Boa Vista', '4587', 'Boa Vista', 'Recife', 'PE', '54789654', 'Apto-203', 'aloizio.antonio', '1324');
//INSERT INTO `emprestimo` (`idemprestimo`, `nomeLeitor`, `livro`, `data`, `dataDevolucao`) VALUES (1, 'Ana', 'Rede de computdores', '10/11/2023', '20/11/2023');
//INSERT INTO `emprestimo` (`idemprestimo`, `nomeLeitor`, `livro`, `data`, `dataDevolucao`) VALUES (2, 'Jefferson', 'Dominando JavaScript', '10/11/2023', '20/11/2023');
//INSERT INTO `emprestimo` (`idemprestimo`, `nomeLeitor`, `livro`, `data`, `dataDevolucao`) VALUES (3, 'Michael', 'Rede de computdores', '13/11/2023', '23/11/2023');
//INSERT INTO `emprestimo` (`idemprestimo`, `nomeLeitor`, `livro`, `data`, `dataDevolucao`) VALUES (4, 'Ana', 'Rede de computdores', '10/11/2023', '20/11/2023');
//INSERT INTO `livro` (`idlivro`, `titulo`, `autor`, `editora`, `anoEdicao`, `quantidade`, `local`) VALUES (1, 'Scar Tissue', 'Alcides Villaça', 'Editora Rocco', '2004', 2, 'Rua A / B5');
//INSERT INTO `livro` (`idlivro`, `titulo`, `autor`, `editora`, `anoEdicao`, `quantidade`, `local`) VALUES (2, 'Windows Server 2022 Administration Fundamentals', 'Grégor Marcondes', 'Editora Wish', '2022', 1, 'Rua D / A2');
//INSERT INTO `livro` (`idlivro`, `titulo`, `autor`, `editora`, `anoEdicao`, `quantidade`, `local`) VALUES (3, 'Como Fazer Amigos e Influenciar Pessoas', 'Graciliano Ramos', 'Darkside', '1936', 4, 'Rua F / A8');
//INSERT INTO `livro` (`idlivro`, `titulo`, `autor`, `editora`, `anoEdicao`, `quantidade`, `local`) VALUES (4, 'Memórias póstumas de Brás Cubas', 'Alcides Villaça', 'Editora Rocco', '1881', 2, 'Rua E / B5');
INSERT INTO `log` (`id`, `usuario`) VALUES (1, 'admin');
```


