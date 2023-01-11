package metier;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App3 {

	public static void main(String[] args) {
Map<String, Fruit> fruit =new HashMap<String,Fruit>();
fruit.put("p1", new Pomme(50));
fruit.put("o1", new Orange(10));
fruit.put("p2", new Pomme(20));
fruit.put("o2", new Orange(90));
fruit.put("p3", new Pomme(100));
fruit.put("o3", new Orange(120));
Set<String> keys =fruit.keySet();
Collection<Fruit> values =fruit.values();
for(String cle:keys) {
	System.out.println(cle);
	fruit.get(cle).affiche();
}
for (Fruit f:values) {
	f.affiche();
	f.affichePoids();
}

	}

}
