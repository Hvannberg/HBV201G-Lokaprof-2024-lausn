package vinnsla;

public class Frambjodandi {
    private String nafn;
    private int fjoldiMedmaela;

    public Frambjodandi(String nafn, int fjoldiMedmaela) {
        this.nafn = nafn;
        this.fjoldiMedmaela = fjoldiMedmaela;
    }


    public int getFjoldiMedmaela() {
        return fjoldiMedmaela;
    }


    @Override
    public String toString() {
        return  nafn;
    }
}
