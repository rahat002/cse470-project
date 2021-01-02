package TestCode;

import static org.junit.Assert.*;

import busstation.model.Trips;
import org.junit.Before;
import org.junit.Test;

public class TripsTest {
	
	Trips t;
	@Before
	public void setUp() throws Exception {
		t= new Trips(0, "test", "test", "test", "test", "test", "test");
	}

	@Test
	public void testTrips() {
		System.out.println("Trips test pass");
	}

	@Test
	public void testTotalcost() {
		assertEquals(8.75, t.totalcost(1, null,"internal", "non stop", "one way trip"), 0);
	}

}
