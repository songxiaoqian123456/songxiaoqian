package com.movie.admin;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Admin_Login extends BaseTest{
	@Test
	public void testLogin() {
		webtest.open("http://localhost:8032/MyMovie/admin.php/Index/index.html");	
		webtest.type("name=username","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("ÍË³ö"));
		
	}
	
}
