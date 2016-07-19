package com.sunqb.utils.codec;

/**
 * @author sunqingbiao
 *
 */
public class Test {
	
	/**
	 *  加密
	 */
	public static void enc(){
		String key = "84";
		String salt = "21232f297a57a5a743894a0e4a801fc3";
		System.out.println(TestMain.encode(key,salt));
	}
	
	/**
	 * 解密
	 */
	public static void dec(){
		String key = "E7Byy4Qk-ps";
		String salt = "21232f297a57a5a743894a0e4a801fc3";
		System.out.println(TestMain.decode(key, salt));
	}

	public static void main(String[] args) {
		enc();
		System.out.println("以上是加密--------------------以下是解密");
		dec();
	}
}
