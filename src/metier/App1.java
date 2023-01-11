package metier;

public class App1 {

	public static void main(String[] args) {
		Fruit [] lesFruit;
		lesFruit =new Fruit [3];
		lesFruit [0]=new Pomme(60);
		lesFruit [1]=new Orange(100);
		lesFruit[2]=new Pomme(20);
	for (int i = 0; i<lesFruit.length;i++) {
		lesFruit[i].affiche();
	}
	System.out.println(lesFruit[0]);
	}

}
