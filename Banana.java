package fruit.basket;

public class Banana extends Fruit {

	private int price;

	public Banana(int price) {
		this.price = price;
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
		if (obj == this)
			return true;
		if (!(obj instanceof Banana)) {
			return false;
		}
		Banana b = (Banana) obj;
		return (this.price == b.price);
	}

	@Override
	public String toString() {
		return "banana";
	}

}
