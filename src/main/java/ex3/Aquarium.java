package ex3;

import java.util.List;

/**
 * aquarium
 */
public class Aquarium extends AnimalsType {

    @Override
    public double calculerKgsNourritureParJour() {
        return noms.size() * 0.2;
    }

}
