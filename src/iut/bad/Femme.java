package iut.bad;

public class Femme extends Humain {
	Femme(String nom, String prenom, int age) {
		super(nom, prenom, age);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public static void main(String[] args) {
		
		Homme josy = new Homme("Gran", "Josy", 32);
		Femme zenina = new Femme("Jaunne", "Zenina", 28);
		
		josy.ami(zenina);
		
		if(josy.estAmi(zenina)) {
			System.out.println("amis zareo");
		}
	}
}
