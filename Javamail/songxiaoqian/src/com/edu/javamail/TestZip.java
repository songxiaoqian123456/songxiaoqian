package com.edu.javamail;

import org.testng.annotations.Test;

public class TestZip {
	@Test
	 public void nihao(){  
	        ZipCompressor zc = new  ZipCompressor("E:\\eclipse\\Java-source\\songxiaoqian\\test-output\\html\\test-output.zip");  
	        zc.compressExe("E:\\eclipse\\Java-source\\songxiaoqian\\test-output\\html");
	    }  

}
