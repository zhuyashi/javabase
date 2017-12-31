package com.base.string;

public class StringDemo {
	
	public static void main(String[] args) {
		test1();
	}
	
	/**
	 * 结果为true
	 * ==比较的是内容
	 * equals 比较的是引用地址   这里地址不一样，但是String 重写了equals，所以返回true
	 */
	private static void test1(){
		String a="a"+"b"+"c";
		String b="abc";
		System.out.println("result--------------  "+a.equals(b));
	}
	
}
