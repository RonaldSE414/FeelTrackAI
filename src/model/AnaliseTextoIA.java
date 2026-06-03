package model;

public class AnaliseTextoIA {

    public static int analisarTexto(String texto) {

        texto = texto.toLowerCase();

        int pontos = 0;

        if(texto.contains("cansado")) {

            pontos += 20;
        }

        if(texto.contains("exausto")) {

            pontos += 30;
        }

        if(texto.contains("ansiedade")) {

            pontos += 25;
        }

        if(texto.contains("pressão")) {

            pontos += 15;
        }

        if(texto.contains("estressado")) {

            pontos += 25;
        }

        return pontos;
    }
}