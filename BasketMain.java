package fruit.basket;

public class BasketMain {

	public static void main(String[] args) {		
		new BasketMain().basket();		
	}

	public  void basket() {
		Banana banana1 = new Banana(40);		
		Orange orange1= new Orange(80);
		Peach peach1 = new Peach(30);
		Lemon lemon1 = new Lemon(10);
		Apple apple1 = new Apple(60);
		Basket b= new Basket();
		b.addItem(banana1);
		b.addItem(banana1);
		b.addItem(banana1);		
		b.addItem(orange1);
		b.addItem(orange1);
		b.addItem(orange1);
		b.addItem(peach1);
		b.addItem(lemon1);
		b.addItem(apple1);
		b.addItem(apple1);
		b.removeItem(banana1);//
		b.removeItem(orange1);
		b.removeItem(apple1);
		int cost=b.totalCost();
		System.out.println(cost);
	}

}
