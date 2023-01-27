package br.com.projetoloja.metodo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.projetoloja.model.Categorias;
import br.com.projetoloja.repository.ConnectionFactory;


public class CategoriaMetodo {

    private Connection con;

    public CategoriaMetodo(){
        this.con = new ConnectionFactory().getConnection();

    }
    public void cadastrarCategoria(Categorias obj){

        //1 passo - Criar o comando sql
        try{
            String sql = "insert into categorias (descricao)" + "values (?)";

            //Conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());

            //Executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro !!" + erro);
            
        }


    }

    public void alterarCategoria(){

    }

    public void excluirCategoria(){

    }
    
}
