package plateau.cartes;

public class Soigneur extends Carte{
	
	private String nom;
	private int ptSoin;
	private String description;
	
	public Soigneur() {
		super();
		this.setCout(10);
		this.setType("Soigneur");
		this.setText("- Nom : " + this.getNom() + " - Points de soin : " + this.getPtSoin() + " - Description : " + this.getDescription());
		this.setNom("Tom");
		this.setPtSoin(20);
		this.setDescription("Un grand magicien spécialisé dans les soins.");
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getPtSoin() {
		return ptSoin;
	}
	public void setPtSoin(int ptSoin) {
		this.ptSoin = ptSoin;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
