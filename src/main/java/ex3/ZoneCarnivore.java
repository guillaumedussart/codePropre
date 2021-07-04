package ex3;


/**
 *  zone carnivore
 *
 */
public class ZoneCarnivore extends AnimalsType {

    @Override
    public double calculerKgsNourritureParJour() {
        return noms.size() * 10;
    }
}
