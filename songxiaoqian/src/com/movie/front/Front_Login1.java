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
		if(webtest.ifContains("退出")) {
			webtest.click("xpath=//a[contains(.,'退出')]");
		}
		webtest.click("link=登录");
		webtest.type("name=username", u_name);
		webtest.type("name=password", u_pwd);
		webtest.click("xpath=//input[@value='马上登录']");
		assertTrue(webtest.ifContains("退出"));
		
	}

}
