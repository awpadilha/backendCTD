package dao.impl;

import dao.IDao;
import dao.config.ConfigJDBC;
import model.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDaoH2 implements IDao<Usuario> {

    private ConfigJDBC configJDBC;

    public UsuarioDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Usuario salvar(Usuario usuario) {

        Connection connection = configJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format(
                "INSERT INTO usuarios " +
                        "(nome, idade, sexo, dataNascimento) " +
                        "VALUES ('%s', '%s', '%s', '%s')",
                usuario.getNome(),
                usuario.getIdade(),
                usuario.getSexo(),
                usuario.getDataNascimento()
        );

        try {
            stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stmt.getGeneratedKeys();
            if(keys.next())
                usuario.setId(keys.getInt(1));
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }

}
