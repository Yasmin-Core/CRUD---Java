package br.com.projetoloja.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.DBQuery;

public class Usuarios {
	private int idUsuario;
	private String email;
	private String senha;
	private int idNivelUsuario;
	private String nome;
	private String cpf;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String telefone;
	private String foto;
	private String ativo;
	
	private String tableName = "usuarios";
	private String fieldsName = "idUsuario, email, senha, idNivelUsuario, nome, cpf, endereco, bairro, cidade, uf, cep, telefone, foto, ativo"; 
	private String fieldKey = "idUsuario";
	private DBQuery dbQuery = new DBQuery(tableName, fieldsName, fieldKey);
			
	public Usuarios() {
		
	}
	
	public Usuarios(int idUsuario, String email, String senha, int idNivelUsuario, String nome, String cpf, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String foto, String ativo){
		this.setIdUsuario(idUsuario);
		this.setEmail(email);
		this.setSenha(senha);
		this.setIdNivelUsuario(idNivelUsuario);
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setUf(uf);
		this.setCep(cep);
		this.setTelefone(telefone);
		this.setFoto(foto);
		this.setAtivo(ativo);
	}
	
	public String toString() {
		
		String outStr = 
				this.getIdUsuario() + " | " +
				this.getEmail() + " | " +
				this.getSenha() + " | " +
				this.getIdNivelUsuario() + " | " +
				this.getNome() + " | " +
				this.getCpf() + " | " +
				this.getEndereco() + " | " +
				this.getBairro() + " | " +
				this.getCidade() + " | " +
				this.getUf() + " | " +
				this.getCep() + " | " +
				this.getTelefone() + " | " +
				this.getFoto() + " | " +
				this.getAtivo();
				
		return outStr;
	}
	
	private ArrayList<Usuarios> listAll() {
		ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();
		ResultSet linhas = this.dbQuery.select("");
		try {
			while (linhas.next()) {
				usuarios.add(
						new Usuarios(
								linhas.getInt("idUsuario"),
								linhas.getString("email"),
								linhas.getString("senha"),
								linhas.getInt("idNivelUsuario"),
								linhas.getString("nome"),
								linhas.getString("cpf"),
								linhas.getString("endereco"),
								linhas.getString("bairro"),
								linhas.getString("cidade"),
								linhas.getString("uf"),
								linhas.getString("cep"),
								linhas.getString("telefone"),
								linhas.getString("foto"),
								linhas.getString("ativo")
						)
				);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return(usuarios);
	}
	
	public void showConsole(){
		ArrayList<Usuarios> usuarios = this.listAll();
		System.out.println( "");
		for (int i = 0; i < usuarios.size(); i++) {
			System.out.println( usuarios.get(i).toString() );
		}
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getIdNivelUsuario() {
		return idNivelUsuario;
	}
	public void setIdNivelUsuario(int idNivelUsuario) {
		this.idNivelUsuario = idNivelUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

}