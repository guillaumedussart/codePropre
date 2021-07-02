package ex3;

/**
 *  zoo
 *
 */
public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")){
			zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")){
			savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals("REPTILE")){
			fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals("POISSON")){
			aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * get field
	 *
	 * @return savaneAfricaine
	 */
	public SavaneAfricaine getSavaneAfricaine() {
		return this.savaneAfricaine;
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
	 * get field
	 *
	 * @return zoneCarnivore
	 */
	public ZoneCarnivore getZoneCarnivore() {
		return this.zoneCarnivore;
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
	 * get field
	 *
	 * @return fermeReptile
	 */
	public FermeReptile getFermeReptile() {
		return this.fermeReptile;
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
	 * get field
	 *
	 * @return aquarium
	 */
	public Aquarium getAquarium() {
		return this.aquarium;
	}

	/**
	 * set field
	 *
	 * @param aquarium
	 */
	public void setAquarium(Aquarium aquarium) {
		this.aquarium = aquarium;
	}
}
