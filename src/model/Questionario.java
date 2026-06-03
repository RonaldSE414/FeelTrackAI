package model;

public class Questionario {

    private int id;

    private int usuarioId;

    private int estresse;

    private int cansaco;

    private int motivacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getEstresse() {
        return estresse;
    }

    public void setEstresse(int estresse) {
        this.estresse = estresse;
    }

    public int getCansaco() {
        return cansaco;
    }

    public void setCansaco(int cansaco) {
        this.cansaco = cansaco;
    }

    public int getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(int motivacao) {
        this.motivacao = motivacao;
    }
}