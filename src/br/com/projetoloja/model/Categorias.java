package br.com.projetoloja.model;

public class Categorias {
//atributos
    private int idCategoria;
    private String descricao;

//Metodo construtor -função de construção
    public Categorias(int idCategoria, String descricao){
		this.setIdCategoria(idCategoria);
        this.setDescricao(descricao);
    }
//Transformar tudo em texto para impressão
    public String toString() {
		
		String outStr = 
				this.getIdCategoria() + " | " +
                this.getDescricao() + " | ";
        return outStr;     

    }
//get -> exibir
    public int getIdCategoria() {
        return idCategoria;
    }
//set -> alterar
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
