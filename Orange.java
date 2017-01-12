package fruit.basket;

public class Orange extends Fruit {
	
	private int price ;
	
	public Orange(int price){
		this.price=price;
	}

	@Override
	public int getPrice() {	
		return price;
	}

	@Override
	public String color() {	
		return "orange";
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(!(obj instanceof Orange)){
			return false;
		}			
		Orange b  = (Orange)obj;
		return (this.price==b.price);		
	
	}
	
	@Override
	public String toString() {
		return "orange";
	}

}
