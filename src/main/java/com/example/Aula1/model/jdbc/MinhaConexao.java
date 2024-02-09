package com.example.Aula1.model.jdbc;

import java.sql.Connection;

public class MinhaConexao {
    public static Connection conexao(){
        ConexaoJDBC conexao = new ConexaoHBD();
        return conexao.criarConexao();
    }
}
