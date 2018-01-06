package com.base.redis;
import redis.clients.jedis.Jedis; 
/**
 * java 链接redis
 * @author zhuyashi
 *
 */
public class RedisJava {

	public static void main(String[] args) { 
		//Connecting to Redis server on localhost 
		Jedis jedis = new Jedis("localhost"); 
		System.out.println("Connection to server sucessfully"); 
		//check whether server is running or not 
		System.out.println("Server is running: "+jedis.ping()); 
		testeppend(jedis);
	} 
	/**
	 * 测试字符串
	 * @param jedis
	 */
	private static void testSting(Jedis jedis) {
		//set the data in redis string 
		jedis.set("tutorialname", "Redis tutorial"); 
		// Get the stored data and print it 
		System.out.println("Stored string in redis:: "+ jedis.get("tutorialname")); 
	}
	private static void testhashmap() {
		
	}
	private static void testeppend(Jedis jedis) {
		jedis.set("append", "one"); 
		System.out.println(jedis.append("append", " two"));
		System.out.println(jedis.getrange("append", 0, 5));
	}

}
