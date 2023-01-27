package br.com.projetoloja.model;

public class Institucional {

    private int idInstituicao;
    private String nome;
    private String cpf_cnpj;
    private String tipoPessoa;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;
    private String email;
    private String logo;


    public Institucional(int idInstituicao, String nome, String cpf_cnpj, String tipoPessoa, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String email, String logo){
		this.setIdInstituicao(idInstituicao);
		this.setNome(nome);
		this.setCpf_cnpj(cpf_cnpj);
		this.setTipoPessoa(tipoPessoa);
		this.setEndereco(endereco);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setUf(uf);
		this.setCep(cep);
		this.setTelefone(telefone);
		this.setEmail(email);
		this.setLogo(logo);
	}

    public String toString() {
		
		String outStr = 
				this.getIdInstituicao() + " | " +
				this.getNome() + " | " +
				this.getCpf_cnpj() + " | " +
				this.getTipoPessoa() + " | " +
				this.getEndereco() + " | " +
				this.getBairro() + " | " +
				this.getCidade() + " | " +
				this.getUf() + " | " +
				this.getCep() + " | " +
				this.getTelefone() + " | " +
				this.getEmail() + " | " +
				this.getLogo();
				
		return outStr;
	}

    public int getIdInstituicao() {
        return idInstituicao;
    }
    public void setIdInstituicao(int idInstituicao) {
        this.idInstituicao = idInstituicao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }
    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }
    public String getTipoPessoa() {
        return tipoPessoa;
    }
    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

}
