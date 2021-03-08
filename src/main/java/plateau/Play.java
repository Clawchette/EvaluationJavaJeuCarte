package plateau;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeu jeu = new Jeu(8);
		jeu.piocher("Guerrier");
		jeu.piocher("Soigneur");
		jeu.piocher("Terrain");
		for (int i = 3; i < jeu.getNbCartesMax(); i++) {
			jeu.piocher("Guerrier");
		}
		
		jeu.jouer();
		jeu.jouer();
		jeu.piocher("Soigneur");
		jeu.jouer();
		jeu.piocher("Guerrier");
		jeu.jouer();
		jeu.jouer();
		jeu.piocher("Terrain");

	}

}
