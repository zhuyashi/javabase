package com.base.string;

public class StringDemo {
	
	public static void main(String[] args) {
		test1();
	}
	
	/**
	 * ���Ϊtrue
	 * ==�Ƚϵ�������
	 * equals �Ƚϵ������õ�ַ   �����ַ��һ��������String ��д��equals�����Է���true
	 */
	private static void test1(){
		String a="a"+"b"+"c";
		String b="abc";
		System.out.println("result--------------  "+a.equals(b));
	}
	
}
