package com.movie.admin;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Action_AddMovie extends Admin_Login{
	@Test
	public void AddMovie(String filename,String petname) {
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
