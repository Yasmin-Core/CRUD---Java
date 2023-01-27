package br.com.projetoloja.model;

public class Produtos {

    private int idProduto;
    private String fabricante;
    private String nome;
    private String marca;
    private String modelo;
    private String idCategoria;
    private String descricao;
    private String unidadeMedida;
    private Double largura;
    private Double altura;
    private Double profundidade;
    private Double peso;
    private String cor;

    public Produtos(int idProduto, String fabricante, String nome, String marca,
    String modelo, String idCategoria, String descricao, String unidadeMedida, Double largura,
    Double altura, Double profundidade, Double peso, String cor){
		this.setIdProduto(idProduto);
		this.setFabricante(fabricante);
        this.setNome(nome);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setIdCategoria(idCategoria);
		this.setDescricao(descricao);
		this.setUnidadeMedida(unidadeMedida);
		this.setLargura(largura);
		this.setAltura(altura);
		this.setProfundidade(profundidade);
		this.setPeso(peso);
		this.setCor(cor);
	}

    public String toString() {
		
		String outStr = 
				this.getIdProduto() + " | " +
				this.getFabricante() + " | " +
                this.getNome() + " | " +
				this.getMarca() + " | " +
				this.getModelo() + " | " +
				this.getIdCategoria() + " | " +
				this.getDescricao() + " | " +
				this.getUnidadeMedida() + " | " +
				this.getLargura() + " | " +
				this.getAltura() + " | " +
				this.getProfundidade() + " | " +
				this.getPeso() + " | " +
				this.getCor();
				
		return outStr;
	}
	
    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    public Double getLargura() {
        return largura;
    }
    public void setLargura(Double largura) {
        this.largura = largura;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getProfundidade() {
        return profundidade;
    }
    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }  
}
