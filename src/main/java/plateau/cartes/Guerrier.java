package plateau.cartes;

public class Guerrier extends Carte{
	private String nom;
	private int ptDegats;
	private int ptVie;
	
	public Guerrier() {
		super();
		this.setCout(50);
		this.setType("Guerrier");
		this.setText("- Nom : " + this.getNom() + " - Points de dégâts : " + this.getPtDegats() + " - Points de vie : " + this.getPtVie());
		this.setNom("Bob");
		this.setPtDegats(30);
		this.setPtVie(100);
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getPtDegats() {
		return ptDegats;
	}
	public void setPtDegats(int ptDegats) {
		this.ptDegats = ptDegats;
	}
	
	public int getPtVie() {
		return ptVie;
	}
	public void setPtVie(int ptVie) {
		this.ptVie = ptVie;
	}
}
