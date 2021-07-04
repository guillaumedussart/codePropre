package ex3;


/**
 *  savane africaine
 *
 */
public class SavaneAfricaine extends AnimalsType {


	public SavaneAfricaine() {
	}

	@Override
	public double calculerKgsNourritureParJour(){
		return noms.size() * 10;
	}
}
