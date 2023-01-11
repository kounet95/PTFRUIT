package metier;

public class Pomme extends Fruit {

public Pomme(int p) {
	poids=p;
}
	public void affichePoids() {
		System.out.println("le poids de l'orange est :"+poids+"grammes");
		
	}
	public void affiche() {
		System.out.println("c'est une pomme");
	}

}
