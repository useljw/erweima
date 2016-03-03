package com.han.demo;

public class TestLogo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String text = "https://www.baidu.com";  
			QRCodeUtil.encode(text, "H:/1.jpg", "H:/image/", true);
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}

}
