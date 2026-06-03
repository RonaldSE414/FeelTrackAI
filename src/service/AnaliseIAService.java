package service;

public class AnaliseIAService {

    public String classificarNivel(
            int nivel
    ) {

        if(nivel >= 8) {

            return "CRÍTICO";
        }

        if(nivel >= 5) {

            return "MODERADO";
        }

        return "SAUDÁVEL";
    }

    public String gerarRecomendacao(
            int nivel
    ) {

        if(nivel >= 8) {

            return "Encaminhar para acompanhamento psicológico.";
        }

        if(nivel >= 5) {

            return "Reduzir carga de trabalho e acompanhar.";
        }

        return "Funcionário emocionalmente estável.";
    }
}
