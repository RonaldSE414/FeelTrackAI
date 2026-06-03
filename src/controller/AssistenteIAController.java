package controller;

import model.RespostaIA;
import service.AssistenteEmocionalService;

public class AssistenteIAController {

    private AssistenteEmocionalService service;

    public AssistenteIAController() {

        service =
                new AssistenteEmocionalService();
    }

    public RespostaIA enviarMensagem(
            String mensagem
    ) {

        String resposta =
                service.responder(mensagem);

        return new RespostaIA(resposta);
    }
}