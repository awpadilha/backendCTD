package dao.impl;

import dao.IDao;
import dao.config.ConfigJDBC;
import model.Endereco;
import model.Filme;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FilmeDaoH2 implements IDao<Filme> {
    private ConfigJDBC configJDBC;

    public FilmeDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Filme salvar(Filme filme) {
        Connection connection = configJDBC.conectarComBancoDeDados();
        Statement stmt = null;

        String corpoConsulta =
                "INSERT INTO filme " +
                "(nome, descricao, min_idade) VALUES ";

        String atributos = String.format(
                "('%s', '%s', '%d')",
                filme.getNome(),
                filme.getDescricao(),
                filme.getIdadeMinima());

        String query = corpoConsulta + atributos;
        System.out.println(query);

        try {
            stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stmt.getGeneratedKeys();

            if (keys.next()) {
                filme.setId(keys.getInt(1));
            }

            stmt.close();
            connection.close();
        }catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return filme;
    }
}
