package com.movie.admin;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Action_AddMovie extends Admin_Login{
	@Test
	public void AddMovie(String filename,String petname) {
		webtest.click("xpath=//h2[text()='影片管理']");
		webtest.click("xpath=//span[text()='添加影片信息']");
		webtest.type("name=filmname", "泰坦尼克号");
		webtest.type("name=petname", "RMS Titanic");
		webtest.type("name=director", "詹姆斯·卡梅隆");
		webtest.type("name=editor", "詹姆斯·卡梅隆 ");
		webtest.type("name=nation", "美国");
		webtest.type("name=language", "English");
		webtest.type("name=showtime", "1997-12-19");
		webtest.type("name=minutes", "194");
		webtest.type("name=picname", "F:\\图片\\Camera\\20.jpg");
		webtest.click("xpath=//button[@type='submit']");
	}
}
