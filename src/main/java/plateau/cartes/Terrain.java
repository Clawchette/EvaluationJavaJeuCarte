package plateau.cartes;

public class Terrain extends Carte {
	private Couleur couleur;
	public Terrain() {
		super();
		this.setCout(0);
		this.setType("Terrain");
		this.setText("- Couleur : " + this.getCouleur());
	}
	
	public Couleur getCouleur() {
		return couleur;
	}
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
}
