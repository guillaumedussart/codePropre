package ex3;

import java.util.List;

/**
 *  ferme reptile
 *
 */
public class FermeReptile {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
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
	
	/**
	 * compter animaux
	 *
	 * @return {@link int}
	 */
	public int compterAnimaux(){
		return noms.size();
	}
	
	/**
	 * calculer kgs nourriture par jour
	 *
	 * @return {@link double}
	 */
	public double calculerKgsNourritureParJour(){
		return noms.size() * 0.1;
	}

	/**
	 * get field
	 *
	 * @return types
	 */
	public List<String> getTypes() {
		return this.types;
	}

	/**
	 * set field
	 *
	 * @param types
	 */
	public void setTypes(List<String> types) {
		this.types = types;
	}

	/**
	 * get field
	 *
	 * @return noms
	 */
	public List<String> getNoms() {
		return this.noms;
	}

	/**
	 * set field
	 *
	 * @param noms
	 */
	public void setNoms(List<String> noms) {
		this.noms = noms;
	}

	/**
	 * get field
	 *
	 * @return comportements
	 */
	public List<String> getComportements() {
		return this.comportements;
	}

	/**
	 * set field
	 *
	 * @param comportements
	 */
	public void setComportements(List<String> comportements) {
		this.comportements = comportements;
	}
}
