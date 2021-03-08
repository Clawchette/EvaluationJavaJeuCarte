package plateau;

import java.util.ArrayList;

import plateau.cartes.Carte;

public class Jeu {
	private ArrayList<Carte> jeu;
	private int nbCartesMax;
	public Jeu(int nbCartesMax) {
		this.nbCartesMax = nbCartesMax;
		jeu = new ArrayList<Carte>();
	}
	
	public ArrayList<Carte> getJeu() {
		return jeu;
	}
	public int getNbCartesMax() {
		return nbCartesMax;
	}
	
	public void piocher() {
		if(jeu.size() < nbCartesMax) {
			jeu.add(new Carte());
		}else {
			System.out.println("Jeu de cartes FULL");
		}
	}
	
	public void jouer() {
		System.out.println("Je joue une carte...");
		jeu.set(0, null);
	}
}
