package fruit.basket;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BasketTest extends TestCase{
	
	Banana banana =null;	
	Apple apple =null;
	Basket b=null;

	@Before
	public void setUp() throws Exception {
		 banana = new Banana(40);			
		 apple = new Apple(60);
		 b= new Basket();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTotalCost() {
		b.addItem(banana);			
		b.addItem(apple);
		b.addItem(apple);		
		int cost=b.totalCost();		
		assertEquals(160, cost);
	}

	

}
