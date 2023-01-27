//Conexão Java com Mysql 

package br.com.projetoloja.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc: mysql://127.0.0.1/lojinha", "root" , "senha123");
        }catch (Exception erro) {
            throw new RuntimeException(erro);//Mensagem de erro    
        }
    }

}
