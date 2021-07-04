package ex3;

/**
 * zoo
 */
public class Zoo {

    private String nom;
    private AnimalsType savaneAfricaine = AnimalsFactory.getSingle().getType(EnumAnimalsType.HERBIVORE);
    private AnimalsType zoneCarnivore = AnimalsFactory.getSingle().getType(EnumAnimalsType.CARNIVORE);
    private AnimalsType fermeReptile = AnimalsFactory.getSingle().getType(EnumAnimalsType.REPTILE);
    private AnimalsType aquarium = AnimalsFactory.getSingle().getType(EnumAnimalsType.POISSON);

    public Zoo(String nom) {
        this.nom = nom;
    }

    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")) {
            zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
        } else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")) {
            savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
        } else if (typeAnimal.equals("REPTILE")) {
            fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
        } else if (typeAnimal.equals("POISSON")) {
            aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
        }
    }

    public void afficherListeAnimaux() {
        savaneAfricaine.afficherListeAnimaux();
        zoneCarnivore.afficherListeAnimaux();
        fermeReptile.afficherListeAnimaux();
        aquarium.afficherListeAnimaux();
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * set field
     *
     * @param savaneAfricaine
     */
    public void setSavaneAfricaine(SavaneAfricaine savaneAfricaine) {
        this.savaneAfricaine = savaneAfricaine;
    }


    /**
     * set field
     *
     * @param zoneCarnivore
     */
    public void setZoneCarnivore(ZoneCarnivore zoneCarnivore) {
        this.zoneCarnivore = zoneCarnivore;
    }


    /**
     * set field
     *
     * @param fermeReptile
     */
    public void setFermeReptile(FermeReptile fermeReptile) {
        this.fermeReptile = fermeReptile;
    }


    /**
     * set field
     *
     * @param aquarium
     */
    public void setAquarium(Aquarium aquarium) {
        this.aquarium = aquarium;
    }

    /**
     * get field
     *
     * @return savaneAfricaine
     */
    public AnimalsType getSavaneAfricaine() {
        return this.savaneAfricaine;
    }

    /**
     * get field
     *
     * @return zoneCarnivore
     */
    public AnimalsType getZoneCarnivore() {
        return this.zoneCarnivore;
    }

    /**
     * get field
     *
     * @return fermeReptile
     */
    public AnimalsType getFermeReptile() {
        return this.fermeReptile;
    }

    /**
     * get field
     *
     * @return aquarium
     */
    public AnimalsType getAquarium() {
        return this.aquarium;
    }
}
