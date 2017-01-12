package fruit.basket;

public class Peach extends Fruit {

	private int price;

	public Peach(int price) {
		this.price = price;
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
		if (obj == this)
			return true;
		if (!(obj instanceof Peach)) {
			return false;
		}
		Peach b = (Peach) obj;
		return (this.price == b.price);
	}

	@Override
	public String toString() {
		return "peach";
	}

}
