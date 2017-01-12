package fruit.basket;

public class Apple extends Fruit {
	
	private int price ;
	
	public Apple(int price){
		this.price=price;
	}
	
		
	@Override
	public String color() {
		return "red";

	}

	@Override
	public int getPrice() {		
		return price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(!(obj instanceof Apple)){
			return false;
		}			
		Apple b  = (Apple)obj;
		return (this.price==b.price);		
	}
	
	@Override
	public String toString() {
		return "apple";
	}	
}
