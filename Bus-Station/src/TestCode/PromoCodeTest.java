package TestCode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import busstation.view.PromoCode;

public class PromoCodeTest {
	PromoCode p;
	
	@Before
	public void setUp() throws Exception {
		p = new PromoCode();
		
	}

	@Test
	public void testPromoCode() {
		System.out.println("Promo test ran");
	}

	@Test
	public void testDiscount() {
		assertFalse(p.discount());
	}

}
