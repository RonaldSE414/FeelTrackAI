package view;

import controller.CadastroController;

import javax.swing.*;
import java.awt.*;

public class CadastroView extends JFrame {

    public CadastroView() {

        setTitle("Cadastro");

        setSize(900,700);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        criarTela();

        setVisible(true);
    }

    private void criarTela() {

        JPanel painel =
                new JPanel();

        painel.setLayout(null);

        painel.setBackground(
                new Color(15,15,15)
        );

        JButton voltar =
                new JButton("Voltar");

        voltar.setBounds(
                20,
                20,
                100,
                35
        );

        voltar.addActionListener(e -> {

            dispose();

            new HomeView();
        });

        JLabel titulo =
                new JLabel("Criar Conta");

        titulo.setForeground(Color.WHITE);

        titulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        38
                )
        );

        titulo.setBounds(
                320,
                50,
                300,
                50
        );

        JLabel lblNome =
                criarLabel("Nome completo");

        lblNome.setBounds(
                250,
                140,
                200,
                30
        );

        JTextField txtNome =
                criarCampo();

        txtNome.setBounds(
                250,
                175,
                400,
                45
        );

        JLabel lblEmail =
                criarLabel("Email");

        lblEmail.setBounds(
                250,
                240,
                200,
                30
        );

        JTextField txtEmail =
                criarCampo();

        txtEmail.setBounds(
                250,
                275,
                400,
                45
        );

        JLabel lblSenha =
                criarLabel("Senha");

        lblSenha.setBounds(
                250,
                340,
                200,
                30
        );

        JPasswordField txtSenha =
                new JPasswordField();

        txtSenha.setBounds(
                250,
                375,
                400,
                45
        );

        txtSenha.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        18
                )
        );

        JLabel lblTipo =
                criarLabel("Tipo de conta");

        lblTipo.setBounds(
                250,
                440,
                200,
                30
        );

        JComboBox<String> tipo =
                new JComboBox<>();

        tipo.addItem("FUNCIONÁRIO");

        tipo.addItem("RH");

        tipo.setBounds(
                250,
                475,
                400,
                45
        );

        tipo.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        16
                )
        );

        JButton criar =
                new JButton("CRIAR CONTA");

        criar.setBounds(
                250,
                570,
                400,
                55
        );

        criar.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        18
                )
        );

        criar.addActionListener(e -> {

            String nome =
                    txtNome.getText();

            String email =
                    txtEmail.getText();

            String senha =
                    String.valueOf(
                            txtSenha.getPassword()
                    );

            String tipoConta =
                    tipo.getSelectedItem()
                            .toString();

            if(nome.isEmpty()
                    || email.isEmpty()
                    || senha.isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Preencha todos os campos."
                );

                return;
            }

            CadastroController controller =
                    new CadastroController();

            boolean sucesso =
                    controller.cadastrar(
                            nome,
                            email,
                            senha,
                            tipoConta
                    );

            if(sucesso) {

                JOptionPane.showMessageDialog(
                        null,
                        "Conta criada com sucesso!"
                );

                dispose();

                new LoginView();

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "Erro ao cadastrar usuário."
                );
            }
        });

        painel.add(voltar);

        painel.add(titulo);

        painel.add(lblNome);

        painel.add(txtNome);

        painel.add(lblEmail);

        painel.add(txtEmail);

        painel.add(lblSenha);

        painel.add(txtSenha);

        painel.add(lblTipo);

        painel.add(tipo);

        painel.add(criar);

        add(painel);
    }

    private JTextField criarCampo() {

        JTextField txt =
                new JTextField();

        txt.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        18
                )
        );

        return txt;
    }

    private JLabel criarLabel(String texto) {

        JLabel lbl =
                new JLabel(texto);

        lbl.setForeground(Color.WHITE);

        lbl.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        18
                )
        );

        return lbl;
    }
}