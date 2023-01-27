package br.com.projetoloja.model;

public class Pedidos {
    private int idPedido;
    private int idUsuario;
    private String dtPedido;
    private String dtPagamento;
    private String dtNotaFiscal;
    private String notaFiscal;
    private String dtEnvio;
    private String dtRecebimento;
    private int tipoFrete;
    private String rastreioFrete;
    private String entregaEndereco;
    private String entregaNumero;
    private String entregaCompl;
    private String entregaBairro;
    private String entregaCidade;
    private String entregaUF;
    private String entregaCEP;
    private String entregaTelefone;
    private String entregaRefer;
    private Double valorTotal;
    private int qtdItems;
    private String dtDevolucao;
    private String motivoDevolucao; 

    public Pedidos(int idPedido, int idUsuario, String dtPedido, String dtPagamento, String dtNotaFiscal, String notaFiscal, String dtEnvio, String dtRecebimento, int tipoFrete, 
    String rastreioFrete, String entregaEndereco,String entregaNumero, String entregaCompl, String entregaBairro, String entregaCidade, String entregaUF, String entregaCEP, String entregaTelefone, 
    String entregaRefer, Double valorTotal, int qtdItems,String dtDevolucao, String motivoDevolucao) {
		this.setIdPedido(idPedido);
		this.setIdUsuario(idUsuario);
		this.setDtPedido(dtPedido);
		this.setDtPagamento(dtPagamento);
		this.setDtNotaFiscal(dtNotaFiscal);
		this.setNotaFiscal(notaFiscal);
		this.setDtEnvio(dtEnvio);
		this.setDtRecebimento(dtRecebimento);
		this.setTipoFrete(tipoFrete);
		this.setRastreioFrete(rastreioFrete);
		this.setEntregaEndereco(entregaEndereco);
		this.setEntregaNumero(entregaNumero);
		this.setEntregaCompl(entregaCompl);
		this.setEntregaBairro(entregaBairro);
        this.setEntregaCidade(entregaCidade);
        this.setEntregaUF(entregaUF);
        this.setEntregaCEP(entregaCEP);
        this.setEntregaTelefone(entregaTelefone);
        this.setEntregaRefer(entregaRefer);
        this.setValorTotal(valorTotal);
        this.setQtdItems(qtdItems);
        this.setDtDevolucao(dtDevolucao);
        this.setMotivoDevolucao(motivoDevolucao);
	}

    public String toString() {
		
		String outStr = 
				this.getIdPedido() + " | " +
				this.getIdUsuario() + " | " +
				this.getDtPedido() + " | " +
				this.getDtPagamento() + " | " +
				this.getDtNotaFiscal() + " | " +
				this.getNotaFiscal() + " | " +
				this.getDtEnvio() + " | " +
				this.getDtRecebimento() + " | " +
				this.getTipoFrete() + " | " +
				this.getRastreioFrete() + " | " +
				this.getEntregaEndereco() + " | " +
				this.getEntregaNumero() + " | " +
				this.getEntregaCompl() + " | " +
                this.getEntregaBairro() + " | " +
                this.getEntregaCidade() + " | " +
                this.getEntregaUF() + " | " +
                this.getEntregaCEP() + " | " +
                this.getEntregaTelefone() + " | " +
                this.getEntregaRefer() + " | " +
                this.getValorTotal() + " | " +
                this.getQtdItems() + " | " +
                this.getDtDevolucao() + " | " +
				this.getMotivoDevolucao();
				
		return outStr;
	}


    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDtPedido() {
        return dtPedido;
    }
    public void setDtPedido(String dtPedido) {
        this.dtPedido = dtPedido;
    }
    public String getDtPagamento() {
        return dtPagamento;
    }
    public void setDtPagamento(String dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public String getDtNotaFiscal() {
        return dtNotaFiscal;
    }
    public void setDtNotaFiscal(String dtNotaFiscal) {
        this.dtNotaFiscal = dtNotaFiscal;
    }
    public String getNotaFiscal() {
        return notaFiscal;
    }
    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    public String getDtEnvio() {
        return dtEnvio;
    }
    public void setDtEnvio(String dtEnvio) {
        this.dtEnvio = dtEnvio;
    }
    public String getDtRecebimento() {
        return dtRecebimento;
    }
    public void setDtRecebimento(String dtRecebimento) {
        this.dtRecebimento = dtRecebimento;
    }
    public int getTipoFrete() {
        return tipoFrete;
    }
    public void setTipoFrete(int tipoFrete) {
        this.tipoFrete = tipoFrete;
    }
    public String getRastreioFrete() {
        return rastreioFrete;
    }
    public void setRastreioFrete(String rastreioFrete) {
        this.rastreioFrete = rastreioFrete;
    }
    public String getEntregaEndereco() {
        return entregaEndereco;
    }
    public void setEntregaEndereco(String entregaEndereco) {
        this.entregaEndereco = entregaEndereco;
    }
    public String getEntregaNumero() {
        return entregaNumero;
    }
    public void setEntregaNumero(String entregaNumero) {
        this.entregaNumero = entregaNumero;
    }
    public String getEntregaCompl() {
        return entregaCompl;
    }
    public void setEntregaCompl(String entregaCompl) {
        this.entregaCompl = entregaCompl;
    }
        public String getEntregaBairro() {
        return entregaBairro;
    }
    public void setEntregaBairro(String entregaBairro) {
        this.entregaBairro = entregaBairro;
    }
    public String getEntregaCidade() {
        return entregaCidade;
    }
    public void setEntregaCidade(String entregaCidade) {
        this.entregaCidade = entregaCidade;
    }
    public String getEntregaUF() {
        return entregaUF;
    }
    public void setEntregaUF(String entregaUF) {
        this.entregaUF = entregaUF;
    }
    public String getEntregaCEP() {
        return entregaCEP;
    }
    public void setEntregaCEP(String entregaCEP) {
        this.entregaCEP = entregaCEP;
    }
    public String getEntregaTelefone() {
        return entregaTelefone;
    }
    public void setEntregaTelefone(String entregaTelefone) {
        this.entregaTelefone = entregaTelefone;
    }
    public String getEntregaRefer() {
        return entregaRefer;
    }
    public void setEntregaRefer(String entregaRefer) {
        this.entregaRefer = entregaRefer;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public int getQtdItems() {
        return qtdItems;
    }
    public void setQtdItems(int qtdItems) {
        this.qtdItems = qtdItems;
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
