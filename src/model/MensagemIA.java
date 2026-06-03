package model;

public class MensagemIA {

    public static String gerarMensagem(int nivel) {

        if(nivel >= 80) {

            return "Sua IA detectou sinais elevados "
                    + "de sobrecarga emocional.";

        } else if(nivel >= 50) {

            return "Você apresenta sinais moderados "
                    + "de estresse emocional.";

        } else {

            return "Seu emocional aparenta estabilidade.";
        }
    }
}