package service;

import util.Sessao;

public class AssistenteEmocionalService {

    public String responder(String mensagem) {

        String usuario = Sessao.nomeUsuario;

        mensagem = mensagem.toLowerCase();

        if(mensagem.contains("estresse")
                || mensagem.contains("estressado")
                || mensagem.contains("sobrecarregado")) {

            return """
                    Olá, %s.

                    Percebo sinais de estresse.

                    Tente realizar pequenas pausas durante o dia,
                    organizar suas tarefas por prioridade e reservar
                    alguns minutos para relaxamento.

                    Sua saúde emocional é importante.
                    """
                    .formatted(usuario);
        }

        if(mensagem.contains("ansiedade")
                || mensagem.contains("ansioso")) {

            return """
                    Olá, %s.

                    A ansiedade pode surgir em momentos de pressão.

                    Procure focar no presente,
                    realizar exercícios de respiração
                    e evitar antecipar situações futuras.

                    Um passo de cada vez.
                    """
                    .formatted(usuario);
        }

        if(mensagem.contains("triste")
                || mensagem.contains("tristeza")
                || mensagem.contains("desanimado")) {

            return """
                    Olá, %s.

                    Sinto que você está passando por um momento difícil.

                    Conversar com pessoas de confiança,
                    manter uma rotina saudável
                    e buscar atividades prazerosas
                    pode ajudar bastante.
                    """
                    .formatted(usuario);
        }

        if(mensagem.contains("feliz")
                || mensagem.contains("bem")
                || mensagem.contains("ótimo")
                || mensagem.contains("otimo")) {

            return """
                    Olá, %s.

                    Fico feliz em saber disso.

                    Continue cultivando hábitos positivos,
                    descanso adequado e equilíbrio entre
                    trabalho e vida pessoal.
                    """
                    .formatted(usuario);
        }

        if(mensagem.contains("motivação")
                || mensagem.contains("motivacao")) {

            return """
                    Olá, %s.

                    A motivação varia ao longo do tempo.

                    Estabeleça metas pequenas,
                    comemore conquistas e mantenha
                    o foco em seu progresso diário.
                    """
                    .formatted(usuario);
        }

        if(mensagem.contains("sono")) {

            return """
                    Olá, %s.

                    O sono influencia diretamente
                    o equilíbrio emocional.

                    Procure manter horários regulares
                    e evitar telas antes de dormir.
                    """
                    .formatted(usuario);
        }

        if(mensagem.contains("ajuda")) {

            return """
                    Olá, %s.

                    Posso ajudar com:

                    • Estresse
                    • Ansiedade
                    • Motivação
                    • Bem-estar emocional
                    • Qualidade do sono
                    • Relaxamento
                    """
                    .formatted(usuario);
        }

        if(mensagem.contains("oi")
                || mensagem.contains("olá")
                || mensagem.contains("ola")
                || mensagem.contains("bom dia")
                || mensagem.contains("boa tarde")
                || mensagem.contains("boa noite")) {

            return """
                    Olá, %s.

                    Sou o assistente emocional do FeelTrack AI.

                    Posso conversar sobre:
                    • Estresse
                    • Ansiedade
                    • Motivação
                    • Bem-estar emocional
                    • Relaxamento

                    Como você está se sentindo hoje?
                    """
                    .formatted(usuario);
        }

        return """
                Olá, %s.

                Entendi sua mensagem.

                Como assistente emocional do FeelTrack AI,
                recomendo observar seus sentimentos,
                manter hábitos saudáveis e buscar equilíbrio
                entre trabalho, descanso e lazer.

                Se desejar, conte mais detalhes para que eu
                possa ajudar melhor.
                """
                .formatted(usuario);
    }
}