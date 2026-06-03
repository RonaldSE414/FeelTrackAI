package controller;

import dao.UsuarioDAO;
import model.Usuario;
import util.Sessao;

public class LoginController {

    private UsuarioDAO usuarioDAO;

    public LoginController() {

        usuarioDAO = new UsuarioDAO();
    }

    public boolean autenticar(
            String email,
            String senha
    ) {

        Usuario usuario =
                usuarioDAO.autenticar(
                        email,
                        senha
                );

        if(usuario == null) {

            return false;
        }

        Sessao.idUsuario =
                usuario.getId();

        Sessao.nomeUsuario =
                usuario.getNome();

        return true;
    }
}