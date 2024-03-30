package iut.bad;

public class Humain implements IConsommation {
	private String nom;
	private String prenom;
	private int age;

	Humain(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void details() {
		System.out.println("Nom : " + nom + "Prenom : " + prenom + "Age : " + age);
	}
	
	public String toString() {
		return "Nom : " + nom + "Prenom : " + prenom + "Age : " + age;
	}

	@Override
	public void manger() {
		// TODO Auto-generated method stub
		// methode manger
	}

	@Override
	public void boire() {
		// TODO Auto-generated method stub
		// methode boire
	}
	
}
