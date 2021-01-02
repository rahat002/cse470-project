package TestCode;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;
import busstation.view.Login;

public class LoginTest {
	private Login Log;
	String user1="test";
	String pass1="test";
	@Before
	public void setUp() throws Exception {
		Log = new Login();
	}

	@Test
	public void testReadfile() throws FileNotFoundException {
		assertFalse(Log.readfile());
	}

	@Test
	public void testPass() throws FileNotFoundException {
		assertNull(Log.pass());
		
	}

}
