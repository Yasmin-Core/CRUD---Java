package br.com.projetoloja.model;

public class ItemsPedido {

    private int idItemPedido;
    private int ordem;
    private int idPedido;
    private int idEstoque;
    private int qtdItem;
    private String dtDevolucao;
    private String motivoDevolucao;


    public ItemsPedido(int idItemPedido, int ordem, int idPedido, int idEstoque, int qtdItem, String dtDevolucao, String motivoDevolucao){
		this.setIdItemPedido(idItemPedido);
		this.setOrdem(ordem);
		this.setIdPedido(idPedido);
		this.setIdEstoque(idEstoque);
		this.setQtdItem(qtdItem);
		this.setDtDevolucao(dtDevolucao);
		this.setMotivoDevolucao(motivoDevolucao);
	}


	public String toString() {
		
		String outStr = 
				this.getIdItemPedido() + " | " +
				this.getOrdem() + " | " +
				this.getIdPedido() + " | " +
				this.getIdEstoque() + " | " +
				this.getQtdItem() + " | " +
				this.getDtDevolucao() + " | " +
				this.getMotivoDevolucao() + " | " ;

		return outStr;
	}
    

    public int getIdItemPedido() {
        return idItemPedido;
    }
    public void setIdItemPedido(int idItemPedido) {
        this.idItemPedido = idItemPedido;
    }
    public int getOrdem() {
        return ordem;
    }
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public int getIdEstoque() {
        return idEstoque;
    }
    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }
    public int getQtdItem() {
        return qtdItem;
    }
    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }
    public String getDtDevolucao() {
        return dtDevolucao;
    }
    public void setDtDevolucao(String dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }
    public String getMotivoDevolucao() {
        return motivoDevolucao;
    }
    public void setMotivoDevolucao(String motivoDevolucao) {
        this.motivoDevolucao = motivoDevolucao;
    }
}

