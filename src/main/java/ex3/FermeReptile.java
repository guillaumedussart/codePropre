package ex3;


/**
 * ferme reptile
 */
public class FermeReptile extends AnimalsType {

    @Override
    public double calculerKgsNourritureParJour() {
        return noms.size() * 0.1;
    }

}
