package model;

public class Resultado {

    private int id;

    private int questionarioId;

    private int nivelEstresse;

    private String estado;

    private String recomendacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuestionarioId() {
        return questionarioId;
    }

    public void setQuestionarioId(int questionarioId) {
        this.questionarioId = questionarioId;
    }

    public int getNivelEstresse() {
        return nivelEstresse;
    }

    public void setNivelEstresse(int nivelEstresse) {
        this.nivelEstresse = nivelEstresse;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
    }
}