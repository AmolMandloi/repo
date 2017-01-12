package fruit.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	
	private List<Fruit> fruits = new ArrayList<Fruit>();
	private int cost=0;
	
	public int totalCost(){		
		for(Fruit f : fruits){
			cost=cost +f.getPrice() ;
		}
		return cost;
	}
	
	public void addItem(Fruit fruit){
		fruits.add(fruit);
	}
	
	public void removeItem(Fruit fruit){
		fruits.remove(fruit);
	}
	
	
	

}
