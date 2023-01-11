
package metier;
import java.util.*;

public class App2 {

	public static void main(String[] args) {
	List<Fruit> fruit =new Vector<Fruit>();
	fruit.add(new Pomme(50));
	fruit.add(new Orange(20));
	fruit.add(new Pomme(110));
	fruit.add(new Orange(500));
	fruit.add(new Orange(60));
	fruit.add(new Pomme(80));
	for (int i =0;i<fruit.size();i++) {
		fruit.get(i).affichePoids();
	}
	System.out.println("**************avec le foreach***********************");
	for (Fruit f:fruit) {
		f.affichePoids();
	}
	
	}

}
