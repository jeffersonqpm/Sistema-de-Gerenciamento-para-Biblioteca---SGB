
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
