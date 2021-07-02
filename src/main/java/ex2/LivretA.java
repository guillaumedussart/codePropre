package ex2;

/**
 * livret a
 */
public class LivretA extends CompteBancaire {


    /** solde : solde du compte */
    private double solde;

    /** decouvert : un découvert est autorisé seulement pour les comptes courants */
    private double decouvert;

    /** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
    private double tauxRemuneration;

    /** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
    private String type;



    public LivretA(String type, double solde, double tauxRemuneration) {
        super(type, solde, 0, tauxRemuneration);
        this.solde = solde;
        this.tauxRemuneration = tauxRemuneration;
        this.type = type;
    }

    public LivretA(String type, double solde, double decouvert, double solde1, double decouvert1, double tauxRemuneration, String type1) {
        super(type, solde, decouvert);
        this.solde = solde1;
        this.decouvert = decouvert1;
        this.tauxRemuneration = tauxRemuneration;
        this.type = type1;
    }


    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public double getDecouvert() {
        return decouvert;
    }

    @Override
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    @Override
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}
