package com.movie.admin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Admin_AddMovie extends BaseTest{
	@Test
	public void addMovie() {
		webtest.open("http://localhost:8032/MyMovie/admin.php/Index/index.html");	
		
		webtest.type("name=username","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
//		assertTrue(webtest.isTextPresent("�˳�"));
		webtest.click("xpath=//h2[text()='ӰƬ����']");
		webtest.click("xpath=//span[text()='���ӰƬ��Ϣ']");
		webtest.type("name=filmname", "̩̹��˺�");
		webtest.type("name=petname", "RMS Titanic");
		webtest.type("name=director", "ղķ˹����÷¡");
		webtest.type("name=editor", "ղķ˹����÷¡ ");
		webtest.type("name=nation", "����");
		webtest.type("name=language", "English");
		webtest.type("name=showtime", "1997-12-19");
		webtest.type("name=minutes", "194");
		webtest.type("name=picname", "F:\\ͼƬ\\Camera\\20.jpg");
		webtest.click("xpath=//button[@type='submit']");
		
		
		
		
		
		

	}
	

	
}
