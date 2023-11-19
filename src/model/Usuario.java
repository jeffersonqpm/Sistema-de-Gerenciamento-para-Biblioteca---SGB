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
