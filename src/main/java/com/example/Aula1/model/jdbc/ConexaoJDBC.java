package com.example.Aula1.model.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

public interface ConexaoJDBC {

    public Connection criarConexao();

}
