package vinnsla;

/**
 * Vinnsluklasi fyrir lánareiknivél sem geymir vexti, upphæð láns og fjölda ára
 * Getur reiknað út greiðslur á mánuði.
 */
public class Lan {
    private final double vextir;
    private final double upphaed;
    private final int fjoldiAra;

      public Lan(double vextir, int fjoldiAra, double upphaed) {
        this.vextir = vextir;
        this.upphaed = upphaed;
        this.fjoldiAra = fjoldiAra;
    }

    public double manadarlegGreidsla() {
        double vextirManudi = vextir / 1200;
        return upphaed * vextirManudi / (1 - 1 / Math.pow(1 + vextirManudi, fjoldiAra * 12));
    }
}
