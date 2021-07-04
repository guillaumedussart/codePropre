package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 *  animals type
 *
 */
public abstract class AnimalsType {



    public List<String> types;
    public List<String> noms;
    public List<String> comportements;

     {
        this.types = new ArrayList<>();
        this.comportements = new ArrayList<>();
        this.noms = new ArrayList<>();
    }

    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    public void afficherListeAnimaux(){
        for (String nom: noms){
            System.out.println(nom);
        }
    }

    public int compterAnimaux(){
        return noms.size();
    }

    public double calculerKgsNourritureParJour() {
        return 0;
    }
}
