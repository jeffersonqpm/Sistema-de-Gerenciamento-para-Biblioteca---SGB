
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
