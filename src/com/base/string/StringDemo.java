package com.base.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhuyashi
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		//		test1();
		//		test2();
		//		test3();
//		test4();
		test6();
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

	private static void test2() {
		//如果最后一位是空，长度就是4
		String str="1,2,3,4,,";
		String [] strarr=str.split(",");
		for (int i = 0; i < strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		System.out.println("长度     "+strarr.length);
	}
	/**
	 * 【强制】使用工具类Arrays.asList()把数组转换成集合时，不能使用其修改集合相关的方法，它的add/remove/clear方法会抛出UnsupportedOperationException异常。 
	 * 说明：asList的返回对象是一个Arrays内部类，并没有实现集合的修改方法。Arrays.asList体现的是适配器模式，只是转换接口，后台的数据仍是数组。
	 */
	private static void test3() {
		String[] str = new String[] { "you", "wu" };  
		List list = Arrays.asList(str); 
		System.out.println(list.get(0));
		str[0] = "gujin";
		System.out.println(list.get(0));
		list.add("2");//抛出异常
	}

	private static void test4 () {
		List<String> list = new ArrayList<String>();      
		list.add("2");    
		list.add("1"); 
		for (String item : list) {   
			if ("1".equals(item)) {   
				list.remove(item);       
			}     
		} 
		for (String string : list) {
			System.out.println(string);

		}
	}
	/**
	 * 卫语句
	 */
	private static void test5() {
		Object obj=null;
		if(obj != null){  
			doSomething();  
		}  

		//转换成卫语句以后的代码如下：  
		if(obj == null){  
			return;  
		}  
		doSomething();
	}
	static void doSomething(){
	}
	/**纳秒级时间值*/
	private static void test6() {
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
	}
}