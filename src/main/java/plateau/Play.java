package plateau;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeu jeu = new Jeu(8);
		for (int i = 0; i < jeu.getNbCartesMax(); i++) {
			jeu.piocher();
		}
		
		jeu.jouer();
		jeu.jouer();
		jeu.piocher();
		jeu.jouer();
		jeu.piocher();
		
		
		
		
	}

}
