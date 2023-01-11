package metier;

public class Orange extends Fruit {
 public Orange(int o) {
	 poids =0;
 }
	
	public void affiche() {
		System.out.println("c'est une orange");
		
	}
public void affichePoids() {
	System.out.println("le poids de l'orange est :"+poids+"grammes");
}
}
