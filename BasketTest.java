package fruit.basket;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BasketTest extends TestCase{
	
	Banana banana =null;		
	Orange orange=null;
	Peach peach =null;
	Lemon lemon =null;
	Apple apple =null;
	Basket b=null;

	@Before
	public void setUp() throws Exception {
		 banana = new Banana(40);		
		 orange= new Orange(80);
		 peach = new Peach(30);
		 lemon = new Lemon(10);
		 apple = new Apple(60);
		 b= new Basket();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTotalCost() {
		b.addItem(banana);		
		b.addItem(orange);			
		b.addItem(peach);
		b.addItem(lemon);
		b.addItem(apple);
		b.addItem(apple);		
		int cost=b.totalCost();		
		assertEquals(280, cost);
	}

	

}
