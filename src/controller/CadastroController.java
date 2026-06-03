package controller;

import dao.UsuarioDAO;
import model.Usuario;

public class CadastroController {

    private UsuarioDAO usuarioDAO;

    public CadastroController() {
        usuarioDAO = new UsuarioDAO();
    }

    public boolean cadastrar(
            String nome,
            String email,
            String senha,
            String tipo
    ) {

        Usuario usuario = new Usuario();

        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setTipo(tipo);

        return usuarioDAO.cadastrar(usuario);
    }
}