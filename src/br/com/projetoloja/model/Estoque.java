package br.com.projetoloja.model;

public class Estoque {

    private int idEstoque;
    private int idProduto;
    private String dtEntrada;
    private int quantidade;
    private String dtFabricacao;
    private String dtVencimento;
    private Double precoCompra;
    private Double icmsCompra;
    private Double precoVenda;
    private int qtdVendida;
    private int qtdOcorrencia;
    private String ocorrencia;
    
    public Estoque(int idEstoque, int idProduto, String dtEntrada, int quantidade, String dtFabricacao, String dtVencimento, Double precoCompra, Double icmsCompra, Double precoVenda, int qtdVendida, int qtdOcorrencia, String ocorrencia){
		
        this.setIdEstoque(idEstoque);
		this.setIdProduto(idProduto);
		this.setDtEntrada(dtEntrada);
		this.setQuantidade(quantidade);
		this.setDtFabricacao(dtFabricacao);
		this.setDtVencimento(dtVencimento);
		this.setPrecoCompra(precoCompra);
		this.setIcmsCompra(icmsCompra);
		this.setPrecoVenda(precoVenda);
		this.setQtdVendida(qtdVendida);
		this.setQtdOcorrencia(qtdOcorrencia);
		this.setOcorrencia(ocorrencia);
	}

    public String toString() {
		
		String outStr = 
                        this.getIdEstoque() + " | " +
                        this.getIdProduto() + " | " +
                        this.getDtEntrada() + " | " +
                        this.getQuantidade() + " | " +
                        this.getDtFabricacao() + " | " +
                        this.getDtVencimento() + " | " +
                        this.getPrecoCompra() + " | " +
                        this.getIcmsCompra() + " | " +
                        this.getPrecoVenda() + " | " +
                        this.getQtdVendida() + " | " +
                        this.getQtdOcorrencia() + " | " +
                        this.getOcorrencia();
        return outStr;
    }  

    public int getIdEstoque() {
        return idEstoque;
    }
    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDtEntrada() {
        return dtEntrada;
    }
    public void setDtEntrada(String dtEntrada) {
        this.dtEntrada = dtEntrada;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getDtFabricacao() {
        return dtFabricacao;
    }
    public void setDtFabricacao(String dtFabricacao) {
        this.dtFabricacao = dtFabricacao;
    }
    public String getDtVencimento() {
        return dtVencimento;
    }
    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }
    public Double getPrecoCompra() {
        return precoCompra;
    }
    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }
    public Double getIcmsCompra() {
        return icmsCompra;
    }
    public void setIcmsCompra(Double icmsCompra) {
        this.icmsCompra = icmsCompra;
    }
    public Double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }
    public int getQtdVendida() {
        return qtdVendida;
    }
    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }
    public int getQtdOcorrencia() {
        return qtdOcorrencia;
    }
    public void setQtdOcorrencia(int qtdOcorrencia) {
        this.qtdOcorrencia = qtdOcorrencia;
    }
    public String getOcorrencia() {
        return ocorrencia;
    }
    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }
}