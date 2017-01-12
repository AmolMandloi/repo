package fruit.basket;

public class Lemon extends Fruit {
	
	private int price ;
	
	public Lemon(int price){
		this.price=price;
	}
	
	
	@Override
	public String color() {
		return "yellow";

	}

	@Override
	public int getPrice() {		
		return price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(!(obj instanceof Lemon)){
			return false;
		}			
		Lemon b  = (Lemon)obj;
		return (this.price==b.price);		
	}
	
	 @Override
 	public String toString() {   
 		return "lemon";
 	}	

}
