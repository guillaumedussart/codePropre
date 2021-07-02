package ex1;

import java.util.Date;

/**
 *  entreprise
 * @author Guillaume dussart
 * @version 1.0
 */
public class Entreprise {

	public int siret;
	public String nom;
	public String adresse;
	public Date dateCreation;
	
	public static final int CAPITAL_MAX = 3000000;
	
	/**
	 * afficher statut
	 *
	 */
	public void afficherStatut(){
		
	}

	/**
	 * get field
	 *
	 * @return siret
	 */
	public int getSiret() {
		return this.siret;
	}

	/**
	 * set field
	 *
	 * @param siret
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * get field
	 *
	 * @return nom
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * set field
	 *
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * get field
	 *
	 * @return adresse
	 */
	public String getAdresse() {
		return this.adresse;
	}

	/**
	 * set field
	 *
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * get field
	 *
	 * @return dateCreation
	 */
	public Date getDateCreation() {
		return this.dateCreation;
	}

	/**
	 * set field
	 *
	 * @param dateCreation
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
