package model;

public class HumorIA {

    public static String gerarHumor(int nivel) {

        if(nivel >= 80) {

            return "😰";

        } else if(nivel >= 60) {

            return "😟";

        } else if(nivel >= 40) {

            return "😐";

        } else {

            return "😊";
        }
    }
}