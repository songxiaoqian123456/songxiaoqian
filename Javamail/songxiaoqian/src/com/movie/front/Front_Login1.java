package com.movie.front;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Front_Login1 extends BaseTest{


	@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void testSearch(String u_name,String u_pwd) throws Exception  {
		System.out.println(u_name);
		System.out.println(u_pwd);
		webtest.open("http://localhost:8032/mymovie/");
		if(webtest.ifContains("�˳�")) {
			webtest.click("xpath=//a[contains(.,'�˳�')]");
		}
		webtest.click("link=��¼");
		webtest.type("name=username", u_name);
		webtest.type("name=password", u_pwd);
		webtest.click("xpath=//input[@value='���ϵ�¼']");
		assertTrue(webtest.ifContains("�˳�"));
		
	}

}
