package plateau;

import java.util.ArrayList;

import plateau.cartes.Carte;
import plateau.cartes.Soigneur;
import plateau.cartes.Guerrier;
import plateau.cartes.Terrain;

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
	
	public void piocher(String type) {
		if(jeu.size() < nbCartesMax) {
			if(type == "Soigneur") {
				jeu.add(new Soigneur());
			}
			else if(type == "Guerrier") {
				jeu.add(new Guerrier());
			}
			else {
				jeu.add(new Terrain());
			}
			
		}else {
			System.out.println("Jeu de cartes FULL");
		}
	}
	
	public void jouer() {
		System.out.println("Je joue une carte...");
		jeu.set(0, null);
	}
}
