package vinnsla;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Lýsing  : Dæmi 21 í lokaprófi HBV201G 2024
 *            Vinnsluklasi
 *
 *****************************************************************************/

public class Frambjodandi {
    private String nafn;
    private int fjoldiMedmaela;

    /**
     * Smiður sem setur nafn og fjöldi meðmælenda
     * @param nafn nafn frambjóðanda
     * @param fjoldiMedmaela fjöldi meðmælenda
     */
    public Frambjodandi(String nafn, int fjoldiMedmaela) {
        this.nafn = nafn;
        this.fjoldiMedmaela = fjoldiMedmaela;
    }

    /**
     * get aðferð til að skila fjölda meðmælenda
     * @return fjöldi meðmælenda
     */
    public int getFjoldiMedmaela() {
        return fjoldiMedmaela;
    }

    /**
     * skilar streng með nafni frambjóðanda
     * @return nafn frambjóðanda
     */

    @Override
    public String toString() {
        return  nafn;
    }
}
