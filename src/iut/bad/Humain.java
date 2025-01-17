package iut.bad;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Humain implements IConsommation {
	private String nom;
	private String prenom;
	private int age;
	
	private Set<Humain> amis = new HashSet<>();
	private Map<Humain, Integer> dureeAmitie = new HashMap<>();  

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
	
	public void ami(Humain h) {
		amis.add(h);
		dureeAmitie.put(h, 100);
	}
	
	public void ami(Humain h, int duree) {
		amis.add(h);
		dureeAmitie.put(h, duree);
	}
	
	public boolean estAmi(Humain h) {
		return amis.contains(h);
	}
	
	public int getDureeAmitie(Humain h) {
		return dureeAmitie.get(h);
	}
}
