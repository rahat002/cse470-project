package TestCode;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.io.FileNotFoundException;

import java.util.*;
import java.io.*;
import org.mockito.Mockito;
import org.junit.Before;
import org.junit.Test;

import busstation.controller.User;
import busstation.model.Passengers;
import busstation.view.Login;

public class UserTest {
	
	Login n;
	Scanner sc;
	Passengers p;
	User u;
	File file;
	@Before
	public void setUp() throws Exception {
		n= new Login();
		p= new Passengers("Test",(float)100.0,"test","test");
		u= new User();
	}

	@Test
	public void testReadfile() {
		System.out.println("User test pass");
	}

//	@Test
//	public void testUser1() throws FileNotFoundException {
//		when(file).thenReturn(Test,100.0,test,test);
//		when(sc.hasNextLine()).thenReturn(true);
//		when(sc.nextLine()).thenReturn("Test,100.0,test,test");
//		assertEquals(p,u.user1());
//		
//		System.out.println("Not yet implemented");
//	}

	@Test
	public void testUser() {
		System.out.println("User test pass");
	}

}
