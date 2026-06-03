package dao;

import model.Usuario;

import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Usuario;

public class UsuarioDAO {

    public boolean cadastrar(Usuario u) {

    String sql =
            "INSERT INTO usuario(nome,email,senha,tipo) VALUES(?,?,?,?)";

    try (

            Connection conn =
                    ConnectionFactory.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

    ) {

        stmt.setString(1, u.getNome());

        stmt.setString(2, u.getEmail());

        stmt.setString(3, u.getSenha());

        stmt.setString(4, u.getTipo());

        stmt.execute();

        return true;

    } catch (Exception e) {

        e.printStackTrace();

        return false;
    }
}

    public Usuario autenticar(
        String email,
        String senha
) {

    String sql =
            "SELECT * FROM usuario WHERE email=? AND senha=?";

    try (

            Connection conn =
                    ConnectionFactory.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql)

    ) {

        stmt.setString(1, email);

        stmt.setString(2, senha);

        ResultSet rs = stmt.executeQuery();

        if(rs.next()) {

            Usuario u = new Usuario();

            u.setId(rs.getInt("id"));

            u.setNome(rs.getString("nome"));

            u.setEmail(rs.getString("email"));

            u.setTipo(rs.getString("tipo"));

            return u;
        }

    } catch (Exception e) {

        e.printStackTrace();
    }

    return null;
}
}