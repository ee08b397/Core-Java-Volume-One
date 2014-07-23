package cn.edu.zju.zhuli1990.corejava;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
	public static void main(String[] args) {
		// The BigInteger and BigDecimal are useful tools for you.
		// You can find more about them yourself.
		// With java, you no longer have to use an array to simulate big integer.
		// Because they did it for you.
		BigInteger bi = new BigInteger("123456789012345678901234567890");
		BigDecimal bd = new BigDecimal("12345678901234567890.12345678901234567890");
		
		System.out.println(bi.multiply(bi));
		System.out.println(bd.multiply(bd));
	}
}
